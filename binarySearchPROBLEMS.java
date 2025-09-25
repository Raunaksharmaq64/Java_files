public class binarySearchPROBLEMS {
    public static void main(String[] args) {
        int[]arr= {2,3,3,3,3,4,4,4,4,5,5,5,5,5};
        firstOccurance(arr, 0);

    }
    // itration method
    static void firstOccurance(int[] arr,int x){

        for(int i=0;i<arr.length;i++){
            if (arr[i]==x){
                 System.out.println(arr[i]+" "+i);
                 
        }else{
            System.out.println("-1");
        }
    }

}
}