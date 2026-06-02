package oop_75794_Week4_LeonardusAdilla

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car("Toyota", numberOfDoors = 4)
    myCar.openTrunk()      // Method milik Car
    myCar.honk()           // Method yang di-override
    myCar.accelerate()     // Gabungan Parent dan Child

    println("\n--- Testing ElectricCar ---")
    val myElectricCar = ElectricCar(
        brand = "Tesla",
        numberOfDoors = 4,
        batteryCapacity = 85
    )

    myElectricCar.accelerate() // Method final yang di-override di ElectricCar
    myElectricCar.honk()       // Inherit dari Car
    myElectricCar.openTrunk()  // Inherit dari Car
}