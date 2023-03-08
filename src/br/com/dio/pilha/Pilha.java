package br.com.dio.pilha;

public class Pilha {
    private No1 refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    public No1 top(){
        return refNoEntradaPilha;
    }

    public void push(No1 novoNo){
      No1 refAuxiliar = refNoEntradaPilha;
      refNoEntradaPilha = novoNo;
      refNoEntradaPilha.setReNo(refAuxiliar);
    }

    public No1 pop(){
        if(!this.isEmpty()){
         No1 noPopped = refNoEntradaPilha;
         refNoEntradaPilha = refNoEntradaPilha.getReNo();
         return noPopped;
        }
        return null;
    }
    public boolean isEmpty(){
        return refNoEntradaPilha == null? true : false;
    }

    @Override
    public String toString() {
    String stringRetorno = "-------------\n";
    stringRetorno += "    Pilha\n";
    stringRetorno += "-------------\n";

    No1 noAuxiliar = refNoEntradaPilha;
    while (true){
      if(noAuxiliar != null){
        stringRetorno += "[No{dado=" + noAuxiliar.getDado() +"}]\n";
        noAuxiliar = noAuxiliar.getReNo();
      }else {
          break;
      }
    }
    stringRetorno += "==============\n";
    return  stringRetorno;
    }
}
