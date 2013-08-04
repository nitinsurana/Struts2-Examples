
import com.opensymphony.xwork2.ActionContext;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nitin
 */
public class KeywordDAO {

    static List<KeywordModel> lstKeywordModel;

    public static List<KeywordModel> getLstKeywordModel() {
        lstKeywordModel = new ArrayList<KeywordModel>();
        for (int i = 1; i < 25; i++) {
            lstKeywordModel.add(new KeywordModel(i, "Data " + i));
        }
        return lstKeywordModel;
    }

    public static int count() {
        return lstKeywordModel.size();
    }

    public static List<KeywordModel> find(int from, int to) {
        return lstKeywordModel.subList(from, to);
    }
}
