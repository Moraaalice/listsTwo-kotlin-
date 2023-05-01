fun main(){
    var specific =  listOfStr(listOf("ann","juana","anita","mark","alice"))
    println(specific)
    //
    var digits = arrOfdigits(arrayOf(12,3,1,89,43,29,50))
    println(digits)
    //
    var counting = count("alice")
    println(counting)
    //
     takelist(listOf(12,3,7,4,9,8,2,11))
    //
    var x = search(arrayOf(12,67,34,90,23,34,24))
    println(x)
    //
  var y = sorting(arrayOf("kampala","uganda","kisumu","kiss"))
    println(y)
    //
    var d = double(listOf(3,5,8,2,7))
    println(d)
    occurences("aliciaa")
    //
     replaceStr("I love kotlin,kotlin is a good language")

}
//Given a list of strings, write a Kotlin function that returns a new list containing only
// the strings that start with a specific prefix
fun listOfStr(str:List<String>):List<String>{
    var new = mutableListOf<String>()
    for (s in str){
    var check = str.filter { s -> s.startsWith('a') }
        new.addAll(check)
}
    return  new
}

//Given an array of integers, write a Kotlin function that finds and returns the maximum value in an array
fun arrOfdigits(nums:Array<Int>):Int{
    var maximum = nums.max()
    return maximum
}
//Write a Kotlin Function that accepts a string as a parameter and counts returns the
// number of vowels within the string
fun count(word:String):Int{
    var sum = 0
    for (w in word){
         word.contains("aeiouAEIOU")
        sum++
    }
    return sum
}

//Write a Kotlin function that takes a list of integers and removes the odd numbers
fun takelist(numb:List<Int>){
    for (n in numb){
        var remove = numb.filter { n -> n%2 == 0 }
        println(remove)
    }
}
//Given an array of integers, write a Kotlin function that searches for a specific value
// and returns its index
fun search(nums:Array<Int>):Int{
    var searching = nums.indexOf(24)
    return searching
}
//Given an array of strings, write a Kotlin function that sorts the string in alphabetical
// order and returns the sorted array
fun sorting(strs:Array<String>):Array<String>{
   var checking = strs.sort()
    return checking
}
//Given a list of integers, write a Kotlin function that doubles each value in the list and
// returns a new list with the doubled values
fun double(numbers:List<Int>):List<Int>{
    var doubled = mutableListOf<Int>()
    for (n in numbers){
        var doubling = numbers.map { n -> n*2 }
        doubled.addAll(doubling)
    }
    return doubled
}
//Given a string, write a Kotlin function that counts the number of occurrences of a specific
// substring within the string
fun occurences(name:String){
    var count = 0
    var character = 'a'
    for (n in 0..name.length){
        if (character == name[1]){
            count++
        }

        println(count)
    }
}
//Write a Kotlin function that takes a string and replaces all  occurrences of a specific
// substring with a new substring
fun replaceStr(place:String){
    var replace = place.replace("kotlin","python")
    println(replace)
}
//Imagine you are building a simple banking system in Kotlin.Create a class that includes
// a base class “Account ” with common properties like account number,balance .
// Implement these methods where a person can deposit,withdraw money.Implement savings account too.
class Account(var accountNumber:Int,var accountBalance:Int,var accountName:String){
    fun deposit(deposits:Double){

    }
    fun withdraw(withdrawals:Double){

    }
    fun savings(saving:Double){

    }
}

//


