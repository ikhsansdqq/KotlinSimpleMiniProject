fun main() {
    println("Temperature Converter")
//    Default Celsius
    val celsius: Int = 10
    println("Celsius: $celsius")

//    Convert to Fahrenheit
    val fahrenheit = celsius * 1.8 + 32
    if (fahrenheit % 1 == 0.0) {
        println("Fahrenheit: ${fahrenheit.toInt()}")
    } else {
        println("Fahrenheit: $fahrenheit")
    }

//    Convert to Kelvin
    val kelvin = celsius + 273.15
    println("Kelvin: $kelvin")
}