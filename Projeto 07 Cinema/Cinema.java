import java.util.ArrayList;

public class Cinema{

    private ArrayList<Cliente> cliente;

    public Cinema(int size){

        this.cliente = new ArrayList<Cliente>();

        for(int i = 0; i < size; i++){
            cliente.add(null);
        }    
    }

    public void reservar(String id, String fone, int indice){
        if(indice < 0 || indice >= cliente.size()){
            System.out.println("Assento indisponível.");
            return;
        }
        if(cliente.get(indice) == null){
            cliente.set(indice, new Cliente(id + ":", fone));
        }else
            System.out.println("Este assento já está ocupado.");

    }

    public boolean cancelar(int indice){
        if(indice < 0 || indice >= cliente.size()){
            System.out.println("Assento indisponível.");
            return false;
        }
        if(cliente.get(indice) != null){
            System.out.println("Reserva cancelada.");
            cliente.set(indice ,null);
            return true;
        }else
            System.out.println("Não está na sala.");
            return false;
    }

    public String toString(){  
        String saida = "[ ";
        for(Cliente pessoa : cliente){ // método mais simples explicado em aula.
            if(pessoa == null){
                saida += "- ";
            }else
                saida += pessoa + " ";
        }
        /* 
        for(int i = 0; i < cliente.size(); i++){
            if(this.cliente.get(i) == null){
                saida += "- ";
            }else
                saida += cliente.get(i).getId()+ cliente.get(i).getFone() + " ";
        }
        */
        saida += "]";
        return saida;
    }

}