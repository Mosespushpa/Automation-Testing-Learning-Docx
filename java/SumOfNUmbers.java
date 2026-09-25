import java.util.*;
class SumOfNumbers{
    public static int sumNumbers(ArrayList<String> nums){
        int sum = 0;
        for(String i : nums){
            sum = sum + (Integer.valueOf(i));
        }
        return sum;
    }

    public static int Numbers(String s){
        String ss = "";
        int n = s.length();
        ArrayList<String> nums = new ArrayList<>();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch >= 48 && ch<= 57){
                ss = ss + ch;
            }
            else{
                if(ss.length() > 0) nums.add(ss);
                ss = "";
            }
        }
        if(ss.length() > 0) nums.add(ss);
        return sumNumbers(nums);
    }

    public static void main(String args[]){
        System.out.println(Numbers("abc123xyz"));
        System.out.println(Numbers("aa11b33"));
        System.out.println(Numbers("7 11"));

        }
}