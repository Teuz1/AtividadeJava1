import java.util.Scanner;

public class CalculoNovoSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o salário: ");
        float salario = scanner.nextFloat();

        System.out.print("Digite o abono: ");
        float abono = scanner.nextFloat();

        float novoSalario = salario + abono;

        System.out.println("Novo Salário: " + novoSalario);

        scanner.close();
    }
}

