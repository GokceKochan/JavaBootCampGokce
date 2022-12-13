package day1;

public class SequenceOfCharacters {

    public static void main(String[] args) {

        //two way we can create the string
        String str="cydeo";
        String str2="cydeo";

        String str3=new String("cydeo");
        String str4=new String("cydeo");

       String str5= str.toUpperCase();// new string will be "CYDEO"
        System.out.println(str5);

        System.out.println(str2.concat("School"));
        System.out.println(str2);

        //   StringBuilder stringBuilder=str;
        //   StringBuffer stringBuffer="cydeo";


        StringBuffer stringBuffer=new StringBuffer("Cydeo");
        stringBuffer.append(" School");
        System.out.println(stringBuffer);

        StringBuilder stringBuilder=new StringBuilder("Cydeo");
        stringBuilder.append(" School");
        System.out.println(stringBuilder);


    }

}
