// program to find the string is palindrome


public class ispalindrome {

    public static boolean palincheck(String name){
        for (int i = 0; i < name.length()/2; i++) {
            int n =name.length();
            if (name.charAt(i)!=name.charAt(n-1-i)) {  /// logic 
                return false;
            }
           
        }
        return true; 
    }
    public static void main(String[] args) {
        String name="nitin";
      if (palincheck(name)==true) {
        System.out.println("yes the string is palindrome");
      } else {
        System.out.println("no the string is not palindrome");
      }
    }
}
