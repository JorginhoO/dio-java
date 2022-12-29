import java.util.Scanner;

public class FilaBanco {
    public static void main(String[] args) {
        
        String[] nomesFila = new String[3];
        System.out.println("Nome do clinete: ");
        Scanner nome = new Scanner(System.in);
      
    
        for (int i = 0; i < nomesFila.length; i++) {
            nomesFila[i] = nome.next();
        }
        
        int count = 0;
        while ( count < nomesFila.length) {
            int posicao = count + 1;
            System.out.println((nomesFila[count] + " - esta na posicao: " + posicao));
            count++;
       }

    }
}
