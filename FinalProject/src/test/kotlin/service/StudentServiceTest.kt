package service

import model.Student
import org.junit.Test
import org.junit.jupiter.api.Assertions.*

internal class StudentServiceTest {

    @Test

    fun findStudentTest() {

        val findStudent = StudentService()

        val estudante = Student("4002", "Henrique", "henrique@teste.com", null)

        findStudent.subscribeStudent(estudante)

        assertNotEquals(null, findStudent.findStudent("4002"))
    }

}