/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author XCoder
 */
public class MyAction extends ActionSupport {

    private String elm1;
    private String nn;

    public String getNn() {
        return nn;
    }

    public void setNn(String nn) {
        this.nn = nn;
    }

    public String getElm1() {
        return elm1;
    }

    public void setElm1(String elm1) {
        this.elm1 = elm1;
    }

    public String execute() {
        System.out.println(elm1);
        nn = elm1;
        return SUCCESS;
    }
}
