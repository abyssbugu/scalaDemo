package com.abyss.scala.cases

import scala.util.Random

/**
  * Created by Abyss on 2018/8/24.
  * description:
  */
object CaseDemo01 extends App {
  val arr = Array("hadoop", "zookeeper", "spark")
  val name = arr(Random.nextInt(arr.length))
  name match {
    case "hadoop" => println("大数据分布式存储和计算框架...")
    case "zookeeper" => println("大数据分布式协调服务框架...")
    case "spark" => println("大数据分布式内存计算框架...")
    case _ => println("我不认识你...")
  }
}
