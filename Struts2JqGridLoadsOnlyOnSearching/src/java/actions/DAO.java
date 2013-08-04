/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nitin
 */
public class DAO {

    static List<MyBean> lst;
    static List<MyBean> MyList=new ArrayList<MyBean>();

    static {
        lst = new ArrayList<MyBean>();
        for (int i = 0; i < 1000; i++) {
            lst.add(new MyBean(i, "Nitin : " + i));
        }
    }

    public static int count() {
        return MyList.size();
    }

    public static List<MyBean> find(int from, int to) {
        return MyList.subList(from, to);
    }

    public static List<MyBean> findByName(String searchString) {
        MyList = new ArrayList<MyBean>();
        if(lst==null){
            System.out.println("got the errror lst is still null");
        }
        for (MyBean b : lst) {
            if (b.getName().toLowerCase().contains(searchString.toLowerCase())) {
                MyList.add(b);
            }
        }
        return MyList;
    }
}
