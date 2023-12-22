package demo;

public class Numbero_of_palindromes {
    //从键盘录入一个数判断是否是回文数
    public static void main(String[] args) {
        java.util.Scanner s = new java.util.Scanner(System.in);
        try {
            System.out.println("请输入一个数：");
            int num = s.nextInt();
            int temp = num;
            int sum = 0;
            while (temp != 0) {
                int ge = temp % 10;
                sum = sum * 10 + ge;
                temp /= 10;
            }
            if (sum == num) {
                System.out.println("是回文数");
            } else {
                System.out.println("不是回文数");
            }
        } finally {
            s.close();
        }
    }
    
    
    
    
}
