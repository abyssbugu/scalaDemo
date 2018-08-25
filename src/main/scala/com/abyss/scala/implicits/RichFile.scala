package com.abyss.scala.implicits

import java.io.File

import scala.io.Source

/**
  * Created by Abyss on 2018/8/25.
  * 让 File 类具备 RichFile 类中的 read 方法
  */
object MyPredef{
  //定义隐式转换方法
  implicit def file2RichFile(file: File)=new RichFile(file)
}
class RichFile(val f: File) {
  def read() = {
    Source.fromFile(f).mkString
  }

}

object RichFile extends App {
  val f=new File("/Users/abyss/Dev/toys/wordcount/input/kkk.txt")
  //使用 import 导入隐式转换方法
  import MyPredef._
  //通过隐式转换，让 File 类具备了 RichFile 类中的方法
  val content=f.read()
  println(content)
}

