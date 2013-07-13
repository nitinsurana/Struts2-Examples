
import java.util.ArrayList;
import java.util.List;

public class NBean {

//    private Integer Inst1;
//    private Double Inst2;
//    private String Inst3;
//    private String Inst4;
//    private String Inst5;
////    private List<String> lstInst=new ArrayList<String>();
//
//    public NBean() {
//    }
//
//    public NBean(String s) {
//        this.Inst3 = s;
//        this.Inst4 = s;
//    }
//
//    public Integer getInst1() {
//        return Inst1;
//    }
//
//    public void setInst1(Integer Inst1) {
//        this.Inst1 = Inst1;
//    }
////    public NBean(int count)
////    {
////        while(count-->0){
////        lstInst.add("Inst "+count);
////        }
////    }
////    public List<String> getLstInst() {
////        return lstInst;
////    }
////
////    public void setLstInst(List<String> lstInst) {
////        this.lstInst = lstInst;
////    }
//
//    public Double getInst2() {
//        return Inst2;
//    }
//
//    public void setInst2(Double Inst2) {
//        this.Inst2 = Inst2;
//    }
//
//    public String getInst3() {
//        return Inst3;
//    }
//
//    public void setInst3(String Inst3) {
//        this.Inst3 = Inst3;
//    }
//
//    public String getInst4() {
//        return Inst4;
//    }
//
//    public void setInst4(String Inst4) {
//        this.Inst4 = Inst4;
//    }
//
//    public String getInst5() {
//        return Inst5;
//    }
//
//    public void setInst5(String Inst5) {
//        this.Inst5 = Inst5;
//    }
//
//    public String toString() {
//        return Inst1 + " " + Inst2 + " " + Inst3 + " " + Inst4 + " " + Inst5;
//    }
    private Integer idFeeHead;
    private String feeHeadName;
    private String strBasis;
    private Double doubBasis;
    
    public String toString()
    {
        return (idFeeHead + "    "+feeHeadName+" "+strBasis+" "+doubBasis);
    }
    public NBean()
    {
    }
    public NBean(Integer idFeeHead, String feeHeadName, String strBasis, Double doubBasis) {
        this.idFeeHead = idFeeHead;
        this.feeHeadName = feeHeadName;
        this.strBasis = strBasis;
        this.doubBasis = doubBasis;
    }

    public Double getDoubBasis() {
        return doubBasis;
    }

    public void setDoubBasis(Double doubBasis) {
        this.doubBasis = doubBasis;
    }

    public String getFeeHeadName() {
        return feeHeadName;
    }

    public void setFeeHeadName(String feeHeadName) {
        this.feeHeadName = feeHeadName;
    }

    public Integer getIdFeeHead() {
        return idFeeHead;
    }

    public void setIdFeeHead(Integer idFeeHead) {
        this.idFeeHead = idFeeHead;
    }

    public String getStrBasis() {
        return strBasis;
    }

    public void setStrBasis(String strBasis) {
        this.strBasis = strBasis;
    }

}
