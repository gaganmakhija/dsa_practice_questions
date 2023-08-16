import java.util.*;
public class sortsnum {
    public static void main(String[] args) {
        int arr[]={0,1,0,2,1,0,1,2,1,0,1,0,2,1,2,0,0,0,0,2,2,2,1,1,2};

        // this is the first approach 
     //   Arrays.sort(arr);
     //   for (int i = 0; i < arr.length; i++) {
      //      System.out.print(arr[i] +" ");
     //   }


     // this is the second approaach
     int zero= 0;
     int one=0;
     int two=0;
     for (int i = 0; i < arr.length; i++) {
        if(arr[i]==0)zero++;
        if(arr[i]==1)one++;
        if(arr[i]==2)two++;
     }
     for (int i = 0; i < zero; i++) arr[i]=0;
     for (int i = zero; i < one+zero; i++) arr[i]=1;
     for (int i = one+zero; i<arr.length; i++) arr[i]=2;

     System.out.println(zero);
     System.out.println(one);
     System.out.println(two);
    
     for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i]+" ");
     }
    }
}
