package com.iphone;

import com.iphone.model.aparelhoTelefonico.AparelhoTelefonico;
import com.iphone.model.navegadorInternet.NavegadorInternet;
import com.iphone.model.reprodutorMusical.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    @Override
    public void tocarMusica() {
        System.out.println("Tocando música!");
    }
    @Override
    public void pausarMusica() {
        System.out.println("Música pausada.");
    }
    @Override
    public void selecionarMusica() {
        System.out.println("Música selecionada, iniciando processo para tocar a música...");
        tocarMusica();
    }

    @Override
    public void ligar() {
        System.out.println("Ligando para o contato selecionado.");
    }
    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
        System.out.println("Chamado atendida com sucesso!");
    }
    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando contato com o correio de voz...");
        System.out.println("Contato iniciado com o correio de voz.");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página atual do navegador.");
    }
    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba aberta com sucesso!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada com sucesso!");
    }
}
