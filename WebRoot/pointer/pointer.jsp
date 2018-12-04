<%@ page language="java" pageEncoding="utf-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
	String path ="http://localhost:8080";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
  <head>
    <html:base />
    
    <title>指标登录系统|Point System</title>
      
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>   
  <script type="text/javascript">
    function validate_required(field,alerttxt)
    {
        with (field)
        {
            if (value==null||value=="")
            {alert(alerttxt);return false;}
            else {return true;}
        }
    }
    function validate_form(thisform)
    {
        with (thisform)
        {
            if (validate_required(fieldNum,"地块编号不能为空!")==false)
            {fieldNum.focus();return false;}
        }
</script>
  <h2>指标表系统</h2>
  <body>
    <html:form action="/queryPointAction" method="get" onsubmit="validate_form(this)">
    <br>
    <td>地块编号:</td>
    <td><input id="fieldNum" type="text" name="fieldNum" /><td>
    <br>
     <td><html:submit property="submit" value="查询" /><td>
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
        	<th>操</th>
        	<th></th>
        	<th>作</th>
        </tr>
        </thead>
         <tbody>
         <c:forEach items="${pb}" var="point">
					<tr>
						<td>${point.fieldNum}</td>
						<td>${point.pointNum}</td>
						<td>${point.id}</td>
						<td>${point.fieldSquare}</td>
						<td>
						<c:if test="${point.fieldType=='1' }">水田</c:if>
						<c:if test="${point.fieldType=='2' }">旱地</c:if>
						</td>
						<td>${point.fieldLoc}</td>
						<td>${point.createTime}</td>
						<td>
						<html:form action="/deletePointAction" method="get">
						<input id="pointNum" type="hidden" name="pointNum" value="${point.pointNum}"/>
						<html:submit property="submit" value="删除" onclick="return confirm('确定删除指标编号${point.pointNum}的记录吗');"/>&nbsp;
						</html:form> 
						</td>
						<%request.setAttribute("pointNum","${point.pointNum}");%>					
						<td><a href="/SE/pointer/updatePoint.jsp?pointNum=${point.pointNum}">编辑</a><td>
						<td><a href="/SE/pointer/addPoint.jsp">增加</a></td>
		</tr>
		</c:forEach>
    	</tbody>
      </table>
  </body>
</html:html>
