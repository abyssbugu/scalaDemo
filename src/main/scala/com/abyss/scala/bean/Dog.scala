package com.abyss.scala.bean

/**
  * Created by Abyss on 2018/8/23.
  * 如果有一个class文件，还有一个与class同名的object文件，那么就称这个object 是 class 的伴生对象，class 是 object 的伴生类;
  * 伴生类和伴生对象必须存放在一个.scala文件中;
  * 伴生类和伴生对象的最大特点是，可以相互访问;
  */
//伴生类
class Dog {
  val id = 1
  private var name = "itcast"

  def printName(): Unit = {
    //在 Dog 类中可以访问伴生对象 Dog 的私有属性
    println(Dog.CONSTANT + name)
  }
}

//伴生对象
object Dog {
  //伴生对象中的私有属性
  private val CONSTANT = "汪汪汪 : "
  def main(args: Array[String]) {
    val p = new Dog
    //访问私有的字段name
    p.name = "123"
    p.printName()
  }
}