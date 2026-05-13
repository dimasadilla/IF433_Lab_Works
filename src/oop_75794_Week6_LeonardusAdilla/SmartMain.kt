package oop_75794_Week6_LeonardusAdilla

fun main() {

    val lamp = SmartLamp(
        "L001",
        "Ruang Tamu"
    )

    val speaker = SmartSpeaker(
        "S001",
        "Google Nest Dapur"
    )

    val cctv = SmartCCTV(
        "C001",
        "Ezviz Garasi"
    )

    val hub = SmartHomeHub()

    hub.addDevice(lamp)
    hub.addDevice(speaker)
    hub.addDevice(cctv)

    println("=== SECURITY MODE ===")
    hub.activateSecurityMode()

    println()

    println("=== TURN OFF ALL DEVICES ===")
    hub.turnOffAllSwitches()
}