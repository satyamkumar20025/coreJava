package Interface_question;

import java.util.Scanner;

//Base64 Encryption
class Base64Encryption implements Encryptable {
 @Override
public void encrypt(String data) {
     
     System.out.println("encrypt data"+data);
 }

 @Override
 public void decrypt(String data) {
	 
     System.out.println("decrypt data"+data);

 }
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Enter text to encrypt: ");
     String input = scanner.nextLine();

     System.out.print("Choose method (aes/base64): ");
     String method = scanner.nextLine().toLowerCase();

    
 }
}


