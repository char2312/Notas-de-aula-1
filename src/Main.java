//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Produto produto = new Produto();
//
//        // Cadastro de produto
//        System.out.println("Cadastro de Produto");
//        System.out.println("-------------------");
//
//        System.out.print("Código do produto: ");
//        produto.setCodigo(sc.nextInt());
//        sc.nextLine(); // Consumir a quebra de linha
//
//        System.out.print("Nome do produto: ");
//        produto.setNome(sc.nextLine());
//
//        System.out.print("Tamanho/Peso do produto: ");
//        produto.setTamanho(sc.nextDouble());
//
//        System.out.print("Cor do produto: ");
//        produto.setCor(sc.next());
//
//        System.out.print("Valor do produto: ");
//        produto.setValor(sc.nextDouble());
//
//        System.out.print("Quantidade no estoque: ");
//        produto.setEstoque(sc.nextInt());
//
//        // Venda de produto
//        produto.vender();
//    }
//}


import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu nome completo: ");
        String nome = sc.nextLine();

        System.out.println("Digite sua primeira nota: ");
        double n1 = sc.nextDouble();

        System.out.println("Digite sua segunda nota: ");
        double n2 = sc.nextDouble();

        System.out.println("Digite sua terceira nota: ");
        double n3 = sc.nextDouble();

        Aluno aluno = new Aluno(nome,n1,n2,n3);
        aluno.exibirInformacoes();
        aluno.checarAprovacao();

        sc.close();

    }
}
