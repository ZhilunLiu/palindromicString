
import java.util.Scanner;


class Scratch {
    public static void main(String[] args) {
        long result = 0;
        Scanner scanner = new Scanner(System.in);
        String str =scanner.next();
        for(int i =0;i<=str.length();i++){
            result+=calculateSubString(i,str);
        }


        System.out.println(+result);
    }

    public static int calculateSubString(int num,String str){
        int result =0;
        for(int i =0;i<str.length()-num+1;i++){
            String subStr = str.substring(i,i+num);
            if(isPalindromicString(subStr)){
                result++;
            }
        }
        return  result;
    }

    public static boolean isPalindromicString(String subStr){
        int len = subStr.length();
        if(len==0){
            return  false;
        }
        for(int j = 0;j<len;j++){
            if(subStr.charAt(j)!=subStr.charAt(len-j-1)){
                return false;
            }
        }
        return true;
    }
}