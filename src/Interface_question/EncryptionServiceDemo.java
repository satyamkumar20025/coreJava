package Interface_question;

public class EncryptionServiceDemo {
    public static void main(String[] args) {
        Encryptable aes = new AESEncryption();
        System.out.println(aes.encrypt("Hello"));
        System.out.println(aes.decrypt(aes.encrypt("Hello")));

        Encryptable base64 = new Base64Encryption();
        String enc = base64.encrypt("Java");
        System.out.println("Base64 Encrypted: " + enc);
        System.out.println("Base64 Decrypted: " + base64.decrypt(enc));
    }
}