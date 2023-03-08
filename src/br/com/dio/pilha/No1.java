package br.com.dio.pilha;

public class No1 {
    private int dado;
    private No1 reNo = null;

    public No1(int dado) {
        this.dado = dado;
    }

    public No1() {
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public No1 getReNo() {
        return reNo;
    }

    public void setReNo(No1 reNo) {
        this.reNo = reNo;
    }

    @Override
    public String toString() {
        return "No1{" +
                "dado=" + dado +
                '}';
    }
}
