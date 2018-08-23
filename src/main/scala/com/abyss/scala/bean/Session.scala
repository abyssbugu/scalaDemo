package com.abyss.scala.bean

/**
  * Created by Abyss on 2018/8/23.
  * object 相当于 class 的单个实例，通常在里面放一些静态的 field 或者 method; 在 Scala 中没有静态方法和静态字段，但是可以使用 object 这个语法结构来达到同样的
  * 目的。
  * object 作用:
  * 1.存放工具方法和常量
  * 2.高效共享单个不可变的实例
  * 3.单例模式
  */
class Session {}

object SessionFactory {
  //该部分相当于 java 中的静态块
  val session = new Session

  //在 object 中的方法相当于 java 中的静态方法
  def getSession(): Session = {
    session
  }
}

object SingletonDemo {
  def main(args: Array[String]) {
    //单例对象，不需要 new，用【单例对象名称.方法】调用对象中的方法
    val session1 = SessionFactory.getSession()
    println(session1)
    //单例对象，不需要 new，用【单例对象名称.变量】调用对象中成员变量
    val session2 = SessionFactory.session
    println(session2)
  }
}
