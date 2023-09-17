package qura.qa;

import java.sql.SQLOutput;
import java.util.concurrent.BlockingDeque;

public class Main {
    public static void main(String[] args) {
        byte maxByte = Byte.MAX_VALUE;
        byte minByte = Byte.MIN_VALUE;
        float maxFloat = Float.MAX_VALUE;
        float minFloat = Float.MIN_VALUE;
        double maxDouble = Double.MAX_VALUE;
        double minDouble = Double.MIN_VALUE;
        int maxInt = Integer.MAX_VALUE;
        int minInt = Integer.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;
        long minLong = Long.MIN_VALUE;
        short maxShort = Short.MAX_VALUE;
        short minShort = Short.MAX_VALUE;
        boolean rTrue = true;
        boolean rFalse = false;
        char maxCharacter = Character.MAX_VALUE;
        char minCharacter = Character.MIN_VALUE;
        String word = "Hi";
        //Calculations
        System.out.println("maxInteger + minInteger = " + (maxInt + minInt));
        System.out.println("maxInteger - minByte = " + (maxInt - minByte));
        System.out.println("maxInteger * minFloat = " + (maxInt * minFloat));
        System.out.println("maxLong / minInt = " + (maxLong / minInt));
        System.out.println("maxInteger % minInteger = " + (maxInt % minInt));
        System.out.println("maxInt - minDouble =" + (maxInt + minDouble));
        System.out.println("minInt - manDouble =" + (minInt - maxDouble));
        System.out.println("Text: " + (word + " qa.quru"));
        //Overflow
        System.out.println("Overflow: " + (byte) (maxByte + 1));
        System.out.println("Overflow: " + (byte) (minByte - 1));
        //Logical expressions
        System.out.println("maxLong < maxInt = " + (maxLong < maxInt));
        System.out.println("True || False = " + (rTrue || rFalse));
        System.out.println("maxLong < maxInt && maxDouble < maxFloat = " + (maxLong < maxInt && maxDouble < maxFloat));
    }
}