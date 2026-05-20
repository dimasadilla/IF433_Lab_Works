package oop_75794_Week5_LeonardusAdilla

class Dosen(nama: String, val nidn: String) : Pegawai(nama) {
    // WAJIB di-override karena fungsi bekerja() bersifat abstract di pusat
    override fun bekerja() {
        println("[$nama] sedang menyiapkan materi perkuliahan dan merevisi RKPS. ")
    }

    // Fungsi unik/spesifik yang hanya dimiliki Dosen
    fun mengajar() {
        println("[$nama] sedang mengajar mahasiswa di kelas.")
    }
}