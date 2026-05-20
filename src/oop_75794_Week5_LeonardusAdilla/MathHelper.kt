package oop_75794_Week5_LeonardusAdilla

class MathHelper {

    // Luas Persegi
    fun hitungLuas(sisi: Int): Int {
        return sisi * sisi
    }

    // Luas Persegi Panjang
    fun hitungLuas(panjang: Int, lebar: Int): Int {
        return panjang * lebar
    }

    // Luas Lingkaran
    fun hitungLuas(jariJari: Double): Double {
        return 3.14 * jariJari * jariJari
    }
}g