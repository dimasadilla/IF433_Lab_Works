package oop_75794_Week4_LeonardusAdilla

class Developer(
    name: String,
    baseSalary: Int,
    val programmingLanguage: String
) : Employee(name, baseSalary) {

    override fun work() {
        println("$name sedang ngoding menggunakan $programmingLanguage.")
    }
}