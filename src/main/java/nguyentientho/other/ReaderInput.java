package nguyentientho.other;

import java.io.*;
import java.util.Scanner;

public class ReaderInput {
    public static void main(String[] args) throws IOException {
//        readerInputByBufferedReader();
//        readerInputByScanner();
//        readerInputByConsole();
        writeFlagToFile2(true);

        // Cách thứ 3
        if (args.length >= 0) {
            System.out.println("The command line arguments are:");
            for (String arg : args) {
                System.out.println(arg);
            }
        } else System.out.println("The command line arguments not found");
    }

    private static void readerInputByBufferedReader() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String read = bufferedReader.readLine();
        System.out.println("read from console = " + read);
    }

    private static void readerInputByScanner() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("read by Scanner = " + input);
    }

    // chú ý cách này không hoạt động trên IDE (vì IDE là môi trường non-interactive)
    private static void readerInputByConsole() {
        Console console = System.console();
        if (console == null) {
            System.out.println("no found console, non-interactive mode!");
        }
        String input = console.readLine();
        System.out.println(input);
    }

    private static void writeFlagToFile2(boolean flag) {
        try {
            File f = new File("/tientho.txt");
//            if(!f.exists()) {
//                f.createNewFile();
//            }
            try (FileWriter fw = new FileWriter(f)) {
                fw.write(Boolean.toString(flag));
//                this.isOffAppIfIsMsgBegin = flag;
            }
        } catch (Exception ex) {
//            logger.error(ex, "Failed to write true to file when receive msg DAY BEGIN --> ", isOffAppIfIsMsgBegin);
            System.out.println("error");
        }
    }


}
