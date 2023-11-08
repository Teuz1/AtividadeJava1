import java.util.Scanner;

public class CalculoDiferencaProdutos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("numero1: ");
        float n1 = scanner.nextFloat();

        System.out.print("numero2: ");
        float n2 = scanner.nextFloat();

        System.out.print("numero3: ");
        float n3 = scanner.nextFloat();

        System.out.print("numero4: ");
        float n4 = scanner.nextFloat();

        float resultado = (n1 * n2) - (n3 * n4);

        System.out.println("Diferença: " + resultado);

        scanner.close();
    }
}

 
	

