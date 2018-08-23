package com.abyss.scala

import scala.collection.mutable.ListBuffer


/**
  * Created by Abyss on 2018/8/23.
  * description:
  */
object MutListDemo {
  def main(args: Array[String]): Unit = {
    //构建一个可变列表，初始有 3 个元素 1,2,3
    val lst0 = ListBuffer[Int](1,2,3) //创建一个空的可变列表
    val lst1 = new ListBuffer[Int]
    //向 lst1 中追加元素，注意:没有生成新的集合
    lst1 += 4
    lst1.append(5)
    //将 lst1 中的元素最近到 lst0 中， 注意:没有生成新的集合
     lst0 ++= lst1
    //将 lst0 和 lst1 合并成一个新的 ListBuffer 注意:生成了一个集合
    val lst2= lst0 ++ lst1
    //将元素追加到 lst0 的后面生成一个新的集合
    val lst3 = lst0 :+ 5
    //删除元素,注意:没有生成新的集合
    val lst4 = ListBuffer[Int](1,2,3,4,5)
    lst4 -= 5
    //删除一个集合列表,生成了一个新的集合
    val lst5=lst4--List(1,2)
    //把可变 list 转换成不可变的 list 直接加上 toList
    val lst6=lst5.toList
    //把可变 list 转变数组用 toArray
    val lst7=lst5.toArray
    println(lst0)
    println(lst1)
    println(lst2)
    println(lst3)
    println(lst4)
    println(lst5)
    println(lst6)
    println(lst7)
  }

}
