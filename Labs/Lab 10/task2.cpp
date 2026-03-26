#include <iostream>
using namespace std;

class Person {
protected:
    string name;
public:
    Person(string n) {
        name = n;
    }
    // Virtual function
    virtual void displayRole() {
        cout << name << " is a person." << endl;
    }
};

class Student : public Person {
public:
    Student(string n) : Person(n) {}
    void displayRole() override {
        cout << name << " is a student." << endl;
    }
};

class Professor : public Person {
public:
    Professor(string n) : Person(n) {}
    void displayRole() override {
        cout << name << " is a professor." << endl;
    }
};

class TeachingAssistant : public Student {
public:
    TeachingAssistant(string n) : Student(n) {}
    void displayRole() override {
        cout << name << " is a teaching assistant." << endl;
    }
};

// Task 2
class Administrator : public Person {
public:
    Administrator(string n) : Person(n) {}
    void displayRole() override {
        cout << name << " is an administrator." << endl;
    }
};

int main() {
    // Base class pointer
    Person* people[4];
    Student s("Alice");
    Professor p("Dr. Smith");
    TeachingAssistant ta("Bob");
    Administrator admin("Louis");
    people[0] = &s;
    people[1] = &p;
    people[2] = &ta;
    people[3] = &admin;

    // Polymorphic behavior
    for (int i = 0; i < 4; i++) {
        people[i]->displayRole();
    }

    return 0;
}