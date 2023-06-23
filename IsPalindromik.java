public class IsPalindromik {
    static boolean isPalindromik(String str){
        int i=0, j=str.length()-1;
        while (i<j){
            if (str.charAt(i) !=str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    static boolean isPalindromik2(String str){
        String reverse="";
        for (int i=str.length()-1; i>=0;i--){
            reverse= reverse +str.charAt(i);
        }
        if (str.equals(reverse)){
            return true;
        }else {
            return false;
        }
    }


    public static void main(String[] args) {
        System.out.println(isPalindromik("abba"));
        System.out.println(isPalindromik2("abba"));

    }
}
