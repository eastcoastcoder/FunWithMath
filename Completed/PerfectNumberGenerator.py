# Adapted from Solomon - The Little Book of Mathematical Principles, Theories and Things
# p20
# Generates Perfect Numbers using a formula
# A perfect number is defined as a number which equals the sum of it's proper divisors
# Example: #6 Divisors: 1,2,3		 Sum: 1+2+3 = 6
# Example: #28 Divisors: 1,2,4,7,14	 Sum: 1+2+4+7+14 = 28

# Wikipedia Primality Test
def is_prime(n):
	if (n <= 1):
		return False
	elif (n <= 3):
		return True
	elif (n % 2 == 0) or (n % 3 == 0):
		return False
	
	i = 5
	
	while (i*i <= n):
		if (n % i == 0) or (n % (i + 2) == 0):
			return False
		i = i + 6
	return True

# Euclid's Elements Formula 2^(n-1)*(2^(n)-1)
# Provided (2^(n)-1) is prime
perfectList =[]
for n in range(1,20):
	inner = (2**n)-1
	if is_prime(inner):
		perfectList.append(2**(n-1) * inner)

print(perfectList)