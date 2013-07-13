/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

/**
 *
 * @author Nitin
 */
import com.opensymphony.xwork2.ActionSupport;

public class HelloWorld extends ActionSupport {

    private String message;

    public String getMessage() {
        return message;
    }

    @Override
    public String execute() {
        message = "Hello World!";
//        return SUCCESS;
        return "success";
    }
}
