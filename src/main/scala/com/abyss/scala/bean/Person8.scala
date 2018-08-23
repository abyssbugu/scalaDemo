package com.abyss.scala.bean

/**
  * Created by Abyss on 2018/8/23.
  * 在Scala中，匿名内部类是非常常见的，而且功能强大。Spark的源码中大量的使用了 匿名内部类;
  *  匿名内部类，就是定义一个没有名称的子类，并直接创建其对象，然后将对象的引用赋 予一个变量，即匿名内部类的实例化对象。然后将该对象传递给其他函数使用。
  */
class Person8(val name: String) {
  def sayHello = "Hello ,I'm " + name
}

class GreetDemo {
  //接受 Person8 参数，并规定 Person8 类只含有一个返回 String 的 sayHello 方法
  def greeting(p: Person8 {
    def sayHello: String}) = {
    println(p.sayHello)
  }
}

object GreetDemo {
  def main(args: Array[String]) {
    //创建 Person8 的匿名子类对象
    val p=new Person8("tom")
    val g=new GreetDemo
    g.greeting(p)
  }
}