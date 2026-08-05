public class recursion {
    public static String removeA(String s,int i){
          if(i==s.length()) return "";
          return s.charAt(i)!='a'?s.charAt(i)+removeA(s,i+1):removeA(s,i+1);
    }
    public static void main(String[] args) {
        String s = "abcdaaeaafa";
        System.out.println(removeA(s,0));
    }
}
