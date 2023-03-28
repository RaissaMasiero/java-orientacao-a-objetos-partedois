package application;

import model.services.BrazilInterestService;
import model.interfaces.InterestService;

import java.util.Locale;
import java.util.Scanner;

public class ProgramInterestRate {

    public static void main(String[] args) {

        /*Fazer um programa para ler uma quantia e a duração em meses de umempréstimo. Informar o valor a ser pago depois
        de decorrido o prazo doempréstimo, conforme regras de juros do Brasil. A regra de cálculo dejuros do Brasil é juro
        composto padrão de 2% ao mês.
        Classes: BrazilInterestService, InterestService e UsaInterestService*/

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor: ");
        double valor = sc.nextDouble();

        System.out.print("Meses: ");
        int meses = sc.nextInt();

        InterestService is = new BrazilInterestService(2.0);
        double pagamento = is.pagamento(valor, meses);

        System.out.println("Pagamento depois de " + meses + " meses: ");
        System.out.println(String.format("%.2f", pagamento));

        sc.close();
    }
}
