/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import com.opensymphony.xwork2.ActionSupport;
import dao.DataService;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.*;
import javax.servlet.http.Cookie;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author Nitin
 */
public class IndexAction extends ActionSupport {

    public static final Logger log = Logger.getLogger(IndexAction.class.getName());
    private String email, passwd;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String logout() {
        ServletActionContext.getContext().getSession().clear();
        addActionMessage("Logout Successfully");
        return SUCCESS;
    }

    public String login() {
        try {
            if (email.equalsIgnoreCase(passwd)) {

                System.out.println("Putting in Database");
                DataService.map.put("iduser", getMD5(email));

                Cookie cookie = new Cookie("remember_me", getMD5(email));
                cookie.setMaxAge(7 * 24 * 60 * 60);
                ServletActionContext.getResponse().addCookie(cookie);
                System.out.println("Putting in Response remember_me cookie");

                ServletActionContext.getContext().getSession().put("iduser", cookie.getValue());
                System.out.println("Putting in Session");

                return SUCCESS;
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        addActionError("Unable to login");
        return INPUT;
    }
    static int count = 4;

    private String getMD5(String input) {
        try {
            MessageDigest m = MessageDigest.getInstance("MD5");
            m.reset();
            m.update(input.getBytes());
            byte[] digest = m.digest();
            BigInteger bigInt = new BigInteger(1, digest);
            String hashtext = bigInt.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        } catch (Exception ex) {
            Logger.getLogger(IndexAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public String execute() {
        if (ServletActionContext.getContext().getSession().get("iduser") != null) {
            System.out.println("Already Session Logged In");
            return SUCCESS;
        } else {
            for (Cookie cookie : ServletActionContext.getRequest().getCookies()) {
                System.out.println(cookie.getName() + "   " + cookie.getValue());

                if (cookie.getName().equalsIgnoreCase("remember_me")) {
                    System.out.println("Cookie Found");
                    if (DataService.map.get("iduser") != null && DataService.map.get("iduser").equalsIgnoreCase(cookie.getValue())) {
                        System.out.println("Remembered you Bro");

                        Cookie c = new Cookie("remember_me", cookie.getValue() + count++);
                        c.setMaxAge(7 * 24 * 60 * 60);
                        ServletActionContext.getResponse().addCookie(c);
                        System.out.println("Created & Added a new cookie to Response");

                        System.out.println("Adding the new cookie to session");
                        ServletActionContext.getContext().getSession().put("iduser", cookie.getValue());
                        DataService.map.put("iduser", c.getValue());

                        return SUCCESS;
                    }
                    break;
                }
            }
        }
        return INPUT;
    }
}
