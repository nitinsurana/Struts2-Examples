
import com.opensymphony.xwork2.ActionSupport;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import org.apache.struts2.ServletActionContext;

public class DownloadAction extends ActionSupport {

    private InputStream inputStream;

    public InputStream getInputStream() {
        return inputStream;
    }

    public void setInputStream(InputStream inputStream) {
        this.inputStream = inputStream;
    }

    public String execute() throws FileNotFoundException {
        String filePath = ServletActionContext.getServletContext().getRealPath("/uploads");
        File f=new File(filePath+"/nn.pdf");
        System.out.println(f.exists());
        inputStream = new FileInputStream(f);
        return SUCCESS;
    }
}
