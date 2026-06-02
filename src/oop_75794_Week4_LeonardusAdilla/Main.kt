package oop_75794_Week4_LeonardusAdilla

fun main() {
    println("--- Testing Vehcile ---")
    val generalVehicle = Vehicle("speed Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    var myCar = Car("Toyota", numberOfDoors = 4)
    myCar.openTrunk() // Memanggil method milik sendiri
    myCar.honk()     // Memanggil method yang sudah di-override
    myCar.accelerate() //  Memanggil gabungan method Parent dan Child
}