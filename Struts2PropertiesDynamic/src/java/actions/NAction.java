/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author Harsh
 */
public class NAction extends ActionSupport {

    public String execute() {
        System.out.println(getText("schoolname") + "secondactionexecute");
        return SUCCESS;
    }
}
