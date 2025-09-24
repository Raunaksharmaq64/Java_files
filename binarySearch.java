public class binarySearch {
    public static void main(String[] args) {
        int []arr={1,23,8,-1,5,5566,6,6675,3,4,4,4,43,23,2,3,5,4,4};
         System.out.println();

        System.out.println("arrey before shoted");
        displayarr(arr);

        int n = arr.length;
        quickShort(arr, 0,  n-1);
        System.out.println();

        System.out.println("arrey after shoted");
        displayarr(arr);

        //binary search impliment;

        System.out.println();
        System.out.println(binarySearch(arr, 3));
        


        
        

    }

    static void displayarr(int arr[]){
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    // binary search algrothim for shorted array ;
        
         static boolean binarySearch(int []arr,int target){
            int n= arr.length;

            int start=0,end=n-1;
            while(start<end){

                int mid=(start+end)/2;
                if (target==arr[mid]) {
                    return true;
                }else if (target<arr[mid]) {
                    end=mid-1;
                }  else {
                    start=mid+1;
                }
            
                
            }
            return false;


        }

        // algorithm for shorted arrey 

    static void quickShort(int arr[],int start,int end){
        if(start>=end) return;
        int mid=(start+end)/2;

        quickShort(arr, start, mid);
        quickShort(arr, mid+1, end);
        merge(arr,mid,start,end);
    };


    // algrothim for merge array;
    
     static void merge(int arr[],int mid,int start,int end){

        int n=mid-start+1;
        int n1=end-mid;

        int[]arr2=new int[n];
        int []arr3=new int[n1];

        for(int i=0;i<n;i++){
            arr2[i]=arr[start+i];
        }

        for(int j=0;j<n1;j++){
            arr3[j]=arr[mid+1+j];
        }

        int i=0,j=0,k=start;

        while (i<n&&j<n1) {

            if (arr2[i]<=arr3[j]) {
                arr[k++]=arr2[i++];
                
            }

            else{
                arr[k++]=arr3[j++];
            }
        }

            while (i<n) {
                arr[k++]=arr2[i++];
            }
            while (j<n1) {
                arr[k++]=arr3[j++];
            }
        }

    }


