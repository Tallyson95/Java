package entities.classes;

import entities.enums.OrderStatus;

import java.util.Date;

public class Order {
    private Integer id;
    private Date moment;
    private OrderStatus status;



    public Order(Integer id, Date moment, OrderStatus status){
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    public Integer getId(){
        return this.id;
    }

    public Date getMoment(){
        return this.moment;
    }

    public OrderStatus getStatus(){
        return this.status;
    }

    public void setStatus(OrderStatus status){
        this.status = status;
    }

    public String toString(){
        return "Id " + this.id + ", horário: " + this.moment + ", status: " + this.status + ".";
    }
}
