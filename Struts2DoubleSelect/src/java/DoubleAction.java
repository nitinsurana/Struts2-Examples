
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Nitin
 */
public class DoubleAction extends ActionSupport {

    private List<BeanFirst> lstFirst = new ArrayList<BeanFirst>();

    public String execute() {
        List<BeanSecond> lstSecond = new ArrayList<BeanSecond>();
        lstSecond.add(new BeanSecond(1, "sec1"));
        lstSecond.add(new BeanSecond(2, "sec2"));

        List<BeanSecond> lstSecond2 = new ArrayList<BeanSecond>();
        lstSecond2.add(new BeanSecond(3, "sec3"));
        lstSecond2.add(new BeanSecond(4, "sec4"));


        BeanFirst f1 = new BeanFirst(1, "name1", lstSecond);
        BeanFirst f2 = new BeanFirst(22, "name2", lstSecond2);
        lstFirst.add(f1);
        lstFirst.add(f2);

        return SUCCESS;
    }

    public List<BeanFirst> getLstFirst() {
        return lstFirst;
    }

    public void setLstFirst(List<BeanFirst> lstFirst) {
        this.lstFirst = lstFirst;
    }
    private String idfirst;
    private String idsecond;

    public String getIdfirst() {
        return idfirst;
    }

    public void setIdfirst(String idfirst) {
        this.idfirst = idfirst;
    }

    public String getIdsecond() {
        return idsecond;
    }

    public void setIdsecond(String idsecond) {
        this.idsecond = idsecond;
    }

    public String save() {
        return SUCCESS;
    }
}
