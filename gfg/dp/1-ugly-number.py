'''
/*
 * naive brute force for ugly numbers
 * Ugly numbers are numbers whose only prime factors are 2, 3 or 5. 
 * The sequence 1, 2, 3, 4, 5, 6, 8, 9, 10, 12, 15, … shows the first 11 ugly numbers. 
 * By convention, 1 is included.
 * Given a number n, the task is to find n’th Ugly number.
 * */
'''

# keep in mind there is no increment operator in python


''' 
	approach 1 - naive approach
'''

# function for dividing integer a by highest integer b
def maxDivide(a, b):
	# keep dividing if the number
	# returned is still divisible
	while a%b == 0:
		a = a/b
	return a


# function for checking whether a given number is ugly or not
def isUgly(no):
	no = maxDivide(no,2)
	no = maxDivide(no,3)
	no = maxDivide(no,5)

	# this is a beautifully written statement
	return 1 if no == 0 else 0

# main function
def getNthUglyNo(no):
	i = 1
	count = 1

	while (count < no):
		i += 1
		if (isUgly(no)):
			count += 1
	return i	

no = getNthUglyNo(150)
print('150th ugly no is', no)



'''
	approach 2 - solving the problem using dynamic programming
'''

def getNthUglyNo(no):

	# the following syntax defines an array of size n
	# in python and initializes the array with the 
	# values 0
	'''
		>> [0]*10
		[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
	'''

	ugly = [0]*no

	# first ugly number is 1
	ugly[0] = 1

	# to keep track of multiples
	next_multiple_of_2 = 2
	next_multiple_of_3 = 3
	next_multiple_of_5 = 5

	# to keep track of the indexes
	# of the above multiples
	i2 = i3 = i5 = 0	

	# loop
	for i in range(1,no):

		# choose the min value of all available multiples
		ugly[i] = min(next_multiple_of_2, next_multiple_of_3, next_multiple_of_5)

		if ugly[i] == next_multiple_of_2:
			i2 += 1
			next_multiple_of_2 = ugly[i2] * 2

		if ugly[i] == next_multiple_of_3:
			i3 += 1
			next_multiple_of_2 = ugly[i3] * 3

		if ugly[i] == next_multiple_of_5:
			i5 += 1
			next_multiple_of_2 = ugly[i5] * 5

	# return the last ugly number
	return ugly[-1]	

def main():
	n = 150
	print(getNthUglyNo(n))

if __self__ == '__main__':
	main()

















