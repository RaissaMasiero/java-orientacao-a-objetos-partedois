package application;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class ProgramContract {

    public static void main(String[] args) {

        /*Uma empresa deseja automatizar o processamento de seus contratos. O processamento de um contrato consiste em gerar
         as parcelas a serem pagas para aquele contrato, com base nonúmero de meses desejado. A empresa utiliza um serviço de
         pagamento online para realizar o pagamento das parcelas.Os serviços de pagamento online tipicamente cobram um juro
         mensal, bem como uma taxapor pagamento. Por enquanto, o serviço contratado pela empresa é o do Paypal, que aplicajuros
         simples de 1% a cada parcela, mais uma taxa de pagamento de 2%. Fazer um programa para ler os dados de um contrato
         (número do contrato, data do contrato,e valor total do contrato). Em seguida, o programa deve ler o número de meses
         paraparcelamento do contrato, e daí gerar os registros de parcelas a serem pagas (data e valor),sendo a primeira
         parcela a ser paga um mês após a data do contrato, a segunda parcela doismeses após o contrato e assim por diante.
         Classes: Contract, Installment, ContractService, OnlinePaymentService, PaypalService.*/

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato:");
        System.out.print("Número: ");
        int numero = sc.nextInt();

        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate data = LocalDate.parse(sc.next(), fmt);

        System.out.print("Valor do contrato: ");
        double valorTotal = sc.nextDouble();

        Contract obj = new Contract(numero, data, valorTotal);

        System.out.print("Entre com o número de parcelas: ");
        int n = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalService());
        contractService.geraContrato(obj, n);

        System.out.println("PARCELAS:");

        for(Installment installment : obj.getInstallments()){
            System.out.println(installment);
        }

        sc.close();
    }
}
