public class mergshirt1 {
    public static void main(String[] args) {

        int arr[]={2,3,4454,55,3,3,22,2,-23};

        System.out.println("arr before sjhorting");
        displayarr(arr);

        int n=arr.length;

        System.out.println();
        System.out.println();

        System.out.println("arr after  shoting");
        
        mergeshort(arr, 0, n-1);
        displayarr(arr);

    }


static void displayarr(int arr[]){
for (int i : arr) {
    System.out.print(i+" ");
}


}


    static void mergeshort(int arr[],int start,int end){
        int mid=start+(end-start)/2;
        if(start>= end) return;

            mergeshort(arr, start, mid);
            mergeshort(arr, mid+1,end);
            merge(arr, mid, start, end);
        
        

        }

        static void merge(int arr[],int mid,int start,int end){
           
            int n1=mid-start+1;
            int n2=end-mid;
            int left[]= new int[n1];
            int right[]= new int[n2];

            for(int i=0;i<n1;i++) {
                left[i]=arr[start+i];
            }

            for(int j=0;j<n2;j++){
                 right[j]=arr[mid+1+j];
            }



             int i=0;
            int j=0;
            int k=start;


            

            while (i<n1&&j<n2) {

               if(left[i]<right[j]){
                arr[k++]=left[i++];
            }

            else {
                arr[k++]=right[j++];
            }
        }

            while (i<n1) {
                arr[k++]=left[i++];
            }

            while (j<n2) {
                arr[k++]=right[j++];
            }
            

            }





            

        
    
}
