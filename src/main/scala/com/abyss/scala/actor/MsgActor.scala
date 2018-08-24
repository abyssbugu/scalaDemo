package com.abyss.scala.actor

import scala.actors.Actor

/**
  * Created by Abyss on 2018/8/24.
  * 1、将消息封装在一个样例类中
  * 2、通过匹配不同的样例类去执行不同的操作
  * 3、Actor 可以返回消息给发送方。通过 sender 方法向当前消息发送方返回消息
  *
  */
case class AsyncMessage(id: Int, msg: String) //异步消息
case class SyncMessage(id: Int, msg: String) //同步消息
case class RelpyMessage(id: Int, msg: String) //返回消息

class MsgActor extends Actor {
  override def act(): Unit = {
    loop {
      react {
        case AsyncMessage(id, msg) => {
          println(s"id:$id msg:$msg")
          sender ! RelpyMessage(3, "finished")
        }
        case SyncMessage(id, msg) => {
          println(s"id:$id msg:$msg")
          sender ! RelpyMessage(2, "回复的消息,无返回值")
        }
        case _ => println("else something")
      }
    }


  }
}

object MsgActor {
  def main(args: Array[String]): Unit = {
    val actor = new MsgActor
    actor.start()
    actor ! AsyncMessage(1, "异步无返回值")
    val result = actor !? SyncMessage(2, "同步有返回值")
    println(result)
    val result2 = actor !! AsyncMessage(3, "异步有返回值")
    val reply = result2.apply()
    println(reply)

  }
}






