package com.app.bajaj.extractor

import scala.io._
object Flow {
  def main(args: Array[String]): Unit = {

//    val path:String = "/home/hadoop/Documents/docs/ds/SFFoodProgram/businesses_plus.csv"
    val path:String ="/home/hadoop/Documents/dataset/marvel-superheroes/characters.csv"
    val charcterSet:String= "ISO-8859-1"

    val file = Source.fromFile(path,charcterSet).getLines()
//    file.foreach(r=>println(r))
    val a = new StringBuilder()
//    b.foreach(println)
    println(file.addString(a,"#&*"))
//    file.toStream.foldLeft()

//    println(file.count(r=> r.contains("SAN")))




  }
}
