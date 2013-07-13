
import java.io.Serializable;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nitin
 */
public class NBean implements Serializable
{

    private String you;
    private String bot;

    public String getBot() {
        return bot;
    }

    public void setBot(String bot) {
        this.bot = bot;
    }

    public String getYou() {
        return you;
    }

    public void setYou(String you) {
        this.you = you;
    }

    public NBean(String you, String bot) {
        this.you = you;
        this.bot = bot;
    }


}
