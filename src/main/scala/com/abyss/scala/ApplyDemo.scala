package com.abyss.scala

/**
  * Array 类的伴生对象中，就实现了可接收变长参数的 apply 方法，
  * 并通过创建一个 Array 类的实例化对象，实现了伴生对象的构造函数功能
  * 指定 T 泛型的数据类型，并使用变长参数 xs 接收传参，返回 Array[T] 数组 通过 new 关键字创建 xs.length 长的 Array 数组
  * 其实就是调用 Array 伴生类的 constructor 进行 Array 对象的初始化
  * def apply[T: ClassTag](xs: T*): Array[T] = {
  * val array = new Array[T](xs.length)
  * var i=0
  * for (x <- xs.iterator) { array(i) = x; i += 1 }
  * array
  * }
  *
  **/


object ApplyDemo {

  def main(args: Array[String]) {
    //调用了 Array 伴生对象的 apply 方法
    //def apply(x: Int, xs: Int*): Array[Int]
    // arr1 中只有一个元素 5
    val arr1 = Array(5)
    //new 了一个长度为 5 的 array，数组里面包含 5 个 null
    var arr2 = new Array[Int](5)

    println(arr1.toBuffer)
    var i = 0

    for (x <- arr2.iterator) {
      println(x);arr2(i) =i;i += 1}
    for (x<-arr2.indices){
      println(arr2(x))
    }
  }
}
