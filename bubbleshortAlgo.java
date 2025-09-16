import java.util.*;
public class bubbleshortAlgo {
    public static void main(String[] args) {
       
problem2();
        
    };

    static void problem2(){
    String[] name ={"raunak","akash","ajeet","amuragh","ajay","gagan","abhishek","arpit","sahil","ashawani","aditya","usa","patna"};

    for(int i=0;i<name.length;i++){
        for(int j=i;j<name.length-i-1;j++){
        if (name[j].compareTo(name[j+1])>0) {
            //swap
             String temp=name[j];
                    name[j]=name[j+1];
                    name[j+1]=temp;
        }
    }
    }
    for (String i : name) {
        System.out.print(i+" ");
    }

    }


    static void problm1(){
        int [] array={12,2,33,4,0,3,0,0,4,00,03};
        for(int i=0;i<array.length;i++){
            for(int j=i; j<array.length-1 ;j++){
                if(array[j]==0&&array[j+1]!=0){
                    //swap
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        for (int a : array) {
            System.out.print(a+" ");
        }
    }

static void arr2(int[]a){
    int n = a.length;
    for (int i = 0;i<n;i++){
        int j=i;
        while (j>0&& a[j]<a[j-1]) {
            //swap
            int prev=a[j];
            a[j]=a[j-1];
            a[j-1]=prev;
            j--;
        }

    }
}


    static void arr(int[]a){
        int x=a.length;
        for(int i=0;i<x-1;i++){
            for(int j=0;j<x-i-1;j++){
                if (a[j]>a[j+1]) {
                    int temp=a[j];
                     a[j]=a[j+1];
                     a[j+1]=temp;

                }
            }

        }

    }
}
