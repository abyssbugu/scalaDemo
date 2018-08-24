package com.abyss.scala.traits

/**
  * Created by Abyss on 2018/8/24.
  * description:
  */
class Person_One {
  println("Person's constructor!")
}

trait Logger_One {
  println("Logger's constructor!")
}

trait MyLogger_One extends Logger_One {
  println("MyLogger's constructor!")
}

trait TimeLogger_One extends Logger_One {
  println("TimeLogger's contructor!")
}

