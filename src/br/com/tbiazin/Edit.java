package br.com.tbiazin;
import java.util.Map;
import java.util.Scanner;

public class Edit extends Cadastro {
    private Map<String, Cliente> clientes;
    private Scanner scanner;

    public Edit(Map<String, Cliente> clientes, Scanner scanner) {
        this.clientes = clientes;
        this.scanner = scanner;
    }

    public void menuEdicao() {
        int opcao;
        do {
            System.out.println("Opções de Edição");
            System.out.println("1. Consultar cliente");
            System.out.println("2. Atualizar cliente");
            System.out.println("3. Excluir cliente");
            System.out.println("4. Voltar ao menu principal");
            System.out.println("Digite sua opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    consultarCliente();
                    break;
                case 2:
                    atualizarCliente();
                    break;
                case 3:
                    excluirCliente();
                    break;
                case 4:
                    System.out.println("Voltando ao menu principal");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 4);
    }


    private void consultarCliente() {
        System.out.println("\nDigite o CPF do cliente: ");
        String cpf = scanner.nextLine();
        if (clientes.containsKey(cpf)) {
            System.out.println("Informações do cliente:");
            System.out.println(clientes.get(cpf));
        } else {
            System.out.println("Cliente não encontrado!");
        }
    }

    private void atualizarCliente() {
        System.out.println("Digite o CPF do cliente: ");
        String cpf = scanner.nextLine();
        if (clientes.containsKey(cpf)) {
            Cliente clienteEncontrado = clientes.get(cpf);
            System.out.println("Digite o novo endereço do cliente: ");
            String novoEndereco = scanner.nextLine();
            clienteEncontrado.setEndereco(novoEndereco);
            System.out.println("Cliente atualizado com sucesso!");
        } else {
            System.out.println("Cliente não encontrado!");
        }
    }

    private void excluirCliente() {
        System.out.println("\nDigite o CPF do cliente a ser excluído: ");
        String cpf = scanner.nextLine();
        if (clientes.containsKey(cpf)) {
            clientes.remove(cpf);
            System.out.println("Cliente excluído com sucesso!");
        } else {
            System.out.println("Cliente não encontrado!");
        }
    }
}
