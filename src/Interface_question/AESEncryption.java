package Interface_question;

//AES Encryption (dummy logic)
class AESEncryption implements Encryptable {
 @Override
 public void encrypt(String data) {
     
     System.out.println("encrypt data"+data);
 }

 @Override
 public void decrypt(String data) {
	 
     System.out.println("decrypt data"+data);

 }
}

