package oop_week8_LeonardusAdilla

fun main() {
    var nama:String? = "Wirawan";


    try {
        println("nama kamu ${nama!!.uppercase()}");
    }catch(ex:Exception) {
        println("kamu kena error, ini pesan err-nya: ${ex.message}");
    }

    val kumpulanData: List<Any> = listOf(123, "Budi", 2024, "Tangerang");
    for( item in kumpulanData) {
        val isiData = item as? String
        if (isiData != null) {
            println(isiData);

        }

    }

}