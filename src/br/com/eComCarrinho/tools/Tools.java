package br.com.eComCarrinho.tools;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Tools {


    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_WHITE = "\u001B[37m";

    static Scanner tc = new Scanner(System.in);
    static NumberFormat nf = new DecimalFormat("R$ #,##0.00", new DecimalFormatSymbols(new Locale("pt", "BR")));
    public static void pause (int segundos){
        try {
            TimeUnit.SECONDS.sleep(segundos);
        } catch (InterruptedException e) {
            System.err.println("Erro so pausar "+segundos+" segundos.");
        }
    }

    public static String precoFormata(double preco){
        return Tools.nf.format(preco);
    }

    public static String liquidaFormata(boolean liquida){
        if (liquida){
            return ANSI_GREEN + " [ LIQUIDADO ] " + ANSI_RESET;
        } else {
            return ANSI_RED + " [ A PAGAR ] " + ANSI_RESET;
        }
    }

    public static String textoFormatadoBlue(String texto){
        return ANSI_BLUE + texto + ANSI_RESET;
    }

    public static String textoFormatadoRed(String texto){
        return ANSI_RED + texto + ANSI_RESET;
    }

    public static String textoFormatadoYellow(String texto){
        return ANSI_YELLOW + texto + ANSI_RESET;
    }

    public static String textoFormatadoPurple(String texto){
        return ANSI_PURPLE + texto + ANSI_RESET;
    }

    public static String textoFormatadoWhite(String texto){
        return ANSI_WHITE + texto + ANSI_RESET;
    }

    public static void teclaEncerrar(){
        pausaTecla();
        System.out.println(textoFormatadoBlue("Isso ?? tudo pessoal.......... "));
        System.exit(0);
    }

    public static void pausaTecla(){
        System.out.println(" ");
        System.out.println(textoFormatadoBlue("Pressione enter para continuar ......."));
        tc.nextLine();
    }



}