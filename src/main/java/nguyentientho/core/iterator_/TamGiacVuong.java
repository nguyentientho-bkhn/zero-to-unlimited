package nguyentientho.core.iterator_;

public class TamGiacVuong {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /*  Bài toán: in hình tam giác vuông căn trái như sau
    j=      1  2  3  4  5
            *                   i = 1
            *  *                i = 2
            *  *  *             i = 3
            *  *  *  *          i = 4
            *  *  *  *  *       i = 5
*/

    // sử dụng 2 for
    public void printStar(int numb) {
        for (int i = 0; i < numb; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    // Sử dụng 2 while
    public void printStar2(int numb) {
        int i = 0;
        while (i < numb) {
            int j = 0;
            while (j <= i) {
                System.out.print("*  ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    // kết hợp while và for
    public void printStar3(int numb) {
        int i = 0;
        while (i < numb) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*  ");
            }
            System.out.println();
            i++;
        }
    }

/*  Bài toán: in hình tam giác vuông như sau
    j=      1  2  3  4  5
            *  *  *  *  *       i = 5
            *  *  *  *          i = 4
            *  *  *             i = 4
            *  *                i = 2
            *                   i = 1
*/

    // vẽ tam giác ngược
    public void printTriangle(int numb) {
        int i = 0;
        for (i = numb - i; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    public void printTriangle2(int numb) {
        int i = numb;
        while (i <= numb && i > 0) {
            int j = 0;
            while (j < i) {
                System.out.print("*  ");
                j++;
            }
            System.out.println();
            i--;
        }
    }

    public void printTriangle3(int numb) {
        int i = numb;
        while (i <= numb && i > 0) {
            for (int j = 0; j < i; j++) {
                System.out.print("*  ");
            }
            System.out.println();
            i--;
        }
    }

/*  Bài toán: in hình tam giác vuông căn phải như sau (góc vuông nằm bên phải)
    i       1  2  3  4  5
    0                   *       j = 1   space k = 4
    1                *  *       j = 2   space k = 3
    2             *  *  *       j = 3   space k = 2
    3          *  *  *  *       j = 4   space k = 1
    4       *  *  *  *  *       j = 5   space k = 0
*/

    // sử dụng 2 vòng for
    public void rightTriangle(int numb) {
        for (int i = 0; i < numb; i++) {
            for (int j = 1; j < numb - i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // sử dụng 2 vòng while
    public void rightTriangle2(int numb) {
        int i = 0;
        while (i < numb) {
            int j = 1, k = 0;
            while (j < numb - i) {
                System.out.print("  ");
                j++;
            }
            while (k <= i) {
                System.out.print("* ");
                k++;
            }
            System.out.println();
            i++;
        }
    }

    // sử dụng kết hợp while và for
    public void rightTriangle3(int numb) {
        int i = 0;
        while (i < numb) {
            for (int j = 1; j < numb - i; j++) {
                System.out.print("  ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
            i++;
        }
    }

/*  Bài toán: in hình tam giác ngược góc vuông căn phải như sau (góc vuông nằm bên phải)
    i       1  2  3  4  5
    0       *  *  *  *  *       k = 5   space j = 0
    1          *  *  *  *       k = 4   space j = 1
    2             *  *  *       k = 3   space j = 2
    3                *  *       k = 2   space j = 3
    4                   *       k = 1   space j = 4
*/
    // sử dụng 2 vòng for
    public void reverseTriangle(int numb) {
        for (int i = 0; i < numb; i++) {
            int k = 0;
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (k = numb - i; k > 0 ; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        TamGiacVuong tgV = new TamGiacVuong();
//        tgV.printStar(5);
//        tgV.printStar2(5);
//        tgV.printStar3(7);

//        tgV.printTriangle(5);
//        tgV.printTriangle2(5);
//        tgV.printTriangle3(5);

//        tgV.rightTriangle(5);
//        tgV.rightTriangle(5);
//        tgV.rightTriangle3(5);

        tgV.reverseTriangle(5);
    }
}
