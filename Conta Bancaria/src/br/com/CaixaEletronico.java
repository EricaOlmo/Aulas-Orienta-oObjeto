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
public class CaixaEletronico {
    
    private Conta conta;
    private String[] extrato;
    private int registrosNoExtrato = 0;
    
    public CaixaEletronico(){
        this.extrato = new String[100]; 
    }
    
    public void iniciarSessao(Conta conta){
        this.conta = conta; //estou chamando o conta da minha classe
        extrato[registrosNoExtrato] = "O saldo é "+ conta.getSaldo();
        registrosNoExtrato++;
    }
    
    public void depositar(float dinheiro){
        if (this.aSessaoEValida()){
        float tmpSaldo = this.conta.getSaldo() + dinheiro; // pega meu saldo e diminui pelo valor que quero sacar
        this.conta.setSaldo(tmpSaldo);
        extrato[registrosNoExtrato] = "Foi depositado "+ dinheiro;
        registrosNoExtrato++;
        extrato[registrosNoExtrato] = "Saldo atual  "+ tmpSaldo;
        registrosNoExtrato++;
         }  
    }
     public void sacar(float dinheiro){
         if (this.aSessaoEValida()){
        float tmpSaldo = this.conta.getSaldo() - dinheiro; // pega meu saldo e diminui pelo valor que quero sacar
        this.conta.setSaldo(tmpSaldo);
         extrato[registrosNoExtrato] = "Foi sacado "+ dinheiro;
        registrosNoExtrato++;
        extrato[registrosNoExtrato] = "Saldo atual  "+ tmpSaldo;
        registrosNoExtrato++;
         }
    }
     public void consultaSaldo(){
        if (this.aSessaoEValida()){
            System.out.printf("O saldo da conta %d do titular %s é %f \r\n", this.conta.getNumero(), this.conta.getTitular(),this.conta.getSaldo());
        }
    }
     public void imprimirExtrato(){
         for (int i = 0; i < registrosNoExtrato; i++){
             System.out.println(extrato[i]);
         }
     }
     
     //validação, neste caso se a conta for nula não é possivel fazer a operação
     private boolean aSessaoEValida(){ 
        if  (this.conta == null){
             System.out.println("Para fazer alguma operação inicie uma sessão!"); //mensagem de erro
             return false; 
         }
        return true;
     }
     
    
}
