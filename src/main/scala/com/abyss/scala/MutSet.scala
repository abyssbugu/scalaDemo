package com.abyss.scala

import scala.collection.mutable

/**
  * Created by Abyss on 2018/8/23.
  * description:
  */
object MutSet {
  def main(args: Array[String]): Unit = {
    //定义一个可变的 Set
    val set1 = new mutable.HashSet[Int]()
    println(set1)
    //添加元素
    println(set1 += 1)
    //添加元素 add 等价于+=
    println(set1.add(2))
    //向集合中添加元素集合
    println(set1 ++= Set(1, 4, 5))
    //删除一个元素
    println(set1 -= 5)
    //删除一个元素
    println(set1.remove(1))
    println(set1)
  }

}
