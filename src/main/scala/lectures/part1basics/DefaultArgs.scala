package lectures.part1basics

import scala.annotation.tailrec

object DefaultArgs extends App {
  @tailrec
  private def trFact(n: Int, acc: Int = 1): Int = {
    if (n <= 1) acc
    else trFact(n - 1, acc * n)
  }
  
  private val fact10 = trFact(10, 2)
  println(fact10)
  
  private def savePicture(format: String = "jpg", width: Int = 1920, height: Int = 1080): Unit = println("saving picture")
  savePicture(width = 800)
  
  /*
  1. pass in every leading argument
  2. name the arguments
   */
  
  savePicture(height = 600, width = 800, format = "bmp" )
}
