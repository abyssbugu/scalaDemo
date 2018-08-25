package com.abyss.scala.func

/**
  * Created by Abyss on 2018/8/25.
  * 定义函数时格式:val 变量名 = (输入参数类型和个数) => 函数实现和返回值类型
  * “=”表示将函数赋给一个变量
  * “=>”左面表示输入参数名称、类型和个数，右边表示函数的实现和返回值类型
  */
object ValueFunc extends App {
  val arr = Array(1, 2, 3, 4, 5)
  val fun1 = (x: Int) => x * 2

  println(arr.map(fun1).toBuffer)

}

