package com.mycompany.notas.parciais;
import java.util.Scanner;
public class NotasParciais {

    public static void main(String[] args) {
        NotasParciais2 result = new NotasParciais2();
        Scanner snota = new Scanner(System.in);
        System.out.println("Digite sua primeira nota!");
        result.nota01 = (snota.nextInt());

        Scanner snota2 = new Scanner(System.in);
        System.out.println("Digite sua segunda nota!");
        result.nota02 = (snota2.nextInt());
        result.resultfinal();
        snota.close();
        snota2.close();
    }
}
