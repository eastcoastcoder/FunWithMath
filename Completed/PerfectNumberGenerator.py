# Adapted from Solomon - The Little Book of Mathematical Principles, Theories and Things
# Generates Perfect Numbers

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
# Provided 2^(n)-1 is prime
perfectList =[]
for n in range(1,20):
	inner = (2**n)-1
	if is_prime(inner):
		perfectList.append(2**(n-1) * inner)

print(perfectList)