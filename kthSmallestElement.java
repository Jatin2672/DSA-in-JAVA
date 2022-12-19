public class kthSmallestElement {
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
       
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){
                if(arr[j]>arr[j+1]){
                    l=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=l;
                    
                }
            }
            
        }
        return arr[k-1];
    } 
}
