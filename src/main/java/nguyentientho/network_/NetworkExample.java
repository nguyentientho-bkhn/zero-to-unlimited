package nguyentientho.network_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

public class NetworkExample {

    public static void main(String[] args) throws MalformedURLException, IOException {
//        urlExample();
//        urlConnectionExample();
        inetAddressExample();
    }

    public static void urlExample() throws MalformedURLException {
        URL url = new URL("https://www.dienmayxanh.com/kinh-nghiem-hay/top-tivi-sony-ban-chay-nhat-thang-05-2021-tai-di-1355860#hmenuid1");
        System.out.println("protocol: " + url.getProtocol());
        System.out.println("domain as ip: " + url.getHost());
        System.out.println("path:" + url.getPath());
        System.out.println("query: " + url.getQuery());
        System.out.println("ref:  "+ url.getRef());
    }

    public static void urlConnectionExample () throws IOException {
        URL url = new URL("https://www.google.com/");
        URLConnection uConn = url.openConnection();
        BufferedReader br = new BufferedReader(new InputStreamReader(uConn.getInputStream()));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            sb.append(line);
        }
        System.out.println(sb);
    }

    public static void inetAddressExample() throws UnknownHostException{
        InetAddress ip = InetAddress.getLocalHost();
        System.out.println("hostname: " + ip.getHostName() + "" + "ip address: " + ip.getHostAddress());

        ip = InetAddress.getByName("www.studytonight.com");
        System.out.println(ip.getHostName() + " - " + ip.getHostAddress());

        InetAddress[] allIp = InetAddress.getAllByName("www.w3schools.com");
        for (int i = 0; i < allIp.length; i++) {
            System.out.println(allIp[i]);
        }
    }
}
