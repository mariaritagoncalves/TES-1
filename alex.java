package alequinho;
import java.util.Scanner;
public class alex {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        while (!sc.hasNextInt()) {
System.out.println("Digite um número válido");
sc.next();
        }
        num = sc.nextInt();
        System.out.println("O número é: "+num);
        sc.close();
    }
}