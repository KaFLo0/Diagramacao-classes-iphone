package com.iphone.model;

import com.iphone.Iphone;

public class DemonstracaoIphone {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("Iniciando Demonstração do novo Iphone!");

        iphone.selecionarMusica();
        iphone.pausarMusica();
        iphone.tocarMusica();

        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        System.out.println("A apresentação foi um sucesso!");
    }
}
