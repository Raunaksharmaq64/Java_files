import java.util.Scanner;

public class patternPrinting {
    public static void main(String[] args) {
        System.out.println("lets print some pattern ");
        Scanner Sc = new Scanner(System.in);
        System.out.print("enter total number of row : ");
        int row = Sc.nextInt();
        System.out.print("enter total number of column : ");
        int column = Sc.nextInt();
        for(int i =row ; i>=0; i--){
            for( int j =0;j<=column;j++){
if (i==j||i<j) {
    System.out.print("*");
    
}else{System.out.print(" ");}

            //     if(i==0||j==0||i==row||j==column){
            //     System.out.print(" * ");
            // }
            // else
            // {System.out.print("   ");}
        }
            System.out.println();
        }



    }
}
