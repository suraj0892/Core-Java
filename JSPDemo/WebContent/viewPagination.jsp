<%@ page  import="java.util.*,Pack.Emp,Pack.EmpDao" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


<%

String spageid=request.getParameter("page");
int pageid=Integer.parseInt(spageid);
int total=5;
if(pageid==1){}
else{
	pageid=pageid-1;
	pageid=pageid*total+1;
}
List<Emp> list=EmpDao.getRecords(pageid,total);

out.print("<h1>Page No: "+spageid+"</h1>");
out.print("<table border='1' cellpadding='4' width='60%'>");
out.print("<tr><th>Id</th><th>Name</th><th>Salary</th>");
for(Emp e:list){
	out.print("<tr><td>"+e.getId()+"</td><td>"+e.getName()+"</td><td>"+e.getSalary()+"</td></tr>");
}
out.print("</table>");
%>
<a href="viewPagination.jsp?page=1">1</a>
<a href="viewPagination.jsp?page=2">2</a>
<a href="viewPagination.jsp?page=3">3</a>
</body>
</html>