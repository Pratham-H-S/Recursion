public class Factorial{
    public static int factorial(int n,int sum){
        if (n==0){
            return sum;
        }
        sum = sum * (n);
        return factorial(n-1, sum);
    }
    public static void main(String[] args) {
        int n = 4;
        int sum =1;
        int ans = factorial(n,sum);
        System.out.println(ans);
    }
}