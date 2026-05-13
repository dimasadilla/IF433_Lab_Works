package oop_75794_Week6_LeonardusAdilla

interface SmartDevice {
    val id: String
    val name: String
}

interface Switchable {
    fun turnOn()
    fun turnOff()
}

interface Recordable {
    fun startRecord()

    fun stopRecord() {
        println("Perekaman dihentikan dan disimpan ke Cloud.")
    }
}