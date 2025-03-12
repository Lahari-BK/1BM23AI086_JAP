package Lahari;

public class LAB2A
{
    public static void main(String[] args) {
        int primitiveInt = 10;
        Integer boxedInt = Integer.valueOf(primitiveInt);

        double primitiveDouble = 3.14;
        Double boxedDouble = Double.valueOf(primitiveDouble);

        boolean primitiveBool = true;
        Boolean boxedBool = Boolean.valueOf(primitiveBool);

        char primitiveChar = 'A';
        Character boxedChar = Character.valueOf(primitiveChar);

        float primitiveFloat = 5.75f; // float primitive
        Float boxedFloat = Float.valueOf(primitiveFloat); // boxing float

        byte primitiveByte = 100; // byte primitive
        Byte boxedByte = Byte.valueOf(primitiveByte); // boxing byte

        int unboxedInt = boxedInt.intValue();
        double unboxedDouble = boxedDouble.doubleValue();
        boolean unboxedBool = boxedBool.booleanValue();
        char unboxedChar = boxedChar.charValue();
        float unboxedFloat = boxedFloat.floatValue(); // unboxing float
        byte unboxedByte = boxedByte.byteValue(); // unboxing byte

        System.out.println("Boxed Values:");
        System.out.println("Boxed Integer: " + boxedInt);
        System.out.println("Boxed Double: " + boxedDouble);
        System.out.println("Boxed Boolean: " + boxedBool);
        System.out.println("Boxed Character: " + boxedChar);
        System.out.println("Boxed Float: " + boxedFloat); // print boxed float
        System.out.println("Boxed Byte: " + boxedByte); // print boxed byte

        System.out.println("\nUnboxed Values:");
        System.out.println("Unboxed Integer: " + unboxedInt);
        System.out.println("Unboxed Double: " + unboxedDouble);
        System.out.println("Unboxed Boolean: " + unboxedBool);
        System.out.println("Unboxed Character: " + unboxedChar);
        System.out.println("Unboxed Float: " + unboxedFloat); // print unboxed float
        System.out.println("Unboxed Byte: " + unboxedByte); // print unboxed byte
    }
}

