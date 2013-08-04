
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Harsh
 */
public class DAO {

    static List<Bean> lst;

    public static List<Bean> getLstBean() {
        lst = new ArrayList<Bean>();
        for (int i = 0; i < 100; i++) {
            Bean temp = new Bean();
            temp.setName("name " + i);
            temp.setId(i);
            lst.add(temp);
        }
        return lst;
    }

    public static int count() {
        return lst.size();
    }

    public static List<Bean> find(int from, int to) {
        return lst.subList(from, to);
    }

    public static List<Bean> findbyName(String searchString) {
        List<Bean> temp = new ArrayList<Bean>();
        for (Bean b : lst) {
            if (b.getName().toLowerCase().contains(searchString)) {
                temp.add(b);
            }
        }
        lst = temp;
        return lst;
    }
}
