package chapter_1

fun main() {
    var x = -5
    while (x < 3) {
        x++
        // if the "if" statement acts as an expression, then it must have a mandatory else condition
        // can't execute println(if (x > 0) "x is positive $x")
        println(if (x > 0) "x is positive $x" else "x isn't positive")
    }

}
