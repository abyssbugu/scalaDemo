package com.abyss.scala

/**
  * Created by Abyss on 2018/8/23.
  * description: 在 scala 中有 for 循环和 while 循环，用 for 循环比较多
  */
object ForDemo {
  def main(args: Array[String]): Unit = {
    //for(i <- 表达式),表达式 1 to 10 返回一个 Range(区间)
    // 每次循环将区间中的一个值赋给 a
    for (a <- -1 to 10) {
      println(a)
    }

    //for(i <- 数组)
    val arr = Array("a", "b", "c")
    for (b <- arr) {
      println(b)
    }

    //高级 for 循环 
    // 每个生成器都可以带一个条件，注意:if 前面没有分号
    for (a <- 1 to 3; b <- 1 to 3 if a != b) {
      print(a * 10 + b + " ")
      println()
    }

    //for 推导式:如果 for 循环的循环体以 yield 开始，则该循环会构建出一 个集合
    //每次迭代生成集合中的一个值
    val v = for (i <- 1 to 10) yield i * 10
    println(v)

  }

}
