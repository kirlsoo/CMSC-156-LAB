import java.util.Scanner

fun main() {
    reverseString()
    evenNaturalNumbers()
}


//Problem #1: Reverse a String
fun reverseString(){
	println("Please input string you want to reverse: ")
	var str = readLine()					//user input
    println(str)
    var reverse = str.toString().reversed()		//used toString because input could not be a string or null
    println(reverse)
}

//Problem #2: Even Natural Numbers
fun evenNaturalNumbers(){
	println("Please input number of Even Natural Numbers (n): ")
	var n = readLine()

	
}