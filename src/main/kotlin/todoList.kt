fun main() {
    val userCredentialInfo = HashMap<String, String>()
    var userFullName = ""
    var userPassword = ""
    val userActivities = ""
    userCredentialInfo[userFullName] = userPassword

    val userLoop = false

    println("==== CHOOSE MENU ====\n1. Register\n2. Login")
    print("Enter your choice: ")
    while (!userLoop) {
        when (readln().toInt()) {
            1 -> {
//                Register
                print("Enter your name:")
                userFullName = readln()
                print("Enter your password: ")
                userPassword = readln()
                userCredentialInfo[userFullName] = userPassword
                println("Success!")
            }

            2 -> {
//                Login
                println("Login")
            }

            else -> {
                println("Invalid type.")
                continue
            }
        }
        println(userCredentialInfo)
    }
}