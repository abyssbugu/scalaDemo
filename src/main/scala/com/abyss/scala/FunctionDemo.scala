package com.abyss.scala

/**
  * Created by Abyss on 2018/8/23.
  * description:调用方法和函数
  */
object FunctionDemo {

  def main(args: Array[String]): Unit = {
    /*    Scala 中的+ - * / %等操作符的作用与 Java 一样，位操作符 & | ^ >> <<也一样。 只是有一点特别的:这些操作符实际上是方法。例如:
          a+b
        是如下方法调用的简写:
          a.+(b)
        a 方法 b 可以写成 a.方法(b)*/
    println(m1(2, 3))

    //    方法的返回值类型可以不写，编译器可以自动推断出来，但是对于递归函数，必 须指定返回类型
    println(m2(5))


  }

  def m1(x: Int, y: Int): Int = x * y

  def m2(x: Int): Int = {
    if (x <= 1) 1
    else m2(x - 1) * x
  }


}
