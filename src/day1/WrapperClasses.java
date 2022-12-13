package day1;

public class WrapperClasses {

    public static void main(String[] args) {
        int a=100;
        byte b=28;

     //   Integer a2 =b; you can not use two primitive under same wrapper

        //Integer ,primitive must be int
        //Byte ,primitive must be byte
     Integer x =a;

     Byte z = b;


     //For char,using "Character"
     char ch='$';
     Character y =ch;

        System.out.println("-----------------------------------------");

      int q=  Integer.parseInt("123");
      Integer w=Integer.valueOf("123");//valueof automatically return wrapper class

    }
}
