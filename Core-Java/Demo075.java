public class Demo075 {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,6,7,8,9,19,18,17,16};
        int max = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("maximum number of an array: "+max);
    }
    
}