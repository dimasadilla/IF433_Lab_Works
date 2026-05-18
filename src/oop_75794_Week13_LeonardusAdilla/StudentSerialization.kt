package oop_75794_Week13_LeonardusAdilla
import java.io.File
import java.io.FileNotFoundException

data class Student(val name: String, val age: Int, val gpa: Double)
//Serialization  (Object -> CSV)
fun Student.toCsv(): String = "$name, $age, $gpa"

// Deserialization (CSV -> Object)
fun fromCsv(line: String): Student {
    val parts = line.split(",")
    return Student(name=parts[0], age=parts[1].toInt(), gpa=parts[2].toDouble())

    fun saveStudent(student : List<Student>, path: String) {
        File(path).writeText(student.joinToString("\n") {it.toCsv() })
    }

    fun loadStudent(path: String): List<Student> {
        return try {
            File(path).readLines().map {fromCsv(it) }
        } catch (e: FileNotFoundException) {
            println("Errror: File tidak  ditemukan! ")
            emptyList()
        }
    }
}

