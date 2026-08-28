//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Inheritance {
    public static void main(String[] args) {
        Person p = new Person("Prajwal", 30);
        Child c = new Child("Ram", 5);
        p.show();
        c.show();
    }
}

class Person {
    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }

    void show() {
        System.out.println(name + " " + age);
    }
}

class Child extends Person {
    Child(String n, int a) {
        super(n, a);
    }
}