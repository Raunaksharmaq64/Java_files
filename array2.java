public class array2 {
    public static void main(String[] args) {
        array1();
    }

    static int array1(){
        int []arr = {23,4,5,6,7,88};
        for(int j=0;j<arr.length;j++)
        for(int i=arr.length;i<=0;i--){
          int arra= arr[i]=arr[j];
            System.out.println(arra);

        }
        return array1();

    }
}
