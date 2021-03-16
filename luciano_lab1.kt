import java.util.Scanner

fun main() {
    reverseString()
    evenNaturalNumbers()
    anagram()
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
	var n = Integer.valueOf(readLine())
	var even = 2
	var sum = 0

	print("The first ")
	print(n)
	println(" Even Natural Numbers are:" )

	for (i in 1..n){
		println(even)

        sum+=even
		even+=2
	}
	print("The sum of the first ")
	print(n)
	print(" Even Natural Numbers are: " )
	println(sum)
}

//Problem #3: Anagram

fun anagram(){
	println("Please input string 1: ")
	var str1 = readLine().toString()

	println("Please input string 2: ")
	var str2 = readLine().toString()
	
	print(str1)
	print(" and ")
	print(str2)

	//check if same length
	if(str1.length == str2.length){
		//sorting to make it easier to compare
		val arr1 = str1.toCharArray()
		val arr2 = str2.toCharArray()

		var strSorted1 = arr1.sorted()
		var strSorted2 = arr2.sorted()

		if(strSorted1 == strSorted2){
			println(" are anagrams")
		}
		else println(" are not anagrams")
	}

    else println(" are not anagrams")
}