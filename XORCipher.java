import java.util.Scanner;

public class XORCipher {
    
    // XOR Encryption/Decryption
    public static String xorEncryptDecrypt(String text, char key) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            result.append((char) (text.charAt(i) ^ key)); // XOR operation
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text: ");
        String input = scanner.nextLine();

        System.out.print("Enter a single character key: ");
        char key = scanner.next().charAt(0);

        // Encrypt
        String encrypted = xorEncryptDecrypt(input, key);
        System.out.println("Encrypted: " + encrypted);

        // Decrypt (XOR is symmetric, so applying again decrypts it)
        String decrypted = xorEncryptDecrypt(encrypted, key);
        System.out.println("Decrypted: " + decrypted);

        scanner.close();
    }
}
