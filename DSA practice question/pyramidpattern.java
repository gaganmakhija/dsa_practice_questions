public class pyramidpattern {

    public static void pyrpattern(int rows, int cols) {
        int k = 1;
        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= cols; j++) {

                if (j >= 6 - i && j <= 4 + i && k == 1) {
                    System.out.print("*");
                    k = 0;
                } else {
                    System.out.print(" ");
                    k = 1;
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pyrpattern(5, 9);
    }
}
