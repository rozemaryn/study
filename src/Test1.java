public class Test1 {
    public static void main(String[] args) {
        String s1 = new String("privet");
        int a = s1.length();
        System.out.println(a);
        System.out.println(s1.length());

        /* char c1 = s1.charAt(7);
        System.out.println(c1); — вот так нельзя делать, будет exception String index out of range: 7 */

        int i1 = s1.indexOf("t");
        System.out.println(i1);

        int i2 = s1.indexOf("vet");
        System.out.println(i2);

        int i3 = s1.indexOf("z");
        System.out.println(i3);

        String s2 = "abcdeaefdefab";
        int i4 = s2.indexOf("a", 3);
        System.out.println(i4);

        int i5 = s2.indexOf("ab", 3);
        System.out.println(i5);

        boolean b1 = s2.startsWith("abcde");
        System.out.println(b1);

        boolean b2 = s2.startsWith("ab", 5);
        System.out.println(b2);

        boolean b3 = s2.endsWith("ab");
        System.out.println(b3);


    }
}
