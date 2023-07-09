import java.util.*;


public class binaryserch {

    // make a function for binary search
    public static int bnrysearch(int numbers[],int key){
        int start=0 , end=numbers.length-1;

        while (start<=end) {
            int mid =(start + end)/2;

            // comparison
            if (numbers[mid]==key) {
                return mid;
            }
            if (numbers[mid]<key) {
                start =mid+1;
            } else {
                end=mid-1;

            }
        }
       return -1;
    }
    public static void main(String[] args) {
        int numbers[] ={10,20,25,30,35,40,45,50,55,60,70,75,85,90,95};
        System.out.println("enter the key you want to find");
        Scanner myObj = new Scanner(System.in);
        int key;
        key= myObj.nextInt(); 
        int indexkey=  bnrysearch(numbers, key);
       if (indexkey==-1) {
        System.out.println("keuy is not present in the array");
       } else {
        System.out.println("the key is at index "+ " "+indexkey);
       }
    }
}