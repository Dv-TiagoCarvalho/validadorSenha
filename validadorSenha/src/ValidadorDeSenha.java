public class ValidadorDeSenha {
    public static void validarSenha(String senha) throws SenhaInvalidaException {

        if (senha == null || senha.isEmpty()) {
            throw new SenhaInvalidaException("A senha não pode ser nula ou vazia.");
        }

        if (senha.length() < 8) {
            throw new SenhaInvalidaException("A senha deve ter pelo menos 8 caracteres.");
        }

        boolean contemNumero = false;
        for (char c : senha.toCharArray()) {
            if (Character.isDigit(c)) {
                contemNumero = true;
                break;
            }
        }
        if (!contemNumero) {
            throw new SenhaInvalidaException("A senha deve conter pelo menos um número.");
        }

        boolean contemMaiuscula = false;
        for (char c : senha.toCharArray()) {
            if (Character.isUpperCase(c)) {
                contemMaiuscula = true;
                break;
            }
        }
        if (!contemMaiuscula) {
            throw new SenhaInvalidaException("A senha deve conter pelo menos uma letra maiúscula.");
        }

        System.out.println("Senha Validada com Sucesso!!!");
    }
}
