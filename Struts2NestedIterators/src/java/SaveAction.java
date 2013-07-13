
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
public class SaveAction extends ActionSupport {

    List<NBean> lstNBean = new ArrayList<NBean>();
    private String idgender;
    private NBean nbean = new NBean();

    public String getIdgender() {
        return idgender;
    }

    public void setIdgender(String idgender) {
        this.idgender = idgender;
    }

    public NBean getNbean() {
        return nbean;
    }

    public void setNbean(NBean nbean) {
        this.nbean = nbean;
    }

    public List<NBean> getLstNBean() {
        return lstNBean;
    }

    public void setLstNBean(List<NBean> lstNBean) {
        this.lstNBean = lstNBean;
    }
    private List<ListBean> lstBean = new ArrayList<ListBean>();

    public List<ListBean> getLstBean() {
        return lstBean;
    }

    public void setLstBean(List<ListBean> lstBean) {
        this.lstBean = lstBean;
    }

    public String execute() {
//        System.out.println("Execute started for first form");
//        System.out.println(nbean.getInst1());
//        System.out.println(nbean.getInst2());
//        System.out.println(nbean.getInst3());
//        System.out.println(nbean.getInst4());
//        System.out.println(nbean.getInst5());
//        System.out.println("Execute almost finished for first form");
        System.out.println("size : " + lstBean.size());
        for (ListBean nn : lstBean) {
            System.out.println(nn.getName());
            System.out.println(nn.getAmt());
            System.out.println(nn.getId());
            for (String ss : nn.getLstString()) {
                System.out.println(ss);
            }
        }
//        System.out.println("execute called size of list : " + lstNBean.size());
//        System.out.println(lstString.size());
////        System.out.println(idgender);
//        for(String s:lstString)
//        {
//            System.out.println(s);
//        }

//        for (NBean nn : lstNBean) {
//            System.out.println(nn);
////            System.out.println("nn : " + nn.getInst1());
////            System.out.println(nn.getInst1() + nn.getInst4());
//        }
//        System.out.println("execute finish ");
        return SUCCESS;
    }
}
