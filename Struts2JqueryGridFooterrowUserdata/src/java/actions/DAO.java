/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author XCoder
 */
public class DAO {

    private static List<Bean> lst;

    public static List<Bean> getList() {
        lst = new ArrayList<Bean>();

        for (int i = 0; i < 10; i++) {
            Bean b = new Bean();
            b.setId(i*i);
            b.setName("Name " + i);
            lst.add(b);
        }
        return lst;
    }

    public static int count() {
        return lst.size();
    }

    public static List<Bean> find(int from, int to) {
        return lst.subList(from, to);
    }
}
