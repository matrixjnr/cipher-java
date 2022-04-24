public class EncryptCipher {
    //variables
    private String text;
    private int key;

    // Encrypts text using a shift  cipher key
    public EncryptCipher(String text, int key) {
        this.text = text;
        this.key = key;
    }

    //getters and setters
    public String getText() {
        return  this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    //Encrypts the text
    public String encrypt() {
        String encryptedText = "";
        for (int i = 0; i < this.text.length(); i++) {
            char c = this.text.charAt(i);
            if (Character.isLetter(c)) {
                if (Character.isUpperCase(c)) {
                    encryptedText += (char) (((c - 65 + this.key) % 26) + 65);
                } else {
                    encryptedText += (char) (((c - 97 + this.key) % 26) + 97);
                }
            } else {
                encryptedText += c;
            }
        }
        return encryptedText;
    }
}
