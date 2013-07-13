
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

public class NAction extends ActionSupport {
    ArrayList<NBean> lstNBean;
    private NBean nbean=new NBean();

    public String execute() {
//        nbean.setInst1("inst 1 value");
        ArrayList<NBean> temp=new ArrayList<NBean>();
        temp.add(new NBean());
//        temp.add(new NBean());
//        temp.add(new NBean());
        temp.add(new NBean(2, "Admission", "01", 24.2));
        temp.add(new NBean(1, "Tuition", "02", 40.00));
        lstString.add("1");
        lstString.add("2");
        lstString.add("3");
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

    private ArrayList<String> lstString=new ArrayList<String>();

    public ArrayList<String> getLstString() {
        return lstString;
    }

    public void setLstString(ArrayList<String> lstString) {
        this.lstString = lstString;
    }

}
