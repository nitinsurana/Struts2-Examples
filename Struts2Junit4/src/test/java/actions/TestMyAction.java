/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import com.opensymphony.xwork2.ActionProxy;
import java.util.logging.Logger;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.struts2.StrutsJUnit4TestCase;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author hp
 */
public class TestMyAction extends StrutsJUnit4TestCase<Object> {

    public static final Logger LOG = Logger.getLogger(TestMyAction.class.getName());

    @Test
    public void testView() throws Exception {
        ActionProxy proxy = getActionProxy("/view");
//        actions.MyAction myAct = (actions.MyAction) proxy.getAction();
        String result = proxy.execute();
        assertEquals("success", result);

//        System.out.println(ToStringBuilder.reflectionToString(response));
        System.out.println(response.getContentAsString());
//        request.setParameter("id", "1");
//        request.setParameter("name", "Test Desc");
    }

    @Test
    public void testSave() throws Exception {
//        request.setParameter("id", "1");
//        request.setParameter("name", "Test Desc");

        request.setContent("{\"id\":\"1\",\"name\":\"nitin\"}".getBytes());
//        request.setContentType("application/json");
        request.addHeader("Content-Type", "application/json");
//        request.setContent("{id:1,name:nitin}".getBytes());
        request.setMethod("POST");
//        request.set

        ActionProxy proxy = getActionProxy("/save");
        actions.MyAction myAct = (actions.MyAction) proxy.getAction();

        String result = proxy.execute();

        System.out.println("test id : " + myAct.getId());
        System.out.println("test name : " + myAct.getName());

        assertEquals("success", result);

//        System.out.println(ToStringBuilder.reflectionToString(response));
        System.out.println(response.getContentAsString());
    }
}
