

class Animal(name: String) {
  override def toString(): String = this.getClass.getName + " " + name + " says ?"
  def eat() = { 
     println(this.getClass.getName + " eating") 
  }
}