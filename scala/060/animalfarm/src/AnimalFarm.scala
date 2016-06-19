
// 060 Write a program that models an animal farm in OOP (animal, duck, sheep)
// Peter Isberg

object AnimalFarm extends App {
   println("Starting animal farm")
   
   val duck1: Animal = new Duck("Donald")
   println(duck1.toString())
   println(duck1.eat())
   
   val sheep1: Animal = new Sheep("Dolly")
   println(sheep1.toString())
   println(sheep1.eat())
   
   val animal1: Animal = new Animal("Ani")
   println(animal1.toString())
   println(animal1.eat())
}