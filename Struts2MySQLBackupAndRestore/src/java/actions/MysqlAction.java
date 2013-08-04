/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletContext;
import org.apache.struts2.ServletActionContext;

/**
 *
 * @author Harsh
 */
public class MysqlAction extends ActionSupport {

    public static void main(String[] args) {
        new MysqlAction().backup();
    }
//            List<String> templst = new ArrayList<String>();
//            templst.add("cmd");
//            templst.add("/c");
//            templst.add("start");
//            templst.add("/b");
//            templst.add(path + "\\backup.bat");
//            templst.add(path);
//            rt.exec(templst.toArray(new String[]{}));

    public String backup() {
        try {
            String path = ServletActionContext.getServletContext().getRealPath("\\uploads");
//            path = path.replace('\\', '/');
            System.out.println(path);
            Runtime rt = Runtime.getRuntime();
            rt.exec("cmd /c \" " + path + "\\backup.bat " + path + "\"");
        } catch (IOException ex) {
            Logger.getLogger(MysqlAction.class.getName()).log(Level.SEVERE, null, ex);
            addActionError("Unable to take backup, try again later and if the problem persists contact the Administrator");
            return ERROR;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        addActionMessage("Backup taken successfully");
        return SUCCESS;
    }

    public String restore() {
        try {
            String path = ServletActionContext.getServletContext().getRealPath("/uploads");
            path = path.replace('\\', '/');
            Runtime rt = Runtime.getRuntime();
            rt.exec("cmd /c start /b " + path + "/restore.bat " + path);
        } catch (IOException ex) {
            Logger.getLogger(MysqlAction.class.getName()).log(Level.SEVERE, null, ex);
            addActionError("Unable to restore database, try again later and if the problem persists contact the Administrator");
            return ERROR;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        addActionMessage("Database restored successfully");
        return SUCCESS;
    }
}
