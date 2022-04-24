public class Main {

    public static void main(String[] args) {
        String text = "L oryh brx 3000";
        int s = 23;

        //create instance of EncryptCipher
        EncryptCipher encryptCipher = new EncryptCipher(
                text, s);

        //create instance of DecryptCipher
        DecryptCipher decryptCipher = new DecryptCipher(
                encryptCipher.encrypt(), encryptCipher.getKey());

        System.out.println("Original Text : " + text);
        System.out.println("Encrypt Shift : " + s);
        System.out.println("Cipher: " + encryptCipher.encrypt());
        System.out.println("Decrypt Shift : " + decryptCipher.getKey());
        System.out.println("Decrypt Text: " + decryptCipher.decrypt());
    }
}
