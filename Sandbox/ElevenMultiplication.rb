def eleven(multiplicand)

	head = multiplicand[0]
	middle = ''
	tail = multiplicand[multiplicand.length-1]
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
	elsif middle >= 10
		puts head + " + " + tail + " = " + String(middle)
		
		head = Integer(multiplicand[0]) + Integer(middle.to_s.split(//).map{|chr| chr.to_i}[0])
		
		puts "Head Carry: " + multiplicand[0] + " + " + String(middle)[0] + " = " + String(head)
		puts "Middle: " + String(middle)[1]
		
		middle = middle.to_s.split(//).map{|chr| chr.to_i}[1]
	end
	
	puts "Tail: " + tail
	return String(head) + String(middle) + String(tail)

end

while true
	print "Enter a number to be multiplied by 11: \n11*"
	puts "Answer: " + eleven(gets.chomp) + "\n\n"
end

# Multiplicans > 2
=begin
	for i in 0..multiplicand.length do
		#OOB?
		insert = Integer(multiplicand[i]) + Integer(multiplicand[i+1])
		puts multiplicand[i] + " + " + multiplicand[i+1] + " = " + String(insert)
		if(insert > 10)
			if(i == 0)
				head = '10'
			else
				puts "Hits"
				middle[i] = middle[i].to_i + Integer(multiplicand[i])
				puts middle
				puts multiplicand[i]
			end
		middle << multiplicand[i+1]
		puts middle
		end
	end
	puts "Head: " + head
	puts "Middle: " + middle
	puts "Tail: " + tail
	return String(head) + String(middle) + String(tail)
=end