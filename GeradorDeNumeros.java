import java.util.Scanner;
import java.util.Random;

public class GeradorDeNumeros {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int numeroAleatorio = random.nextInt(101);
        int tentativas = 5;
        boolean acertou = false;

        System.out.println("=== Jogo de adivinhação ===");
        System.out.println("Tente adivinhar o número entre 0 e 100. Você tem " + tentativas + " tentativas!");
        for (int i = 1; i <= tentativas; i++){
            System.out.println("Tentativa " + i + ": Digite seu palpite: ");
            int palpite = scanner.nextInt();

            if (palpite == numeroAleatorio){
                System.out.println("Parabéns! Você acertou o número " + numeroAleatorio + "!");
                acertou = true;
                break;
            } else if (palpite > numeroAleatorio) {
                System.out.println("O número é menor! Tente novamente. ");
            } else {
                System.out.println("O número é maior! Tente novamente. ");
            }
        }
        if (!acertou) {
            System.out.println("Fim de jogo! O número era " + numeroAleatorio + ".");
        }
        scanner.close();
    }
}
