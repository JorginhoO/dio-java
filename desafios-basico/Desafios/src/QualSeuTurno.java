import java.util.Scanner;

import javax.swing.Popup;

public class QualSeuTurno {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Qual é o seu turno: ");
        char turno = leitor.next().toUpperCase().charAt(0);


        if (turno == 'M') {
            System.out.println("Bom dia!");
        } else if (turno == 'V')  {
            System.out.println("Boa tarde!");
        }else if (turno == 'N') {
            System.out.println("Boa noite!");
        }else {
            System.out.println("Valor Inválido!");  
        }
}
    }

