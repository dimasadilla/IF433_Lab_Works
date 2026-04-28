package oop_week9_LeonardusAdilla

data class Student(val name:String, val gpa: Double)

fun main(){
    val student = listOf(
        Student("Andi", 3.2),
        Student("Budi", 3.9),
        Student("Citra", 2.8),
        Student("Dewi", 3.7)


    )
    println("=== HONOR STUDENT PIPELINE ===")
    val honorNames = student
        .filter {it.gpa >= 3.5}
        .sortedBy { it.name }
        .map { it.name.uppercase() }

    honorNames.forEach { println("Honor Roll: $it") }

}