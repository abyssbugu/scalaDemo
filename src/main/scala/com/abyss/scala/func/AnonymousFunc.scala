package com.abyss.scala.func

/**
  * Created by Abyss on 2018/8/25.
  * 你不需要给每一个函数命名，没有将函数赋给变量的函数叫做匿名函数
  */
object AnonymousFunc extends App {
  val arr = Array(1, 2, 3, 4, 5)

  println(arr.map(_*2).toBuffer)
}
