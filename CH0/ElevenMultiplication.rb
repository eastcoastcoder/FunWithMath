def eleven (multiplicand)
	
	middle = -1
	if multiplicand.length == 2
		middle = Integer(multiplicand[0]) + Integer(multiplicand[1])
	else
		return "Not yet implemented: Multiplicans > 2 in length\n\n"
	end

	if middle < 10 and middle >= 0
		return multiplicand[0] + String(middle) + multiplicand[1]
	elsif middle == -1 or middle >= 10
		return "Not yet implemented: Multiplicans that sum > 10\n\n"
	end
end

while true
	print "Enter a number to be multiplied by 11: \n11*"
	#chomp removes enter key from length
	puts eleven(gets.chomp)
	
end