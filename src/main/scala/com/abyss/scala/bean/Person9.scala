package com.abyss.scala.bean

/**
  * Created by Abyss on 2018/8/23.
  * 如果在父类中，有某些方法无法立即实现，而需要依赖不同的子类来覆盖，重写实现 不同的方法。此时，可以将父类中的这些方法编写成只含有方法签名，不含方法体的 形式，这种形式就叫做抽象方法;
  *  一个类中，如果含有一个抽象方法或抽象field，就必须使用abstract将类声明为抽 象类，该类是不可以被实例化的;
  *  在子类中覆盖抽象类的抽象方法时，可以不加override关键字;
  */
abstract class Person9(val name: String) { //必须指出返回类型，不然默认返回为 Unit def sayHello:String
  def sayBye: String
}

class Student9(name: String) extends Person9(name) {
  //必须指出返回类型，不然默认
  def sayHello: String = "Hello," + name

  def sayBye: String = "Bye," + name
}

object Student9 {
  def main(args: Array[String]) {
    val s = new Student9("tom")
    println(s.sayHello)
    println(s.sayBye)
  }
}