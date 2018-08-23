package com.abyss.scala

/**
  * Created by Abyss on 2018/8/23.
  * description: 条件表达式
  */
object ConditionDemo {
  def main(args: Array[String]): Unit = {

    val x = 1
    val y = if (x > 0) 1 else -1
    println(y)

    //支持混合类型的表达式
    val z= if (x > 1) 2 else "error"
    println(z)

    //如果确实else相当于if(x>2) 3 else ()
    val m = if (x>2) 3
    println(m)

    //在 scala 中每个表达式都有值，scala 中有个 Unit 类，用作不返回任何 结果的方法的结果类型,相当于 Java 中的 void，Unit 只有一个实例值，写成()
    val n = if (x > 2) 1 else ()
    println(n)
    //if 和 else if
    val k = if (x < 0) 0
    else if (x > 1) 1 else -1
    println(k)
  }


}
