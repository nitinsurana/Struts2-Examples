/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package actions;

import com.opensymphony.xwork2.conversion.TypeConversionException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import org.apache.struts2.util.StrutsTypeConverter;

/**
 *
 * @author Nitin
 */
public class DateConverter extends StrutsTypeConverter {

   public Object convertFromString(Map context, String[] values, Class toClass) {
        if (values != null && values.length > 0 && values[0] != null && values[0].length() > 0) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
            try {
                return sdf.parse(values[0]);
            }
            catch(ParseException e) {
                throw new TypeConversionException(e);
            }
        }
        return null;
    }
    public String convertToString(Map context, Object o) {
        if (o instanceof Date) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            return sdf.format((Date)o);
        }
        return "";
    }
}
