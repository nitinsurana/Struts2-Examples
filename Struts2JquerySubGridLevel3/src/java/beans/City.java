/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

/**
 *
 * @author XCoder
 */
public class City {

    private String cityname;
    private Integer idcity;

    public City(int i, String string) {
        idcity = i;
        cityname = string;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public Integer getIdcity() {
        return idcity;
    }

    public void setIdcity(Integer idcity) {
        this.idcity = idcity;
    }
}
