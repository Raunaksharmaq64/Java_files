public class recursion {

  
    public static void main(String[] args) {
        // System.out.println(fact(4));
       


     };


   



     static int fact(int n ){
        if(n==0) return 1 ; 
        
        int a = fact(n-1);
        int ans = n*a;
        return ans;


     }
    }