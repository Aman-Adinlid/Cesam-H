package se.aman;

public class RemoveRepetitions{

    public static String transform(String input) {
        char[] arr1 = input.toCharArray();
        String targetStr = "";
        for (char value: arr1) {
            if (targetStr.indexOf(value) == -1) {
                targetStr += value;
            }
        }
        return targetStr;
    }



    public static void main(String[] args) {
        String str1 = "abcb";
        System.out.println(RemoveRepetitions.transform("abbcbbb"));
        System.out.println(str1);
    }
}
