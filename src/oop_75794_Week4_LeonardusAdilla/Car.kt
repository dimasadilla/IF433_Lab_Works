package oop_75794_Week4_LeonardusAdilla

// Car "Is-A" Vehicle. Parameter brand dilempar ke atas melalui Vehicle(brand)
open class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand) {

    fun openTrunk() {
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka.")
    }

    override fun honk() {
        println("TIN TIN! Mobil $brand lewat!")
    }

    override fun accelerate() {
        super.accelerate() // Memanggil logika penambahan kecepatan milik parent
        println("Mobil $brand menggunakan transmisi gigi untuk kecepatan.")
    }
}