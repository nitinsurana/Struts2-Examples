/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import com.opensymphony.xwork2.ActionSupport;
import java.util.List;

/**
 *
 * @author hp
 */
public class OrderAction extends ActionSupport {

    private List<Order> lst;
    private String idorder;
    private Order order;

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public String getIdorder() {
        return idorder;
    }

    public void setIdorder(String idorder) {
        this.idorder = idorder;
    }

    public List<Order> getLst() {
        return lst;
    }

    public void setLst(List<Order> lst) {
        this.lst = lst;
    }

    public String save() {
//        System.out.println("Order to Save : " + order);
        if (order.getIdorder() == null) {
            addActionMessage("Order saved successfully");
        } else {
            addActionMessage("Order updated successfully");
        }
        new OrdersService().save(order);
        return SUCCESS;
    }

    @Override
    public String execute() {
        System.out.println("Action Never Executed");
        lst = new OrdersService().getAll();
        return SUCCESS;
    }

    public String edit() {
        order = new OrdersService().get(idorder);
        if (order == null) {
            addActionError("Order not found");
            return INPUT;
        }
        return SUCCESS;
    }

    public String del() {
        if (new OrdersService().get(idorder) == null) {
            addActionError("Order not found");
//            return INPUT;
        } else {
            new OrdersService().remove(idorder);
            addActionMessage("Order deleted successfully");
        }
        return SUCCESS;
    }
}
