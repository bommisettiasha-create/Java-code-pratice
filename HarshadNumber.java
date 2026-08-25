public class Harshad {
    public static void main(String[] args) {
        int num = 18;
        int temp = num;
        int sum = 0;

        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }

        if (num % sum == 0)
            System.out.println("Harshad Number");
        else
            System.out.println("Not Harshad Number");
    }
}