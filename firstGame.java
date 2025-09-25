import java.util.*;



public class firstGame {
    public static void main(String[] args) {
        
        double num1 = Math.random(); //65 use to genrate random numbersbetween (0,1);
        int num2=(int)(Math.random() * 100);
           Scanner sc = new Scanner(System.in);
        //    int enterNum=sc.nextInt();

        if(num2>=0&&num2<=10){
            System.out.println("number is too small , infact it is one digit....");

            int enterNum1=sc.nextInt();

            if (num2==enterNum1) {
                System.out.println("great job you guess right👍 "+num2);
            }
            else{
                System.out.println("better luck next time.   "+"the number was   "+num2);
            }
        }


        if(num2>10&&num2<=30){

            System.out.println("number is   bigger than 10 , infact it is less than (200/20+30-10) ....");
            int enterNum2=sc.nextInt();

            if (num2==enterNum2) {
                System.out.println("great job you guess right👍 "+num2);
            }
            else{
                System.out.println("better luck next time.   "+"the number was   "+num2);
            }
        }


         if(num2>30&&num2<=50){
            
            System.out.println("number is   bigger than 30, infact it is less than (200/20+30+10) ....");
            int enterNum3=sc.nextInt();

            if (num2==enterNum3) {
                System.out.println("great job you guess right👍 "+num2);
            }
            else{
                System.out.println("better luck next time.   "+"the number was   "+num2);
            }
        }


         if(num2>50&&num2<=70){
            
            System.out.println("number is  bigger than 50 , infact it is less than (200/20+30+10+20) ....");
            int enterNum4=sc.nextInt();

            if (num2==enterNum4) {
                System.out.println("great job you guess right👍 "+num2);
            }
            else{
                System.out.println("better luck next time.   "+"the number was   "+num2);
            }
        }

        if(num2>70&&num2<=90){
            
            System.out.println("number is bigger than 70 , infact it is less than (200/20+30+10+40) ....");
            int enterNum5=sc.nextInt();

            if (num2==enterNum5) {
                System.out.println("great job you guess right👍 "+num2);
            }
            else{
                System.out.println("better luck next time.   "+"the number was   "+num2);
            }
        }
        if(num2>90&&num2<=100){
            
            System.out.println("number is  bigger than 90, infact it is less than (200/20+30+10+50) ....");
            int enterNum6=sc.nextInt();

            if (num2==enterNum6) {
                System.out.println("great job you guess right👍 "+num2);
            }
            else{
                System.out.println("better luck next time.   "+"the number was   "+num2);
            }
        }




    }

}
