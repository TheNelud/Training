class Person:
	def __init__(self, name ,age):
		self.name = name
		self.age = age 
		print("Constructor person created")

	def sayHallo(self):
		print(f"{self.name} says hello")

p1 = Person("Tom" , 15)
p1.sayHallo()

class Student(Person):
	def __init__ (self, name , age, averageGrade):
		super().__init__(name, age) # <==> Person.__init__(self, name, age) 
		self.averageGrade = averageGrade 

		print("Created studet constructor")

	def study(self):
		print(f"{self.name} studies")

	def sayHallo(self):
		super().sayHallo()
		print(f"Student with name: {self.name} says hello!")


class Teacher(Person):
	def teach(self):
		print(f"{self.name} teaches")

s1 = Student("Mile", 18, 8.6)
t1 = Teacher("Kate", 21)



s1.sayHallo()
t1.sayHallo()
s1.study()


def introduce(person):
	print("Now, a person will say hello")
	person.sayHallo

people_array=[Student("Tom", 18, 3.5),
			  Teacher("Katy", 35),
			  Student("Bob", 26, 4.6)]


for person in people_array:
	introduce(person)

