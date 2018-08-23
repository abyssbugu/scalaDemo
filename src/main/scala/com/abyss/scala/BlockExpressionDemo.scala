package com.abyss.scala

/**
  * Created by Abyss on 2018/8/23.
  * description: 块表达式
  */
object BlockExpressionDemo {
  def main(args: Array[String]): Unit = {
    val a = 10
    val b = 20
    //在 scala 中{}中包含一系列表达式，块中最后一个表达式的值就是块的值 //下面就是一个块表达式
    val result = {
      val c=b-a
      val d=b-c
      d //块中最后一个表达式的值
    }
    //result 的值就是块表达式的结果
    println(result)
  }

}
