package com.mycompany.notas.parciais;

public class NotasParciais2 {
    // variáveis que vão receber os valores para o cálculo da média
    public double nota01, nota02, media;
    
    // cálculo das notas parciais para obter a média
    public double resultado(){
        media = (nota01 + nota02)/2;
        return media;
    }
    public void resultfinal(){
        resultado();
        System.out.println("Sua média é: "+ media);
        System.out.println("E você foi...");
        
        // condicionais para verificar se a pessoa foi aprovada com perfeição, na média ou se foi reprovado.
        if (media == 10){
            System.out.println("Aprovado com distinção!");
        } else if (media >= 7){
            System.out.println("Aprovado!");
        } else if (media < 7){
            System.out.println("Reprovado!");
        }          
    }
}
