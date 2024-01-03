package Interview;

public class NormalString {

    public static void main(String[] args) {
        String s = "***ab-cd____";
        char[] chars = s.toCharArray();

        String output = "";
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            while (i < j && (!Character.isLetter(chars[i]))) {
                i=i+1;
            }
            while (i < j && (!Character.isLetter(chars[j]))) {
                j=j-1;
            }
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i=i+1;
            j=j-1;
        }

        System.out.println(chars);





/**
        String str = "@amit_dixit";
        String[] arrOfStr = str.split("@", 2);
        System.out.println(arrOfStr.length);
        System.out.println(arrOfStr[1].concat("_"));


        for (String a : arrOfStr)
            System.out.println(a);*/
    }
}
