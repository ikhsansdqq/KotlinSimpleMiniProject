const val APP_NAME = "GUESSING GAME"
const val VERSION = "0.0.1"
fun main() {
    val welcomeWagon: String = """
        Welcome to $APP_NAME,
        our app version is $VERSION
    """.trimIndent()

    val player: Array<String> = arrayOf("Arthur", "John", "Charles")
//    val playerAge: Array<Int> = arrayOf(30, 23, 29)
//    val jobCount: Array<Int?> = arrayOfNulls(4)

//    val range = 1..100
    val downRange = 100 downTo 0 step 10

    println(welcomeWagon)
    println(player[0])
    player[0] = "Dutch"
    println(player.size)

    println(downRange.step)
}