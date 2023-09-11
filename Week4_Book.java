
public class Week4_Book {

    public static void main(String[] args) {
        char ch = (char) 0XAB0041;
        System.out.print(ch);
        int i = 'A';
        System.out.print(i);
        byte b = (byte) '\uFFF4';
        System.out.print(b);
        System.out.println("isDigit('a') is " + Character.isDigit('a'));
        System.out.println("isLetter('a') is " + Character.isLetter('a'));
        System.out.println("isLowerCase('a') is "
                + Character.isLowerCase('a'));
        System.out.println("isUpperCase('a') is "
                + Character.isUpperCase('a'));
        System.out.println("toLowerCase('T') is "
                + Character.toLowerCase('T'));
        System.out.println("toUpperCase('q') is "
                + Character.toUpperCase('q'));
    }

}