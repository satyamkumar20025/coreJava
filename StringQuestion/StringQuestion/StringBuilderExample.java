package StringQuestion;

public class StringBuilderExample {
    public static void main(String[] args) {

        // String concatenation using +
        String str = "Hello";
        str += "World";
        System.out.println(str); // HelloWorld

        // StringBuilder (mutable)
        StringBuilder sb = new StringBuilder("Hello");
        StringBuilder name = new StringBuilder("Karan ");
        sb.append(" World");
        System.out.println(name.append(sb)); // Karan Hello World
        System.out.println(sb.toString());   // Hello World

        // StringBuffer (mutable)
        StringBuffer s = new StringBuffer("Hii");
        s.append(" Welcome to String");
        System.out.println(s); // Hii Welcome to String

        // length()
        int a = s.length();
        System.out.println("Size of s: " + a);

        // charAt()
        String nam = "Alice";
        if (Character.isUpperCase(nam.charAt(0))) {
            System.out.println("Name starts with a capital letter.");
        }
        System.out.println(nam.charAt(nam.length() - 1)); // e

        // toCharArray() loop
        for (char c : nam.toCharArray()) {
            System.out.println(c);
        }

        // substring()
        String email = "user@example.com";
        String domain = email.substring(email.indexOf("@") + 1);
        System.out.println(domain); // example.com

        // equals()
        String inputPassword = "123456";
        String storedPassword = "123456";
        if (inputPassword.equals(storedPassword)) {
            System.out.println("Login successful.");
        }

        // trim()
        String username = "  admin  ";
        System.out.println(username.trim()); // admin

        // Reverse a string
        String sr = "Hello world welcome to java programming";
        char[] ch = sr.toCharArray();
        for (int i = ch.length - 1; i >= 0; i--) {
            System.out.print(ch[i]);
        }
        System.out.println();

        // Capitalize each character
        String op = "hello world";
        System.out.println(op.toUpperCase());

        // Convert to lowercase using loop
        char[] chr = op.toUpperCase().toCharArray();
        for (char k : chr) {
            if (k != ' ') {
                k = Character.toLowerCase(k);
            }
            System.out.print(k);
        }
        System.out.println();

        // startsWith() and endsWith()
        String url = "https://github.com/satyamkumar";
        System.out.println(url.startsWith("https")); // true
        System.out.println(url.endsWith("kumar"));   // true

        // contains()
        String bio = "Full Stack Developer specializing in MERN";
        System.out.println(bio.contains("MERN")); // true

        // indexOf() and lastIndexOf()
        String sentence = "Java is powerful. Java is popular.";
        System.out.println(sentence.indexOf("Java"));       // 0
        System.out.println(sentence.lastIndexOf("Java"));   // 18

        // replace() and replaceAll()
        String dirty = "This_is_a_test_string";
        System.out.println(dirty.replace("_", " "));        // This is a test string
        System.out.println(dirty.replaceAll("test", "demo")); // This_is_a_demo_string

        // split()
        String csv = "apple,banana,grape,mango";
        String[] fruits = csv.split(",");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // isEmpty() and isBlank()
        String emptyStr = "";
        String blankStr = "   ";
        System.out.println(emptyStr.isEmpty()); // true
        System.out.println(blankStr.isBlank()); // true (Java 11+)

        // join()
        String joined = String.join(" | ", "React", "Angular", "Vue");
        System.out.println(joined); // React | Angular | Vue

        // compareTo()
        String a1 = "apple";
        String b1 = "banana";
        System.out.println(a1.compareTo(b1)); // negative (lexicographically less)

        // intern()
        String x = new String("hello").intern();
        String y = "hello";
        System.out.println(x == y); // true (same reference from string pool)

        // format()
        String devName = "Satyam";
        int score = 95;
        String formatted = String.format("Name: %s, Score: %d", devName, score);
        System.out.println(formatted); // Name: Satyam, Score: 95
    }
}