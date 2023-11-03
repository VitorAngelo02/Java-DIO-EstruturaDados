package com.projeto.projetofila;

public class Fila<T> {
    private No<T> refNoEntradaFila;


    public Fila(){        
        this.refNoEntradaFila = null;
    }

    public boolean isEmpty(){
        return this.refNoEntradaFila == null ? true : false;
    }

    public T first(){
        if(!this.isEmpty()){
            No primeiroNo = refNoEntradaFila;
            while(true){
                if(primeiroNo.getRefNo() == null){
                    return (T) primeiroNo.getObject();
                } else {
                    primeiroNo = primeiroNo.getRefNo();
                }                
            }
        }
    return null;
    } 

    public No teste(){
        No primeiroNo = new No();
        primeiroNo.setObject(first());
        return primeiroNo;
    }

    public T dequeue(){
        if(!this.isEmpty()){
            No primeiroNo = refNoEntradaFila;
            No noAuxiliar = refNoEntradaFila;
            while(true){
                if(primeiroNo.getRefNo() != null){
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNo();
                } else {
                    noAuxiliar.setRefNo(null);
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    public void enqueue(T object){
        No novoNo = new No(object);
        novoNo.setRefNo(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No noAuxiliar = refNoEntradaFila;
        if(!this.isEmpty()){
            while(true){
                stringRetorno += "[No{objeto=" + noAuxiliar.getObject() + "}]--->";
                if(noAuxiliar.getRefNo() != null){
                    noAuxiliar = noAuxiliar.getRefNo();
                } else {
                    stringRetorno += "null";
                    break;
                }
            }
        }
        return stringRetorno;
    }
}