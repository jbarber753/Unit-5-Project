import java.util.Arrays;

public class MissingNumber {
    public static int findMissingNumber(int[] arr, int maxNum){
        Arrays.sort(arr);
        for(int i = 0; i < arr.length; i++){
            if (arr[i] != i + 1){
                return i + 1;
            }
        }
        return 0;
    }
    //My above solution ended up being very similar, basically the same, as solution 2. I sort of skipped over something like solution 1 (I came up with this solution before reaching step 2), and I was not able to figure out the solution for step 3 on my own
}
