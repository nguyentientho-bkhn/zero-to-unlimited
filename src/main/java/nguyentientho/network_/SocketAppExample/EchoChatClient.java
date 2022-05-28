package nguyentientho.network_.SocketAppExample;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoChatClient {
    public final static String SERVER_IP = "127.0.0.1";
    public final static int SERVER_PORT =  7;

    public static void main0(String[] args) {
        try (Socket socket = new Socket(SERVER_IP, SERVER_PORT)) {
            System.out.println("Connected: " + socket);

            InputStream is = socket.getInputStream();
            OutputStream os = socket.getOutputStream();
            for (int i = '0'; i <= '9'; i++) {
                os.write(i); // Send each number to the server
                int ch = is.read(); // Waiting for results from server
                System.out.print((char) ch + " "); // Display the results received from the server
                Thread.sleep(200);
            }
        }
        catch (IOException | InterruptedException ie) {
            System.out.println("Can't connect to server");
        }
    }

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(SERVER_PORT)){
            System.out.println("binding to port " + SERVER_PORT + ", please wait ...");
            System.out.println("Server started: " + serverSocket);
            System.out.println("waiting for a client ...");
            while (true) {
                try (Socket socket = serverSocket.accept()) {
                    System.out.println("Client accepted: " + socket);

                    OutputStream os = socket.getOutputStream();
                    InputStream is = socket.getInputStream();
                    int ch = 0;
                    while (true) {
                        ch = is.read(); // nhận dữ liệu từ clent
                        if (ch == -1) {
                            break;
                        }
                        os.write(ch); // gửi kết quả tới client
                    }
                } catch (IOException ie) {
                    System.out.println("Connection Error: " + ie);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
