package nguyentientho.other;

import java.security.SecureRandom;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Class sinh 1 chuỗi ngẫu nhiên
 */
public class RandomNumber {
    public static void main(String[] args) {
        randomSecureNumber();
        generateId();
        generateIdByByte();
    }

    // Bảo mật do độ phức tạp 2^128
    private static String randomSecureNumber() {
        SecureRandom sRandom = new SecureRandom();
        StringBuilder sb = new StringBuilder();
        try {
            int i = 0;
            while (i < 5) {
                int ascii = 97 + sRandom.nextInt(25);
                sb.append((char) ascii);
                i++;
            }
        } catch (Exception e) {
            sb.append("ERROR");
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    // không bảo mật độ phức tạp chỉ là 2^64
    private static String generateId() {
        StringBuilder sb = new StringBuilder();
        try {
            for (int i = 0; i < 5; i++) {
                int ascii = ThreadLocalRandom.current().nextInt('a', 'z');
                sb.append((char) ascii);
            }
        } catch (Exception e) {
            sb.append("ERROR");
        }
        System.out.println(sb.toString());
        return sb.toString();
    }


    private static int generateIdByByte() {
        SecureRandom random = new SecureRandom(); // Compliant for security-sensitive use cases
        byte[] bytes = new byte[20];
        random.nextBytes(bytes);
        System.out.println(random.nextInt());
        return random.nextInt();
    }
}
