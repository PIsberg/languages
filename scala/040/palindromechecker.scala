
//Palindrome checker
//A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward. E.g racecar, radar
// Peter Isberg

import scala.util.control.Breaks._;

object Main extends App {
    
   var palindrome: String = "racecar"
   var nonPalindrome: String = "banana"
     
   checkPalindrome(palindrome)
   checkPalindrome(nonPalindrome)
   
   checkPalindrome2(palindrome)
   checkPalindrome2(nonPalindrome)

    def checkPalindrome(input: String): Boolean = {
        println()
        var result = false
        if(input != null) {
            println( "Is " + input + " a palindrome? " )
            if(input == input.reverse) { // the scala way
                result = true;
            }
            print(result )
        }
        return result;
    }
    
    def checkPalindrome2(input: String): Boolean = {
        println()
        var result = false
        if(input != null) {
            println( "Is " + input + " a palindrome? " )
            for (i <- 0 until input.length; r <- (0 until input.length).reverse) { // the generic non-scala way
                if(input(i) != input(r)) {
                     result = false
                     //break //Not working in glot.io?
                }
                else {
                    result = true
                }
            }
            print(result )
        }
        return result;
    }
}