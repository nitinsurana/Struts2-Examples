/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import com.opensymphony.xwork2.ActionSupport;
import model.MyModel;

/**
 *
 * @author Nitin
 */
public class MyAction extends ActionSupport {

    private MyModel mymodel;

    public MyModel getMymodel() {
        return mymodel;
    }

    public void setMymodel(MyModel mymodel) {
        this.mymodel = mymodel;
    }

    public String save() {
        System.out.println("save");
        System.out.println(mymodel.getName());
        System.out.println(mymodel.getDob());
        return SUCCESS;
    }

    public String show() {
        System.out.println("show");
        return SUCCESS;
    }
}
