package A1;
import java.util.Scanner;

public class Produto {
     private String NomeProduto;
     private String Descricao;
     private Double Preco;
     
     public Produto(String NomeProduto, String Descricao) {
    	 this.NomeProduto= NomeProduto;
    	 this.Descricao= Descricao;
    	 this.Preco= 0.0;
     }
     public String getNome() {
    	 return NomeProduto;
     }
     public void setNome(String NomeProduto) {
    	 this.NomeProduto = NomeProduto;
     }
     public String getDescricao() {
    	 return Descricao;
     }
     public void setDescricao(String Descricao) {
    	 this.Descricao = Descricao;
     }
     public double getPreco() {
    	 return Preco;
     }
     public void setPreco(double Preco) {
    	 this.Preco = Preco;
     }
     public void aumentaPreco(double porcentagem) {
    	 this.Preco += this.Preco*porcentagem / 100.0;
     }
     public void mostrarDados() {
    	 System.out.println("NomeProduto: " + NomeProduto);
    	 
    	 System.out.println("Descricao: " + Descricao);
    	 
    	 System.out.println("Preco: " + Preco);
     }
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Digite o nome do produto:");
         String NomeProduto = scanner.nextLine();
         System.out.println("Digite a descrição do produto:");
         String Descricao = scanner.nextLine();

         Produto p1 = new Produto(NomeProduto, Descricao);

         double preco;
         double menorPreco = Double.MAX_VALUE;
         do {
             System.out.println("Digite o preço do produto (0 para sair)");
             preco = scanner.nextDouble();
             if (preco != 0 && preco < menorPreco) {
                 menorPreco = preco;
             }
         } while (preco != 0);

         p1.setPreco(menorPreco);
         p1.aumentaPreco(2.0);

         p1.mostrarDados();

         scanner.close();
     }
 }
