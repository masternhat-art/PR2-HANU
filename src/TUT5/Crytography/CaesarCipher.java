package TUT5.Crytography;

public class CaesarCipher extends Cryptography {
    private int shift;

    public CaesarCipher(String plainText, int shift) {
        super(plainText);
        this.shift = shift;
    }

    @Override
    public void encrypt() {
        StringBuilder encrypted = new StringBuilder();
        for (char ch : plainText.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                encrypted.append((char) ((ch - 'A' + shift) % 26 + 'A'));
            } else if (Character.isLowerCase(ch)) {
                encrypted.append((char) ((ch - 'a' + shift) % 26 + 'a'));
            } else {
                encrypted.append(ch);
            }
        }
        cipherText = encrypted.toString();
    }

    @Override
    public void decrypt() {
        StringBuilder decrypted = new StringBuilder();
        for (char ch : cipherText.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                decrypted.append((char) ((ch - 'A' - shift + 26) % 26 + 'A'));
            } else if (Character.isLowerCase(ch)) {
                decrypted.append((char) ((ch - 'a' - shift + 26) % 26 + 'a'));
            } else {
                decrypted.append(ch);
            }
        }
        plainText = decrypted.toString();
    }
}
