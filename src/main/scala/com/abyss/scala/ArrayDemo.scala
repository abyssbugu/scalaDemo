package com.abyss.scala

import scala.collection.mutable.ArrayBuffer

/**
  * Created by Abyss on 2018/8/23.
  * description: 定长数组和变长数组
  */
object ArrayDemo {
  def main(args: Array[String]): Unit = {
    //初始化一个长度为 8 的定长数组，其所有元素均为 0
    val arr1 = new Array[Int](8)
    //直接打印定长数组，内容为数组的 hashcode 值
    println(arr1)
    //将数组转换成数组缓冲，就可以看到原数组中的内容了
    println(arr1.toBuffer)
    // toBuffer 会将数组转换长数组缓冲 13

    //注意:如果不new，相当于调用了数组的 apply 方法，直接为数组赋值
    // 初始化一个长度为 1的定长数组
    val arr2 = Array[Int](10)
    println(arr2.toBuffer)

    //定义一个长度为 3 的定长数组
    val arr3 = Array("hadoop", "storm", "spark") //使用()来访问元素
    println(arr3(2))

    //变长数组(数组缓冲)
    //如果想使用数组缓冲，需要导入 import scala.collection.mutable.ArrayBuffer 包

    val ab = ArrayBuffer[Int]()
    //向数组缓冲的尾部追加一个元素 //+=尾部追加元素
    ab += 1
    //追加多个元素
    ab += (2, 3, 4, 5) //追加一个数组++=
    ab ++= Array(6, 7) //追加一个数组缓冲
    ab ++= ArrayBuffer(8,9) //打印数组缓冲 ab
    //在数组某个位置插入元素用 insert，从某下标插入
    ab.insert(0, -1, 0) //删除数组某个位置的元素用remove 按照下标删除


  }

}
