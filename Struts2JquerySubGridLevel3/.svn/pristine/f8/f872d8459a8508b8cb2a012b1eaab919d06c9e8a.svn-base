/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import beans.City;
import beans.Country;
import beans.State;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author XCoder
 */
public class DAO extends ActionSupport {

    private List<Country> lstcountry;
    private List<State> lststate;
    private List<City> lstcity;

    public List<Country> genLstCountry() {
        lstcountry = new ArrayList<Country>();
        lstcountry.add(new Country(1, "IN"));
        lstcountry.add(new Country(2, "US"));
        lstcountry.add(new Country(3, "AU"));
        return lstcountry;
    }

    public List<State> genLstState(Integer idcountry) {
        lststate = new ArrayList<State>();
        if (idcountry == null || idcountry.intValue() == -1) {
            return lststate;
        }
        if (idcountry.intValue() == 1) {
            lststate.add(new State(11, "MP"));
            lststate.add(new State(12, "UP"));
            lststate.add(new State(13, "AP"));
        } else if (idcountry.intValue() == 2) {
            lststate.add(new State(21, "US state 1"));
            lststate.add(new State(22, "US state 2"));
            lststate.add(new State(23, "US state 3"));
        } else if (idcountry.intValue() == 3) {
            lststate.add(new State(31, "AU state 1"));
            lststate.add(new State(32, "AU state 2"));
            lststate.add(new State(33, "AU state 3"));
        }
        return lststate;
    }

    public List<City> genLstCity(Integer idstate) {
        lstcity = new ArrayList<City>();
        if (idstate == null || idstate.intValue() == -1) {
            return lstcity;
        }
        if (idstate.intValue() == 11) {
            lstcity.add(new City(111, "MP city 1"));
            lstcity.add(new City(112, "MP city 2"));
        } else if (idstate.intValue() == 12) {
            lstcity.add(new City(121, "UP city 1"));
            lstcity.add(new City(122, "UP city 2"));
        } else if (idstate.intValue() == 13) {
            lstcity.add(new City(131, "AP city 1"));
            lstcity.add(new City(132, "AP city 2"));
        } else if (idstate.intValue() == 21) {
            lstcity.add(new City(211, "US State 1  city 1"));
            lstcity.add(new City(212, "US State 1  city 2"));
        } else if (idstate.intValue() == 22) {
            lstcity.add(new City(221, "US State 2  city 1"));
            lstcity.add(new City(222, "US State 2  city 2"));
        } else if (idstate.intValue() == 23) {
            lstcity.add(new City(231, "US State 3  city 1"));
            lstcity.add(new City(232, "US State 3  city 2"));
        } else if (idstate.intValue() == 31) {
            lstcity.add(new City(311, "AU State 1  city 1"));
            lstcity.add(new City(312, "AU State 1  city 2"));
        } else if (idstate.intValue() == 32) {
            lstcity.add(new City(321, "AU State 2  city 1"));
            lstcity.add(new City(322, "AU State 2  city 2"));
        } else if (idstate.intValue() == 33) {
            lstcity.add(new City(331, "AU State 3  city 1"));
            lstcity.add(new City(332, "AU State 3  city 2"));
        }
        return lstcity;
    }
}
