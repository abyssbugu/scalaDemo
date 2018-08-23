package com.abyss.scala

/**
  * Created by Abyss on 2018/8/23.
  * description:
  */
object ImmutMap {
  def main(args: Array[String]): Unit = {
    //定义 Map 集合
    //1.val map=Map(键 -> 值 , 键 -> 值...)
    //2.利用元组构建 val map=Map((键，值), (键，值) , (键，值)....) 展现形式:
    val map = Map("zhangsan" -> 30, "lisi" -> 40)
    println(map)

    val map2 = Map(("zhangsan", 30), ("lisi", 40))
    println(map2)
    //3.操作 map 集合
    //获取值: 值=map(键) 原则:通过先获取键，在获取键对应值。
    //4.遍历 map 集合
    val imap = Map("zhangsan" -> 20, "lisi" -> 30)
    println(imap)
    //方法一:显示所有的 key
    println(imap.keys)

    //方法二:显示所有的 key
    println(imap.keySet)
    //通过 key 获取 value
    println(imap("lisi"))
    //通过 key 获取 value 有 key 对应的值则返回，没有就返回默认值 0，
    println(imap.getOrElse("zhangsan", 0))
    //没有对应的 key，返回默认 0
    println(imap.getOrElse("zhangsan1", 0))
    //由于是不可变 map,故不能向其添加、删除、修改键值对
  }

}
