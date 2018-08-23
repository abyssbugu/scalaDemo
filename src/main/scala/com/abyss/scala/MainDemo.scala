package com.abyss.scala

/**
  * Created by Abyss on 2018/8/23.
  * 同 Java 一样，如果要运行一个程序，必须要编写一个包含 main 方法的类;
  *  在 Scala 中，也必须要有一个 main 方法，作为入口;
  *  Scala 中的 main 方法定义为 def main(args: Array[String])，而且必须定义在 object 中;
  *  除了自己实现 main 方法之外，还可以继承 App Trait，然后，将需要写在 main 方法
  * 中运行的代码，直接作为 object 的 constructor 代码即可，而且还可以使用 args 接收
  * 传入的参数;
  */
object MainDemo {
  def main(args: Array[String]): Unit = {
    if (args.length > 0) {
      println("Hello, " + args(0))
    } else {
      println("Hello World!")
    }
  }
}

object MainDemo2 extends App {
  if (args.length > 0) {
    println("Hello, " + args(0))
  } else {
    println("Hello Abyss!")
  }
}
