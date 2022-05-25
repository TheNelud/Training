a = [1, 2, 3, 4]
b = []

for element in a:
	b.append(element * 2)
print(b)

c = [num * 3 for num in a]
print(c)

range_elements = []
for element in range(1, 6):
	range_elements.append(element * 3)
print(range_elements)


range3 = [num * 3 for num in range(1,6)]
print(range3)

a = [1,42, 532,123,53,2]
result = []
for element in a: 
	if element < 10:
		result.append(element)

print(result)


result = [element for element in a if element < 10]
print(result)

result = [element ** 2 for element in a if element < 10]
print(result)

words = ["hello", "hey", "GoodBye", "guitar", "piano"]
result = [element for element in words if len(element) < 6]
print(result)

#_________________________________________________________
#
print("\n")

#array = [20, 16, 12, 8, 4]
result = [element for element in range(10, 1, -1) if element % 2 == 0]
print(result)

#________________________________________________________
#

result = [element + "." for element in words if len(element) < 6]
print(result)
