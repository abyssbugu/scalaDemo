package com.abyss.scala.traits

/**
  * Created by Abyss on 2018/8/23.
  * Scala中的trait也能定义抽象field，而trait中的具体方法也能基于抽象field编写;  继承trait的类，则必须覆盖抽象field，提供具体的值;
  */
trait SayHelloTrait {
  val msg: String

  def sayHello(name: String) = println(msg + ", " + name)
}

class PersonForAbstractField(val name: String) extends SayHelloTrait { //必须覆盖抽象 field
  val msg = "Hello"

  def makeFriends(other: PersonForAbstractField) = {
    this.sayHello(other.name)
    println("I'm " + this.name + ", I want to make friends with you!!")
  }
}

object PersonForAbstractField {
  def main(args: Array[String]) {
    val p1 = new PersonForAbstractField("Tom")
    val p2 = new PersonForAbstractField("Rose")
    p1.makeFriends(p2)
  }
}
