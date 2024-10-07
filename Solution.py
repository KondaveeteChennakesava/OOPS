class Student:
    def __init__(self, name=None, age=None, student=None):
        if student is not None:
            self.name = student.name
            self.age = student.age
        else:
            self.name = name
            self.age = age

    def get_name(self):
        return self.name

    def get_age(self):
        return self.age

    def set_name(self, name):
        self.name = name

    def set_age(self, age):
        self.age = age

    def print_info(self):
        print(f"Name: {self.name} Age: {self.age}")

if __name__ == "__main__":
    s1 = Student()
    s1.set_name("Devara")
    s1.set_age(41)
    s1.print_info()

    s2 = Student("Bhaira", 51)
    s2.print_info()

    s3 = Student(student=s2)
    s3.set_age(20)
    s3.print_info()