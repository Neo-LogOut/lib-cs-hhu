<%   String str=request.getParameter("guess");
     if(str==null||str.length()==0) {
         response.sendRedirect("example3_16_number.jsp");
     }
     else {
        int guessNumber=Integer.parseInt(str);
        session.setAttribute("guess",new Integer(guessNumber));
        Integer integer=(Integer)session.getAttribute("save");
        int realnumber=integer.intValue();
        if(guessNumber==realnumber) {
           int n=((Integer)session.getAttribute("count")).intValue();
           n=n+1;
           session.setAttribute("count",new Integer(n));
           response.sendRedirect("example3_16_success.jsp");
        } 
        else if(guessNumber>realnumber){
           int n=((Integer)session.getAttribute("count")).intValue();
           n=n+1;
           session.setAttribute("count",new Integer(n));
           response.sendRedirect("example3_16_large.jsp");
        }
        else if(guessNumber<realnumber) {
           int n=((Integer)session.getAttribute("count")).intValue();
           n=n+1;
           session.setAttribute("count",new Integer(n));
           response.sendRedirect("example3_16_small.jsp");
        }
     }
%>
