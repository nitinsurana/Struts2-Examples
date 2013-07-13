/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

/**
 *
 * @author XCoder
 */
@Results({
@Result(location="/index.jsp")
})
public class NAction extends ActionSupport{
    //Since I haven't specified the action name here, so by default
    // the action word in class name will be dropped and the
    // rest part will be changed into camel case and that becomes
    // the action and hence the action name is n

    //Moreover just for the sake of remembrance, if we use annotations
    // then we have to specify a init-param for the FilterDispatcher
    // i.e. struts2 filter, named actionPackages, whose
    //value is the name of the packages that will be scanned for containing
    //annotations.

    //Moreover, struts2.2.3 core libraries doesn't contain the annotations
    //facility, it is contained with the convetion-plugin-2.2.3.jar


    //Moreover, this class is contained with actions package, so by default
    //the package for struts.xml url mapping becomes /actions
    //Although it can also be directly referenced, as we already know
    //it is specified in the servlets specification.
}
