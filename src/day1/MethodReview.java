package day1;

public class MethodReview {

    public static void main(String[] args) {

        String str1="Cydeo";
        printEach(str1);
       /*
        for (int i = 0; i <str1.length() ; i++) {
            System.out.println(str1.charAt(i));

        }


        */

        System.out.println("-----------------------------------");
        String str2="Java";
        printEach(str2);

        System.out.println("-----------------------------------");
        String str3="WoodenSpoon";
        printEach(str3);

        System.out.println("-----------------------------------");

        int[] numbers={10,20,30,40};
        printEach(numbers);

    }

    public static void  printEach(String str){
        for (int i = 0; i <str.length() ; i++) {
            System.out.println(str.charAt(i));
        }

    }

    public static void printEach(int[] arr){
        for (int each :arr){
            System.out.println(each);
        }
    }
}
