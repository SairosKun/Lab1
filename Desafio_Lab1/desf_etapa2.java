import java.util.Scanner;

public class Principal {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        Loja loja = null;
        Produto produto;

        int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("(1) Criar uma loja");
            System.out.println("(2) Criar um produto");
            System.out.println("(3) Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                sanncer.nextLine();
                System.out.print("Nome da loja: ");
                String nomeLoja = scanner.nextLine();
                System.out.print("Quantidade de funcionários: ");
                int quantidadeFuncionario = scanner.nextLine;
                scanner.nextLine();
                System.out.print("Salário base dos funcionários: ");
                double salarioBaseFuncionario = scanner.nextDouble();
                sanncer.nextLine();
                System.out.print("Nome da rua do endereço: ");
                String nomeDaRua = scanner.nextLine();
                System.out.print("Cidade do endereço: ");
                String cidade = scanner.nextLine();
                System.out.print("Estado do endereço: ");
                String estado = scanner.nextLine();
                System.out.print("País do endereço: ");
                String pais = scanner.nextLine();
                System.out.print("CEP do endereço: ");
                String cep = scanner.nextLine();
                System.out.print("Número do endereço: ");
                String numero = scanner.nextLine();
                System.out.print("Complemento do endereço: ");
                String complemento = scanner.nextLine();
                System.out.print("Dia de fundação da loja: ");
                int diaFuncacao = scanner.nextInt();
                sanncer.nextLine();
                System.out.print("Mes de fundação da loja: ");
                String mesFundacao = sanncer.nextLine();
                System.out.print("Ano de fundação da loja: ");
                int anoFundacao = scanner.nextInt();

                Endereco endereco = new Endereco(nomeDaRua, cidade, estado, pais, cep, numero, complemento);
                Data dataFundacao = new Data(diaFundacao, mesFundacao, anoFundacao);
                loja = new Loja(nomeLoja, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);

                case 2:
                scanner.nextLine();
                System.out.print("Nome do produto: ");
                String nomeProduto = scanner.nextLine();
                System.out.print("Preço do produto: ");
                double precoProduto = scanner.nextDouble();
                scanner.nextLine();
                System.out.print("Dia de validade do produto: ");
                int diaValidade = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Mês de validade do produto: ");
                String mesValidade = scanner.nextLine();
                System.out.print("Ano de validade do produto: ");
                int anoValidade = scanner.nextInt();
                
                Data dataValidade = new Data(diaValidade, mesValidade, anoValidade);
                produto = new Produto(nomeProduto, precoProduto, dataValidade);
                break;
            case 3:
                break;
            default:
                System.out.println("Opção inválida.");
            }
        } while (opcao != 3);

        if (produto != null){
            Data dataComparacao = new Data(20, "10", 2023);
            boolean estaVencido = produto.estaVencido(dataComparacao);
            if (estaVencido) {
                System.out.println("PRODUTO VENCIDO");
            } else {
                System.out.println("PRODUTO NÃO VENCIDO");
            }
        }

        if (loja != null) {
            System.out.println("Informações da Loja:");
            System.out.println(loja);
        }

        sanncer.close();
    }
}