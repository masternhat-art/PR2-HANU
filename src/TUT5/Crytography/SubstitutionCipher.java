package TUT5.Crytography;

import java.util.Map;
import java.util.stream.Collectors;

public class SubstitutionCipher extends Cryptography {
    private Map<Character, Character> keyMap;
    private Map<Character, Character> reverseKeyMap;

    public SubstitutionCipher(String plainText, Map<Character, Character> keyMap) {
        super(plainText);
        this.keyMap = keyMap;
        this.reverseKeyMap = keyMap.entrySet().stream()
                .collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey));
    }

    @Override
    public void encrypt() {
        StringBuilder encrypted = new StringBuilder();
        for (char ch : plainText.toCharArray()) {
            encrypted.append(keyMap.getOrDefault(ch, ch));
        }
        cipherText = encrypted.toString();
    }

    @Override
    public void decrypt() {
        StringBuilder decrypted = new StringBuilder();
        for (char ch : cipherText.toCharArray()) {
            decrypted.append(reverseKeyMap.getOrDefault(ch, ch));
        }
        plainText = decrypted.toString();
    }
}

