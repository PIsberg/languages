import scala.io.StdIn.readLine;

object Main extends App {
    var input = readLine();
    
    if( input != null)
        println("Hey " + input + "!")
    else
        println("Please provide your name as input")
}