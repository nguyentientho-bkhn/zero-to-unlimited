package nguyentientho.core.text;

import java.text.FieldPosition;
import java.text.MessageFormat;

public class MyMessageFormat {
    public static void main(String[] args) {
        MessageFormat messageFormat = new MessageFormat("{0, number, #}, {0, number, #.##}, {0, number}");

        FieldPosition fieldPosition = new FieldPosition(MessageFormat.Field.ARGUMENT);

        StringBuffer sb = new StringBuffer(10);

        Object[] obj = {9.5678};

        sb = messageFormat.format(obj, sb, fieldPosition);

        System.out.println("formated array : " + sb.toString());
    }
}
