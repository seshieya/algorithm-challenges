/*
Problem:
https://www.hackerrank.com/challenges/extra-long-factorials/problem
*/

/*
My solution:
*/
public class Solution {

    static void extraLongFactorials(int n) {
       
        BigInteger factorial = new BigInteger("1");
        
        for(int i = n; i > 0; i--) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        
        System.out.print(factorial);
                
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        extraLongFactorials(n);
        in.close();
        
    }
}
