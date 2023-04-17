import kotlin.math.pow
import kotlin.math.floor

fun main() {
    val weightInput = 80
    val heightInputCm = 172.0

    val bmiCalc = weightInput / (heightInputCm / 100).pow(2)
    val bmiFloor = floor(bmiCalc).toInt()

    val bmiCategory = when {
        bmiFloor < 18.5 -> "underweight"
        bmiFloor < 25.0 -> "normal"
        bmiFloor < 30.0 -> "overweight"
        bmiFloor < 35.0 -> "obese"
        else -> "extremely obese"
    }

    println("Your BMI is: $bmiFloor, your BMI is $bmiCategory.")
}
