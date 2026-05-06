package oop_75794_Week11_LeonardusAdilla

fun String.rubahHurufDepanJadiBesar(): String {
    val hasil = this.split(" ").joinToString(" ") {
        it.replaceFirstChar { c ->
            c.uppercase()
        }
    }
    return hasil
}

//function extension- parameters
fun Int.tentukanGrade(namaMhs:String){
    var hasilGrade = "E"
    if (this>=88){
        hasilGrade = "A"
    } else if (this >= 70){
        hasilGrade = "B"
    }else {
        hasilGrade = "C"
    }
    println(namaMhs + "Grade kamu" + hasilGrade);
}

//function extension - null
fun String?.cekNulldanEmpty(): String{
    if(this == null || this.isEmpty()){
        return "Usernama ga boleh null atau empty";
    } else {
        return "Username kamu $this";
    }
}
class Mahasiswa {
    var nim:String = "";
    var name:String = "";
    var nilai:Int = 6;
}


fun main () {
    println("udin sedunia".rubahHurufDepanJadiBesar())

    //cara panggil function extension - parameter
    var hasilStr = 71.tentukanGrade(namaMhs = "Eligrah");
    hasilStr.toString();

//cara panggil function extension- null
    var usernameKamu: String? = null;
    println(usernameKamu.cekNulldanEmpty());

    // Scope - LET
    var kampusKamu:String= "UMN";
    kampusKamu.let {
        println("Nama Kampus kamu" + it);
        if(it=="UMN"){
            println("Ih keren");
        } else {
            println("Amzing");
        }

    }

    // Scope - RUN
    var namaMatkul:String = "OOP";
    namaMatkul.run {
        println("Matkul favorite kamu" + this);
    }

    //Scope - WITH
    val keputusanLulus = with (receiver = 70 ){
        if(this >=70){
            "Lulus"
        } else {
            "Remedial"
        }
    }
    println("kamu $keputusanLulus");

    // Scope - APPLY
    val  namaMahasiswa = Mahasiswa().apply{
        nim = "12345";
        name = "Dwiky";
        nilai = 100;
    }
    println("si ${namaMahasiswa.name} nilainya ${namaMahasiswa.nilai}")


    //Scope - ALSO
    val arDeret = mutableListOf<Int>(60,70,56,80);
    arDeret.also {
        println("Deret Sebelum : $arDeret")
    }.add(90)
    println("Deret Setelan : $arDeret")

}


