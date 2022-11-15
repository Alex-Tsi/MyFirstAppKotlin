package chapter_2

import kotlin.random.Random

fun main() {
    val wordArray1 = arrayOf("24/7", "multi-tier", "B-to-B", "dynamic", "pervasive")
    val wordArray2 = arrayOf("empowered", "leveraged", "aligned", "targeted")
    val wordArray3 = arrayOf("process", "paradigm", "solution", "portal", "vision")

    val array1Size = wordArray1.size
    val array2Size = wordArray2.size
    val array3Size = wordArray3.size

/*

    val rand1 = (Math.random() * array1Size).toInt()
    val rand2 = (Math.random() * array2Size).toInt()
    val rand3 = (Math.random() * array3Size).toInt()
*/

    val rand1 = Random.nextInt(array1Size)
    val rand2 = Random.nextInt(array2Size)
    val rand3 = Random.nextInt(array3Size)

    val phrase = "${wordArray1[rand1]} ${wordArray2[rand2]} ${wordArray3[rand3]}"
    println(phrase)
}