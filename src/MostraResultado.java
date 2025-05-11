import java.io.IOException;
import java.util.Scanner;

public class MostraResultado {

    static BuscaConversao novabusca = new BuscaConversao();

    static void mostraResultado (String base, String alvo) throws IOException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("\nDigite o valor:");
        double valor = leitura.nextDouble();
        Moeda moedaConvertida = novabusca.buscaconversao(valor, base, alvo);
        System.out.println("(" + base + ")" + valor + " ==> CONVERSÃO ==> (" + alvo + ")" + moedaConvertida.conversion_result() + " (Taxa cambio: " + moedaConvertida.conversion_rate() + ")" + "\n");

    }
}
