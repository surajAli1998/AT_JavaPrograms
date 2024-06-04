package day_01June2024.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array elements: ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target value: ");
        int target = sc.nextInt();
        int[] result = twoSum(arr,target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums, int target){
        Map<Integer,Integer> hmap = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int rem = target-nums[i];
            if(!hmap.containsKey(rem)){
                hmap.put(nums[i],i);
            }
            else return new int[] {hmap.get(rem),i};
        }
        return new int[] {-1,-1};
    }
}
