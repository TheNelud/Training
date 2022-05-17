a = [1,5,14,"ada"]
# print (a)

multiarray = [[1,2,3],
 			  [4,5,6],
  			  [7,8,9]]
print(multiarray)
print(multiarray[1][1])


multiarray_after = [[1,2,3],
 			  		[4,5],
  			  		[6,7,8,9]]
print(multiarray_after)


def printMatrix(matrix):
	for arrays in matrix:
		for element in arrays:
			print(element, end=" ")
		print()

printMatrix(multiarray)

def printMatrix2(matrix):
	for i in range(len(matrix)):
		for j in range(len(matrix[i])):
			print(matrix[i][j], end = " ")
		print()

printMatrix2(multiarray_after)

multiarray [1][1] = 100
printMatrix (multiarray)

#________________________________________________
#
print("\n\n")

def create_multiarray(m, n):
	matrix = []
	for i in range(m):
		internal_array = []
		for j in range(n):
			internal_array.append(0)
		matrix.append(internal_array)
	return matrix


print(create_multiarray(1,5))

printMatrix(create_multiarray(1,5))
#___________________________________________________
#
print("\n\n")

''' 
1 2 3     3 2 1
4 5 6  -> 6 5 4
7 8 9	  9 8 7
'''

def swap(arr, i, j):
	tmp = arr[i]
	arr[i] = arr[j]
	arr[j] = tmp

def mirrorMultiArray(matrix):
	for arrays in matrix:
		for i in range(len(arrays) // 2 ):
			swap (arrays, i, len(arrays) - 1 - i)

printMatrix(multiarray)
mirrorMultiArray(multiarray)
printMatrix(multiarray)
			