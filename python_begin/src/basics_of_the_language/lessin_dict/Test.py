d = {1: "Bob", 2: "Vova"}
print(d)
print(len(d)) #длина
d[3] = "Kate"
print(d)
print(d[1])

d["Kate"] = 18 
print(d["Kate"])

d["Kate"] = 25
print(d["Kate"])

print(d)

d[10] = 20 
print(d)

for k, v in d.items(): # вернет пару ключ значения
	print(k)
	print("__")
	print(v)


for key, value in d.items():
	print("Key: " + str(key) + " , value: " + str(value))
print("\n\n\n")

#_____________________________________________________
#
list_a = ["first", 1,2,3,"second",10, 20, "third", 15,56, 70, "fourth", -46]

result = {}
current_str = None
for element in list_a:
	if type(element) == str:
		result[element] = []
		current_str = element
	else: 
		result[current_str].append(element)

for key, value in result.items():
	print(str(key) + " : " + str(value))
print("\n\n\n")



#_____________________________________________________
#
my_text = "asda re qwe d asdasd asdaf asd sad asdqw eq ad asd"

result = my_text.split(" ")# разделяет по пробелам
print(len(result))

result_2 = {}

for word in my_text.split(" "):
	if word in result_2:
		result_2[word] = result_2[word] + 1
	else: result_2[word] = 1

print (result_2)


result_3 = {}
for word in my_text.split(" "):
	result_3[word] = result_3.get(word, 0) + 1

print(result_3)


