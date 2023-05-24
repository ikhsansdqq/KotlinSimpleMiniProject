fun main() {
    var shouldExit = false
    val todoList = mutableListOf<String>()
    var userToDo: String?

    println("==== TO-DO LIST APP v1.89 ====")
    print("Please Enter your name: ")
    val name: String = readln()
    println("Welcome $name")

    println("==== CHOOSE MENU ====\n1. Add Name\n2. Add Activity\n3. Add Address\n4. Exit Program")
    print("Enter your choice: ")
    while (!shouldExit) {
        print("Enter your choice: ")
        when (readln().toInt()) {
            1 -> {
                // TODO: ADD TODO ITEM
                print("Enter to-do list today: ")
                userToDo = readlnOrNull()
                if (userToDo != null) {
                    todoList.add(userToDo)
                }
            }

            2 -> {
                // TODO: VIEW ALL TODO ITEMS
            }

            3 -> {
                // TODO: MARK A TODO ITEM AS COMPLETED
            }

            4 -> {
                // TODO: EXIT() PROGRAM
                shouldExit = true
            }

            else -> {
                println("Invalid number. Please enter rill number.")
            }
        }
    }
}