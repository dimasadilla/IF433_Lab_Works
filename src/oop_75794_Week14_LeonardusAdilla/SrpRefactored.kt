package oop_75794_Week14_LeonardusAdilla

class userValidator {
    fun validate(user: User): Boolean = user.email.contains("@") && user.age >= 18
}

class UserRepostory {
    fun save (user: User) {
        println("Saving user: ${user.name} to Database")
    }
}

