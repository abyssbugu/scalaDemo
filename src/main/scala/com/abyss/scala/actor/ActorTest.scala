package com.abyss.scala.actor

import scala.actors.Actor

/**
  * Created by Abyss on 2018/8/24.
  * description:
  */

class Actor1 extends Actor {
  override def act(): Unit = {
    for (i <- 1 to 10) {
      println("Actor1--------" + i)
    }
  }
}

class Actor2 extends Actor {
  override def act(): Unit = {
    for (i <- 10 to 20) {
      println("Actor2--------" + i)
    }
  }
}

object ActorTest extends App {
  val actor1 = new Actor1()
  val actor2 = new Actor2()
  actor1.start()
  actor2.start()

}
