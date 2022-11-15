package chapter_3

fun main() {

    for (x in 1..3) println(x) // 1 2 3

    for (x in 1 until 3) println(x) // 1 2

    for (x in 3 downTo 1) println(x) // 3 2 1

    for (x in 4 downTo 0 step 2) println(x) // 4 2 0

    println(1 until 5 step 2)

    val listInts = listOf(1, 2)
    listInts.funPrintFromList()
}

fun <T> List<T>.funPrintFromList() {
    this.forEach(::println)
}
