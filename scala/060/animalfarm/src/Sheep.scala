

class Sheep(name: String) extends Animal(name: String) {
  override def toString(): String = this.getClass.getName + " " + name + " says beeeh";
  
  override def eat() = { 
     println(this.getClass.getName + " eating yummy grass") 
  }
}