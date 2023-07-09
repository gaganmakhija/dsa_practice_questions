public class pairs_of_arrays {

    // function which can make pairs of arrays

    public static void pairs(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int current =arr[i];
            for (int j = i+1; j < arr.length; j++) {
                System.out.print("(" +current +"," + arr[j] +") ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        int arr []= {1,2,3,4,5,6,7,8};
        pairs(arr);
    }
}
