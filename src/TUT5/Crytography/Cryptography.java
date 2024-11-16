package TUT5.Crytography;

public  abstract class Cryptography {
    protected String plainText;
    protected String cipherText;
    public Cryptography(String plainText){
        this.plainText=plainText;
        this.cipherText="";
    }
    public String getPlainText() {
        return plainText;
    }

    public void setPlainText(String plainText) {
        this.plainText = plainText;
    }

    public String getCipherText() {
        return cipherText;
    }

    public void setCipherText(String cipherText) {
        this.cipherText = cipherText;
    }
    public abstract void encrypt();

    public abstract void decrypt();
}
