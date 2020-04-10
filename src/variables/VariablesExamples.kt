package variables

fun main(args: Array<String>) {
    println("Enter your age")
    val age = readLine()!!.toShort()
    println("Your age is: $age")
    println("Enter your name")
    val name = readLine()
    println("Your name is: $name")
    println("Enter number")
    val number: Short = readLine()!!.toShort()
    println("Your age in $number years will be ${age + number}")
}