class ClassStudent {
    var firstName: String? = null
    var lastName: String? = null
    var registration = 0
    var grade = 0
    var year = 0

    fun printFullName() {
    var fullName=firstName + lastName

    }

    val foiAprovado: Boolean
        get() {
            if (grade >= 60) {
                return true
            } else { return false
            }
        }

        fun changeYearIfApproved(): Boolean {
            {
                if (grade >= 60)
                println("congragulations")
                return 0
            }
        }

}