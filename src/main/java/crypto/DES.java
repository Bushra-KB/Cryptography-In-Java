/**
 *
 * @author Bushra
 */
package crypto;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.Base64;

public class DES {
    public static String encrypt(String data, SecretKey key) throws Exception {
        Cipher cipher = Cipher.getInstance("DES");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encryptedData = cipher.doFinal(data.getBytes());
        return Base64.getEncoder().encodeToString(encryptedData);
    }

    public static String decrypt(String encryptedData, SecretKey key) throws Exception {
        Cipher cipher = Cipher.getInstance("DES");
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte[] decodedData = Base64.getDecoder().decode(encryptedData);
        byte[] decryptedData = cipher.doFinal(decodedData);
        return new String(decryptedData);
    }

    public static void main(String[] args) throws Exception {
        KeyGenerator keyGen = KeyGenerator.getInstance("DES");
        keyGen.init(56);
        SecretKey key = keyGen.generateKey();

        String data = "Hello, World!";
        String encryptedData = encrypt(data, key);
        System.out.println("Encrypted: " + encryptedData);

        String decryptedData = decrypt(encryptedData, key);
        System.out.println("Decrypted: " + decryptedData);
    }
}
