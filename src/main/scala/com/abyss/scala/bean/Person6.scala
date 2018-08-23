package com.abyss.scala.bean

/**
  * Created by Abyss on 2018/8/23.
  * 跟 Java 一样，Scala 中同样可使用 protected 关键字来修饰 field 和 method。在 子类中，可直接访问父类的 field 和 method，而不需要使用 super 关键字;
  *  还可以使用protected[this]关键字，访问权限的保护范围:只允许在当前子类中访 问父类的 field 和 method，不允许通过其他子类对象访问父类的 field 和 method。
  */
class Person6 {
  protected var name: String = "tom"
  protected[this] var hobby: String = "game"

  protected def sayBye = println("再见...")
}

class Student6 extends Person6 {
  //父类使用 protected 关键字来修饰 field 可以直接访问
  def sayHello = println("Hello " + name)

  //父类使用 protected 关键字来修饰 method 可以直接访问
  def sayByeBye = sayBye

  def makeFriends(s: Student6) = {
    println("My hobby is " + hobby + ", your hobby is UnKnown")
  }
}

object Student6 {
  def main(args: Array[String]) {
    val s: Student6 = new Student6
    s.sayHello
    s.makeFriends(s)
    s.sayByeBye
  }
}