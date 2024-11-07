/**
 *
 * @author Bushra
 */
package crypto;

import java.security.MessageDigest;

public class SHA256 {
    public static String hash(String data) throws Exception {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hashBytes = md.digest(data.getBytes());
        StringBuilder sb = new StringBuilder();
        for (byte b : hashBytes) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }

    public static void main(String[] args) throws Exception {
        String data = "Hello, World!";
        String hash = hash(data);
        System.out.println("SHA-256 Hash: " + hash);
    }
}
