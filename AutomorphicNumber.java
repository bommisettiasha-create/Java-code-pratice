public class Automorphic {
    public static void main(String[] args) {
        int num = 25;
        int square = num * num;

        if (square % 100 == num)
            System.out.println("Automorphic Number");
        else
            System.out.println("Not Automorphic");
    }
}