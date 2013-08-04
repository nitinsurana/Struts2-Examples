package actions;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nitin
 */
public class dao {

    static List<MyBean> lstBean;

    public static List<MyBean> getLstbean() {
        lstBean = new ArrayList<MyBean>();

        for (int i = 0; i < 14; i++) {
            MyBean temp = new MyBean(i, "nitin idiot " + i);
            lstBean.add(temp);
        }
        return lstBean;
    }

    public static int count() {
        return lstBean.size();
    }

    public static List<MyBean> find(int from, int to) {
        return lstBean.subList(from, to);
    }
}
