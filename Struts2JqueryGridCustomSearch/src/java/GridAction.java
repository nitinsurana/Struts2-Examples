/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import com.opensymphony.xwork2.ActionSupport;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Harsh
 */
public class GridAction extends ActionSupport {

    private String sidx;
    // Search Field
    private String searchField;
    // The Search String
    private String searchString;
    // he Search Operation ['eq','ne','lt','le','gt','ge','bw','bn','in','ni','ew','en','cn','nc']
    private String searchOper;
    // Your Total Pages
    private Integer total = 0;
    //Your result List
    private List<Bean> gridModel;
    //get how many rows we want to have into the grid - rowNum attribute in the grid
    private Integer rows = 0;
    //Get the requested page. By default grid sets this to 1.
    private Integer page = 0;
    // sorting order - asc or desc
    private String sord;
    private boolean loadonce = false;

    public Integer getRecords() {
        return records;
    }

    public void setRecords(Integer records) {
        this.records = records;
        if (this.records > 0 && this.rows > 0) {
            this.total = (int) Math.ceil((double) this.records / (double) this.rows);
        } else {
            this.total = 0;
        }
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }
    // All Record
    private Integer records = 0;

    public String execute() {
        System.out.println("gridaction Caste execute called...." + searchString + "     " + searchField + "     " + searchOper);
//1.BuildList 2.1Sort if necessary 2.2SetRecords count 3.Search if necessary 4.Return Sublist else 5.Set Total count left
        myList = DAO.getLstBean();

        if (getSord() != null && getSord().equalsIgnoreCase("asc")) {
//            Collections.sort(myList);
        }
        if (getSord() != null && getSord().equalsIgnoreCase("desc")) {
//            Collections.sort(myList);
            Collections.reverse(myList);
        }

        setRecords(new DAO().count());
        int to = (getRows() * getPage());
        int from = to - getRows();
        if (to > getRecords()) {
            to = getRecords();
        }

        if (loadonce) {
            setGridModel(DAO.getLstBean());
        } else {
            if (searchString != null && searchOper != null && !searchString.equals("") && !searchOper.equals("")) {
                System.out.println("Searching within Database");
                if (searchOper.equalsIgnoreCase("cn")) {
                    setGridModel(DAO.findbyName(searchString));
                }
            } else {
                System.out.println("Not Searching Anywhere");
                setGridModel(DAO.find(from, to));
            }
        }
        total = (int) Math.ceil((double) getRecords() / (double) getRows());
        System.out.println("gactCaste over : " + gridModel.size());
        return SUCCESS;
    }
    private List<Bean> myList;

    public List<Bean> getGridModel() {
        return gridModel;
    }

    public void setGridModel(List<Bean> gridModel) {
        this.gridModel = gridModel;
    }

    public Integer getPage() {
        return page;
    }

    public boolean isLoadonce() {
        return loadonce;
    }

    public void setLoadonce(boolean loadonce) {
        this.loadonce = loadonce;
    }

    public String getSidx() {
        return sidx;
    }

    public void setSidx(String sidx) {
        this.sidx = sidx;
    }

    public String getSord() {
        return sord;
    }

    public void setSord(String sord) {
        this.sord = sord;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public String getSearchField() {
        return searchField;
    }

    public void setSearchField(String searchField) {
        this.searchField = searchField;
    }

    public String getSearchOper() {
        return searchOper;
    }

    public void setSearchOper(String searchOper) {
        this.searchOper = searchOper;
    }

    public String getSearchString() {
        return searchString;
    }

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }

    public String getJSON() {
        return execute();
    }
}
