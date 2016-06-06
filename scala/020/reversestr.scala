
// reverse a string in Scala
// Peter Isberg

object Main extends App {
    //var alfabet = "abcd"  //non-type safe
    val alfabet: String = "abcd" //type safe
    var len: Integer = alfabet.length();
    println( "String Length is : " + len );
    
    var alfabetArr: Array[Char] = alfabet.toCharArray
    var alfabetList: List[Char] = alfabet.toList         

    printList(alfabetList.sortWith(_ > _))
    
    println("Reverse list")
    def printList(args: TraversableOnce[_]): Unit = { //TraversableOnce is something even more general than List
        args.foreach(print)
    }
    
    println("Reverse char array")
    for (i <- (0 until alfabetArr.length).reverse) {
        print(alfabetArr(i))
    }
}

