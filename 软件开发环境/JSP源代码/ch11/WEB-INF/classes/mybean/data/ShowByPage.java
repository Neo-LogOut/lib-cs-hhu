package mybean.data;
import com.sun.rowset.*; 
public class ShowByPage{
    CachedRowSetImpl rowSet=null;         //存储表中全部记录的行集对象
    int pageSize=10;                      //每页显示的记录数
    int pageAllCount=0;                   //分页后的总页数
    int showPage=1   ;                    //当前显示页 
    StringBuffer presentPageResult;      //显示当前页内容
    public void setRowSet(CachedRowSetImpl set){
       rowSet=set;
    }
    public CachedRowSetImpl getRowSet(){
       return rowSet;
    }
    public void setPageSize(int size){
       pageSize=size;
    }
    public int getPageSize(){
       return pageSize;
    } 
    public int getPageAllCount(){
       return pageAllCount;
    } 
    public void setPageAllCount(int n){
       pageAllCount=n; 
    }
    public void setShowPage(int n){
       showPage=n;
    }
    public int getShowPage(){
       return showPage;
    }
    public void setPresentPageResult(StringBuffer p){
       presentPageResult=p; 
    }
    public StringBuffer getPresentPageResult(){
       return presentPageResult; 
    }
}
