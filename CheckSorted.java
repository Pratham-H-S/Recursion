public class CheckSorted {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,32,23};
        // System.out.println(check(arr,0));
        System.out.println(checkTarget(arr, 2, 0));
        System.out.println(findIndex(arr, 0, 3));
    }
    static boolean check(int[] arr , int index){
        if(index == arr.length -1 ){
            return true;
        }
        return arr[index] < arr[index + 1] && check(arr, index + 1);
    }
    static boolean checkTarget(int [] arr,int target,int i){
        if(i == arr.length -1){
            return false;
        }
        return (arr[i] == target) || checkTarget(arr, target, i+1);
    }
    static int findIndex(int[] arr, int i,int target){
        if(i == arr.length){
            return -1;
        }
        if(arr[i] == target){
            return i ;
        }
        else{
            return findIndex(arr, i+1, target);
        }
    }
}
