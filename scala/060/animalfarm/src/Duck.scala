

class Duck(name: String) extends Animal(name: String){
  override def toString(): String = this.getClass.getName + " " + name + " says quack";
}