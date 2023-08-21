public class starpattern4 {

    public static void pattern(int rows , int cols){
        for (int i = 1; i<=rows; i++) {
            
            for (int j = 1; j<=cols; j++) {
                if (j<=6-i || j>=4+i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(5,9);
    }
}
