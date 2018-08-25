package com.abyss.scala.func

/**
  * Created by Abyss on 2018/8/25.
  * cala 中的闭包
  * *闭包是一个函数，返回值依赖于声明在函数外部的一个或多个变量。
  */
object ClosureDemo extends App {
  val y = 10
  //变量 y 不处于其有效作用域时,函数还能够对变量进行访问
  val add = (x: Int) => {
    x + y
  }
  //在 add 中有两个变量:x 和 y。其中的一个 x 是函数的形式参数，
  // 在 add 方法被调用时，x 被赋予一个新的值。
  // 然而，y 不是形式参数，而是自由变量
  println(add(5))

}
