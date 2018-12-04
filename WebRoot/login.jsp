<%@ page language="java" pageEncoding="utf-8"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
  <head>
    <html:base />
    
    <title>系统登录|Log in</title>
      
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  <h2>监测信息填写审核系统</h2>
  <body background="1.png">
    <html:form action="/loginAction" method="get" focus="login">
      <table border="0">
      <tr align="center"><td> <font color="red"><html:errors/></font></td></tr>
        <tr>
          <td>用户名:</td>
          <td><html:text property="userName" /></td>
        </tr>
        <tr>
          <td>密码:</td>
          <td><html:password property="password" /></td>
        </tr>
        <tr>
        <tr>
          <td>用户类型:</td>
          <td><html:radio property="userType" value="1" />指标员
              <html:radio property="userType" value="2"/>录入员
              <html:radio property="userType" value="3"/>审核员
          </td>
        </tr>
        <tr>
          <td colspan="2" align="center">
          <html:submit property="submit" value="登录" />
          <html:reset property="reset" value="重置" />
          </td>      
        </tr>
      </table>
    </html:form>
  </body>
</html:html>
