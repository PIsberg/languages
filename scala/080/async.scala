import scala.concurrent.Future
import scala.concurrent.blocking
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

object Main extends App {

    
println("Start async execution")
  val f = Future {
    123
  }

  f.onComplete {
    case Success(value) => println(s"Finished async execution, callback value = $value")
    case Failure(e) => e.printStackTrace
  }
  
      
   println("Continue execution")
    
}