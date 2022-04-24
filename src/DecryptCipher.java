public class DecryptCipher {

    private String text;
    private int key;

    // Encrypts text using a shift  cipher key
    public DecryptCipher(String text, int key) {
        this.text = text;
        this.key = 26 - key;
    }

    //getters and setters


    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getKey() {
        return this.key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    // Decrypts text using a shift
    public StringBuffer decrypt(){
        StringBuffer r= new StringBuffer();

        for (int i=0; i<this.text.length(); i++)
        {
            if (Character.isLetter(this.text.charAt(i))){
                if (Character.isUpperCase(this.text.charAt(i)))
                {
                    if(this.text.charAt(i) == ' '){
                        r.append(' ');
                    } else {
                        char ch = (char)(((int)this.text.charAt(i) +
                                this.key - 65) % 26 + 65);
                        r.append(ch);
                    }
                }
                else
                {
                    if(this.text.charAt(i) == ' '){
                        r.append(' ');
                    } else {
                        char ch = (char) (((int) this.text.charAt(i) +
                                this.key - 97) % 26 + 97);
                        r.append(ch);
                    }
                }
            } else {
                r.append(this.text.charAt(i));
            }
        }
        return r;
    }
}
