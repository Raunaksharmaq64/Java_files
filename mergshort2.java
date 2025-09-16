public class mergshort2 {
    public static void main(String[] args) {
        int arr[]={22,3,4,1,4,56,67,-445,76};
        System.out.println();

        System.out.println("arrey before shoted");
        displayarr(arr);

        int n = arr.length;
        mergshort(arr, 0, n-1);
        System.out.println();

        System.out.println("arrey after shoted");
        displayarr(arr);
        
        

    }

    static void displayarr(int arr[]){
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }

    static void mergshort(int arr[],int s,int e){
        int mid = (s+e)/2 ;
        if (s>=e) return;
        mergshort(arr, s, mid);
        mergshort(arr, mid+1, e);
        merge(arr, s, mid, e);
        
            
        
    }

    static void merge(int arr[],int s,int mid,int e){
       
        int n1= mid-s+1;
        int n2 = e-mid;

        int left[]= new int[n1];
        int right[]= new int [n2];

         for(int i=0;i<n1;i++){
            
            left[i]=arr[s+i];
            
        };
            for(int j=0;j<n2;j++) {
                
                right[j]=arr[mid+1+j];
            };

            int i=0;
            int j=0;
            int k=s;


            while (i<n1&&j<n2) {
                if(left[i]<=right[j]){
                    arr[k++]=left[i++];
                }

                else{
                    arr[k++]=right[j++];
                }
            }



                while (i<n1) {
                    arr[k++]=left[i++];

                }
                while(j<n2){
                    arr[k++]=right[j++];
                }


            }



    }
    


