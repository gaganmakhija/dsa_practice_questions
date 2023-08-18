public class invertedhalfpyramid {

    public static void pattern (int rows , int cols) {
        for (int i = 1; i<=rows; i++) {
            
            for (int j = 1; j <=cols; j++) {
                if (j<=6-i) {
                    System.out.print("*");
                } 
                else {
                    System.out.println(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(5 ,5);
    }
}
