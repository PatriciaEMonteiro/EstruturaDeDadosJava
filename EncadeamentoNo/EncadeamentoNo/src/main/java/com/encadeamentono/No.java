package com.encadeamentono;

public class No <T>{

    private T conteudoNo;
    private No<T> proximoNo;

    // Constructor das Strings
    public No(T conteudoNo) {
        this.proximoNo = null;
        this.conteudoNo = conteudoNo;
    }

    //Get e Set da String ConteudoNo
    public T getConteudoNo() {
        return conteudoNo;
    }

    public void setConteudoNo(T conteudoNo) {
        this.conteudoNo = conteudoNo;
    }

    //Get e Set da String ProximoNo
    public No<T> getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(No<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    // Metodo ToString
    @Override
    public String toString() {
        return "No{" + "conteudoNo='" + conteudoNo + '\'' +'}';
    }
}
