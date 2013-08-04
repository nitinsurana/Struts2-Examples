package actions;

import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Harsh
 */
public class MyAction extends ActionSupport {

    private List<String> mylist;
    private List<String> ajaxlist;
    private String myautocmp2;

    public String getMyautocmp2() {
        return myautocmp2;
    }

    public void setMyautocmp2(String myautocmp2) {
        this.myautocmp2 = myautocmp2;
    }

    public List<String> getAjaxlist() {
        return ajaxlist;
    }

    public void setAjaxlist(List<String> ajaxlist) {
        this.ajaxlist = ajaxlist;
    }

    public List<String> getMylist() {
        return mylist;
    }

    public void setMylist(List<String> mylist) {
        this.mylist = mylist;
    }

    public String execute() {
        mylist = new ArrayList<String>();
        mylist.add("Java");
        mylist.add("C++");
        mylist.add("Apple");
        mylist.add("Bat");
        mylist.add("Cat");
        mylist.add("Dog");
        mylist.add("Elephant");
        mylist.add("C");
        mylist.add("Fish");
        return SUCCESS;
    }

    public String ajaxfill() {
        System.out.println("ajax call "+myautocmp2);
        ajaxlist = new ArrayList<String>();
        ajaxlist.add("Java");
        ajaxlist.add("C++");
        ajaxlist.add("Apple");
        ajaxlist.add("Bat");
        ajaxlist.add("Cat");
        ajaxlist.add("Dog");
        ajaxlist.add("Elephant");
        ajaxlist.add("Fish");
        ajaxlist.add("Goat");
        ajaxlist.add("Hen");
        ajaxlist.add("Ink");
        ajaxlist.add("Joker");
        ajaxlist.add("Kite");
        ajaxlist.add("Lotus");
        ajaxlist.add("Monkey");
        return SUCCESS;
    }
}
