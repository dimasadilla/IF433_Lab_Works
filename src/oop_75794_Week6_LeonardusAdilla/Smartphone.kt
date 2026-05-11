package oop_75794_Week6_LeonardusAdilla

class Smartphone : Camera, Phone {
    // Manually override to resolve ambiguity
    override fun turnOn() {
        super<Camera>.turnOn() // Menjalankan logika camera
        super<Phone>.turnOn() // Menjalankan logika Phone
        println("Sistem operasi Smartphone berhasil oting.")

    }
}
