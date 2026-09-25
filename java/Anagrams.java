import java.util.*;
class Anagrams{

    public static String sort(String s){
        char[] arr = s.toCharArray();
        Arrays.sort(arr);
        String ss = new String(arr);
        return ss;
    }

    public static void main(String args[]){
        String[] str = {"eats","sesat","teas","east"};

        String first = sort(str[0]);
        for(int i=1;i<str.length;i++){
            if(!first.equalsIgnoreCase(sort(str[i]))){
                System.out.print("The String of array elements are NOT Anagrams");
                return;
            }
        }
        System.out.println("The String of array elements are Anagrams");

        }
}