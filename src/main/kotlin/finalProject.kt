package machine

import java.util.Scanner

fun main() {
    var water = 400
    var milk = 540
    var coffee = 120
    var cups = 9
    var money = 550
    val scanner = Scanner(System.`in`)

    fun printCurrentStatus() {
        println()
        println("The coffee machine has:")
        println("$water of water")
        println("$milk of milk")
        println("$coffee of coffee beans")
        println("$cups of disposable cups")
        println("$money of money")
    }

    fun checkEnough(waterNeeded: Int, milkNeeded: Int, coffeeNeeded: Int, moneyAdded: Int) {
        val waterEnough = (water >= waterNeeded)
        val milkEnough = (milk >= milkNeeded)
        val coffeeEnough = (coffee >= coffeeNeeded)
        if (waterEnough && milkEnough && coffeeEnough && (cups >= 1)) {
            water -= waterNeeded
            milk -= milkNeeded
            coffee -= coffeeNeeded
            money += moneyAdded
            cups -= 1
            println("I have enough resources, making you a coffee")
        } else {
            if (!waterEnough) println("Sorry, not enough water!")
            if (!milkEnough) println("Sorry, not enough milk!")
            if (!coffeeEnough) println("Sorry, not enough coffee!")
            if (cups == 0) println("Sorry, not enough cups!")
        }
    }

    fun chooseCoffee() {
        println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ")

        when (readLine()) {
            "1" -> checkEnough(250, 0, 16, 4)
            "2" -> checkEnough(350, 75, 20, 7)
            "3" -> checkEnough(200, 100, 12, 6)
            else -> println("Invalid choice of coffee")
        }
    }

    fun fillAmounts() {
        println("Write how many ml of water do you want to add: ")
        water += scanner.nextInt()
        println("Write how many ml of milk do you want to add: ")
        milk += scanner.nextInt()
        println("Write how many grams of coffee beans do you want to add: ")
        coffee += scanner.nextInt()
        println("Write how many disposable cups of coffee do you want to add: ")
        cups += scanner.nextInt()
    }

    fun emptyCash() {
        println("I gave you $$money")
        money = 0
    }

    do {
        println("Write action (buy, fill, take, remaining, exit): ")
        val choice = readLine()
        when (choice) {
            "buy" -> chooseCoffee()
            "fill" -> fillAmounts()
            "take" -> emptyCash()
            "remaining" -> printCurrentStatus()
            else -> println("Invalid choice of action")
        }
    } while (choice != "exit")
}