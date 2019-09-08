package academy.learnProgramming;

public class Datatypes {
    public static void main(String[] args){
        System.out.println("Hello world!!");

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer Mininum value " + myMinIntValue);
        System.out.println("Integer Max value " + myMaxIntValue);
        System.out.println("Busted MAX value " + (myMaxIntValue + 1));
        // overflow and under flow in Java for datatypes exists

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte Max value " + myMaxByteValue);
        System.out.println("Byte Max Value " + myMinByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Byte Max value " + myMaxShortValue);
        System.out.println("Byte Max Value " + myMinShortValue);

        long myLongValue = 100L;




    }
}
