package com.abyss.scala.bean

/**
  * Created by Abyss on 2018/8/23.
  * 在实际的开发中，比如 spark 源码中，大量的地方使用了模式匹配的语法进行类型的 判断，这种方式更加地简洁明了，而且代码的可维护性和可扩展性也非常高;
  *  使用模式匹配，功能性上来说，与 isInstanceOf 的作用一样，主要判断是否为该类或 其子类的对象即可，不是精准判断。
  *  等同于 Java 中的 switch case 语法;
  */
class Person5 {

}

class Student5 extends Person5

object Student5 {
  def main(args: Array[String]) {
    val p: Person5 = new Student5
    p match {
      // 匹配是否为 Person 类或其子类对象
      case per: Person5 => println("This is a Person5's Object!")
      // 匹配所有剩余情况
      case _ => println("Unknown type!")
    }
  }
}