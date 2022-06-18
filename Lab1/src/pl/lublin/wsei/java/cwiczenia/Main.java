package pl.lublin.wsei.java.cwiczenia;


public class Main {
    public static void main(String[] args){

    }
    private static String leftPad(String aText, char aChar, int aWidth) {
        String res = aText;
                for (int i = 0; i < aWidth - aText.length();i++)
                    res = aChar + res;
                return res;
    }
}