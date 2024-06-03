
public class StringComparison {

    public static void compareStrings(String str1, String str2) {
        System.out.println("Comparing \"" + str1 + "\" and \"" + str2 + "\":");

        // == and != comparisons
        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println("str1 != str2: " + (str1 != str2));

        // equals() test
        System.out.println("str1.equals(str2): " + str1.equals(str2));
    }

    public static void main(String[] args) {
        compareStrings("Hello", "Hello");
        compareStrings("Hello", "World");
        compareStrings(new String("Hello"), new String("Hello"));
    }
}