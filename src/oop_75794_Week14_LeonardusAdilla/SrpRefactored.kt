package oop_75794_Week14_LeonardusAdilla

class UserRepostory {
    fun save (user: User) {
        println("Saving user: ${user.name} to Database")
    }
}

class EmailService {
    fun sendWelcome(user: User) {
        println("welcome email -> ${user.email}")
    }
}

