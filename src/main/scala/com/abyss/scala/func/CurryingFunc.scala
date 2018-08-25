package com.abyss.scala.func

/**
  * Created by Abyss on 2018/8/25.
  * 柯里化(Currying)指的是把原来接受多个参数的函数变换成接受一个参数的 函数过程，并且返回接受余下的参数且返回结果为一个新函数的技术。
  */
object CurryingFunc extends App {
  def m(x: Int) = (y: Int) => x * y

  //3*y
  val func1: Int => Int = m(3)
  //3*2
  val result = func1(2)
  println(result)


  //  普通的非柯里化的函数定义，实现一个加法函数:
  def plainOldSum(x: Int, y: Int) = x + y

  //  使用“柯里化”技术来定义这个加法函数，原来函数使用一个参数列表，“柯 里化”，把函数定义为多个参数列表:
  def curriedSum(x: Int)(y: Int) = x + y

  //  当你调用 curriedSum (1)(2)时，实际上是依次调用两个普通函数(非柯里化函数)， 第一次调用使用一个参数 x，返回一个函数类型的值，
  //  第二次使用参数 y 调用这个函数类型的值

  //  使用下面两个分开的定义在模拟curriedSum柯里化函数:
  //    首先定义第一个函数:
  def first(x: Int) = (y: Int) => x + y

  //  然后我们使用参数 1 调用这个函数来生成第二个函数:
  val second = first(1)
  //  second: Int => Int = <function1>
  second(2)

  val onePlus = curriedSum(1) _
  //  onePlus: Int => Int = <function1>
  //   下划线“_” 作为第二参数列表的占位符， 这个定义的返回值为一个函数，当调用时会给 调用的参数加一。
  println(onePlus(2))


}
