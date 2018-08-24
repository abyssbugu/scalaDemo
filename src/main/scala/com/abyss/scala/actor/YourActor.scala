package com.abyss.scala.actor

import scala.actors.Actor

/**
  * Created by Abyss on 2018/8/24.
  * ! 发送异步消息,没有返回值
  * !? 发送同步消息,等待返回值
  * !! 发送异步消息,返回值是Future[Any]
  *
  */
class YourActor extends Actor {
  override def act(): Unit = {
    loop {
      react {
        case "start" => println("starting")
        case "stop" => println("stoping")
      }
    }


  }
}

object YourActor {
  def main(args: Array[String]): Unit = {
    val actor = new MsgActor()
    actor.start()
    actor ! "start"
    actor ! "stop"
    println("发送消息成功")
  }
}




