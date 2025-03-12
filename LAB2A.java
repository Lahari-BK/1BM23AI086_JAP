package Lahari;

public class LAB2A
{
    public static void main(String[] args)
    {
        int primitiveInt = 10;
        Integer boxedInt = Integer.valueOf(primitiveInt);

        double primitiveDouble = 3.14;
        Double boxedDouble = Double.valueOf(primitiveDouble);

        boolean primitiveBool = true;
        Boolean boxedBool = Boolean.valueOf(primitiveBool);

        char primitiveChar = 'A';
        Character boxedChar = Character.valueOf(primitiveChar);

        int unboxedInt = boxedInt.intValue();
        double unboxedDouble = boxedDouble.doubleValue();
        boolean unboxedBool = boxedBool.booleanValue();
        char unboxedChar = boxedChar.charValue();

        System.out.println("Boxed Values:");
        System.out.println("Boxed Integer: " + boxedInt);
        System.out.println("Boxed Double: " + boxedDouble);
        System.out.println("Boxed Boolean: " + boxedBool);
        System.out.println("Boxed Character: " + boxedChar);

        System.out.println("\nUnboxed Values:");
        System.out.println("Unboxed Integer: " + unboxedInt);
        System.out.println("Unboxed Double: " + unboxedDouble);
        System.out.println("Unboxed Boolean: " + unboxedBool);
        System.out.println("Unboxed Character: " + unboxedChar);
    }

}
