while true
	print "Enter a number to be multiplied by 11: \n11*"
	
	#chomp removes extra character (enter key) from length
	multiplicand = gets.chomp
	
	middle = -1
	if multiplicand.length == 2
		middle = Integer(multiplicand[0]) + Integer(multiplicand[1])
	else
		puts "Not yet implemented: Multiplicans > 2 in length\n"
	end

	if middle < 10 and middle >= 0
		puts multiplicand[0] + String(middle) + multiplicand[1]
	elsif middle == -1 or middle >= 10
		puts "Not yet implemented: Multicands that sum > 10\n\n"
	end
end