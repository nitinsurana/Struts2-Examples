
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
public class NAction extends ActionSupport {

    private ArrayList<String> lstString = new ArrayList<String>();
    ArrayList<NBean> lstNBean;
    private NBean nbean = new NBean();
    private ArrayList<ListBean> lstBean = new ArrayList<ListBean>();

    public List<ListBean> getLstBean() {
        return lstBean;
    }

    public void setLstBean(ArrayList<ListBean> lstBean) {
        this.lstBean = lstBean;
    }

    public String execute() {
        ArrayList<NBean> temp = new ArrayList<NBean>();
        temp.add(new NBean());
        temp.add(new NBean(2, "Admission", "01", 24.2));
        temp.add(new NBean(1, "Tuition", "02", 40.00));
        lstString.add("1");
        lstString.add("2");
        lstString.add("3");

        lstBean.add(new ListBean(1, 10.1, "name1", lstString));
        ArrayList<String> temp1=new ArrayList<String>(lstString);
        temp1.add("5");
        lstBean.add(new ListBean(1, 10.1, "name2", temp1));
        ArrayList<String> temp2=new ArrayList<String>(lstString);
        temp2.add("6");
        lstBean.add(new ListBean(1, 10.1, "name3", temp2));

        setLstNBean(temp);
        return SUCCESS;
    }

    public NBean getNbean() {
        return nbean;
    }

    public void setNbean(NBean nbean) {
        this.nbean = nbean;
    }

    public ArrayList<NBean> getLstNBean() {
        return lstNBean;
    }

    public void setLstNBean(ArrayList<NBean> mapNBean) {
        this.lstNBean = mapNBean;
    }

    public ArrayList<String> getLstString() {
        return lstString;
    }

    public void setLstString(ArrayList<String> lstString) {
        this.lstString = lstString;
    }
}
