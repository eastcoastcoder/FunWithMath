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

    private int digitSum(int n){
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
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
     * The sum of it's digits are zero or a multiple of eleven
     */
    public boolean eleven(int n){
        return digitSum(n) == 0 || digitSum(n)%11 == 0;
    }

    // Method Stubs
    /**
     * A number is divisible by seven if
     * You add or subtract a multiple of seven
     * The resulting number is a multiple of seven
     */
    public boolean seven(int n){
        return false;
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
