

// 050 Write a program that reads a file and writes the contents to another file (i/o)
// Peter Isberg


import scala.io.Source
import scala.io._
import java.io._
import scala.io.Codec

object testio extends App {
   
  val fileInputName : String = "C:\\Users\\Administrator\\workspace\\io\\src\\main\\resources\\fileInput.txt"
  
  var fileContent: String = readFile(fileInputName, Codec.UTF8.decoder)
  
  println("Content of the file is " + fileContent)
  
  val fileOutName : String = "C:\\Users\\Administrator\\workspace\\io\\src\\main\\resources\\fileOutput.txt"
  
  writeFile(fileContent, fileOutName, "UTF-8")
  
  def readFile(fileInputName: String, decoder: Codec): String = {
    
    println("Trying to read file: " + fileInputName)
    
    val contentBuilder = StringBuilder.newBuilder
    val source = Source.fromFile(fileInputName)(decoder)
    try {
      var nbrOfLines: Int = 0
      for(line <- source.getLines()) {
        contentBuilder.append(line + "\n")
        nbrOfLines+=1
      }
      
      println("File contained " + nbrOfLines + " lines")
    } catch {
      case ex: FileNotFoundException => println("Could not find file.")
      case ex: IOException => println("Had an IOException trying to read that file")
    }
    finally {
      source.close()
    }
    
    return contentBuilder.toString()
  }
  
  
  def writeFile(fileContent: String, fileOutName: String, encoding: String)= {
    
    println("Trying to write file: " + fileOutName)
    var fileOutput: File = new File(fileOutName)
  
    val printWriter = new java.io.PrintWriter(fileOutput)
  
    try { 
        printWriter.write(fileContent)
       } catch {
      case ex: FileNotFoundException => println("Could not find file.")
      case ex: IOException => println("Had an IOException trying to read that file")
    }
      finally { 
        printWriter.close() }
    }

}