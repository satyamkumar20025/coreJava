package String;

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

        // charAt() with index loop
        for (int i = 0; i < nam.length(); i++) {
            System.out.println(nam.charAt(i));
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
        } else {
            System.out.println("Wrong Password");
        }

        // == comparison
        if (inputPassword == storedPassword) {
            System.out.println("Reference same");
        }

        // equalsIgnoreCase()
        String inputEmail = "Vijay0102@gmail.com";
        String storedEmail = "vijay0102@gmail.com";
        if (inputEmail.equalsIgnoreCase(storedEmail)) {
            System.out.println("Email matched.");
        }

        // trim()
        String username = "  admin  ";
        System.out.println(username.trim()); // admin

        // contains()
        String description = "This phone has a great camera.";
        if (description.contains("camera")) {
            System.out.println("Camera feature found.");
        }

        // toLowerCase(), toUpperCase()
        String keyword = "Laptop";
        System.out.println(keyword.toLowerCase()); // laptop
        System.out.println(keyword.toUpperCase()); // LAPTOP

        // startsWith(), endsWith()
        String fileName = "report.pdf";
        if (fileName.endsWith(".pdf")) {
            System.out.println("PDF file detected.");
        }
        if (fileName.startsWith("report")) {
            System.out.println("File name starts with 'report'.");
        }

        // indexOf(), lastIndexOf()
        String url = "https://example.com/page";
        int index = url.indexOf("com");
        System.out.println(index); // 16

        // replace(), replaceAll()
        String text = "Hello World";
        System.out.println(text.replace(" ", "_")); // Hello_World
        System.out.println(text.replaceAll(" ", "_")); // Hello_World

        // split(String regex)
        String csv = "apple,banana,grape";
        String[] fruits = csv.split(",");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // isEmpty(), isBlank()
        String input = "   ";
        System.out.println(input.isBlank()); // true
        System.out.println(input.isEmpty()); // false

        // valueOf()
        int age = 25;
        String ageStr = String.valueOf(age);
        System.out.println(ageStr); // 25

        // format(String format, Object... args)
        String nameFormat = "Ravi";
        int score = 95;
        String result = String.format("%s scored %d marks.", nameFormat, score);
        System.out.println(result); // Ravi scored 95 marks.
    }
}