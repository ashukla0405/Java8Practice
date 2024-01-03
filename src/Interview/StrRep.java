package Interview;

public class StrRep {
    public static void main(String[] args) {

        String s = "abmcd";
        System.out.println(("s length is" + s.length()));
        String str="";
        for(int i=s.length()-1;i>=0;i--) {
            str=str+s.charAt(i);
        }
        System.out.println(str);
    }
}