import java.util.*;
public class TwoSumArray {
    public static int[] twoSum(int[] nums, int target) {
        int ans []=new int [2];
        int n = nums.length;
        for (int i =0;i<n;i++){
          for (int j =i+1;j<n;j++){
                if (nums[i]+nums[j]==target){
                    ans [0]=i;
                    ans [1]=j;
                    break;
                }
            }
        } 
         return ans;
    }
    public static void main (String [] args){
        Scanner kb = new Scanner (System.in);
        System.out.println("Enter size of array : ");
        int size = kb.nextInt();
        int [] number = new int [size];
        for (int i = 0 ; i < size ; i++) {
            number[i]= kb.nextInt();
            }
        System.out.println("Enter target : ");
        int target = kb.nextInt();
        int [] results = twoSum(number , target);
        System.out.println("index "+results[0]+" and index "+results[1]+ " are added to get target "+target );
        kb.close();
    }
}