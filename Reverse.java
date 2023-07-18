public class Reverse {
    public static void main(String[] args) {
        // fun(1);
        System.out.println(reverse(124,0));
        System.out.println(rev(1234));
    }
    static void fun(int n){
        if(n == 5){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        fun(n+1);
        System.out.println(n);
        
    }
    static int reverse(int n,int rev){
        
        
        rev = (rev*10) + (n%10); 
        n = n / 10;
        if(n == 0){
            return rev;
        }
        rev = reverse(n, rev);
        return rev;
    }
    static int rev (int n){
        int digits = (int)(Math.log10(n)) + 1;
        return helper(digits,n);
    }
    static int helper( int digits ,int n){
        if(n%10 == 0){
            return n;
        }
        int rem = n % 10;
        return rem * (int)(Math.pow(10,digits-1)) + helper(digits-1, n/10);
    }
}
