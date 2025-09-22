//TC :O(logn)

public class binarySearch {
    public static int binarySearch(int arr[],int key){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = (start+end)/2;
            if(key == arr[mid]){
                return mid;
            }else if(arr[mid]<key){
                start = mid+1;
            }else{
                end = mid-1;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] ={16,36,72,98,100};
        int key = 36;
        System.out.println("Key found at index: "+binarySearch(arr, key));
    }
    
}
