package model.services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T>{

    // T: permite instanciar vários tipos de PrintService, garantindo a segurança de tipos.
    private List<T> list = new ArrayList<>();

    public void addValor(T valor){
        list.add(valor);
    }

    public T primeiro(){
        if(list.isEmpty()){
            throw new IllegalStateException("Lista está vazia!");
        }
        return list.get(0);
    }

    public void print(){
        System.out.print("[");
        if(!list.isEmpty()){
            System.out.print(list.get(0));
        }
        for(int i=1; i<list.size(); i++){
            System.out.print(", " + list.get(i));
        }
        System.out.println("]");
    }
}
