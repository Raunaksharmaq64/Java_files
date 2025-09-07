public class recursion_2 {
    public static void main(String[] args) {


    };



    
    static int array2(int index){
        int [] arr={223,33,222,333,23,23,88387,23,33};
        if (index==arr.length) return 0;
        
    System.out.print(arr[index]+ " , ");

        return array2(index+1);



    }

 

    static int array(int index){
        int[]array={223,378,838,3893,777};
        if(index==array.length){ 
        return 0 ;
    };
    
        return array[index]+array(index+1);
        
        
        


    }

    static void arr(int indx){
        int[]array={12,11,43,334,555,3};
        if (indx==array.length) return;
        System.out.print(array[indx] + " , ");
        
        arr(indx+1);
       
        
            
        
    }






static void  tabel(int x,int y){
    if(y==0) return;
     tabel(x, y-1);
    System.out.println(x + " * " + y + " = " + (x * y));
    
    


}






    
           
        
 
            
        
            
        
    

    static int series(int x){
        if(x==0)return 0;
        if (x%2==0) {
            return series(x-1)-x;
            
        }
        else
        
        {return series(x-1)+x;
        }
    };

    static int numb(int x){
        if(x==0)return 0;
        return numb(x-1)+x;
    }


    static int multipaal(int x,int y){
        // if(y==0) return x;
        if(y==1) {
            System.out.println(x);
            return 0;
        }

multipaal(x, y-1);
        System.out.println(x*y);
        return 0;
    }



}
