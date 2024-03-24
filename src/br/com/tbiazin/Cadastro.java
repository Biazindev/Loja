package br.com.tbiazin;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Cadastro {
    private static Map<String, Cliente> clientes = new HashMap<>();

    static void cadastrarCliente() {
        System.out.println("Cadastro de Cliente");
        System.out.println("Digite o nome do cliente: ");
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();

        System.out.println("Digite o CPF do cliente: ");
        String cpf = scanner.nextLine();

        if (clientes.containsKey(cpf)) {
            System.out.println("Cliente já cadastrado!");
        } else {

            System.out.println("Digite o endereço do cliente: ");
            String endereco = scanner.nextLine();

            System.out.println("Digite o CEP do cliente: ");
            String cep = scanner.nextLine();

            System.out.println("Digite a Cidade do cliente: ");
            String cidade = scanner.nextLine();

            System.out.println("Digite o Estado do cliente: ");
            String uf = scanner.nextLine();

            Cliente cliente = new Cliente(nome, cpf, endereco, cep, cidade, uf);
            clientes.put(cpf, cliente);

            System.out.println("Cliente cadastrado com sucesso!");
        }
    }
}