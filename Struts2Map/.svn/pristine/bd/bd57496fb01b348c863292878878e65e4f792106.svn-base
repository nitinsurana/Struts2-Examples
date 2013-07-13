
import com.opensymphony.xwork2.ActionSupport;
import java.util.HashMap;
import java.util.Map;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**

 * @author Nitin
 */
public class MyAction extends ActionSupport {

    private Map<Integer, String> nmap = new HashMap<Integer, String>();
    private Integer idmap;

    public Integer getIdmap() {
        return idmap;
    }

    public void setIdmap(Integer idmap) {
        this.idmap = idmap;
    }

    public String startIt() {
        for (int i = 0; i < 10; i++) {
            nmap.put(i, "Niaasdf " + i);
        }
        System.out.println(nmap.size());
        System.out.println("m out of startIt");
        return SUCCESS;
    }

    public String save() {
        System.out.println("m in save : " + idmap);
        return SUCCESS;
    }

    public Map<Integer, String> getNmap() {
        return nmap;
    }

    public void setNmap(Map<Integer, String> nmap) {
        this.nmap = nmap;
    }
}
