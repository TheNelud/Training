a = ["Fuck you", "Hello", "GoodBye"]
print(a[0])
print(a[1])
print(a[2])

#выводим все элементы в цикле
for element in a:
    print(element)

b = [20, 30, 50, 60]
for num in b:
    print(num)

total_sum = 0
for element in b:
    total_sum = total_sum + element
print(total_sum)


print(list(range(1,5))) # генерация элементов
for i in range(1,5):
    print(i)

total_sum2 = 0
for i in range(1,5):
    total_sum2 = total_sum2 + i # total_sum2 += i
print(total_sum2)

total_sum3 = 0
#числа которые делятся без остатка на 3 и 5
for num in range(1, 100):
    if num % 3 == 0 or num % 5 == 0:
        total_sum3 += num
        # print(num)
print(total_sum3)


def my_function(n , k):
    total_sum = 0
    if n > 20:
        return 0
    elif n <= 20:
        for element in range(1, n):
            if element % 2 == 0:
                element = element ** k
                total_sum += element
    return total_sum


print(my_function(18, 5))