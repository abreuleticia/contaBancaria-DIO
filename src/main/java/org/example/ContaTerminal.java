package org.example;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ContaTerminal {
    int numeroConta;
    String agenciaConta;
    String nomeCliente;
    double saldoConta;

    Scanner sc = new Scanner(System.in);
    public void dadosBancarios() {

        System.out.println("Insira seu nome: ");
        nomeCliente = sc.next();
        System.out.println("Insira o número da agencia: ");
        agenciaConta = sc.next();
        System.out.println("Insira o numero da conta: ");
        numeroConta = sc.nextInt();
        System.out.println("Qual seu saldo bancario: ");
        saldoConta = sc.nextDouble();
    }
        public void imprimirDados(){
            System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agenciaConta + ", conta " + numeroConta + ", e seu saldo de R$" + saldoConta + " já está disponivel para saque");
        }
    }
