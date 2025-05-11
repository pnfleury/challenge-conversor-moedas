import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Principal {
    public static void main(String[] args) throws IOException {
        Scanner leitura = new Scanner(System.in);
        int x = 1;
        while (x == 1) {
            try {
                MenuPrincipal.menuPrincipal();
                int menu = leitura.nextInt();
                switch (menu) {
                    case 1:
                        MostraResultado.mostraResultado("USD", "BRL");
                        break;
                    case 2:
                        MostraResultado.mostraResultado("BRL", "USD");
                        break;
                    case 3:
                        MostraResultado.mostraResultado("BRL", "MXN");
                        break;
                    case 4:
                        MostraResultado.mostraResultado("MXN", "BRL");
                        break;
                    case 5:
                        MostraResultado.mostraResultado("EUR", "BRL");
                        break;
                    case 6:
                        MostraResultado.mostraResultado("BRL", "EUR");
                        break;
                    case 7:
                        System.out.println("Voce saiu do programa....");
                        x = 2;
                        break;
                    default:
                        System.out.println("Opção invalida...tente de novo.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("ERRO: Caracteres invalidos..." + e);
                leitura.nextLine();
            } catch (FileNotFoundException | UnknownHostException e) {
                System.out.println("ERRO: valor invalido ou na busca do cambio...");
            }
        }
    }
}

