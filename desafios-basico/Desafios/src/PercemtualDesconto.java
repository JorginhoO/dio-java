import java.util.Scanner;

public class PercemtualDesconto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Valor do produto: ");
        int M = input.nextInt();
        System.out.println("Valor de desconto do Produto: ");
        int D = input.nextInt();

        double descontoProduto = M - D;
        double percentualDesconto = (descontoProduto / M) * 100;
        
        System.out.println(String.format("O desconto foi de %.0f%%",percentualDesconto));

    }
}
    

