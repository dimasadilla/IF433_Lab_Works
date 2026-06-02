package oop_75794_Week4_LeonardusAdilla

fun main() {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle("Sepeda Onthel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car("Toyota", numberOfDoors = 4)
    myCar.openTrunk()
    myCar.honk()
    myCar.accelerate()

    println("\n--- Testing ElectricCar ---")
    val myElectricCar = ElectricCar(
        brand = "Tesla",
        numberOfDoors = 4,
        batteryCapacity = 85
    )

    myElectricCar.accelerate()
    myElectricCar.honk()
    myElectricCar.openTrunk()

    println("\n--- Testing Manager ---")
    val manager = Manager(
        name = "Andi",
        baseSalary = 8_000_000
    )

    manager.work()
    println("Bonus Manager: Rp${manager.calculateBonus()}")

    println("\n--- Testing Developer ---")
    val developer = Developer(
        name = "Budi",
        baseSalary = 7_000_000,
        programmingLanguage = "Kotlin"
    )

    developer.work()
    println("Bonus Developer: Rp${developer.calculateBonus()}")
}