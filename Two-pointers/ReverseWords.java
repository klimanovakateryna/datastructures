
public class ReverseWords {
    public static String reverseWords(String sentence){
        String[] arr = sentence.trim().split("\\s+");
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            String temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return String.join(" ", arr); //join concatenates the elements of the array
    }

    public static void main(String[] args){
        String testString = "MULTIPLE     SPACES";
        String res = reverseWords(testString);
        System.out.println(res);
    }
}
