
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MyAction extends ActionSupport {

    private List<NBean> messagesWord = new ArrayList<NBean>();
    private List<NBean> messagesExcel = new ArrayList<NBean>();
    private List<NBean> messagesPowerpoint = new ArrayList<NBean>();
    private String msg;

    public List<NBean> getMessagesWord() {
        return messagesWord;
    }

    public void setMessagesWord(List<NBean> messagesWord) {
        this.messagesWord = messagesWord;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String executePowerpoint() throws Exception {
        System.out.println("first action called : " + msg);
        Map session = ActionContext.getContext().getSession();

//        session.put("pic", "uploads/desert.jpg");
        if (session.containsKey("messagesPowerpoint")) {
            System.out.println("in if");
            messagesPowerpoint = (List<NBean>) session.get("messagesPowerpoint");
//            messagesPowerpoint.add(new NBean(msg.toUpperCase(), Chatterbot10.get_input(msg)));
            messagesPowerpoint.add(new NBean(msg.toUpperCase(), NBot.get_input(msg)));

            session.put("pic", "uploads/" + NBot.getPicLocation());
            System.out.println("pic location founded is " + NBot.getPicLocation());

            System.out.println(messagesPowerpoint.size());
            if (messagesPowerpoint.size() > 5) {
                messagesPowerpoint = messagesPowerpoint.subList(1, 6);
            }
            System.out.println(messagesPowerpoint.size());
            session.put("messagesPowerpoint", messagesPowerpoint);
        } else {
            System.out.println(" in else ");
            session.put("messagesPowerpoint", messagesPowerpoint);
//            messagesPowerpoint.add(new NBean(msg.toUpperCase(), Chatterbot10.get_input(msg)));
            messagesPowerpoint.add(new NBean(msg.toUpperCase(), NBot.get_input(msg)));

            session.put("pic", "uploads/" + NBot.getPicLocation());
            System.out.println("pic location founded is " + NBot.getPicLocation());

            System.out.println(messagesPowerpoint.size());
            if (messagesPowerpoint.size() > 5) {
                messagesPowerpoint = messagesPowerpoint.subList(1, messagesPowerpoint.size());
            }
            System.out.println(messagesPowerpoint.size());
//            messagesPowerpoint.add(new Bean(msg, msg + " by bot "));
        }
        return SUCCESS;
    }

    public String executeExcel() throws Exception {
        System.out.println("first action called : " + msg);
        Map session = ActionContext.getContext().getSession();

//        session.put("pic", "uploads/Tulips.jpg");

        if (session.containsKey("messagesExcel")) {
            System.out.println("in if");
            messagesExcel = (List<NBean>) session.get("messagesExcel");
//            messagesExcel.add(new NBean(msg.toUpperCase(), Chatterbot10.get_input(msg)));
            messagesExcel.add(new NBean(msg.toUpperCase(), NBot.get_input(msg)));

            session.put("pic", "uploads/" + NBot.getPicLocation());
            System.out.println("pic location founded is " + NBot.getPicLocation());

            System.out.println(messagesExcel.size());
            if (messagesExcel.size() > 5) {
                messagesExcel = messagesExcel.subList(1, 6);
            }
            System.out.println(messagesExcel.size());
            session.put("messagesExcel", messagesExcel);
        } else {
            System.out.println(" in else ");
            session.put("messagesExcel", messagesExcel);
//            messagesExcel.add(new NBean(msg.toUpperCase(), Chatterbot10.get_input(msg)));
            messagesExcel.add(new NBean(msg.toUpperCase(), NBot.get_input(msg)));

            session.put("pic", "uploads/" + NBot.getPicLocation());
            System.out.println("pic location founded is " + NBot.getPicLocation());

            System.out.println(messagesExcel.size());
            if (messagesExcel.size() > 5) {
                messagesExcel = messagesExcel.subList(1, messagesExcel.size());
            }
            System.out.println(messagesExcel.size());
//            messagesExcel.add(new Bean(msg, msg + " by bot "));
        }
        return SUCCESS;
    }

    public String executeWord() throws Exception {
        System.out.println("first action called : " + msg);
        Map session = ActionContext.getContext().getSession();

//        session.put("pic", "uploads/Koala.jpg");

        if (session.containsKey("messagesWord")) {
            System.out.println("in if");
            messagesWord = (List<NBean>) session.get("messagesWord");
//            messagesWord.add(new NBean(msg.toUpperCase(), Chatterbot10.get_input(msg)));
            messagesWord.add(new NBean(msg.toUpperCase(), NBot.get_input(msg)));

            session.put("pic", "uploads/" + NBot.getPicLocation());
            System.out.println("pic location founded is " + NBot.getPicLocation());

            System.out.println(messagesWord.size());
            if (messagesWord.size() > 5) {
                messagesWord = messagesWord.subList(1, 6);
            }
            System.out.println(messagesWord.size());

            session.put("messagesWord", messagesWord);
        } else {
            System.out.println(" in else ");
            session.put("messagesWord", messagesWord);
//            messagesWord.add(new NBean(msg.toUpperCase(), Chatterbot10.get_input(msg)));
            messagesWord.add(new NBean(msg.toUpperCase(), NBot.get_input(msg)));

            session.put("pic", "uploads/" + NBot.getPicLocation());
            System.out.println("pic location founded is " + NBot.getPicLocation());

            System.out.println(messagesWord.size());
            if (messagesWord.size() > 5) {
                messagesWord = messagesWord.subList(1, messagesWord.size());
            }
            System.out.println(messagesWord.size());
//            messagesWord.add(new Bean(msg, msg + " by bot "));
        }
        return SUCCESS;
    }
    public String nn;
    public String uname;

    public String saveUser() {
        System.out.println("save user called successfully");
        Map session = ActionContext.getContext().getSession();
        session.put("user", uname);
        session.put("pic", "uploads/desert.jpg");
        System.out.println(session.get("user"));
        return SUCCESS;
    }

    public List<NBean> getMessagesExcel() {
        return messagesExcel;
    }

    public void setMessagesExcel(List<NBean> messagesExcel) {
        this.messagesExcel = messagesExcel;
    }

    public List<NBean> getMessagesPowerpoint() {
        return messagesPowerpoint;
    }

    public void setMessagesPowerpoint(List<NBean> messagesPowerpoint) {
        this.messagesPowerpoint = messagesPowerpoint;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getNn() {
        return nn;
    }

    public void setNn(String nn) {
        this.nn = nn;
    }

    public String execute() {
        Map sess = ActionContext.getContext().getSession();
        setNn((String) sess.get("pic"));
        return SUCCESS;
    }
}
