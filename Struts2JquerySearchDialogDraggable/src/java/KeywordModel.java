/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Nitin
 */
public class KeywordModel implements Comparable<KeywordModel>{

    private Integer idkeyword;
    private String valuedata;
    private Integer iduser;

    public Integer getIdkeyword() {
        return idkeyword;
    }

    public void setIdkeyword(Integer idkeyword) {
        this.idkeyword = idkeyword;
    }

    public Integer getIduser() {
        return iduser;
    }

    public void setIduser(Integer iduser) {
        this.iduser = iduser;
    }

    public String getValuedata() {
        return valuedata;
    }

    public void setValuedata(String valuedata) {
        this.valuedata = valuedata;
    }

    public KeywordModel(Integer idkeyword, String valuedata, Integer iduser) {
        this.idkeyword = idkeyword;
        this.valuedata = valuedata;
        this.iduser = iduser;
    }

    public KeywordModel(Integer idkeyword, String valuedata) {
        this.idkeyword = idkeyword;
        this.valuedata = valuedata;
    }

    public KeywordModel(String valuedata) {
        this.valuedata = valuedata;
    }

    public KeywordModel() {
    }

    public int compareTo(KeywordModel o) {
        return this.getValuedata().toLowerCase().compareTo(o.getValuedata().toLowerCase());
    }
}
