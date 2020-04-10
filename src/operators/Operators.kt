package operators

fun main(args: Array<String>) {
    var a : Int
    var b : Int
    println("Enter a first value")
    a = readLine()!!.toInt()
    println("Enter second value")
    b = readLine()!!.toInt()
    val sum = a + b
    val product = a * b
    val modulo = a % b
    println("sum of $a and $b is $sum")
    println("Product of $a and $b is $product")
    println("Modulo of $a and $b is $modulo")
}
