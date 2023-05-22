data class MenuItem(val name: String, val price: Float)
//data class CustomersName(val name: String, val deposit: Float)

fun main() {
//    val customersData = arrayOf(
//        CustomersName("John McTavish", 16F),
//        CustomersName("John Price", 22F),
//        CustomersName("Philip Graves", 40F),
//        CustomersName("Alejandro Vargas", 37F)
//    )

    val beveragesMenu = arrayOf(
        MenuItem("Latte", 4.16F),
        MenuItem("Americano", 2.25F),
        MenuItem("Coffee Chocolate", 2.39F),
        MenuItem("Piccolo", 2.70F)
    )

    print("Hi! May I have your name? ")

    val customerName = readln()
    println("What would you like to order for today Mr. $customerName?")

    for (i in beveragesMenu.indices) {
        println("${i + 1}. ${beveragesMenu[i].name} ($${beveragesMenu[i].price})")
    }

    print("May I inquire about your preferred choice of beverages? ")

    when (val choice = readln().toInt()) {
        in 1..beveragesMenu.size -> {
            val selectedBeverage = beveragesMenu[choice - 1]
            print("How many ${selectedBeverage.name} do you want? ")
            val howMany = readln().toInt()
            println("\n=== ORDERS FOR $howMany ${selectedBeverage.name.uppercase()} ===")
            val pricePerItem = selectedBeverage.price

            println("Do you want to add size up?")

            val subTotal = howMany * pricePerItem
            val discountThreshold = 10F
            val discountRate = 0.1F
            val total = if (subTotal > discountThreshold) {
                println("Woohoo! Congrats on scoring a 10% discount for your beverages! It'll be automatically applied to your bill. Enjoy! \uD83C\uDF89")
                subTotal * (1 - discountRate)
            } else {
                subTotal
            }
            println("The total bill amount is: $${"%.2f".format(total)}")
        }

        else -> {
            println("It seems that you haven't chosen any beverages. That's perfectly alright. I hope you have a pleasant day! :)")
        }
    }
}