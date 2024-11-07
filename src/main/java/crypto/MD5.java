/**
 *
 * @author Bushra
 */
package crypto;

import java.security.MessageDigest;

public class MD5 {
    public static String hash(String data) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
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
        System.out.println("MD5 Hash: " + hash);
    }
}
