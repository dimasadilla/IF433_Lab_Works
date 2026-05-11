package oop_75794_Week6_LeonardusAdilla
// menggabungkan 1 parent Class dan 2 interfaces
class Smartwatch : Watch(), BluetoothConnectable, Rechargeable {
    override fun showTime() {
        println("Layar OLED menyala: 14:00 WIB")
    }

    override fun connetToBluetooth() {
        println ("Mencari perangkat HP di sekitar untuk pairing...")
    }

    override fun chargerBattery() {
        println("Mengisi daya mengunakan charger magnetik 150...")
    }
}
