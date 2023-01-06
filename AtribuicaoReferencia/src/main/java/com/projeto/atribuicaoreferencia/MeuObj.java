package com.projeto.atribuicaoreferencia;

// Para analisar forma de referênciação/atribuições de variaveis na memoria
// Objetos - copiamos o valor de referência na mémoria, mas o objeto em si não é duplicado.

public class MeuObj {
    Integer num;

    public MeuObj(Integer num) {
        this.num = num;
    }

    public void setNum(Integer num){
        this.num = num;
    }

    @Override
    public String toString() {
        return this.num.toString();
    }
}
