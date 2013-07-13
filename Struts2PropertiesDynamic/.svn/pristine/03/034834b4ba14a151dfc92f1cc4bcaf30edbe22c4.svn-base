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
public class MyAction extends ActionSupport {

    private String myschool;

    public String getMyschool() {
        return myschool;
    }

    public void setMyschool(String myschool) {
        this.myschool = myschool;
    }

    public String execute() {
        System.out.println(getText("schoolname") + " first");
        myschool = "Kendriya Vidyalaya";
        System.out.println(getText("schoolname") + " first");
        return SUCCESS;
    }

    public String second() {
        System.out.println(getText("schoolname") + " first");
        return SUCCESS;
    }

    public String third() {
        return SUCCESS;
    }
}
