import java.util.Scanner;

public class NumericConversion {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Por favor, insira um valor numérico:");
        int valorPrimitivo = scanner.nextInt();


        Integer valorWrapper = Integer.valueOf(valorPrimitivo);


        System.out.println("Valor primitivo: " + valorPrimitivo);
        System.out.println("Valor wrapper: " + valorWrapper);


        scanner.close();
    }
}
