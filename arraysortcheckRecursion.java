public class arraysortcheckRecursion {
    public static boolean checksort(int arr[], int idx){
        if(idx==arr.length-1){
            return true;
        }
        if(arr[idx]<arr[idx+1]){
            return checksort(arr, idx+1);
        }
        else{
            return false ;
        }
    }
    public static void main(String args){
        int arr[]={1,3,5,6,7,8};
        System.out.println(checksort(arr, 0));
    }
}
