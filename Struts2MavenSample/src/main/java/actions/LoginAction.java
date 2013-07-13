/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import com.opensymphony.xwork2.ActionSupport;
import models.User;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *
 * @author hp
 */
public class LoginAction extends ActionSupport {

    private User uu;
//    private String email,passwd;

    public User getUu() {
        return uu;
    }

    public void setUu(User uu) {
        this.uu = uu;
    }

    public String login() {
        System.out.println(ToStringBuilder.reflectionToString(uu, ToStringStyle.SHORT_PREFIX_STYLE));
        if (uu.getEmail().equals("email")) {
            addActionError("Invalid Login");
//            addFieldError(NONE, SUCCESS);
            return INPUT;
        }
        addActionMessage("Login is Successful!");
        return SUCCESS;
    }
}
