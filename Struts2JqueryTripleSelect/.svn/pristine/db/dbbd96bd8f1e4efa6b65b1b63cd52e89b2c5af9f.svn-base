/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import com.opensymphony.xwork2.ActionSupport;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author XCoder
 */
public class FillListsAction extends ActionSupport {

    private Map<Integer, String> lstcountry;
    private Map<Integer, String> lststate;
    private Map<Integer, String> lstcity;
    private Integer idcountry;
    private Integer idstate;

    public Integer getIdstate() {
        return idstate;
    }

    public void setIdstate(Integer idstate) {
        this.idstate = idstate;
    }

    public Map<Integer, String> getLstcity() {
        return lstcity;
    }

    public void setLstcity(Map<Integer, String> lstcity) {
        this.lstcity = lstcity;
    }

    public Map<Integer, String> getLststate() {
        return lststate;
    }

    public void setLststate(Map<Integer, String> lststate) {
        this.lststate = lststate;
    }

    public Integer getIdcountry() {
        return idcountry;
    }

    public void setIdcountry(Integer idcountry) {
        this.idcountry = idcountry;
    }

    public Map<Integer, String> getLstcountry() {
        return lstcountry;
    }

    public void setLstcountry(Map<Integer, String> lstcountry) {
        this.lstcountry = lstcountry;
    }

    public String genLstCountry() {
        lstcountry = new HashMap<Integer, String>();
        lstcountry.put(1, "IN");
        lstcountry.put(2, "US");
        lstcountry.put(3, "AU");
        return SUCCESS;
    }

    public String genLstState() {
        lststate = new HashMap<Integer, String>();
        if (idcountry == null || idcountry.intValue() == -1) {
            return SUCCESS;
        }
        if (idcountry.intValue() == 1) {
            lststate.put(11, "MP");
            lststate.put(12, "UP");
            lststate.put(13, "AP");
        } else if (idcountry.intValue() == 2) {
            lststate.put(21, "US state 1");
            lststate.put(22, "US state 2");
            lststate.put(23, "US state 3");
        } else if (idcountry.intValue() == 3) {
            lststate.put(31, "AU state 1");
            lststate.put(32, "AU state 2");
            lststate.put(33, "AU state 3");
        }
        return SUCCESS;
    }

    public String genLstCity() {
        lstcity = new HashMap<Integer, String>();
        if (idstate == null || idstate.intValue() == -1) {
            return SUCCESS;
        }
        if (idstate.intValue() == 11) {
            lstcity.put(111, "MP city 1");
            lstcity.put(112, "MP city 2");
        } else if (idstate.intValue() == 12) {
            lstcity.put(121, "UP city 1");
            lstcity.put(122, "UP city 2");
        } else if (idstate.intValue() == 13) {
            lstcity.put(131, "AP city 1");
            lstcity.put(132, "AP city 2");
        } else if (idstate.intValue() == 21) {
            lstcity.put(211, "US State 1  city 1");
            lstcity.put(212, "US State 1  city 2");
        } else if (idstate.intValue() == 22) {
            lstcity.put(221, "US State 2  city 1");
            lstcity.put(222, "US State 2  city 2");
        } else if (idstate.intValue() == 23) {
            lstcity.put(231, "US State 3  city 1");
            lstcity.put(232, "US State 3  city 2");
        } else if (idstate.intValue() == 31) {
            lstcity.put(311, "AU State 1  city 1");
            lstcity.put(312, "AU State 1  city 2");
        } else if (idstate.intValue() == 32) {
            lstcity.put(321, "AU State 2  city 1");
            lstcity.put(322, "AU State 2  city 2");
        } else if (idstate.intValue() == 33) {
            lstcity.put(331, "AU State 3  city 1");
            lstcity.put(332, "AU State 3  city 2");
        }
        return SUCCESS;
    }
}
