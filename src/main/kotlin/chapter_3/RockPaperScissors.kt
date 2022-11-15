package chapter_3

import kotlin.random.Random

fun main() {
    val gameOptions = arrayOf("Rock", "Paper", "Scissors")
    val gameChoice = getGameChoice(gameOptions)
    val userChoice = getUserChoice(gameOptions)
    printResult(gameChoice, userChoice)
}

private fun getGameChoice(gameVariants: Array<String>): String {
    return gameVariants[Random.nextInt(gameVariants.size)]
}

private fun getUserChoice(gameVariants: Array<String>): String {
    print("Please enter one of the following:")
    for (item in gameVariants) print(" $item")
    println(".")
    var userChoice = readLine()
    while (userChoice == null || userChoice !in gameVariants) {
        println("You must enter a valid choice.")
        userChoice = readLine()
    }
    return userChoice
}

private fun printResult(userChoice: String, gameChoice: String) {
    val result: String = if (userChoice == gameChoice) "Tie!"
    else if ((userChoice == "Rock" && gameChoice == "Scissors") ||
        (userChoice == "Paper" && gameChoice == "Rock") ||
        (userChoice == "Scissors" && gameChoice == "Paper")
    ) "You win!"
    else "You lose!"
    println("You chose $userChoice. I chose $gameChoice. $result")
}

//    println(for ((index, item) in gameVariants.withIndex()) "$item") // not allowed. foreach is not expression
