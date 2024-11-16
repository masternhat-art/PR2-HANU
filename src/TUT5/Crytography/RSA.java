package TUT5.Crytography;

import java.math.BigInteger;

public class RSA extends Cryptography {
    private BigInteger publicKey;
    private BigInteger privateKey;
    private BigInteger modulus;

    public RSA(String plainText, BigInteger publicKey, BigInteger privateKey, BigInteger modulus) {
        super(plainText);
        this.publicKey = publicKey;
        this.privateKey = privateKey;
        this.modulus = modulus;
    }

    @Override
    public void encrypt() {
        StringBuilder encrypted = new StringBuilder();
        for (char ch : plainText.toCharArray()) {
            BigInteger encryptedChar = BigInteger.valueOf((int) ch).modPow(publicKey, modulus);
            encrypted.append(encryptedChar.toString()).append(" ");
        }
        cipherText = encrypted.toString().trim();
    }

    @Override
    public void decrypt() {
        String[] cipherTextArray = cipherText.split(" ");
        StringBuilder decrypted = new StringBuilder();
        for (String encryptedChar : cipherTextArray) {
            BigInteger decryptedChar = new BigInteger(encryptedChar).modPow(privateKey, modulus);
            decrypted.append((char) decryptedChar.intValue());
        }
        plainText = decrypted.toString();
    }
}

