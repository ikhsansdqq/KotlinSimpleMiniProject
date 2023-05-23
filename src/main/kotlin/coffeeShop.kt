data class MenuItem(val name: String, val price: Float)

fun order(customerName: String) {
    var customerSubTotal = 0F
    val randomCashierName = arrayOf("Dito Utomo", "Putri Mayasari", "Adi Prasetyo", "Rizky Nugroho")
    val beveragesMenu = arrayOf(
        MenuItem("Latte", 4.16F),
        MenuItem("Americano", 2.25F),
        MenuItem("Coffee Chocolate", 2.39F),
        MenuItem("Piccolo", 2.70F)
    )
    val sizeUpDrinks = arrayOf(
        MenuItem("Tall", 0.64F),
        MenuItem("Grande", 1.24F),
        MenuItem("Venti", 1.34F)
    )

    /* Generating Random Names */
    val randomNames = randomCashierName.random()
    println("Hi! My name is $randomNames, What would you like to order Mr/Mrs. $customerName? ")

    for (i in beveragesMenu.indices) {
        println("${i + 1}. ${beveragesMenu[i].name} ($${beveragesMenu[i].price})")
    }

    print("May I take your preferred choice of beverages? ")
    when (val choice = readln().toInt()) {
        in 1..beveragesMenu.size -> {
            val selectedBeverage = beveragesMenu[choice - 1]
            print("How many ${selectedBeverage.name} do you want? ")
            val howMany = readln().toInt()

            /* ASKING DO YOU WANT TO SIZE UP? */
            print("Do you want to size up your drink?\n1. Yes\n2. No\n")
            val sizeUpChoice = readln().toInt()

            val sizeUpgrade: String
            var sizeUpgradePrice = 0F

            when (sizeUpChoice) {
                1 -> {
                    println("\n==== WHAT SIZE DO YOU WANT TO UPGRADE? ====")
                    for (i in sizeUpDrinks.indices) {
                        println("${i + 1}. ${sizeUpDrinks[i].name} (+$${sizeUpDrinks[i].price})")
                    }
                    when (readln().toInt()) {
                        1 -> {
                            sizeUpgrade = "Tall"
                            sizeUpgradePrice = 0.64F
                            customerSubTotal += sizeUpgradePrice
                        }

                        2 -> {
                            sizeUpgrade = "Grande"
                            sizeUpgradePrice = 1.24F
                            customerSubTotal += sizeUpgradePrice
                        }

                        3 -> {
                            sizeUpgrade = "Venti"
                            sizeUpgradePrice = 1.34F
                            customerSubTotal += sizeUpgradePrice
                        }

                        else -> {
                            println("Mr/Mrs. $customerName, you have not made a valid size selection :)")
                            return
                        }
                    }
                }

                2 -> {
                    println("Continuing with the regular size drink.")
                    sizeUpgrade = "Regular"
                }

                else -> {
                    println("I'm sorry, but you have not made a valid selection.")
                    return
                }
            }

            println("\n==== ORDERS FOR $howMany ${selectedBeverage.name.uppercase()} ====")
            println("Beverage: ${selectedBeverage.name}")
            println("Quantity: $howMany")
            if (sizeUpgrade != "Regular") {
                println("Size Upgrade: $sizeUpgrade +$${"%.2f".format(sizeUpgradePrice * howMany)}")
            }

            val pricePerItem = selectedBeverage.price
            customerSubTotal += howMany * pricePerItem

            val discountThreshold = 10F
            val discountRate = 0.1F
            val total = if (customerSubTotal > discountThreshold) {
                println("Woohoo! Congrats on scoring a 10% discount for your beverages! It'll be automatically applied to your bill. Enjoy! \uD83C\uDF89")
                customerSubTotal * (1 - discountRate)
            } else {
                customerSubTotal
            }

            println("\nThe total bill amount is: $${"%.2f".format(total)}")
        }

        else -> {
            println("It seems that you haven't chosen any beverages. That's perfectly alright. I hope you have a pleasant day! :)")
        }
    }
}

fun main() {
    print("Hi! May I have your name? ")
    val customerName = readln()
    order(customerName)
}

// TAMBAHIN INFINITE LOOPING BUAT PERTANYAAN
// FITUR BISA NAMBAH MINUMAN LAIN
