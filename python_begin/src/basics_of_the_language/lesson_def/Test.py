# блок кода, блок инструкции

def function1():
    print("Hello1")
    print("Hello2")


print("Hello from outside")
function1()


def function2(x):
    return x * 2


a = function2(5)
print(a)


def sum_of_two_numbers(x, y):
    return x + y


e = sum_of_two_numbers(2, 4)
print(e)


def function5(some_argument):
    print(some_argument)
    print("Exit")


function5(5)


def function6(x):
    print(x)
    print("Epa")
    return 3 * x


print(function6(3))

name1 = "Tom"
height1 = 1.90
weight1 = 80
name2 = "Katy"
height2 = 1.70
weight2 = 60
name3 = "Bob"
height3 = 2
weight3 = 130


def bmi_calculate(name, height, weight):
    bmi = weight / (height ** 2)
    print("Индекс массы тела: " + str(bmi))

    if (bmi < 25):
        return name + " не имеет лишнего веса"
    else:
        return name + " имеет лишниий вес"


bmi1 = bmi_calculate(name1, height1, weight1)
bmi2 = bmi_calculate(name2, height2, weight2)
bmi3 = bmi_calculate(name3, height3, weight3)

print(bmi1)
print(bmi2)
print(bmi3)

miles = 10


def converter(miles):
    return miles * 0.612


print(converter(miles))


def area(a, b):
    return a*b


print(area(12,12))



def is_even(a):
    if a % 2 == 0:
        return "Четный"
    else:
        return "Нечетный"

print(is_even(13))
