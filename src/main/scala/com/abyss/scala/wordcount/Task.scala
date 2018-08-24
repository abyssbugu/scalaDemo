package com.abyss.scala.wordcount

import scala.actors.{Actor, Future}
import scala.io.Source

/**
  * Created by Abyss on 2018/8/24.
  * description:
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
  val task = new Task
  task.start()
  val result: Future[Any] = task !! SubmitTask("/Users/abyss/Dev/toys/wordcount/input/kkk.txt")
  println(result.apply())


}
