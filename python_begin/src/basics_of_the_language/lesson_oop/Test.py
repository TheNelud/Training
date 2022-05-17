

class Person:
	sume_num =123
	people_count = 0

	def __init__(self, name , surname, place_of_birth, year_of_birth):
		self.name = name
		self.surname = surname
		self.place_of_birth = place_of_birth
		self.year_of_birth = year_of_birth
		print("Hello")

		Person.people_count += 1

	def printInfo(self, n):
		for i in range (n):
			print(f"{self.name} {self.surname}")

	def printAge(self, currentYear):
		return currentYear - self.year_of_birth



p1 = Person ("Elon", "Musk", "USA", 1971)
p1.printInfo(1)

print(p1.sume_num)
print(Person.sume_num)


#________________________________________________________________
class Circle:
	pi = 3.14

	def __init__(self, radius):
		self.radius = radius

	def getPerimetr(self):
		return self.radius * 2 * Circle.pi

	def getArea(self):
		return Circle.pi * self.radius ** 2

c1 = Circle(3)
print(c1.getPerimetr())
print(c1.getArea())

#__________________________________________________________________
class DB:
	dbConnection = pass

	def write_some_data(self):
		pass
#__________________________________________________________________














# person = Person()
# person.name = "Elon"
# person.surname = "Musk"
# person.place_of_birth = "USA"
# person.year_of_birth = 1971

# person2 = Person()
# person2.name = "Sergei"
# person2.surname = "Korolev"
# person2.place_of_birth = "USSR"
# person2.year_of_birth = 1907

# print(f"{person.name} {person.surname}")
# person.printInfo()
# person2.printInfo()
# Person.printInfo(person)

# person.printInfo(3)
# print(person.printAge(2022))


# person3 = Person()
# person3.name = "Albert"
# person3.surname = "Einstein"
# person3.place_of_birth = "USSR"
# person3.year_of_birth = 1879

