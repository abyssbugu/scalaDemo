package com.abyss.scala

/**
  * Created by Abyss on 2018/8/23.
  * description:方法和函数的区别
  */
object MethodAndFunction {

  /*    方法和函数的区别
    在函数式编程语言中，函数是“头等公民”，它可以像任何其他数据类型一 样被传递和操作，函数是一个对象，继承自 FuctionN。
    函数对象有 apply、curried、toString、tupled 这些方法。而方法不具有这些 特性。*/
  def main(args: Array[String]): Unit = {
    println(m2(f1))
    println(m2(f2))

//    将方法转换成函数，只需要在方法的后面加上一个下划线
    val f3 =m2 _
    println(f3)
  }

  //定义一个方法
  //方法 m2 参数要求是一个函数，函数的参数必须是两个 Int 类型 //返回值类型也是 Int 类型
  def m2(f: (Int, Int) => Int): Int = {
    f(2, 6)
  }

  //定义一个函数 f1，参数是两个 Int 类型，返回值是一个 Int 类型
  val f1 = (x: Int, y: Int) => x + y
  val f2 = (x: Int, y: Int) => x * y


}
