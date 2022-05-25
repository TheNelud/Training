a = [3, 4, 5]
print(a)
a.append(6)  # добавит в лист
a.append("String")
a.append([1, "Name"])
print(a)
a.pop()  # удалить последний элемент
a.pop(1)  # удалить по индексу элемент
print(a)
print(a[2])  # доступ к элементу с индексом 2
print(a[-1])  # доступ к последнему индексу
a[0] = 100  # замена элемента
print(a)

b = ["hello", "goodbye", "fuck you"]  # меняем местами
print(b)
temp = b[0]
b[0] = b[2]
b[2] = (temp)
print(b)

b[0], b[2] = b[2], b[0]  # меняем местами
print(b)
