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
public class SaveAction extends ActionSupport {

    private Integer idcountry;
    private Integer idstate;
    private Integer idcity;

    public Integer getIdcity() {
        return idcity;
    }

    public void setIdcity(Integer idcity) {
        this.idcity = idcity;
    }

    public Integer getIdcountry() {
        return idcountry;
    }

    public void setIdcountry(Integer idcountry) {
        this.idcountry = idcountry;
    }

    public Integer getIdstate() {
        return idstate;
    }

    public void setIdstate(Integer idstate) {
        this.idstate = idstate;
    }

    public String execute() {
        System.out.println("idcountry : " + idcountry);
        System.out.println("idstate : " + idstate);
        System.out.println("idcity : " + idcity);
        return SUCCESS;
    }
}
