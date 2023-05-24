fun readIntInputs(prompt: String): Int {
    while (true) {
        try {
            print(prompt)
            return readLine()?.toInt() ?: 0
        } catch (e: NumberFormatException) {
            println("Invalid input. Please enter a valid number.")
        } catch (e: Exception) {
            println("An error occurred while reading input.")
            break
        }
    }
    return 0
}

fun main() {
    val randomNumber = (1..10).random()
    var guess: Int
    var attempt = 1
    println("==== WELCOME TO GUESSING GAME ====")

    println("Let's Start!")
    println("Guess the number from 1-10\n")
    while (true) {
        guess = readIntInputs("")
        when {
            guess == randomNumber -> {
                println("Correct on Attempt No. $attempt")
                break
            }
            guess < randomNumber -> println("Your answer is less than the number.")
            guess > randomNumber -> println("Your answer is more than the number.")
            else -> println("Invalid Input")
        }

        attempt++
    }
}