package com.abyss.scala.bean

/**
  * Created by Abyss on 2018/8/23.
  * 如果在父类中，定义了field，但是没有给出初始值，则此field为抽象field;
  */
abstract class Person10(val name: String) {
  //抽象 fields
  val age: Int
}

class Student10(name: String) extends Person10(name) {
  val age: Int = 50
}