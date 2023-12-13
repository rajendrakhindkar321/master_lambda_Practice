package work;

public class Main {

    public static void main(String[] args) {

        SayHi s = () -> System.out.println("This is first anonymous class");

        s.SayHello();

        MyInter i = (a,b) -> a+b;

        System.out.println( i.sum(25,85));

        LengthInter lengthInter = str -> str.length();

        System.out.println(lengthInter.getLength("This is Rajendra"));

    }
}
