public class recursion_2 {
    public static void main(String[] args) {
 
    };

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
