/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import com.opensymphony.xwork2.conversion.TypeConversionException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import org.apache.struts2.util.StrutsTypeConverter;

/**
 * This class converts date to/from normal string representating date
 * @author Nitin
 */
public class DateConverter extends StrutsTypeConverter {

    /**
     * This method creates a Date from a String
     * @param context
     * @param values
     * @param toClass
     * @return
     */
    @Override
    public Object convertFromString(Map context, String[] values, Class toClass) {
        if (values != null && values.length > 0 && values[0] != null && values[0].length() > 0) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss");
            try {
                return sdf.parse(values[0]);
            } catch (ParseException e) {
                System.out.println(e);
                throw new TypeConversionException(e);
            }
        }
        return null;
    }

    /**
     * This method creates a String representation of a Date
     * @param context
     * @param o
     * @return
     */
    @Override
    public String convertToString(Map context, Object o) {
        if (o instanceof Date) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
            return sdf.format((Date) o);
        }
        return "";
    }
}
