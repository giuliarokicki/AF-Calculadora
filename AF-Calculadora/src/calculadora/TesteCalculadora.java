package calculadora;

/**
 * <p><strong>Classe de Teste da Calculadora</strong></p>
 *
 * <p>Esta classe contém o método {@code main}, responsável por executar e
 * demonstrar o funcionamento da classe {@link Calculadora}. São realizados testes
 * com operações válidas e também com operações que geram exceções, permitindo
 * observar o comportamento do tratamento de erros.</p>
 *
 * <p>Operações demonstradas:</p>
 * <ul>
 *     <li>Soma</li>
 *     <li>Subtração</li>
 *     <li>Multiplicação</li>
 *     <li>Divisão</li>
 * </ul>
 *
 * <p>Também são realizados testes com:</p>
 * <ul>
 *     <li>Divisão por zero</li>
 *     <li>Operador matemático inválido</li>
 * </ul>
 *
 * <p>Ambos os casos acima resultam em exceções tratadas com {@code try/catch},
 * permitindo exibir mensagens amigáveis ao usuário.</p>
 *
 * @author Seu Nome
 * @version 1.0
 */
public class TesteCalculadora {

    /**
     * <p>Método principal responsável por executar testes da calculadora.</p>
     *
     * @param args argumentos passados pela linha de comando (não utilizados)
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        // Exemplos de operações válidas
        System.out.println(calc.calcular(2, 3, "+"));
        System.out.println(calc.calcular(10, 4, "-"));
        System.out.println(calc.calcular(3, 5, "*"));
        System.out.println(calc.calcular(8, 2, "/"));

        // Teste de divisão por zero
        try {
            System.out.println(calc.calcular(8, 0, "/")); // exceção
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Teste com operador inválido
        try {
            System.out.println(calc.calcular(5, 5, "x")); // exceção
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
