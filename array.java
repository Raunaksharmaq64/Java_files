public class array {
    public static void main(String[] args) {
        question3();

    };



    

    //finding minimum and maximum 


static int question3(){
    int[]array3={33,45,66,778,5,665,-22,66666};
    int max= Integer.MIN_VALUE;
    int min= Integer.MAX_VALUE;

    for(int i = 0;i<array3.length;i++){
        if (array3[i]>max) {
            max=array3[i]; };

             if (array3[i]<min) {
            min=array3[i];
            
        };
            
        };
    

System.out.println("Maximum = " + max);
    System.out.println("Minimum = " + min);
        
        return max;
        
    }

    







//print equals numbers 
    static int question2(){
        int[]array2={2,3,4,5,2,1,3,5,5,2,5,88,0};
        int result=0;

        for (int i = 0 ; i<array2.length;i++){
            for(int j = i+1 ; j<array2.length;j++){
                if(array2[i]==array2[j]){
                    
                    System.out.println("found at "+array2[i]+" ,  "+array2[j]);

                }else{System.out.println("searching ......"+array2[i]+" , "+array2[j]);}
            }
        }



        return result;
    }






//print sum= 10 


static int question1() {
        System.out.println("print sum pairs ");
        int[]array1={4,5,6,7,3,5,8,2};
        int sum= 0;
        for(int i=0;i<array1.length;i++){
            for(int j =i+1;j<array1.length;j++){
            sum =array1[i]+array1[j];
            if(sum==10){
                System.out.println("found "+ sum+"at "+array1[i]+" "+array1[j]);

            }else{
                System.out.println("not found  "+ sum +" "+"at "+array1[i]+" "+array1[j]);
            }
            
        }
        }
        return sum;
    }
}
