<%@ page contentType="text/html;charset=GB2312" %>
<HTML><body bgcolor=cyan>
  <%  //Math.random()是（0,1）之间的随机数
      int number = 7+(int)(Math.random()*13);
      if(number<=13) {
  %>   <center> <h2> 显示小学生图片</h2> <!-- 插入其他标记 -->
       <image src ='image/xiao.jpg' width=180 height=178>小学生</image>
  <%  }
      else {
  %>   <center> <h2> 显示中学生图片</h2>
       <image src ='image/zhong.jpg' width=180 height=178>中学生</image>
  <%  }
  %> 
</body></HTML>
