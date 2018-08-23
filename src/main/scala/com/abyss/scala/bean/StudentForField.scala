package com.abyss.scala.bean

/**
  * Created by Abyss on 2018/8/23.
  * Scala 中的 trait 可以定义具体的 field，此时继承 trait 的子类就自动获得了 trait 中定义的 field;
  *  但是这种获取 field 的方式与继承 class 的是不同的。如果是继承 class 获 取的 field ，实际上还是定义在父类中的;而继承 trait 获取的 field，就直 接被添加到子类中了。
  */
trait PersonForField {
  val age: Int = 50
}

//继承 trait 获取的 field 直接被添加到子类中
class StudentForField(val name: String) extends PersonForField {
  def sayHello = println("Hi, I'm " + this.name + ", my age is " + this.age)
}

object StudentForField {
  def main(args: Array[String]) {
    val s = new StudentForField("tom")
    s.sayHello
  }
}
