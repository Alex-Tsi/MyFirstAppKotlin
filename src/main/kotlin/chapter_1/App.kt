package chapter_1

fun main(@Suppress("UNUSED_PARAMETER") args: Array<String>) { // alternative fun main declaration fun main() { }
    var x = 1
    println("Before the loop. x = $x.")
    while (x < 4) {
        println("In the loop. x = $x.")
        x++
    }
    println("After the loop. x = $x.")
}