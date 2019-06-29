public class Kangaroo {

    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {

        double valid = (double)(x1 - x2)/(v2-v1);

        if(valid>=1){

            valid = valid - ((int)valid);

            if(valid == 0){
                return "YES";
            }
            return "NO";
        }else{
            return "NO";
        }
    }


    public static void main(String[] args)   {

       String result =  kangaroo(63 ,8 ,94, 3);

       System.out.println(result);
    }

}
