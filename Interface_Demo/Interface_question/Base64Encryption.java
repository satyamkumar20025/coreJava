package Interface_question;

import java.util.Scanner;


//Base64 Encryption (simple logic)
import java.util.Base64;

class Base64Encryption implements Encryptable {
 @Override
 public String encrypt(String data) {
     return Base64.getEncoder().encodeToString(data.getBytes());
 }

 @Override
 public String decrypt(String data) {
     return new String(Base64.getDecoder().decode(data));
 }
}

