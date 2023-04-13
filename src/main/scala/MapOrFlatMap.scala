package com.knoldus

object MapOrFlatMap extends App {
 private val list = List(1,2,3,4)
  private val listTwo = List(List(1,2),List(2,3),List(4,5))
 private val flattennedList = listTwo.flatMap(newList => newList.map(value => value * value))
  private val mappedList = list.map(value => value * value )
  println(flattennedList)
  println(mappedList)
}
