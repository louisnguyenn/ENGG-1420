#include <iostream>
using namespace std;

// Base class
class Person {
protected:
    string name;
    int age;
public:
    Person(string n, int a) {
        name = n;
        age = a;
    }
    void displayBasicInfo() {
        cout << "Name: " << name << ", Age: " << age << endl;
    }
};

// First derived class
class Student : public Person {
protected:
    int studentID;
public:
    Student(string n, int a, int id) : Person(n, a) {
        studentID = id;
    }
    void displayStudentInfo() {
        displayBasicInfo();
        cout << "Student ID: " << studentID << endl;
    }
};

// Second derived class
class Professor : public Person {
protected:
    string department;
public:
    Professor(string n, int a, string dept) : Person(n, a) {
        department = dept;
    }
    void displayProfessorInfo() {
        displayBasicInfo();
        cout << "Department: " << department << endl;
    }
};

// Task 1
class TeachingAssistant : public Student {
protected:
    string assignedCourse;
public:
    TeachingAssistant(string n, int a, int id, string assignedCourse) : Student(n, a, id) {
        this->assignedCourse = assignedCourse;
    }
    void displayTeachingAssistantInfo() {
        displayBasicInfo();
        cout << "Assigned Course: " << assignedCourse << endl;
    }
};

int main() {
    // Student s1("Alice", 20, 12345);
    // Professor p1("Dr. Smith", 50, "Computer Science");
    // cout << "Student Info:" << endl;
    // s1.displayStudentInfo();
    // cout << "\nProfessor Info:" << endl;
    // p1.displayProfessorInfo();

    TeachingAssistant ta1("Louis", 19, 123892, "Object-oriented Programming");
    cout << "Teaching Assistant Info:" << endl;
    ta1.displayTeachingAssistantInfo();

    return 0;
}