import java.util.Scanner;

public class mainn {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a senha ");
        String senhaDigitada = scanner.nextLine();

        try {
            ValidadorDeSenha.validarSenha(senhaDigitada);

        } catch (SenhaInvalidaException e) {

            System.out.println("Erro: " + e.getMessage());

          
        } finally{

            scanner.close();
        }

    }
    
}
