def eleven(multiplicand)

	head = multiplicand[0]
	tail = multiplicand[1]
	puts "Head: " + head
	
	if multiplicand.length == 1 
		answer = Integer(multiplicand)*11
		return String(answer) + " No magic necessary!"
	elsif multiplicand.length == 2
		middle = Integer(head) + Integer(tail)
	else
		return "Not yet implemented: Multiplicans > 2 in length"
	end

	if middle < 10
		puts "Middle: " + head + " + " + tail + " = " + String(middle)
		answer = multiplicand[0] + String(middle) + tail
	elsif middle >= 10
		puts head + " + " + tail + " = " + String(middle)
		
		head = Integer(multiplicand[0]) + Integer(middle.to_s.split(//).map{|chr| chr.to_i}[0])
		
		puts "Carry: " + multiplicand[0] + " + " + String(middle)[0] + " = " + String(head)
		puts "Middle: " + String(middle)[1]
		
		middle = middle.to_s.split(//).map{|chr| chr.to_i}[1]
		answer =  String(head) + String(middle) + tail
	end
	
	puts "Tail: " + tail
	return answer
end

while true
	print "Enter a number to be multiplied by 11: \n11*"
	#chomp removes enter key from length
	puts "Answer: " + eleven(gets.chomp) + "\n\n"
	
end