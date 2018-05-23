/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com;

/**
 *
 * @author Erica
 */
public class ContaBancaria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Conta c = new Conta();
        c.setAgencia(0726);
        c.setBanco("Sicredi");
        c.setNumero(123456789);
        c.setTitular("Erica");
        c.setSaldo(10);
        //////////
        CaixaEletronico ce = new CaixaEletronico();
        ce.iniciarSessao(c);
        ce.depositar(150);
        ce.sacar(10);
        System.out.println(c.getSaldo());
        ce.consultaSaldo();
        ce.imprimirExtrato();
//vai mostrar o saldo após o saque
        // TODO code application logic here
    }
    
}
