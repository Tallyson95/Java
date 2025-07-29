package entities;
import java.util.Date;

public class Pedido {
    private Date momento;

    public Pedido(){
    }

    public Pedido(Date momento){
        this.momento = momento;
    }

    public Date getMomento(){
        return this.momento;
    }

}
