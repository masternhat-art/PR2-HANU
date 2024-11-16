package TUT5.Crytography;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
public class Demo {
    public class Main {
        public static void main(String[] args) {
            // Caesar Cipher Example
            CaesarCipher caesar = new CaesarCipher("HELLO", 3);
            caesar.encrypt();
            System.out.println("Caesar Encrypted: " + caesar.getCipherText());
            caesar.decrypt();
            System.out.println("Caesar Decrypted: " + caesar.getPlainText());

            // Substitution Cipher Example
            Map<Character, Character> keyMap = new HashMap<>();
            keyMap.put('H', 'X');
            keyMap.put('E', 'Y');
            keyMap.put('L', 'Z');
            keyMap.put('O', 'W');
            SubstitutionCipher substitution = new SubstitutionCipher("HELLO", keyMap);
            substitution.encrypt();
            System.out.println("Substitution Encrypted: " + substitution.getCipherText());
            substitution.decrypt();
            System.out.println("Substitution Decrypted: " + substitution.getPlainText());

            // RSA Example
            BigInteger publicKey = new BigInteger("65537");
            BigInteger privateKey = new BigInteger("2753");
            BigInteger modulus = new BigInteger("3233");
            RSA rsa = new RSA("HELLO", publicKey, privateKey, modulus);
            rsa.encrypt();
            System.out.println("RSA Encrypted: " + rsa.getCipherText());
            rsa.decrypt();
            System.out.println("RSA Decrypted: " + rsa.getPlainText());
        }
    }
}
