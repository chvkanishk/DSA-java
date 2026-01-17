package arrays;
class remove{
    public int[] RemoveDup(int[] nums){
        if (nums.length == 0) return new int[]{0};
        int j = 0;
        for (int i = 1; i < nums.length; i++){
            if (nums[i] != nums[j]){
                j++;
                nums[j] = nums[i];
            }
        }
        return new int[]{j + 1};
    }
}
public class RemoveDuplicate {
    public static void main(String[] args) {
        remove r = new remove();
        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
        int[] result = r.RemoveDup(nums);
        System.out.println(result[0]);
        
    }
    
}
