/**
 * Secrets of Mental Math
 * p. 98
 * These are round-about ways of doing math, meant to ease mental calculations.
 * Obviously, from a computing standpoint these could be more easily implemented.
 * Writing out the algorithm helps in memorizing these methods.
 */
public class Div {

    /**
     * Mod 10 returns the last digit of the number (Remainder Division)
     * Mod 2 returns 0 if the last digit is divisible by two (Even)
     */
    public boolean two(int n){
        return (n % 10)%2 == 0;
    }

    /**
     * Mod 100 returns the last two digits of the number (Remainder Division)
     * Mod 4 returns 0 if the last digit is divisible by four
     */
    public boolean four(int n){
        return (n % 100)%4 == 0;
    }

    /**
     * Mod 1000 returns the three digits of the number (Remainder Division)
     * Mod 8 returns 0 if the last digit is divisible by eight
     */
    public boolean eight(int n){
        return (n % 1000)%8 == 0;
    }

    /**
     * Iterates through an integer as a sequence
     * Adds each digit to the next
     */
    private int digitSum(int n){
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    /**
     * Iterates through an integer as a sequence
     * Adds even position integers
     * Subtracts odd position integers
     */
    private int altDigitSum(int n){
        int sum = 0, i = 0;
        while (n != 0) {
            if(i%2 == 0)
                sum += n % 10;
            else
                sum -= n % 10;
            i++;
            n /= 10;
        }
        return sum;
    }
    /**
     * A number is divisible by three iff
     * The sum of it's digits are divisible by three
     */
    public boolean three(int n){
        return digitSum(n)%3 == 0;
    }

    /**
     * A number is divisible by nine iff
     * The sum of it's digits are divisible by nine
     */
    public boolean nine(int n){
        return digitSum(n)%9 == 0;
    }

    /**
     * A number is divisible by six iff
     * It's even and divisible by three
     */
    public boolean six(int n){
        return (n%2 == 0) && three(n);
    }

    /**
     * A number is divisible by five iff
     * It ends in five or zero
     * Mod 10 returns the last digit of the number (Remainder Division)
     */
    public boolean five(int n){
        return (n % 10)%5 == 0 || (n % 10)%5 == 5;
    }

    /**
     * A number is divisible by eleven iff
     * The alternating sum of it's digits are zero or a multiple of eleven
     */
    public boolean eleven(int n){
        int sum = altDigitSum(n);
        return sum == 0 || sum%11 == 0;
    }

    // Method Stubs
    /**
     * A number is divisible by seven if
     * You add or subtract a multiple of seven
     * The resulting number is a multiple of seven
     * (Try to make the last digit zero, repeat the process)
     * Mod 100 returns the last two digits of the number (Remainder Division)
     */
    public boolean seven(int n){
        int[] sevens = new int[12];

        // Load array of 7's multiples
        // Loaded in reverse to prefer to subtract larger values
        for (int i = 11; i >= 0; i--)
            sevens[i] = 7*(i+1); // Less expensive than calling Math.pow

        int lastDigitOfN;
        int lastTwoDigitsOfN;
        int total = 0, lastDigitOfMulti = 0;
        for(int multi: sevens){
            lastDigitOfN  = (n % 10);
            lastTwoDigitsOfN = (n % 100);
            lastDigitOfMulti = (multi % 10);

            if (lastTwoDigitsOfN == multi || lastDigitOfN == lastDigitOfMulti)
                if(total == 0)
                    total = n - multi;
                else
                    total -= multi;

            System.out.println("" + "" + total);
        }

        return total%7 == 0;
    }

    /**
     * A number is divisible by any odd number that doesn't end in five if
     * You add or subtract a multiple of the number
     * The resulting number is a multiple of the number
     */
    public boolean oddNotFive(int n){
        return false;
    }

}
