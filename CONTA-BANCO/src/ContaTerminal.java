import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner inputData = new Scanner(System.in);

        int numeroConta, agencia;
        String nomeDoCliente;
        float saldo;

        System.out.println("OLÁ SEJA BEM VINDO AO BANCO DIO, PARA COMEÇAR DIGITE O SEU NOME:");
        nomeDoCliente = inputData.nextLine();
        System.out.println("AGORA POR FAVOR INFORME UM NUMERO DE CONTA COM 4 DIGITOS:");
        numeroConta = inputData.nextInt();
        System.out.println("DIGITE O NUMERO DA AGÊNCIA COM 4 DIGITOS:");
        agencia = inputData.nextInt();
        System.out.println("DIGITE O SALDO DISPONIVÉL EM CONTA:");
        saldo = inputData.nextFloat();
        System.out.println("Olá, "+ nomeDoCliente + " sua conta "+ numeroConta+ " e agência "+ agencia+ " foi criada com sucesso e o valor de: " +saldo+"R$ já se encontra disponível para saque.");
        
    }
}
