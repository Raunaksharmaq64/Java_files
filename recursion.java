public class recursion {

  
    public static void main(String[] args) {
        // System.out.println(fact(4));
       System.out.println(power(6,4));


     };

     static int power(int x,int y){
      if (y==0)return 1;
      return power(x, y-1)*x;
     }

static int dgt(int x){
   if (x==0)return 0;
   
    return 1+dgt(x/10);
}


static int sod(int x){
   if(x>=0&&x<=9) return x;
   return sod(x/10) + x%10;
}

static int multi(int n){
   

   return multi(n+3);
}



   static int sum(int n){
      if(n==0||n==1)return n;

      int prev=sum(n-1);
      int prev2=sum(n-2);

      return prev+prev2;
   }



     static int fact(int n ){
        if(n==0) return 1 ; 
        
        int a = fact(n-1);
        int ans = n*a;
        return ans;


     }
    }