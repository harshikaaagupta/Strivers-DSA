
public class linearSearch {
    public static int linearSearch(int arr[] ,int target){
        for(int i =0;i<arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10,12,14,16};
        int target = 10;
        int idx =linearSearch(arr, target);
        if(idx == -1){
            System.out.println("Not Found");
        }else{
            System.out.println("Found");
        }
    }
}
