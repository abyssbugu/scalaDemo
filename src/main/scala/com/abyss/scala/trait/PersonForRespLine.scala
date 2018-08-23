package com.abyss.scala.`trait`

/**
  * Created by Abyss on 2018/8/23.
  * Scala中支持让类继承多个trait后，可依次调用多个trait中的同一个方法， 只要让多个 trait 中的同一个方法，在最后都依次执行 super 关键字即可;
  *  类中调用多个 trait 中都有的这个方法时，首先会从最右边的 trait 的方法开 始执行，然后依次往左执行，形成一个调用链条;
  *  这种特性非常强大，其实就是设计模式中责任链模式的一种具体实现;
  */

trait HandlerTrait {
  def handle(data: String) = {
    println("last one")
  }
}

trait DataValidHandlerTrait extends HandlerTrait {
  override def handle(data: String) = {
    println("check data: " + data)
    super.handle(data)
  }
}

trait SignatureValidHandlerTrait extends HandlerTrait {
  override def handle(data: String) = {
    println("check signature: " + data)
    super.handle(data)
  }
}

class PersonForRespLine(val name: String) extends SignatureValidHandlerTrait with DataValidHandlerTrait {
  def sayHello = {
    println("Hello, " + this.name)
    this.handle(this.name)
  }
}

object PersonForRespLine {
  def main(args: Array[String]) {
    val p = new PersonForRespLine("tom")
    p.sayHello
    //执行结果:
    //         Hello, tom
    //         check data: tom
    //         check signature: tom //         last one
  }
}

