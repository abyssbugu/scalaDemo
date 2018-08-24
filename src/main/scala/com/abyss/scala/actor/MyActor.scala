package com.abyss.scala.actor

import scala.actors.Actor

/**
  * Created by Abyss on 2018/8/24.
  * ! 发送异步消息,没有返回值
  * !? 发送同步消息,等待返回值
  * !! 发送异步消息,返回值是Future[Any]
  *
  */
class MyActor extends Actor {
  override def act(): Unit = {
    receive {
      case "start" => println("starting")
    }
  }
}

object MyActor extends App {
  val actor = new MyActor()
  actor.start()
  actor ! "start"
  println("消息发送成功")
}
