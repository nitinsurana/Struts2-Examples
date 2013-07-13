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
public class NAction extends ActionSupport {

    private String echo;

    public String getEcho() {
        return echo;
    }

    public void setEcho(String echo) {
        this.echo = echo;
    }
}
