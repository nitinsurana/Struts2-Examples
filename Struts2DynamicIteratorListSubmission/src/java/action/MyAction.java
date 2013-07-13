/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author XCoder
 */
public class MyAction extends ActionSupport {

    private List<MyBean> mylist = new ArrayList<MyBean>();

    public String execute() {
        System.out.println("execute method is called");
        mylist.add(new MyBean("a"));
        mylist.add(new MyBean("b"));
        mylist.add(new MyBean("c"));
        return SUCCESS;
    }

    public List<MyBean> getMylist() {
        return mylist;
    }

    public void setMylist(List<MyBean> mylist) {
        this.mylist = mylist;
    }

    public String save() {
        for (MyBean b : mylist) {
            System.out.println(b.getName());
        }
        return SUCCESS;
    }
}
