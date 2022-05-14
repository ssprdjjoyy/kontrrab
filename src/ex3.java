import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        System.out.println("Введите последовательность целых чисел, оканчивающаяся числом 0:");
        Scanner sc = new Scanner(System.in);
        int curr = 0;
        int summ = 0;
        while ((curr = sc.nextInt()) != 0) {
            summ += curr;
        }
        System.out.println(String.format("Сумма последовательности %d", summ));
    }
}