/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package actions;

/**
 *
 * @author Nitin
 */
public class MyBean
{
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyBean(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public MyBean() {
    }


}
