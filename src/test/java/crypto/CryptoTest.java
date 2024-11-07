/**
 *
 * @author Bushra
 */
package crypto;

import org.junit.jupiter.api.Test;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.ECGenParameterSpec;

import static org.junit.jupiter.api.Assertions.*;

public class CryptoTest {

    @Test
    public void testAES() throws Exception {
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(128);
        SecretKey key = keyGen.generateKey();

        String data = "Hello, World!";
        String encryptedData = AES.encrypt(data, key);
        String decryptedData = AES.decrypt(encryptedData, key);

        assertEquals(data, decryptedData);
    }

    @Test
    public void testDES() throws Exception {
        KeyGenerator keyGen = KeyGenerator.getInstance("DES");
        keyGen.init(56);
        SecretKey key = keyGen.generateKey();

        String data = "Hello, World!";
        String encryptedData = DES.encrypt(data, key);
        String decryptedData = DES.decrypt(encryptedData, key);

        assertEquals(data, decryptedData);
    }

    @Test
    public void testRSA() throws Exception {
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
        keyGen.initialize(2048);
        KeyPair keyPair = keyGen.generateKeyPair();
        PublicKey publicKey = keyPair.getPublic();
        PrivateKey privateKey = keyPair.getPrivate();

        String data = "Hello, World!";
        String encryptedData = RSA.encrypt(data, publicKey);
        String decryptedData = RSA.decrypt(encryptedData, privateKey);

        assertEquals(data, decryptedData);
    }

    @Test
    public void testSHA() throws Exception {
        String data = "Hello, World!";
        String hash = SHA.hash(data);

        assertNotNull(hash);
    }

    @Test
    public void testTripleDES() throws Exception {
        KeyGenerator keyGen = KeyGenerator.getInstance("DESede");
        keyGen.init(168);
        SecretKey key = keyGen.generateKey();

        String data = "Hello, World!";
        String encryptedData = TripleDES.encrypt(data, key);
        String decryptedData = TripleDES.decrypt(encryptedData, key);

        assertEquals(data, decryptedData);
    }

    @Test
    public void testIDEA() throws Exception {
        KeyGenerator keyGen = KeyGenerator.getInstance("IDEA", "BC");
        keyGen.init(128);
        SecretKey key = keyGen.generateKey();

        String data = "Hello, World!";
        String encryptedData = IDEA.encrypt(data, key);
        String decryptedData = IDEA.decrypt(encryptedData, key);

        assertEquals(data, decryptedData);
    }

    @Test
    public void testECC() throws Exception {
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("EC");
        keyGen.initialize(new ECGenParameterSpec("secp256r1"));
        KeyPair keyPair = keyGen.generateKeyPair();
        PublicKey publicKey = keyPair.getPublic();
        PrivateKey privateKey = keyPair.getPrivate();

        String data = "Hello, World!";
        byte[] signature = ECC.sign(data, privateKey);
        boolean isVerified = ECC.verify(data, signature, publicKey);

        assertTrue(isVerified);
    }

    @Test
    public void testSHA256() throws Exception {
        String data = "Hello, World!";
        String hash = SHA256.hash(data);

        assertNotNull(hash);
    }

    @Test
    public void testMD5() throws Exception {
        String data = "Hello, World!";
        String hash = MD5.hash(data);

        assertNotNull(hash);
    }
}
