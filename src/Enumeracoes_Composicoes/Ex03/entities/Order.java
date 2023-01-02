package Enumeracoes_Composicoes.Ex03.entities;

import Enumeracoes_Composicoes.Ex03.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date moment;
    private OrderStatus orderStatus;

    private Client client;
    private List<OrdemItem> items = new ArrayList<>();


    public Order(Date moment, OrderStatus orderStatus, Client client) {
        this.moment = moment;
        this.orderStatus = orderStatus;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public List<OrdemItem> getItem() {
        return items;
    }

    public void addClient(OrdemItem item) {
        items.add(item);
    }

    public void removeClient(OrdemItem item) {
        items.remove(item);
    }

    public double total (){
        double sum = 0;
        for(OrdemItem item : items){
            sum += item.subTotal();
        }
        return sum;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pedido Feito: ");
        sb.append(sdf.format(moment) + "\n");
        sb.append("Pedido status: ");
        sb.append(orderStatus + "\n");
        sb.append("Cliente: ");
        sb.append(client + "\n");
        sb.append("Pedido items:\n");
        for (OrdemItem item : items) {
            sb.append(item + "\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }
}
