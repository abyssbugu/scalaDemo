package com.abyss.scala.traits

/**
  * Created by Abyss on 2018/8/24.
  * 在 Scala 中 trait 也可以继承 class，此时这个 class 就会成为所有继承 该 trait 的子类的超级父类
  */
class MyUtil {
  def printMsg(msg: String) = println(msg)
}

trait Logger_Two extends MyUtil {
  def log(msg: String) = this.printMsg("log: " + msg)
}

class Person_Three(val name: String) extends Logger_Two {
  def sayHello {
    this.log("Hi, I'm " + this.name)
    this.printMsg("Hello, I'm " + this.name)
  }
}

object Person_Three {
  def main(args: Array[String]) {
    val p = new Person_Three("Tom")
    p.sayHello
    //执行结果:
    //             log: Hi, I'm Tom //             Hello, I'm Tom
  }
}
