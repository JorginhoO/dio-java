import java.util.Scanner;

public class MediaIdade {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite idade1: ");
        int idade1 = leitor.nextInt();
        System.out.println("Digite idade2: ");
        int idade2 = leitor.nextInt();
        System.out.println("Digite idade3: ");
        int idade3 = leitor.nextInt();

        int totalIdade = idade1 + idade2 + idade3;
        int idadeMedia = totalIdade / 3;

        if (idadeMedia <= 25) {
            System.out.println("Jovem!");
        } else if (idadeMedia <= 60) {
            System.out.println("Adulta!");
        } else {
            System.out.println("Idosa!");
        }
    }
}