import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();
        double totalSacado = 0; // Inicializa o total sacado como zero

        // Loop for para iterar sobre os saques
        for (int i = 1; ; i++) {

            double valorSaque = scanner.nextDouble();

            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break; // Encerra o loop
            } else if (valorSaque > limiteDiario) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break; // Encerra o loop
            } else if (totalSacado + valorSaque > limiteDiario) {
                System.out.println("Limite diario de saque atingido com este saque. Transacoes encerradas.");
                break; // Encerra o loop
            } else {
                totalSacado += valorSaque; // Atualiza o total sacado
                limiteDiario -= valorSaque; // Atualiza o limite diário
                System.out.println("Saque realizado. Limite restante: " + limiteDiario);
            }
        }

        // Fechar o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}
