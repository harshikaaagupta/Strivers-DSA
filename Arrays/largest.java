public class largest{
    public static int getLargest(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] ={1,2,6,3,5};
        int largest = getLargest(arr);
        System.out.println(" "+largest);

    }
}