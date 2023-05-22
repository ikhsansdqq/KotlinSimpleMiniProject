fun main() {
//   COFFEE SHOP CUSTOMER SUPPORT PROGRAM
    print("Hi! May I have your name? ")
    val customerName = readln()
    println("What would you like to order for today Mr. $customerName?")
    println("We have \n1. Latte ($4.16)\n2. Ice Coffee ($2.25)\n3. Chocolate ($2.39)")
    print("May I inquire about your preferred choice of beverages? ")
    val menuPick = readln().toInt()
    when (menuPick) {
        1 -> {
            println("Thank you! Your Latte will be prepared within a few minutes. We appreciate your choice and hope you enjoy your drink!")
        }

        2 -> {

        }

        3 -> {

        }

        else -> {
            println("It seems that you haven't chosen any beverages. That's perfectly alright. I hope you have a pleasant day! :)")
        }
    }

//    NANTI MASUKIN SALDO BUYERS
//    TERUS KURANGIN SALDO SAMA HARGA YANG DIBELI
//    KALO BISA DIJADIIN ARRAY MINUMAN SAMA HARGANYA
//    ATAU TAMBAHIN FITUR ADD MORE ORDERS TERUS BIKIN FUNGSI BUAT NGETOTALIN HARGA
}
