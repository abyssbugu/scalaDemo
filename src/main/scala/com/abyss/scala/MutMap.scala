package com.abyss.scala

import scala.collection.mutable.HashMap

/**
  * Created by Abyss on 2018/8/23.
  * description:
  */
object MutMap {
  def main(args: Array[String]): Unit = {
    //声明一个可变集合
    val user = HashMap("zhangsan" -> 50, "lisi" -> 100)
    println(user)
    //添加键值对
    println(user += ("wangwu" -> 30))
    //添加多个键值对
    println(user += ("zhangsan0" -> 30, "lisi0" -> 20))
    //方法一:显示所有的 key
    println(user.keys)
    //方法二:显示所有的 key
    println(user.keySet)
    //通过 key 获取 value
    println(user("zhangsan"))
    //通过 key 获取 value 有 key 对应的值则返回，没有就返回默认值 0，
    println(user.getOrElse("zhangsan", 0))
    //没有对应的 key，返回默认 0
    println(user.getOrElse("zhangsan1", 0))
    //更新键值对
    user("zhangsan") = 55
    println(user("zhangsan"))
    //更新多个键值对
    println(user += ("zhangsan" -> 60, "lisi" -> 50))
    //删除 key
    println(user -= ("zhangsan"))
    //删除 key
    println(user.remove("zhangsan0"))
    //遍历 map 方法一:通过 key 值
    for (x <- user.keys) println(x + " -> " + user(x))
    //遍历 map 方法二:模式匹配
    for ((x, y) <- user) println(x + " -> " + y)
    //遍历 map 方法三:通过 foreach
    user.foreach { case (x, y) => println(x + " -> " + y) }
  }

}
