//Ckeck if a given string can be a palindrome after removing at most one char

public class ValidPalindromeII{
   
    public static boolean isPalindrome(String s){
        int left = 0; //left pointer
        int right = s.length() - 1; //right pointer
        while(left <= right){
            if(s.charAt(left) != s.charAt(right)){ 
                return compare(s, left+1, right) || compare(s, left, right - 1); //skip one char at either side and check if palidrome
            }
            left++;
            right--;
        }
        return true; //if no mistmatches found, it is a palindrome
    }

    public static boolean compare(String s, int a, int b){
        while(a <= b){
        if(s.charAt(a) == s.charAt(b)){
            a++; 
            b--;
        } else return false;
    }
    return true;
}
    public static void main(String[] args){
        //Testing
        String test1 = "madame";
        String test2 = "dead";
        String test3 = "abgca";
        
        boolean res1 = isPalindrome(test1);
        boolean res2 = isPalindrome(test2);
        boolean res3 = isPalindrome(test3);

        System.out.println("Test for madame: " + res1);
        System.out.println("Test for dead: " + res2);
        System.out.println("Test for abgca: " + res3);
    }
}
