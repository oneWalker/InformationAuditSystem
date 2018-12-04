<%@ page language="java" pageEncoding="utf-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
  <head>
    <html:base />
    
    <title>指标录入系统|Inputer System</title>
      
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  <h2>指标录入系统</h2>
  <body>
    <html:form action="/loginAction" method="get" focus="inputer">
    <br/>地块编号<input id="fieldNum" type="text" name="fieldNum" value=""/>
    <br/>地块指标编号<input id="pointNum" type="text" name="pointNum" value=""/>
     <html:submit property="submit" value="查询" />
    </html:form>
      <table border="0">
      <thead>
      <tr align="center">
           	<th>地块编号</th>
        	<th>地块指标编号</th>
        	<th>操作人员员工号</th>
        	<th>地块面积</th>
        	<th>地块类型</th>
        	<th>地理位置</th>
        	<th>创建时间</th>
        	<th>操作</th>
        </tr>
        </thead>
         <tbody>
         <c:forEach items="${pb}" var="point">
					<tr>
						<td>${point.fieldNum}</td>
						<td>${point.pointNum}</td>
						<td>${point.id}</td>
						<td>${point.fieldSquare}</td>
						<td>${point.fieldType}</td>
						<td>${point.fieldLoc}</td>
						<td>${point.createTime}</td>
						<!--
						<td><a href="" onclick="return confirm('确定删除${borrowRead.user.name}的记录吗');">删除</a>&nbsp; 
			<a href="">更新</a>
			-->
			</td>
		</tr>
		</c:forEach>
    	</tbody>
      </table>
  </body>
</html:html>
