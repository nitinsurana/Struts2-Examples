/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package actions;

import java.io.Serializable;

/**
 *
 * @author XCoder
 */
public class UserBean implements Serializable
{
    private Integer iduser;
    private String uname;
    private String passwd;
    private Integer contact;
    private String country;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getContact() {
        return contact;
    }

    public void setContact(Integer contact) {
        this.contact = contact;
    }

    public Integer getIduser() {
        return iduser;
    }

    public void setIduser(Integer iduser) {
        this.iduser = iduser;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

}
