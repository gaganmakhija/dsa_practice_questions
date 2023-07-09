public class linearsearch {
    public static int findkey(int numbers[],int key){
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]== key) {
                return i;
            }
          
        }
          return -1;
    }
    public static void main(String[] args) {
        int numbers[]={10,20,30,40,50,60,70,80,90};
        int key=60;

        int index = findkey(numbers,key);

        if (index== -1) {
            System.out.println("key not found");
        } else {
            System.out.println("key is at index "+" "+index);
        }

    }
}
