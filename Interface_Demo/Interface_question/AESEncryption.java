package Interface_question;

//AES Encryption (dummy logic)
// AES Encryption (sample logic)
class AESEncryption implements Encryptable {
    @Override
    public String encrypt(String data) {
        return "AES Encrypted: " + new StringBuilder(data).reverse(); // just a dummy example
    }

    @Override
    public String decrypt(String data) {
        return "AES Decrypted: " + new StringBuilder(data.replace("AES Encrypted: ", "")).reverse();
    }
}


