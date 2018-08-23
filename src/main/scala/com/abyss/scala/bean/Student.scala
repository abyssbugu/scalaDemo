package com.abyss.scala.bean

/**
  * Created by Abyss on 2018/8/23.
  * description:
  */
class Student(val name: String, var age: Int) {
  //主构造器会执行类定义的所有语句
  println("执行主构造器")
  private var gender: String = "male"

  def this(name: String, age: Int, gender: String) {
    //每个辅助构造器执行必须以主构造器或者其他辅助构造器的调用开始
    this(name, age)
    println("执行辅助构造器")
    this.gender = gender
  }

  override def toString = s"Student($gender, $name, $age)"
}

object Student {
  def main(args: Array[String]): Unit = {
    val st = new Student("tom", 22, "frmale")
    println(st.toString)
    val st1 = new Student("aa", 33)
    println(st1.toString)
  }
}

