package nguyentientho.network_;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

public class parseUrlExample {
    public static void main(String[] args) throws Exception {
//        getUrl();
//        urlConnection();
        inetAddressEx();
    }

    protected static void getUrl() throws MalformedURLException {
        URL url = new URL("https://www.gpcoder.com:80/java/index.html?page=1&amp;amp;amp;order=desc#java-core");
        System.out.println("URL: " + url.getHost());
        System.out.println("protocol: " + url.getProtocol());
        System.out.println("protocol: " + url.getPort());
        System.out.println("protocol: " + url.getPath());
        System.out.println("protocol: " + url.getQuery());
        System.out.println("protocol: " + url.getRef());
    }

    protected static void urlConnection() throws IOException {
        URL url = new URL("https://www.w3schools.com/");
        URLConnection urlConnection = url.openConnection();
        BufferedReader br = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
        StringBuilder sb = new StringBuilder();
        String line;
        while ((line = br.readLine()) != null) {
            sb.append(line + "\n");
        }
        System.out.println(sb.toString());
    }

    protected static void inetAddressEx() throws UnknownHostException {
        InetAddress ip = InetAddress.getLocalHost();
        System.out.println(ip.getHostName());
    }
}
