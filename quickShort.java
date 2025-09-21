public class quickShort {
    public static void main(String[] args) {
        System.out.println("arr before shorted ");
        

        int arr[]={122,1,3,34,4,3,4,76,00,455};

        display(arr);
        System.out.println();

        System.out.print("arr after shorted");
        System.out.println();

        quickshort(arr, 0, arr.length-1);
        display(arr);

    };

    static void display(int arr[]){
        for (int i : arr) {
            System.out.print(i+" ");
        };
    }
    static void swap(int arr[],int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }


    static void quickshort(int[] arr, int x , int y ){
        if(x>=y) return;
        int pivit=partitation( arr,x,y);

        quickshort(arr, x, pivit-1);
        quickshort(arr, pivit+1, y);


    }

    public static int partitation(int[] arr,int x,int y){
        int pivit=arr[x];
        int count=0;
        
        for (int i=x+1;i<y;i++){
            if (arr[i]<=pivit) {
                count++;
            }
        };

        int pvtIdx=count+x;
        swap(arr, pvtIdx, x);

        while(x<pvtIdx && y>pvtIdx){
            while(arr[x]<pivit){
                x++;
            }
            while(arr[y]>pivit){
                y--;
            }

            if (x<pvtIdx && y>pvtIdx) {
                swap(arr, x, y);
                x++;
                y--;
            }

        }
        return pvtIdx;

    }
}
