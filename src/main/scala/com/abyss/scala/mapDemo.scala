package com.abyss.scala

import scala.collection.mutable.Map

/**
  * Created by Abyss on 2018/8/23.
  * 在 Scala 中，把哈希表这种数据结构叫做映射。
  * (1)构建映射格式
  * 1、val map=Map(键 -> 值，键 -> 值....)
  * 2、利用元组构建 val map=Map((键，值),(键，值),(键，值)....)
  */

object mapDemo {
  def main(args: Array[String]): Unit = {

    //获取值:值=map(键)
    val scores = Map(("tom", 85), ("jerry", 99), ("kitty", 90))
    println(scores("tom"))
    println(scores)

    //好用的 getOrElse,如果映射中有值,返回映射中的值,没有就返回默认的值

    println(scores.getOrElse("Tom", 0))

    //注意:在 Scala 中，有两种 Map，一个是 immutable 包下的 Map，该 Map 中的内容不可变; 另一个是 mutable 包下的 Map，该 Map 中的内容可变
    //修改map中的内容
    scores("tom") = 99
    println(scores("tom"))

    //追加元素
    scores += ("suck" -> 100, "a" -> 55)

    println(scores)

  }

}
