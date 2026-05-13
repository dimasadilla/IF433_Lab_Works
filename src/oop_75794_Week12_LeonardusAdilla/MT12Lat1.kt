package oop_75794_Week12_LeonardusAdilla

fun basic_trycatch(pembilang:Int, penyebut: Int){
    try {
        val hasil = pembilang/penyebut;
        println("hasil bagi $hasil");
    } catch (e: Exception) {
        println("ada error pembagian ${e.message}");
    } finally {
        println("selesai pembagian");
    }

}

fun cek_tipe_data(angka:String) {
    var nilai: Int = try {
        Integer.parseInt(angka);
    } catch (e: Exception) {
        println("ada error di cek tipe data ${e.message}")
        123
    }
    println("nilai kamu $nilai")

}

fun cek_gaji(harikerja:Int) {
    if(harikerja<0) {
        throw IllegalArgumentException("Masa hari kerja minus");
    } else {
        val gaji = harikerja * 1000;
        println("gaji kamu $gaji");
    }
}

fun main() {
    //coba trow
    try {
        cek_gaji(-1);
    } catch (e: Exception) {
        println("Error coba catch ::: ${e.message}")
    }
    // Exception - Expression
    cek_tipe_data("10");
}