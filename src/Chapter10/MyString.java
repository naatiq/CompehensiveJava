package Chapter10;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Arrays;

/**
 * Created by naatiqullahmohammed on 28/06/14.
 */
public class MyString {
    private char[] chars;
    private static char[] digits = new char[]{'0','1','2','3','4','5','6','7','8','9'};
    private static char[] lowerCase = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m'
            ,'n','o','p','r','s','t','u','v','w','x','y','z'};
    private static char[] upperCase = new char[]{'A','B','C','D','E','F','G','H','I','J','K','L','M'
            ,'N','O','P','R','S','T','U','V','W','X','Y','Z'};


    public MyString(char[] chars) {
        this.chars = chars;
    }

    public MyString(String s)   {

    }

    public char charAt(int index) {
        return chars[index];
    }

    public int length() {
        return chars.length;
    }

    public MyString substring(int begin, int end) {
        char[] newchars = new char[end - begin];
        for (int i = 0; i < newchars.length; i++) {
            newchars[i] = chars[begin+i];
        }

        return new MyString(newchars);
    }

    public MyString toLowerCase() {
        char[] newChars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            int index = Arrays.binarySearch(upperCase,chars[i]);
            if(index >= 0) {
                newChars[i] = lowerCase[index];
            }
            else newChars[i] = chars[i];
        }
        return new MyString(newChars);
    }

    public boolean equals(MyString s) {
        if(s.length() != this.length()) return false;

        for (int i = 0; i < chars.length; i++) {
            if(chars[i] != s.chars[i]) return false;
        }
        return true;
    }

    public static MyString valueOf(int i) {
        if(i >= 0) return new MyString(intToChar(i));
        else {
            char[] c = intToChar(i);
            char[] res = new char[1 + c.length];
            for (int j = 0; j < c.length; j++) {
                res[i+1] = c[i];
            }
            res[0] = '-';
            return new MyString(res);
        }
    }

    private static char[] intToChar(int i) {
        if(i<0) i = -i;
        int nums = 0;
        while (Math.pow(10,nums) < i) nums++;
        char[] res = new char[nums];
        int num = i;
        for (int j = 0; j < res.length; j++) {
            int index = num / (int)Math.pow(10,nums-j-1);
            num = num % (int)Math.pow(10,nums-j-1);
            res[j] = digits[index];
        }

        return res;
    }

    @Override
    public String toString() {
        return Arrays.toString(chars);
    }

    public static void main(String[] args) {
        MyString s = MyString.valueOf(999);
        System.out.println(s);
        System.out.println(s.toLowerCase());
    }
}
