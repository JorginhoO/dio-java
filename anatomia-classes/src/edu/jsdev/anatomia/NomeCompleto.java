package edu.jsdev.anatomia;
public class NomeCompleto {
    
    public static void main(String[] args) {

        String primeiroNome = "Jorge";
        String segundoNome = "Sidney";
       
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
       
        System.out.println(nomeCompleto);
     }

     public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
     }

}
