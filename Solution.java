class Student {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void printInfo(){
        System.out.println("Name: " + this.name + " Age: " + this.age);
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
    }

    Student() {
    }
}

public class Solution{

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Devara";
        s1.age = 41;
        s1.printInfo();

        Student s2 = new Student("Bhaira", 51);
        s2.printInfo();

        Student s3 = new Student(s2);
        s3.setAge(20);
        s3.printInfo();
    }
}