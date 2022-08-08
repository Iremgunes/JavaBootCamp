package day01;

public class CharSequences {
    public static void main(String[] args) {

        String str = "Java";
        String str2 = new String("Java");

        System.out.println(str == str2);
        System.out.println(str.equals(str2));

        StringBuilder stringBuilder = new StringBuilder("Java");

        StringBuffer stringBuffer = new StringBuffer("Java");

        System.out.println(stringBuffer.equals(stringBuilder));


        System.out.println("-----------------------------");

        String s1 = "Cydeo";
        s1.concat("School");

        System.out.println(s1);

        StringBuilder s2 = new StringBuilder("Cydeo");
        s2.append(" School");
        System.out.println(s2);

        StringBuffer s3 = new StringBuffer("Cydeo");
        s3.append(" School");
        System.out.println(s3);



    }
}
