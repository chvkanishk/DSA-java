class reverse{
    public void solution(char[] s){
        int right = s.length - 1;
        int left=0;
        while(left<right){
            char temp = s[left];
            s[left]= s[right];
            s[right]= temp;
            left++;
            right--;
        }
    }
}
public class ReverseString {
    public static void main(String[] args) {
        reverse r = new reverse();
        char[] s = {'h','e','l','l','o'};
        r.solution(s);
        System.out.println(s);
    }
}
