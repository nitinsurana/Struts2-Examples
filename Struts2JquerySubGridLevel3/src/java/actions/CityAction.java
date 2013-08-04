/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package actions;

import beans.City;
import com.opensymphony.xwork2.ActionSupport;
import java.util.List;

/**
 *
 * @author XCoder
 */
public class CityAction extends ActionSupport {

    private Integer id;
    private Integer idstate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdstate() {
        return idstate;
    }

    public void setIdstate(Integer idstate) {
        this.idstate = idstate;
    }
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
    private List<City> gridModel;
    //get how many rows we want to have into the grid - rowNum attribute in the grid
    private Integer rows = 0;
    //Get the requested page. By default grid sets this to 1.
    private Integer page = 0;
    // sorting order - asc or desc
    private String sord;
    private boolean loadonce = false;
// All Record
    private Integer records = 0;
    private String includepage;
    private List<City> myList;

    public String getIncludepage() {
        return includepage;
    }

    public void setIncludepage(String includepage) {
        this.includepage = includepage;
    }

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

    public String execute() throws Exception {
        System.out.println("CityAction : " + id + "    " + idstate);
        myList = new DAO().genLstCity(id);

        setRecords(myList.size());
        int to = (getRows() * getPage());
        int from = to - getRows();

        if (to > getRecords()) {
            to = getRecords();
        }
        if (loadonce) {
            setGridModel(myList);
        } else {
            if (searchString != null && searchOper != null && !searchString.equals("") && !searchOper.equals("")) {
                System.out.println("Searching within Database");
                if (searchOper.equalsIgnoreCase("cn")) {
//                    setGridModel(.findbyName(searchString));
                }
            } else {
                System.out.println("Not Searching Anywhere");
                setGridModel(myList.subList(from, to));
            }
        }
        total = (int) Math.ceil((double) getRecords() / (double) getRows());
        System.out.println(gridModel.size());
        return SUCCESS;
    }

    public List<City> getGridModel() {
        return gridModel;
    }

    public void setGridModel(List<City> gridModel) {
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
}
