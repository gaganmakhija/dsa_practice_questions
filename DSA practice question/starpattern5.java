// this is the number star pattern



public class starpattern5 {

    public static void pattern(int rows ,int cols ){
        
        for (int i = 1; i<=rows; i++) {
            int k=1;
            for (int j = 1; j<=cols; j++) {
                
                if (j>=5-i && j<=3+i) {
                    System.out.print(k);
                    if (j<4) {
                        k++;
                    } else {
                        k--;
                    }
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(4 ,7);
    }
}
