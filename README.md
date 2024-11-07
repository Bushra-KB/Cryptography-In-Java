# Cryptography Algorithms in Java
This repository contains implementations of various cryptographic algorithms in Java. It includes well-known algorithms such as AES, DES, RSA, SHA, Triple DES, IDEA, ECC, SHA-256, and MD5. Each algorithm is implemented in a clear and concise manner, making it easy to understand and use. This project aims to provide a practical resource for learning and applying cryptographic techniques in Java.

## Cryptography Tutorials and Implementations in Java
### What is Cryptography?
Cryptography is the study of secure communications techniques that allow only the sender and intended recipient of a message to view its contents. The term is derived from the Greek word kryptos, which means hidden. It is closely associated to encryption, which is the act of scrambling ordinary text into what's known as ciphertext and then back again upon arrival. In addition, cryptography also covers the obfuscation of information in images using techniques such as microdots or merging. Ancient Egyptians were known to use these methods in complex hieroglyphics, and Roman Emperor Julius Caesar is credited with using one of the first modern ciphers.

When transmitting electronic data, the most common use of cryptography is to encrypt and decrypt email and other plain-text messages. The simplest method uses the symmetric or "secret key" system. Here, data is encrypted using a secret key, and then both the encoded message and secret key are sent to the recipient for decryption. The problem? If the message is intercepted, a third party has everything they need to decrypt and read the message. To address this issue, cryptologists devised the asymmetric or "public key" system. In this case, every user has two keys: one public and one private. Senders request the public key of their intended recipient, encrypt the message and send it along. When the message arrives, only the recipient's private key will decode it — meaning theft is of no use without the corresponding private key.

1. Modern cryptography
   - Symmetric-key cryptography
   - Public-key cryptography
   - Cryptographic Hash Functions
   - Cryptanalysis
   - Cryptographic primitives
   - Cryptosystems
   - Lightweight cryptography
2. Applications
   - In general
   - In cybersecurity
   - In Virtual money, blockchain, and cryptocurrency

## Algorithms Implemented
1. **Advanced Encryption Standard (AES)**
2. **Data Encryption Standard (DES)**
3. **RSA Algorithm (Rivest, Shamir, Adleman Algorithm)**
4. **Secure Hash Algorithm (SHA)**
5. **Triple Data Encryption Standard (Triple DES)**
6. **International Data Encryption Algorithm (IDEA)**
7. **Elliptic Curve Cryptography (ECC)**
8. **SHA-256**
9. **MD5**

## Project Structure
```
java-crypto-algorithms/
│
├── README.md
├── src/
│   ├── main/
│   │   └── java/
│   │       └── crypto/
│   │           ├── AES.java
│   │           ├── DES.java
│   │           ├── RSA.java
│   │           ├── SHA.java
│   │           ├── TripleDES.java
│   │           ├── IDEA.java
│   │           ├── ECC.java
│   │           ├── SHA256.java
│   │           └── MD5.java
│   └── test/
│       └── java/
│           └── crypto/
│               └── CryptoTest.java
```

## Getting Started

### Prerequisites

- **Java Development Kit (JDK)**: Make sure you have JDK installed on your system. You can download it from oracle.com.
- **Maven**: A build automation tool for Java projects. You can download it from maven.apache.org.

### Installation
Clone the repository to your local machine:

```bash
git clone https://github.com/Bushra-KB/java-crypto-algorithms.git
cd java-crypto-algorithms
```
## Contributing
Contributions are welcome! Please fork the repository and create a pull request with your changes.

## License
This project is licensed under the MIT License - see the LICENSE file for details.

## Acknowledgments
Special thanks to the open-source community for their invaluable contributions and resources.

```
Bushra KM.
Debre Berhan University, Ethiopia
2019
-----------
