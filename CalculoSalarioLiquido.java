import java.util.Scanner;

public class CalculoSalarioLiquido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Salário Bruto: ");
        float salarioBruto = scanner.nextFloat();

        System.out.print("Adicional Noturno: ");
        float adicionalNoturno = scanner.nextFloat();

        System.out.print("Horas Extras: ");
        float horasExtras = scanner.nextFloat();

        System.out.print("Descontos: ");
        float descontos = scanner.nextFloat();

        float salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;

        System.out.println("Salário Líquido: " + salarioLiquido);

        scanner.close();
    }
}

