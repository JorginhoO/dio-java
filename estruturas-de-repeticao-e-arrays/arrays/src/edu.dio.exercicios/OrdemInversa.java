public class OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = { 1, 2, 3, 4, 5, 6};

        System.out.println(vetor.length);

        int count = 0;
        while (count < vetor.length) {
            System.out.println(vetor[count]);
            count++;
        }

        System.out.println("Vetor:");
        for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();
    }
}
