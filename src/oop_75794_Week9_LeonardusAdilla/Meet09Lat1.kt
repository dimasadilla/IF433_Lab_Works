package oop_75794_Week9_LeonardusAdilla

fun main () {
    println("===============List Of Imut===============")
    val arSiswa = listOf("Ali", "budi","Cica");
            println (arSiswa);
    println ("Nama siswa:" + arSiswa[1]);
    println ("banyak siswa:" + arSiswa.size);
    for (i in arSiswa){
        println(i)
    }
    println("===============List Of Imut===============")
    val arMatkul = mutableListOf ("OOP", "Matdis", "Gamedev");
    arMatkul.add("Kalkulus");
    arMatkul[2] = "Pemweb";
    arMatkul.remove(element = "Matdis");
    println(arMatkul);

    println("===============List Of Imut===============")
    var arNilai = setOf(80,20,30,90,70,20,10,100);
    println("banyak data: ${arNilai.size}");
    println("angka 20 ada ga? ${arNilai.contains(20)}")
    println(arNilai);

    println("===============List Of Imutable===============")
    var arMakanan =mutableListOf("Nasi Goreng", "Tempe", "Tahu", "Bakpo", "Tahu", "Ayam");
    arMakanan.add("Mie");
    arMakanan.remove(element = "Tahu");
    arMakanan.add("tempe");
    println(arMakanan);

    println("===============List Of Imutable===============")
    var arDataMhs = mapOf(
        "acoong" to 89,
        "siska" to 90,
        "Udin" to 83,

    );
    println ("Banyak data: ${arDataMhs.size}");
    println("Si Acong nilainya: ${arDataMhs["Acong"]}");
    println("List semua Mhs: ${arDataMhs.keys}");
    println("List semua NIlai: ${arDataMhs.values}");
    println(arDataMhs);

    println("===============List Of Imutable===============")

    var arMenuResto = mutableMapOf(
        "Mie ayam" to 5000,
        "Mie bakso" to 6000,
        "Mie pangsit" to 6500
    )

    arMenuResto["Mie bakso"] = 6200
    arMenuResto.remove("Mie ayam")

    println(arMenuResto)

    println("===============Lambda===============")
    fun tambah(a:Int, b: Int):Int {
        return a+b;
    }
    println("Hasil tambah ${tambah(a =10, b=3)}")
    var hasil= {a:Int, b:Int->a+b};
    println("hasil kurang $(kurang(10,3)}");

    println("===============Lambda===============")
    val pangkat = {a:Int -> a*a}
    val hitungpangkat:(Int) -> Int = {it*it}
    println("Hasil pangkat adalah ${hitungpangkat(5)}");

    println("===============Foreach===============")
for(a in arMakanan) {
    println(a);

}
    println("===============Foreach===============")
    arMakanan .forEach {
        mkn-> println(mkn);
    }









}