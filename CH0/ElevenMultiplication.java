import java.util.Scanner;
import java.util.Stack;

public class Eleven{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		Stack<Integer> stack = new Stack<Integer>();
		boolean carry = false;
		
		//Load Stack
		for (int i = 0; i < input.length() ; i++)
			stack.push(Character.getNumericValue(input.charAt(i)));
		
		int n = input.length()-1;
		int[] answer = new int[n+3];	 //Answer array will have at most 2 longer than input
		answer[n+1] = Character.getNumericValue(input.charAt(n)); 	//Answer end will be input end (no carry)
		
		for (int i = answer.length-3; i >= 0; i--) {	//iterate starting two less than tail
			int mid;
			if(i > 0)
				mid = stack.pop()+stack.peek();
			else
				mid = stack.pop();

			//Determine Carry
			if (carry){
				mid++;
				carry = false;
			}
			if(mid > 9)
				carry = true;
			
			if(i == 0)
				answer[i] = mid;	//Carry to Head
			else
				answer[i] = mid%10;	//Keep non-10 digit
			
			System.out.println(mid);
		}
		
		for (int i = 0; i < answer.length-1; i++)
			System.out.print(answer[i]);
		
	}

}
