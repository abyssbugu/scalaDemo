package com.abyss.scala.cases

import scala.util.Random

/**
  * Created by Abyss on 2018/8/24.
  * description:
  */
object CaseDemo02 extends App {
  val arr = Array("hello", 1, 2.0, CaseDemo02)
  val v = arr(Random.nextInt(arr.length))
  println(v)
  v match {
    case x: Int => println("Int " + x)
    case y: Double if(y >= 0) => println("Double "+ y)
    case z: String => println("String " + z)
    case _ => throw new Exception("not match exception")
  }

//  注意:case y: Double if(y >= 0) => ... 模式匹配的时候还可以添加守卫条件。如不符合守卫条件，将掉入 case _中。
}
