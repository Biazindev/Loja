package br.com.tbiazin;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {

    private static Map<String, Cliente> clientes = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            System.out.println("=== Menu ===");
            System.out.println("1. Cadastrar cliente");
            System.out.println("2. Acessar opções de edição");
            System.out.println("3. Sair");
            System.out.println("Digite sua opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarCliente();
                    break;
                case 2:
                    acessarEdicao();
                    break;
                case 3:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 3);

        scanner.close();
    }

    private static void cadastrarCliente() {
        Cadastro cadastro = new Cadastro();
        cadastro.cadastrarCliente();
    }
    private static void acessarEdicao() {
        Edit editor = new Edit(clientes, scanner);
        editor.menuEdicao();
    }

}
