package application;

import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class ProgramCarRental {

    public static void main(String[] args) {

        /*Uma locadora brasileira de carros cobra um valor por hora para locações de até12 horas. Porém, se a duração da
        locação ultrapassar 12 horas, a locação serácobrada com base em um valor diário. Além do valor da locação, é acrescido
        no preço o valor do imposto conforme regras do país que, no caso do Brasil, é 20% para valores até 100.00, ou 15% para
        valores acima de 100.00. Fazer umprograma que lê os dados da locação (modelo do carro, instante inicial e final da
        locação), bem como o valor por hora e o valor diário de locação. O programadeve então gerar a nota de pagamento
        (contendo valor da locação, valor do imposto e valor total do pagamento) e informar os dados na tela.
        Veja osexemplos.
        Classes: CarRental, Invoice, Vehicle, BrazilTaxService, RentalService, TaxService*/

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel: ");
        System.out.print("Modelo do carro:");
        String modeloCarro = sc.nextLine();

        System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime inicio = LocalDateTime.parse(sc.nextLine(), fmt);

        System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
        LocalDateTime termino = LocalDateTime.parse(sc.nextLine(), fmt);

        CarRental cr = new CarRental(inicio, termino, new Vehicle(modeloCarro));

        System.out.print("Preço por hora: ");
        double precoPorHora = sc.nextDouble();

        System.out.print("Preço por dia: ");
        double precoPorDia = sc.nextDouble();

        RentalService rentalService = new RentalService(precoPorHora, precoPorDia, new BrazilTaxService());
        rentalService.geraFatura(cr);

        System.out.println("FATURA:");
        System.out.println("Pagamento básico: " + String.format("%.2f", cr.getInvoice().getPagamentoBasico()));
        System.out.println("Imposto: " + String.format("%.2f", cr.getInvoice().getImposto()));
        System.out.println("Pagamento total: " + String.format("%.2f", cr.getInvoice().getTotalPagamento()));

        sc.close();
    }
}
