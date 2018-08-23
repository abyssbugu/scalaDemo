package com.abyss.scala.bean

/**
  * Created by Abyss on 2018/8/23.
  * description:
  */
class Child extends Father {
  //继承加上关键字
  override val name: String = "sub"

  //子类可以定义自己的 field 和 method
  val score = "A"

  def getScore = this.score

  override def getName: String = super.getName

}

object Child extends App {
  val c = new Child()
  println(c.getName)

}

