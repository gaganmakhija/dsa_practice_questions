public class reversepattern {

    public static void revpattern(int rows , int cols){
        for (int i = 1; i<=rows ; i++) {
            
            for (int j = 1; j<=cols; j++) {
                if (j>=i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        revpattern(5 ,5);
    }
}
