package com.abyss.scala

/**
  * Created by Abyss on 2018/8/23.
  * description:
  */
object ImutSet {
  def main(args: Array[String]): Unit = {
    //定义一个不可变的 Set 集合
    val set = Set(1, 2, 3, 4, 5, 6, 7)
    //元素个数
    println("1: " + set.size)
    //取集合最小值
    println("2: "  + set.min)
    //取集合最大值
    println("3: " + set.max)
    //将元素和 set1 合并生成一个新的 set，原有 set 不变
    println("4: " + (set + 8))
    val set1 = Set(7, 8, 9)
    println("5: " + set1)
    //两个集合的交集
    println("6: " + (set & set1))
    //两个集合的并集
    println("7: " + (set ++ set1))
    //在第一个 set 基础上去掉第二个 set 中存在的元素
    println(set -- set1)
    //返回第一个不同于第二个 set 的元素集合
    println(set &~ set1)
    //计算符合条件的元素个数
    println(set.count(_ > 5))
    //返回第一个不同于第二个的元素集合
    println(set.diff(set1))
    //返回第一个不同于第二个的元素集合
    println(set1.diff(set))
    //取子 set(2,5 为元素位置, 从 0 开始，包含头不包含尾)
    println(set.slice(2, 5))
    //迭代所有的子 set，取指定的个数组合
    set1.subsets(2).foreach(x=>println(x))
  }

}
