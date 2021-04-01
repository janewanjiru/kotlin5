import java.util.*

fun main() {
    modulus()
    name()
    words()
    sentence()
    place()
    you()
    digits()
    array()
}

//modulus as operators
fun modulus(){
    var num1=80
    var num2=40
    var modulus =(80%60)
    println(modulus)
}

//strings
fun name(){
val x = "My name is"
val name = "Mary"
println(x + " " + name)

}

//string indexing
fun words() {
    val text = "way"
    print(text[0]) //Prints out "w"
    print(text[1]) //Prints out "a"
    println(text[2]) //Prints out "y"
}

//String interpolation
fun sentence() {
    val name = "Jey"
    val year = "2000"
    val sentence = "$name was born in $year"
    println(sentence)

}

//Array
fun place() {
    var country = arrayOf("Uganda", 400, 0.35, false)
    println(country[2]) //prints out false
}
//get an element to a certain index
fun you(){
var namesArray= arrayOf("Judith", "cate", "ann", "purity", "Nyc",)
var name = namesArray.get(2)
println(name)
}

//sorting Array
fun digits() {
    var numArray = arrayOf(10,14,32,6,43,2,75,8)
    var sortedNums = numArray.sortedArray()
    println(Arrays.toString(sortedNums))
}
//

fun array(){
    var numArray = arrayOf(10,14,32,6,43,2,75,8)
    var numElements = numArray.count()
    println(numElements) //8
    var sumElements = numArray.sum()
    println(sumElements)
//190
    var minValue = numArray.minOrNull()
    println(minValue)
//2
    var maxValue = numArray.maxOrNull()
    println(maxValue)
//75
}
