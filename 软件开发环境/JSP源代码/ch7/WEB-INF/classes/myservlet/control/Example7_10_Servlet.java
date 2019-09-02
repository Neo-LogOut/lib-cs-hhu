package myservlet.control;
import mybean.data.Example7_10_Bean; //引入Javabean模型
import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.util.*;
public class Example7_10_Servlet extends HttpServlet{
   public void init(ServletConfig config) throws ServletException{
      super.init(config);
   }
   public void doPost(HttpServletRequest request,HttpServletResponse response)
               throws ServletException,IOException{
      Example7_10_Bean testBean=null;
      HttpSession session=request.getSession(true);
      try{  testBean=(Example7_10_Bean)session.getAttribute("testBean");
            if(testBean==null){
                testBean=new Example7_10_Bean(); //创建Javabean对象
                session.setAttribute("testBean",testBean);
            }
      }
      catch(Exception exp){
            testBean=new Example7_10_Bean();  //创建Javabean对象
            session.setAttribute("testBean",testBean);
      } 
     try{  Class.forName("com.mysql.jdbc.Driver");
     }
     catch(Exception e){} 
     request.setCharacterEncoding("gb2312");
     String id=request.getParameter("id");
     if(id==null||id.length()==0) {
        notify(request,response,"必须给出学号");
        return;
     }
     testBean.setId(id); 
     int testAmount = testBean.getTestAmount();   //考题数量
     Connection con;
     Statement sql; 
     ResultSet rs;
     try{ 
          String uri="jdbc:mysql://127.0.0.1/school?"+
                      "user=root&password=&characterEncoding=gb2312";
          con=DriverManager.getConnection(uri);
          sql=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
                                 ResultSet.CONCUR_READ_ONLY);
          rs=sql.executeQuery("SELECT * FROM test");
          rs.last();    
          int recordAmount=rs.getRow();  //得到记录数
          testAmount = Math.min(recordAmount,testAmount);
          LinkedList<Integer> list=(LinkedList<Integer>)session.getAttribute("list");
          if(list==null||list.size()==0){
             list = new LinkedList<Integer>();
             for(int i=1;i<=recordAmount;i++) {
               list.add(i);
             }
             session.setAttribute("list",list); 
          }
          int m= -1;
          int index=-1;
          if(list.size()>=1) {
             m= (int)(Math.random()*list.size());
             index=list.get(m);
             list.remove(m);
             session.setAttribute("list",list); 
             int tihao=testBean.getNumber();
             if(tihao<testAmount) {
                 //首先判断上一题是否正确，给出分数：
                String studentAnswer=testBean.getAnswer();
                if(studentAnswer!=null&&studentAnswer.length()>=1) {
                   if(studentAnswer.equalsIgnoreCase(testBean.getCorrectAnswer())){
                      float score= testBean.getScore();
                      score++;
                     testBean.setScore(score);
                   }
                }
                //随机抽取下一题目：
                tihao++;
                testBean.setNumber(tihao); //题号
                rs.absolute(index); //随机抽取题目
                testBean.setQuestions(rs.getString(1));//题目内容
                testBean.setChoiceA(rs.getString(2));  //题目的选择a
                testBean.setChoiceB(rs.getString(3));  //题目的选择b
                testBean.setChoiceC(rs.getString(4));  //题目的选择c
                testBean.setChoiceD(rs.getString(5));  //题目的选择d
                testBean.setImage(rs.getString(6));  //题目的示意图名称
                testBean.setCorrectAnswer(rs.getString(7).trim());//题目的答案
                testBean.setMess("现在是第"+tihao+"题");
                con.close(); 
            }
            else {
                testBean.setMess("答题结束，单击交卷查看分数");
                String studentAnswer=testBean.getAnswer(); //判断最后一题
                if(studentAnswer!=null&&studentAnswer.length()>=1) {
                   if(studentAnswer.equalsIgnoreCase(testBean.getCorrectAnswer())){
                      float score= testBean.getScore();
                      score++;
                     testBean.setScore(score);
                   }
                }
                testBean.setAnswer(null);
                testBean.setNumber(0);
                testBean.setQuestions(null);
                testBean.setChoiceA(null);  
                testBean.setChoiceB(null);  
                testBean.setChoiceC(null);  
                testBean.setChoiceD(null);  
                testBean.setImage(null); 
            }
          }
          else {
             testBean.setMess("没有抽到题目");
          }
          response.sendRedirect("example7_10_examination.jsp");
     }
     catch(SQLException e){
          notify(request,response,e.toString());
     }  
   }
   public  void  doGet(HttpServletRequest request,HttpServletResponse response)
           throws ServletException,IOException{
       doPost(request,response);
   }
   public void notify(HttpServletRequest request,HttpServletResponse response,
                      String backNews) {
        response.setContentType("text/html;charset=GB2312");
        try {
         PrintWriter out=response.getWriter();
         out.println("<html><body>");
         out.println("<h2>"+backNews+"</h2>") ;
         out.println("返回");
         out.println("<a href =example7_10.jsp>返回</a>");
         out.println("</body></html>");
        }
        catch(IOException exp){} 
    }
}
