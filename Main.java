import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

public class Main {
    public static void main(String[] args){
        int[] arr = {2, 1, 4, 3, 6, 5, 7, 10, 9, 8};
        System.out.println(MissingNumber.findMissingNumber(arr, 10));
        System.out.println(BalancedBrackets.isBalanced("()"));
        System.out.println(BalancedBrackets.isBalancedToo("({[<>]})"));
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        list1.addFirst(1);
        list1.addFirst(9);
        list1.addFirst(3);
        LinkedList<Integer> list2 = new LinkedList<Integer>();
        list2.addFirst(4);
        list2.addFirst(5);
        list2.addFirst(6);
        System.out.println(linkedListAdd(list1, list2));
    }

    public static LinkedList<Integer> linkedListAdd(LinkedList<Integer> list1, LinkedList<Integer> list2){
        LinkedList<Integer> answer = new LinkedList<Integer>();
        int carryTheOne = 0;
        for (int i = 0; i < list1.size(); i++){
            int digit = list1.get(i) + list2.get(i);
            if (digit + carryTheOne > 9){
                    digit -= 10;
                    answer.addLast(digit + carryTheOne);
                    carryTheOne = 1;
                    if (i == list1.size() - 1){
                        answer.addLast(1);
                    }
            }
            else{
                answer.addLast(digit + carryTheOne);
                carryTheOne = 0;
            }
        }
        return answer;
    }
    //Runtime of O(n)
}