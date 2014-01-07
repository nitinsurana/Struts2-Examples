/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import com.opensymphony.xwork2.ActionSupport;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class MyAction extends ActionSupport {

    public static final Logger LOG = Logger.getLogger(MyAction.class.getName());
    private String id, name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String view() {
        id = "11";
        name = "test-11";
        return SUCCESS;
    }

    public String save() {
        System.out.println(id);
        System.out.println(name);
        return SUCCESS;
    }
}
