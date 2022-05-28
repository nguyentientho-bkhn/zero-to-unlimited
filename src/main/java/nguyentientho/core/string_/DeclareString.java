package nguyentientho.core.string_;

/**
# Các phương thức của String
        1	char charAt(int index)	Trả về một ký tự tại vị trí có chỉ số được chỉ định.
        2	int compareTo(Object o)	So sánh một String với một Object (Phương thức này đã bị lược bỏ ko còn được sử dụng)
        3	int compareTo(String anotherString)	So sánh hai chuỗi theo từ điển (ASCII) nếu giống nhau = 0, chỉ cần khác nhau 1 ký tự thì sẽ >0 hoặc <0. (Phân biệt chữ hoa chữ thường)
        4	int compareToIgnoreCase(String str)	So sánh hai chuỗi theo từ điển (ASCII) nếu giống nhau = 0, chỉ cần khác nhau 1 ký tự thì sẽ >0 hoặc <0. (Không phân biệt chữ hoa chữ thường)
        5	String concat(String str)	Nối chuỗi được chỉ định đến cuối của chuỗi này.
        6	boolean contentEquals(StringBuffer sb)	Trả về true nếu và chỉ nếu chuỗi này đại diện cho cùng một chuỗi ký tự như là StringBuffer quy định.
        7	static String copyValueOf(char[] data)	Trả về một chuỗi đại diện cho chuỗi ký tự trong mảng quy định.
        8	static String copyValueOf(char[] data, int offset, int count)	Trả về một chuỗi đại diện cho chuỗi ký tự trong mảng quy định.
        9	boolean endsWith(String suffix)	Kiểm tra nếu chuỗi này kết thúc với hậu tố quy định.
        10	boolean equals(Object anObject)	So sánh với một đối tượng
        11	boolean equalsIgnoreCase(String anotherString)	So sánh với một String khác, không phân biệt chữ hoa chữ thường.
        12	byte[] getBytes()	Mã hóa chuỗi này thành một chuỗi các byte bằng cách sử dụng bảng mã mặc định của flatform (nền tảng), lưu trữ kết quả vào một mảng byte mới.
        13	byte[] getBytes(String charsetName)	Mã hóa chuỗi này thành một chuỗi các byte bằng cách sử dụng bảng mã cho trước, lưu trữ kết quả vào một mảng byte mới.
        14	void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)	Copy các ký tự từ chuỗi này vào mảng ký tự đích.
        15	int hashCode()	Trả về một mã “hash code” cho chuỗi này.
        16	int indexOf(int ch)	Trả về chỉ số trong chuỗi này xuất hiện đầu tiên của ký tự cụ thể.
        17	int indexOf(int ch, int fromIndex)	Trả về chỉ số trong chuỗi này xuất hiện đầu tiên của ký tự được chỉ định, bắt đầu tìm kiếm từ chỉ số cụ thể đến cuối.
        18	int indexOf(String str)	Trả về chỉ số trong chuỗi này xuất hiện đầu tiên của chuỗi quy định.
        19	int indexOf(String str, int fromIndex)
        Trả về chỉ số trong chuỗi này xuất hiện đầu tiên của chuỗi quy định, bắt đầu từ chỉ số xác định.
        20	String intern()	Returns a canonical representation for the string object.
        21	int lastIndexOf(int ch)	Trả về chỉ số trong chuỗi này về sự xuất hiện cuối cùng của ký tự cụ thể.
        22	int lastIndexOf(int ch, int fromIndex)	Trả về chỉ số trong chuỗi này về sự xuất hiện cuối cùng của ký tự được chỉ định, tìm kiếm lùi lại bắt đầu từ chỉ số xác định.
        23	int lastIndexOf(String str)	Trả về chỉ số trong chuỗi này xảy ra cuối cùng bên phải của chuỗi quy định.
        24	int lastIndexOf(String str, int fromIndex)
        Trả về chỉ số trong chuỗi này về sự xuất hiện cuối cùng của chuỗi xác định, tìm kiếm lùi lại bắt đầu từ chỉ số xác định.
        25	int length()	Trả về độ dài chuỗi.
        26	boolean matches(String regex)	Kiểm tra chuỗi này khớp với biểu thức chính quy chỉ định hay không.
        27	boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len)	Kiểm tra chuỗi có một phần giống nhau.
        28	boolean regionMatches(int toffset, String other, int ooffset, int len)	Kiểm tra chuỗi có một phần giống nhau.
        29	String replace(char oldChar, char newChar)	Trả về một chuỗi mới từ thay thế tất cả các lần xuất hiện của ký tự oldChar trong chuỗi này với ký tự newChar.
        30	String replaceAll(String regex, String replacement)
        Thay thế tất cả các chuỗi con của chuỗi này khớp với biểu thức chính quy bởi String mới replacement
        31	String replaceFirst(String regex, String replacement)	Thay thế chuỗi con đầu tiên của chuỗi này khớp với biểu thức chính quy bởi một String mới replacement
        32	String[] split(String regex)	Tách chuỗi này thành các chuỗi con, tại các chỗ khớp với biểu thức chính quy cho trước.
        33	String[] split(String regex, int limit)	Tách chuỗi này thành các chuỗi con, tại các chỗ khớp với biểu thức chính quy cho trước. Tối đa limit chuỗi con.
        34	boolean startsWith(String prefix)	Kiểm tra nếu chuỗi này bắt đầu với tiền tố quy định.
        35	boolean startsWith(String prefix, int toffset)
        Kiểm tra nếu chuỗi này bắt đầu với tiền tố quy định bắt đầu một chỉ số xác định.
        36	CharSequence subSequence(int beginIndex, int endIndex)	Trả về một chuỗi ký tự mới là một dãy con của dãy này.
        37	String substring(int beginIndex)	Trả về một chuỗi ký tự mới là một dãy con của dãy này. Từ chỉ số cho trước tới cuối
        38	String substring(int beginIndex, int endIndex)	Trả về một chuỗi ký tự mới là một dãy con của dãy này. Từ chỉ số bắt đầu cho tới chỉ số cuối.
        39	char[] toCharArray()	Chuyển chuỗi này thành mảng ký tự.
        40	String toLowerCase()	Chuyển tất cả các ký tự của chuỗi này sang chữ thường, sử dụng miền địa phương mặc định (default locale)
        41	String toLowerCase(Locale locale)	Chuyển tất cả các ký tự của chuỗi này sang chữ thường, sử dụng miền địa phương (locale) cho trước.
        42	String toString()	Trả về String này.
        43	String toUpperCase()	Chuyển tất cả các ký tự của chuỗi này sang chữ hoa, sử dụng miền địa phương mặc định (default locale)
        44	String toUpperCase(Locale locale)	Chuyển tất cả các ký tự của chuỗi này sang chữ hoa, sử dụng miền địa phương (locale) cho trước.
        45	String trim()	Trả về một String mới, sau khi loại bỏ các ký tự trắng (whitespace) bên trái và bên phải.
        46	static String valueOf(primitive data type x)	Returns the string representation of the passed data type argument. */
public interface DeclareString {
}
