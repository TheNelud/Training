a = set()
print(a)

a = set([1,2,42,15,"Hello"])
print(a)

b = {1,2,42,15,"Hello"}
print(b)

a = set()
a.add(1)
print(a)
a.add(2)
a.add("hello")
a.add(10)
print(a)

for element in a:
	print(element)
	

array = [1, 2, 3, 1, 1, 5, "hello", "hello"]
my_set = set()
for element in array: 
	my_set.add(element)

print(my_set)

my_set = set(array)
print(my_set)

array = list(my_set)
print(array)

a = {"hello" , "hey", 1,5,10}

print(5 in a)
print("hey" in a)
print(15 not in a)

#_____________________________________________________
my_list = [1, 2, 1, 5 ,10, 10, 10]
my_set = set(my_list)
result = 0
for element in my_set:
	result += element

print(result)
print(sum(set(my_list)))
#____________________________________________________

def my_function(input_set, input_list):
	if len(input_list)> len(input_set):
		return False
	for list_element in input_list:
		if list_element not in input_set:
			return False
	return True



print(my_function({1,4,23,5,3}, [4]))