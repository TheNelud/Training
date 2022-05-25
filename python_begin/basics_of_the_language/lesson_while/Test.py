total = 0
for i in range(1, 5):
    total += i
print (total)

total2 = 0
i1 = 0

while i1 < 5:
    total2 += i1
    i1 += 1
print(total2)

my_list = [7, 5, 4, 2, 1, -3, -5, -7]
total3 = 0
i2 = 0

while my_list[i2] > 0 :
    total3 += my_list[i2]
    i2 += 1

total4 = 0
for element in my_list:
    if element <= 0:
        break;
    total4 += element

print(total3)
print(total4)

total5 = 0
i3 = 0
while total5 < 10 and my_list[i3] > 0:
    total5 += my_list[i3]
    i3 += 1
print(i3)