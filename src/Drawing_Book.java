public class Drawing_Book {

    static int pageCount(int n, int p) {
        /*
         * Write your code here.
         */

        int result;

        int startIndex = 1;
        int endIndex = n/2 +1;

        int selectedIndex = p/2 +1;

        result = (selectedIndex - startIndex) >= (endIndex-selectedIndex) ? (endIndex-selectedIndex): (selectedIndex - startIndex) ;

        return  result;
    }


    public static void main(String[] args) {
        int result;

        result = pageCount(6,2);
        System.out.println(result);


        result = pageCount(5,4);
        System.out.println(result);
    }



}
