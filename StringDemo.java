
public class StringDemo {
    public static void main(String[] args) {

        String s = "Welcome to java.";
        String s1 = "Andrew";

        /*
        System.out.println(s.length());
        System.out.println(s.charAt(3));
        System.out.println(s.concat(s1));
        System.out.println(s.trim());
        System.out.println(s1);

        if (s.compareTo(s1) < 0) {
            System.out.print(s + "\n" + s1);
        } else {
            System.out.print(s1 + "\n" + s);
        }
        */
//        System.out.println(s.charAt(s.length()-1));
        System.out.println("1" + 1);
        System.out.println('1' + 1);
        System.out.println("1" + 1 + 1);
        System.out.println("1" + (1 + 1));
        System.out.println('1' + 1 + 1);

        System.out.println(1 + "Welcome " + 1 + 1);
        System.out.println(1 + "Welcome " + (1 + 1));
        System.out.println(1 + "Welcome " + ('\u0001' + 1));
        System.out.println(1 + "Welcome " + 'a' + 1);
        double d = 123.45;
        System.out.println((d + "").length());

        String address = "www.turingscraft.com";

        String name = "Blair";

        System.out.println(name.charAt(name.length()-1));

        boolean recalled = true;
        name = "Jeremy";

        System.out.println(name.substring(name.length() - 1));

    }
}
