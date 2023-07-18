public class Countzero {
    public static void main(String[] args) {
        System.out.println(count(302000000,0));
    }
    static int count(int n,int c){
        if(n == 0){
            return c;
        }
        if((n%10) == 0){
            c += 1;
        }
        int ans = count(n/10, c);
        return ans;

    }
}
