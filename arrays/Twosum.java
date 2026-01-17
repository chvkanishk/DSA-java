package arrays;
import java.util.HashMap;

class sum{
    public int[] Twosum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int num = nums[i];
            if (map.containsKey(target - num)){
                return new int[]{map.get(target - num), i};
            }
            map.put(num, i);
        }
        return new int[]{};
    }
}

public class Twosum {
    public static void main(String[] args) {
        sum s = new sum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = s.Twosum(nums, target);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
        
    