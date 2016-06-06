
// encoded/decode morse-code in Scala
// encoded according to http://morsecode.scphillips.com/morse2.html
// Peter Isberg

object Main extends App {
    var morseCodes:Map[String,String] = Map()
    morseCodes += ("s" -> "...")
    morseCodes += ("o" -> "---")
    
    var englishInput: String = "sos"
    var morseInput: String = "...---..."

    println( "Keys in morseCodes : " + morseCodes.keys )
    println( "Values in morseCodes : " + morseCodes.values )
    
    // english to morse
    print("Translating morse code for english" + englishInput + " to ")
    translate(englishInput, morseCodes)
    //println("")
    //morseCodes.map(_.swap)
    //print("Translating english for morse code" + morseInput + " to ")
    //translate(morseInput, morseCodes)

    def translate(input: String, morseCode: Map[String,String]) = {
      for (i <- 0 until input.length) {
        if(morseCodes.contains(input(i))) {
            print(morseCodes.apply(input(i))) // key to value
        }
        else {
            println("missing translation for key " + input(i))
        }
      }
    }
    
}

