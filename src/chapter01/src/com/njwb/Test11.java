package chapter01.src.com.njwb;

import java.util.Arrays;

public class Test11 {
    public static void main(String arg[]){
        String[] nums = new String[]{"a","c","u","b","e","p","f","z"};
        System.out.print("原先顺序为:\t");
        for(String value: nums){
            System.out.print(value+"\t");
        }
        System.out.println();
        System.out.print("排列升序为:\t");
        Arrays.sort(nums);
        for(String value: nums){
            System.out.print(value+"\t");
        }

        System.out.println();
        System.out.print("排列降序为:\t");
        Arrays.sort(nums);

        String[] nums1 = new String[8];
        for(int i=7;i>=0;i--){
            nums1[i] = nums[7-i];
        }
        for(String value: nums1){
            System.out.print(value+"\t");
        }


    }
}
