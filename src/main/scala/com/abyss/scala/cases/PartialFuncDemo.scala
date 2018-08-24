package com.abyss.scala.cases

/**
  * Created by Abyss on 2018/8/24.
  * 被包在花括号内没有 match 的一组 case 语句是一个偏函数，
  * 它是 PartialFunction[A, B] 的一个实例，
  * A 代表输入参数类型，B 代表返回结果类型，
  * 常用作输入模式匹配，偏函数最 大的特点就是它只接受和处理其参数定义域的一个子集。
  */
object PartialFuncDemo {
  val fun1: PartialFunction[String, Int] = {
    case "one" => 1
    case "two" => 2
    case _ => -1
  }

  def fun2(num: String): Int = num match {
    case "one" => 1
    case "two" => 2
    case _ => -1
  }

  def main(args: Array[String]): Unit = {
    println(fun1("one"))
    println(fun2("two"))
  }

}
