package oop_75794_Week11_LeonardusAdilla

fun main() {

    val homeDevices = mutableListOf<SmartDevice>()

    // Lighting (apply + also)
    SmartDevice("Philips WiZ Living Room", "Lighting").apply {
        isOnline = true
        powerLoad = 12
    }.also {
        homeDevices.add(it)
    }

    // Camera (apply + also)
    SmartDevice("Ezviz Outdoor", "Camera").apply {
        isOnline = true
        powerLoad = 5
    }.also {
        println("(LOG) Kamera terhubung")
        homeDevices.add(it)
    }

    // AC (run)
    val ac = run {
        SmartDevice("Daikin Inverter (Kabel 3x2.5)", "HVAC", false, 800)
    }
    homeDevices.add(ac)

    // Pet Feeder
    homeDevices.add(
        SmartDevice("Picolo's Auto Feeder", "Pet Care", true, 10)
    )

    // Search + let
    val searchResult = homeDevices.find { it.category == "Camera" }
    searchResult?.let {
        println(it.diagnose())
    }

    // with
    with(homeDevices) {
        println("\nTotal Device: ${this.size}")
    }

    // total power (run)
    val totalPower = homeDevices.run {
        sumOf { it.powerLoad }
    }
    println("Total Power Usage: $totalPower Watt")

    // print all devices
    println("\n=== DEVICE LIST ===")
    homeDevices.forEach {
        println(it.diagnose())
    }
}