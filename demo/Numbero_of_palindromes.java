package demo;

public class Numbero_of_palindromes {
    //判断100-1000有多少个数字是回文数
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i < 1000; ++i) {
            int a = i / 100;
            int c = i % 10;
            if (a == c) {
                count++;
            }
        }
        System.out.println(count);
    }
    
    
}
