/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import beans.User;
import com.opensymphony.xwork2.ActionSupport;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class MyAction extends ActionSupport {

    public static final Logger LOG = Logger.getLogger(MyAction.class.getName());
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String execute() {
        System.out.println(user);
        if (user != null) {
            System.out.println(user.getName());
            System.out.println(user.getAge());
        }
        return SUCCESS;
    }
}
