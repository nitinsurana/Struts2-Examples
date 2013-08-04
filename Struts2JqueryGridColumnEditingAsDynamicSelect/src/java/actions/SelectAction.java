/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import com.opensymphony.xwork2.ActionSupport;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author XCoder
 */
public class SelectAction extends ActionSupport {

    private Map<Integer, String> lstcountry;

    public Map<Integer, String> getLstcountry() {
        return lstcountry;
    }

    public void setLstcountry(Map<Integer, String> lstcountry) {
        this.lstcountry = lstcountry;
    }

    public String execute() {
        System.out.println("Populating the select");
        lstcountry = new HashMap<Integer, String>();
        for (int i = 0; i < 10; i++) {
            lstcountry.put(i, "India" + i);
        }
        return SUCCESS;
    }
}
