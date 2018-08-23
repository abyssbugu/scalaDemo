package com.abyss.scala.bean

/**
  * Created by Abyss on 2018/8/23.
  * isInstanceOf 只能判断出对象是否为指定类以及其子类的对象，而不能精确的判断出， 对象就是指定类的对象;
  *  如果要求精确地判断出对象就是指定类的对象，那么就只能使用 getClass 和 classOf 了;
  *  p.getClass 可以精确地获取对象的类，classOf[XX] 可以精确的获取类，然后使用 == 操作符即可判断;
  */
class Person4 {

}

class Student4 extends Person4
object Student4{
  def main(args: Array[String]) {
    val p:Person4=new Student4
    //判断 p 是否为 Person4 类的实例
    println(p.isInstanceOf[Person4])//true
    //判断 p 的类型是否为 Person4 类
    println(p.getClass == classOf[Person4])//false
    // 判断 p 的类型是否为 Student4 类
    println(p.getClass == classOf[Student4])//true
  } }
