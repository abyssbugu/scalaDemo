package com.abyss.scala.cases

import scala.util.Random

/**
  * Created by Abyss on 2018/8/24.
  * 在 Scala 中样例类是一种特殊的类，可用于模式匹配。 定义形式:
  * case class 类型，是多例的，后面要跟构造参数。
  * case object 类型，是单例的。
  */

case class SubmitTask(id: String, name: String)

case class HeartBeat(time: Long)

case object CheckTimeOutTask

object CaseDemo04 extends App {
  val arr = Array(CheckTimeOutTask, HeartBeat(12333), SubmitTask("0001", "task-0001"))
  arr(Random.nextInt(arr.length)) match {
    case SubmitTask(id, name) => {
      println(s"$id, $name")
    }
    case HeartBeat(time) => {
      println(time)
    }
    case CheckTimeOutTask => {
      println("check")
    }
  }
}

