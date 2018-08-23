package com.abyss.scala

/**
  * Created by Abyss on 2018/8/23.
  * description:
  */
object ImmutListDemo {
  def main(args: Array[String]): Unit = {
    //创建一个不可变的集合
    val lst1 = List(1, 2, 3)
    //补充:另一种定义 list 方法
    val other_lst = 2 :: Nil
    //获取集合的第一个元素
    val first = lst1.head
    //获取集合中除第一个元素外的其他元素集合,
    val tail = lst1.tail
    //补充:其中如果 List 中只有一个元素，那么它的 head 就是这个元素，它的 tail 就是 Nil; println(other_lst.head+"----"+other_lst.tail)
    //将 0 插入到 lst1 的前面生成一个新的 List
    val lst2 = 0 :: lst1
    val lst3 = lst1.::(0)
    val lst4 = 0 +: lst1
    val lst5 = lst1.+:(0)
    //将一个元素添加到 lst1 的后面产生一个新的集合
    val lst6 = lst1 :+ 3
    val lst0 = List(4, 5, 6)
    //将 2 个 list 合并成一个新的 List
    val lst7 = lst1 ++ lst0
    //将 lst0 插入到 lst1 前面生成一个新的集合
    val lst8 = lst1 ++: lst0
    //将 lst0 插入到 lst1 前面生成一个新的集合
    val lst9 = lst1.:::(lst0)
    println(other_lst)
    println(lst1)
    println(first)
    println(tail)
    println(lst2)
    println(lst3)
    println(lst4)
    println(lst5)
    println(lst6)
    println(lst7)
    println(lst8)
    println(lst9)
  }

}
