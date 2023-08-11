// program find the 3 smalllest number in array 


import java.util.*;
public class findthirssmall {
    public static void main(String[] args) {
        int arr[]={45,78,41,12,63,10,18,49};
        int n=3;
        Arrays.sort(arr);
        System.out.println(arr[n-1]);

    }
}
