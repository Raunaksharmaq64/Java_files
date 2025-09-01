import java.util.*;
public class factorial {
//pascaal trangle
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        
        
        for(int i = 0;i<=n;i++){

            for(int k=1;k<=n-i;k++){ //for spaces 
                System.out.print("  ");
            }

            
            
            for( int j=0;j<=i;j++){
                int ncr = fact(i)/(fact(j)*fact(i-j));
                System.out.print(ncr+"   ");

               
                
            }
            System.out.println();

            
    };
    };
// for factorial fxn
 public static int fact (int x){
    int xfact=1;
    for(int i=1;i<=x;i++){
        xfact*=i;
    }
    return xfact;

 }
    
};