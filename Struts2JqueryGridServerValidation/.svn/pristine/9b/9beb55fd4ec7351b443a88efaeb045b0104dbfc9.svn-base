/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author XCoder
 */
public class DAO extends ActionSupport {

    private static List<UserBean> lst;

    public static List<UserBean> buildList() {
        lst = (List<UserBean>) ActionContext.getContext().getSession().get("list");
        if (lst != null) {
            return lst;
        }
        lst = new ArrayList<UserBean>();
        for (int i = 0; i < 10; i++) {
            UserBean temp = new UserBean();
            temp.setIduser(i);
            temp.setPasswd("passwd " + i);
            temp.setUname("uname " + i);
            lst.add(temp);
        }
        ActionContext.getContext().getSession().put("list", lst);
        return lst;
    }

    public static int count() {
        return lst.size();
    }

    public static List<UserBean> find(int from, int to) {
        return lst.subList(from, to);
    }
}
