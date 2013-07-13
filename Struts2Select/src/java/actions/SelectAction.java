/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author XCoder
 */
public class SelectAction extends ActionSupport {

    private List<String> lstOne;

    public List<String> getLstOne() {
        return lstOne;
    }

    public void setLstOne(List<String> lstOne) {
        this.lstOne = lstOne;
    }

    public String execute() {
        lstOne = new ArrayList<String>();
        lstOne.add("one");
        lstOne.add("two");
        lstOne.add("three");
        lstOne.add("four");
        return SUCCESS;
    }
}
