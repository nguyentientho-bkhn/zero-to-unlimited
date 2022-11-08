package nguyentientho.core.security.digital_signtures;

import lombok.extern.slf4j.Slf4j;

import java.security.*;

@Slf4j
public class SignApp1 {
    public static void main1(String[] args){
        try {
            //thong diep can goi
            String thongdiep = "Happy new year 2022";

            //cung cap public-key va private-key cho thuat toan Signature
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("DSA");
            KeyPair keyPair = keyPairGenerator.generateKeyPair();
            PrivateKey privateKey = keyPair.getPrivate();
            PublicKey publicKey = keyPair.getPublic();

            //ten thuat toan danh cho Signature
            String tenthuattoan = "SHA1withDSA";

            //nguoi goi
            byte[] bSignature = signNguoiGoi(thongdiep, tenthuattoan, privateKey);

            //nguoi nhan
            verifyNguoiNhan(thongdiep, tenthuattoan, publicKey, bSignature);

        } catch (Exception ex) {
            log.info(ex.getMessage());
        }
    }

    /*phuong thuc signNguoiGoi danh cho nguoi goi :
        - String thongdiep : thong diep can duoc goi.
        - String tenthuattoan : thuat toan danh cho digital signature
        - PrivateKey privateKey : được dùng để mã hóa Signature.
       Phương thức này trả về mảng byte đó là Digital signature, được gởi đến người nhận
    */
    public static byte[] signNguoiGoi(String thongdiep,
                                      String tenthuattoan,
                                      PrivateKey privateKey){
        byte[] byteSignature = null;
        try {
            Signature signature = Signature.getInstance(tenthuattoan);
            signature.initSign(privateKey);

            signature.update(thongdiep.getBytes());

            byteSignature = signature.sign();

            log.info("Dang ky thanh cong !");
            return byteSignature;
        } catch (Exception ex) {
            log.info(ex.getMessage());
        }
        return byteSignature;
    }

    public static void main(String[] args) {
        try {
            System.out.println(Signature.getInstance("SHA1withDSA").toString());
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /*phuong thuc verifyNguoiNhan danh cho nguoi nhan :
        - String thongdiep : thong diep nhan duoc tu nguoi goi.
        - String tenthuattoan : thuat toan danh cho digital signature phu hop voi thuat toan ben goi
        - PublicKey publicKey : được dùng để giải mã Signature.
        Nếu thành công phương thức này hiển thị "kiểm tra thành công",
         còn ngược lại "kiểm tra thất bại"
    */
    public static void verifyNguoiNhan(String thongdiep, String tenthuattoan, PublicKey publicKey, byte[] sign){
        try {
            Signature signature = Signature.getInstance(tenthuattoan);
            signature.initVerify(publicKey);
            signature.update(thongdiep.getBytes());

            boolean b = signature.verify(sign);
            if (b){
                log.info("kiem tra sign nhan duoc thanh cong, thong diep chinh xac !");
            }else{
                log.info("kiem tra sign nhan duoc that bai, thong diep khong dung !");
            }
        } catch (Exception ex) {
            log.info(ex.getMessage());
        }
    }
}
