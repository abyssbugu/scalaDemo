package com.abyss.scala

/**
  * Created by Abyss on 2018/8/23.
  * 1.增强 for 循环
  * 2.好用的 until 会生成脚标，0 until 10 包含 0 不包含 10
  */
object ForArrayDemo {
  def main(args: Array[String]): Unit = {
    val arr = Array(1, 2, 3, 4, 5)
    for (i <- arr) {
      println(i)
    }

    for (index <- (0 until (arr.length)).reverse) {
      println(arr(index))

    }

    for (index <- arr.indices) {
      println(arr(index))
    }

  }
}
