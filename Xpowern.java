public class Xpowern {
    public static int Power(int x,int n){
        if(n ==0)
        {
            return 1;
        }
        // int xpower = Power(x,n-1);
        // int num = x * xpower;
        // return num;
        //
        //Logn Solution by diving the n value
        if((n%2)==0)
        {
            return Power(x, n/2) * Power(x, n/2);
        }
        else{
            return Power(x, n/2) * Power(x, n/2) * x;
        } 
        //This is the logn solution to the problem
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 3;
        int nn = Power(x, n);
        System.out.println(nn);
    }
}
