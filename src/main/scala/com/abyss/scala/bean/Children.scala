package com.abyss.scala.bean

/**
  * Created by Abyss on 2018/8/23.
  * Scala中的trait是一种特殊的概念;
  *  首先先将 trait 作为接口使用，此时的 trait 就与 Java 中的接口 (interface)非常类似;
  *  在trait中可以定义抽象方法，就像抽象类中的抽象方法一样，只要不给出方法的方法
  * 体即可;
  *  类可以使用 extends 关键字继承 trait，注意，这里不是 implement，而是 extends ，在
  * Scala 中没有 implement 的概念，无论继承类还是 trait，统一都是 extends;
  *  类继承后，必须实现其中的抽象方法，实现时，不需要使用 override 关键字;
  *  Scala 不支持对类进行多继承，但是支持多重继承 trait，使用 with 关键字即可。
  */

trait HelloTrait {
  def sayHello(): Unit
}

trait MakeFriendsTrait {
  def makeFriends(c: Children): Unit
}

class Children(val name: String) extends HelloTrait with MakeFriendsTrait with Cloneable with Serializable {
  override def sayHello(): Unit = println("Hello, " + this.name)

  override def makeFriends(c: Children): Unit = println("Hello, my name is " + this.name + ", your name is " + c.name)
}

object Children {
  def main(args: Array[String]) {
    val c1 = new Children("tom")
    val c2 = new Children("jim")
    c1.sayHello() //Hello, tom
    c1.makeFriends(c2) //Hello, my name is tom, your name is jim
  }
}
