package oop_75794_Week6_LeonardusAdilla

class SmartHomeHub {

    val devices = mutableListOf<SmartDevice>()

    fun addDevice(device: SmartDevice) {
        devices.add(device)
    }

    fun turnOffAllSwitches() {
        for (device in devices) {

            if (device is Switchable) {
                device.turnOff()
            }

        }
    }

    fun activateSecurityMode() {

        for (device in devices) {

            if (device is Recordable) {
                device.startRecord()
            }

            if (device is SmartSpeaker) {
                device.playMusic("Sirine Peringatan")
            }

        }

    }
}