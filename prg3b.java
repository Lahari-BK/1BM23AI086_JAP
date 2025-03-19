import java.util.Scanner;
public class prg3b {
    public static void main(String[] args){
        StringBuffer sb1 = new StringBuffer();
        System.out.println("Capacity of stringBuffer objrct sb1:"+ sb1.capacity());
        StringBuffer sb2 = new StringBuffer("Hello");
        System.out.println("Capacity of StringBuffer object sb2:"+sb2.capacity());
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputString = scanner.nextLine();
        StringBuffer reversedBuffer = new StringBuffer(inputString);
        reversedBuffer.reverse();
        String reversedUpperCase = reversedBuffer.toString().toUpperCase();
        System.out.println("Reversed string in uppercase" + reversedUpperCase);
        System.out.println("Enter a string to append:");
        String appendString = scanner.nextLine();
        reversedBuffer.append(appendString);
        System.out.println("String after appending:"+reversedBuffer);
        scanner.close();

    }
}

