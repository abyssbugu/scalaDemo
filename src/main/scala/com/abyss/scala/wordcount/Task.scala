package com.abyss.scala.wordcount

import scala.actors.{Actor, Future}
import scala.collection.mutable
import scala.collection.mutable.ListBuffer
import scala.io.Source

/**
  * Created by Abyss on 2018/8/24.
  * 需求:
  * 用 actor 并发编程写一个单机版的 WordCount，将多个文件作为输入，计算完成后将多 个任务汇总，得到最终的结果。
  * 大致的思想步骤:
  * 1、通过 loop +react 方式去不断的接受消息
  * 2、利用 case class 样例类去匹配对应的操作
  * 3、其中 scala 中提供了文件读取的接口 Source,通过调用其 fromFile 方法去获取文件内容
  * 4、将每个文件的单词数量进行局部汇总，存放在一个 ListBuffer 中
  * 5、最后将 ListBuffer 中的结果进行全局汇总。
  */
case class SubmitTask(fileName: String)

case class ResultTask(result: Map[String, Int])

class Task extends Actor {
  override def act(): Unit = {
    loop {
      react {
        case SubmitTask(fileName: String) => {
          val result = Source.fromFile(fileName)
            .mkString //获取文本内容
            .split("\n") //按行切割
            .flatMap(_.split(" ")) //转换压平切割获取每个单词
            .map((_, 1)) //每个单词计数为1
            .groupBy(_._1) //根据单词进行分组
            .mapValues(_.length) //单词数组的长度就是单词的数量

          sender ! ResultTask(result)
        }

      }
    }
  }
}

object WordCount extends App {
  val replySet = new mutable.HashSet[Future[Any]]()
  val resultList = new ListBuffer[ResultTask]
  val path = "/Users/abyss/Dev/toys/wordcount/input/"
  val files = Array("kkk.txt", "aaa.txt", "bbb.txt")
  for (file <- files) {
    val task = new Task
    task.start()
    val result: Future[Any] = task !! SubmitTask(path + file)
    //将统计未知的结果
    replySet += result
  }

  //对返回的每个文件结果进行收集
  while (replySet.size > 0) {
    //过滤掉空的结果
    val sets = replySet.filter(_.isSet)
    for (reply <- sets) {
      val result = reply.apply()
      //收集结果
      resultList += result.asInstanceOf[ResultTask]
      //移除已收到的回复
      replySet.remove(reply)
    }
  }

  //对结果进行汇总整理
  println(resultList.flatMap(_.result).groupBy(_._1).mapValues(x => x.foldLeft(0)(_ + _._2)))


}
