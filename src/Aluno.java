//import java.util.Scanner;
//class Produto {
//    Scanner sc = new Scanner(System.in);
//    private String nome, cor;
//    private int codigo, estoque;
//    private double tamanho, valor;
//
//    // Getters e Setters
//    public String getNome() {
//        return nome;
//    }
//
//    public void setNome(String nome) {
//        this.nome = nome;
//    }
//
//    public String getCor() {
//        return cor;
//    }
//
//    public void setCor(String cor) {
//        this.cor = cor;
//    }
//
//    public int getCodigo() {
//        return codigo;
//    }
//
//    public void setCodigo(int codigo) {
//        this.codigo = codigo;
//    }
//
//    public int getEstoque() {
//        return estoque;
//    }
//
//    public void setEstoque(int estoque) {
//        this.estoque = estoque;
//    }
//
//    public double getTamanho() {
//        return tamanho;
//    }
//
//    public void setTamanho(double tamanho) {
//        this.tamanho = tamanho;
//    }
//
//    public double getValor() {
//        return valor;
//    }
//
//    public void setValor(double valor) {
//        this.valor = valor;
//    }
//
//    // Método para realizar a venda
//    public void vender() {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Quantas unidades de " + nome + " deseja adquirir?");
//        int quantidade = sc.nextInt();
//
//        if (quantidade > estoque) {
//            System.out.println("Estoque insuficiente! Temos apenas " + estoque + " unidades.");
//            return;
//        }
//
//        estoque -= quantidade; // Atualiza o estoque
//
//        System.out.println("Forma de pagamento: ");
//        System.out.println("1- Pix ; 2- Espécie ; 3- Transferência ; 4- Débito ; 5- Crédito (até 3x sem juros)");
//        int formaPagamento = sc.nextInt();
//
//        double total = valor * quantidade;
//
//        switch (formaPagamento) {
//            case 1, 3, 4 -> {
//                double desconto = total * 0.05;
//                System.out.println("Total com 5% de desconto: R$ " + (total - desconto));
//            }
//            case 2 -> {
//                double desconto = total * 0.05;
//                double totalComDesconto = total - desconto;
//                System.out.println("Total com 5% de desconto: R$ " + totalComDesconto);
//                System.out.print("Qual será o valor pago em espécie? ");
//                double valorPago = sc.nextDouble();
//                if (valorPago > totalComDesconto) {
//                    double troco = valorPago - totalComDesconto;
//                    System.out.println("Troco: R$ " + troco);
//                } else {
//                    System.out.println("Pagamento insuficiente!");
//                }
//            }
//            case 5 -> {
//                System.out.println("Deseja parcelar em quantas vezes? (Até 3x sem juros)");
//                int parcelas = sc.nextInt();
//                if (parcelas <= 3) {
//                    double valorParcela = total / parcelas;
//                    System.out.println("Total: R$ " + total);
//                    System.out.println("Valor de cada parcela (" + parcelas + "x): R$ " + valorParcela);
//                } else {
//                    System.out.println("Não é possível parcelar em mais de 3 vezes sem juros.");
//                }
//            }
//            default -> System.out.println("Forma de pagamento inválida!");
//        }
//
//        System.out.println("Venda realizada com sucesso! Estoque restante: " + estoque);
//    }
//}
public class Aluno{
    private String nome;
    private double n1;
    private double n2;
    private double n3;


    public Aluno(String nome, double n1,double n2,double n3){
        this.nome = nome;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }
    public double calcularMedia(){
      return (n1+n2+n3)/3;
    }

    public void exibirInformacoes(){
        System.out.println("sua primeira nota : "+n1+ "; Segunda nota: "+n2+"; Terceira nota: "+n3+"; Média: "+calcularMedia());
    }
    public void checarAprovacao(){
        if (calcularMedia()>=70){
            System.out.println("Parabéns voce foi aprovado!!");
        } else if(calcularMedia()<40){
        System.out.println("Voce foi reprovado!");}
        else {
            System.out.println("Voce esta apto para realizar a prova final!");
        }
    }

}