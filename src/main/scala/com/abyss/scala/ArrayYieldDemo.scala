package com.abyss.scala

/**
  * Created by Abyss on 2018/8/23.
  * yield 关键字将原始的数组进行转换会产生一个新的数组，原始的数组不变
  */
object ArrayYieldDemo {
  def main(args: Array[String]): Unit = {

    //定义一个数组
    val arr = Array(1, 2, 3, 4, 5, 6, 7, 8, 9).reverse
    //将偶数取出乘以 10 后再生成一个新的数组
    val arr1 = for (i <- arr if i % 2 == 0) yield i * 10
    println(arr1.toBuffer)

    //更高级的写法,用着更爽
    //filter 是过滤，接收一个返回值为 boolean 的函数
    //map 相当于将数组中的每一个元素取出来，应用传进去的函数
    val arr3 = arr.filter(_ % 2 == 0).map(_ * 10)
    println(arr3.toBuffer)

    //Scala 中，数组上的某些方法对数组进行相应的操作非常方
    println(arr3.sum)
    println(arr3.max)
    println(arr3.sorted.toBuffer)
  }

}
