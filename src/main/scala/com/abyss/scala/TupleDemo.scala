package com.abyss.scala

/**
  * Created by Abyss on 2018/8/23.
  * 元组是不同类型的值的聚集;对偶是最简单的元组。
  * 元组表示通过将不同的值用小括号括起来，即表示元组。
  * 元组操作
  */
object TupleDemo {
  def main(args: Array[String]): Unit = {

    //创建元组
    val t =("tom",22,"scala")

    //获取元组中的值格式: 使用下划线加脚标 ，例如 t._1 t._2 t._3
    println(t._1)
    println(t._2)
    println(t._3)


  }

}
