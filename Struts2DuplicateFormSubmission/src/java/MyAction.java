
import com.opensymphony.xwork2.ActionSupport;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nitin
 */
public class MyAction extends ActionSupport {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String execute() {
        System.out.println("form submitted : " + name);
        return SUCCESS;
    }
}
