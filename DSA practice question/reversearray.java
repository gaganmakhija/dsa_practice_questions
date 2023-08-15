// program for reverse an array

public class reversearray {

// making a function which can reverse an array
    public static void reverse(int numbers[]){
        // swap numbers (logic)
        int first = 0 ,  last = numbers.length-1;
        while (first < last) {
            int temp = numbers[last];
           numbers[last]= numbers[first];
           numbers[first]= temp;

             first ++;
             last --;

        }
    }

    public static void main(String[] args) {
        int numbers[]= {10,20,30,40,50,60,70,80,90};
         System.out.println("the orignal array is ");
        for (int i = 0; i < numbers.length; i++) {
           
            System.out.print(+numbers[i]+" ");
        }
        System.out.println(" ");
       
        System.out.println("the reversed array is");
        reverse(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print( numbers[i]+" ");

        }
        System.out.println(" ");
    }
}
