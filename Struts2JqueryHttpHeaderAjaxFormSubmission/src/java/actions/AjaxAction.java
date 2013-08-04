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
public class AjaxAction extends ActionSupport {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String execute() {
        System.out.println("Action Called : " + name);
//        if(((Math.random())*10)%2==0){
//            return SUCCESS;
//        }else{
//            return ERROR;
//        }
        return SUCCESS;
    }

    public String submitExpertForm() {
        System.out.println("expert form submit : " + name);
        return SUCCESS;
    }

    public String getAjaxForm() {
        System.out.println("get Ajax Form : " + name);
        return SUCCESS;
    }
}
