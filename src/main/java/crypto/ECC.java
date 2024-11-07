/**
 *
 * @author Bushra
 */
package crypto;

import java.security.*;
import java.security.spec.ECGenParameterSpec;
import java.util.Base64;

public class ECC {
    public static byte[] sign(String data, PrivateKey privateKey) throws Exception {
        Signature signature = Signature.getInstance("SHA256withECDSA");
        signature.initSign(privateKey);
        signature.update(data.getBytes());
        return signature.sign();
    }

    public static boolean verify(String data, byte[] signatureBytes, PublicKey publicKey) throws Exception {
        Signature signature = Signature.getInstance("SHA256withECDSA");
        signature.initVerify(publicKey);
        signature.update(data.getBytes());
        return signature.verify(signatureBytes);
    }

    public static void main(String[] args) throws Exception {
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("EC");
        keyGen.initialize(new ECGenParameterSpec("secp256r1"));
        KeyPair keyPair = keyGen.generateKeyPair();
        PublicKey publicKey = keyPair.getPublic();
        PrivateKey privateKey = keyPair.getPrivate();

        String data = "Hello, World!";
        byte[] signature = sign(data, privateKey);
        System.out.println("Signature: " + Base64.getEncoder().encodeToString(signature));

        boolean isVerified = verify(data, signature, publicKey);
        System.out.println("Verification: " + isVerified);
    }
}
