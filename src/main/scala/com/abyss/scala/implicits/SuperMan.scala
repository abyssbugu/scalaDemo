package com.abyss.scala.implicits

/**
  * Created by Abyss on 2018/8/25.
  * description:
  */
class Man(val name: String)

class SuperMan(val name: String) {
  def heat = print("超人打怪兽")
}

object SuperMan {
  implicit def man2SuperMan(man: Man) = new SuperMan(man.name)

  def main(args: Array[String]): Unit = {
    val hero = new Man("hero")
    hero.heat

  }
}
