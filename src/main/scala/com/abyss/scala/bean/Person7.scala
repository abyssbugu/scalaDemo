package com.abyss.scala.bean

/**
  * Created by Abyss on 2018/8/23.
  * Scala中，每个类都可以有一个主constructor和任意多个辅助constructor，而且每 个辅助 constructor 的第一行都必须调用其他辅助 constructor 或者主 constructor 代码;因此子类的辅助 constructor 是一定不可能直接调用父类的 constructor 的;
  *  只能在子类的主constructor中调用父类的constructor。
  *  如果父类的构造函数已经定义过的field，比如name和age，子类再使用时，就不
  * 要用 val 或 var 来修饰了，否则会被认为，子类要覆盖父类的 field，且要求一定
  * 要使用 override 关键字。
  */
class Person7(val name: String, val age: Int) {
  var score: Double = 0.0
  var address: String = "beijing"

  def this(name: String, score: Double) = {
    //每个辅助 constructor 的第一行都必须调用其他辅助 constructor 或者主 constructor 代码
    // 主 constructor 代码
    this(name, 30)
    this.score = score
  }

  //其他辅助 constructor
  def this(name: String, address: String) = {
    this(name, 100.0)
    this.address = address
  }
}

class Student7(name: String, score: Double) extends Person7(name, score)
