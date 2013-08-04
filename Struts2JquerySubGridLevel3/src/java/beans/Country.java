/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author XCoder
 */
public class Country {

    private String countryname;
    private Integer idcountry;

    public Country(Integer idcountry, String countryname) {
        this.countryname = countryname;
        this.idcountry = idcountry;
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    public Integer getIdcountry() {
        return idcountry;
    }

    public void setIdcountry(Integer idcountry) {
        this.idcountry = idcountry;
    }
}
