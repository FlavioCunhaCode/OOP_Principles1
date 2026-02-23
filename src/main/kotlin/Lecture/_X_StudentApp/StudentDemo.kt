package Lecture._X_StudentApp

// This file contains main() to demonstrate creating Student OBJECTS
fun main() {

    /* LOOP: We keep reading student details and creating objects.
        The loop stops when the user enters "quit" for the name. */

    while (true) {
        print("Enter student ID: ")
        val id = readln()
        print("Enter student name (or quit to stop): ")
        val name = readln()
        if (name == "quit") {
            break
        }

        print("Enter course: ")
        val course = readln()

        print("Enter mark: ")
        val mark = readln().toDouble()

        // OBJECT: Here we create a Student object using the constructor.
        val s = _root_ide_package_.Lecture._X_StudentApp.Student(id, name, course, mark)

        // Display the student (calls toString())
        println(s)
        println()
    }
}