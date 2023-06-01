fun main() {
    var shouldExit = false
    val todoList = mutableListOf<String>()

    println("==== TO-DO LIST APP v0.8 ====")
//    DELETE THIS WHEN DONE
    println(todoList)
    print("Please Enter your name: ")
    val name: String = readln()
    println("Welcome $name")
    while (!shouldExit) {
        println("==== CHOOSE MENU ====\n1. Add Name\n2. Add Activity\n3. Add Address\n4. Exit Program")
        print("Enter your choice: ")
        when (readln().toInt()) {
            1 -> {
                println("Infokan nama")
            }

            2 -> println("This is add activity")
            3 -> println("This is address")
            4 -> {
                println("Exiting now...")
                shouldExit = true
            }
        }
    }
//    DELETE THIS WHEN DONE
    println(todoList)
}