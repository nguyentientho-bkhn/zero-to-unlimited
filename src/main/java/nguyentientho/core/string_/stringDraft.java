package nguyentientho.core.string_;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import org.openjdk.jol.vm.VM;

public class stringDraft {
    public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "PANKAJ";
		String str2 = "PANKAJ";
		String str3 = new String("PANKAj");

        System.out.println("memory address of: " + VM.current().addressOf(str));
        // str += " thoát";
        System.out.println("memory address of: " + VM.current().addressOf(str));

    }

    
}
