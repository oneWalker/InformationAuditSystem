<%@ page language="java" pageEncoding="utf-8"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>

<html> 
	<head>
		<title>指标表基本信息录入</title>
	</head>
	 <h2>指标表基本信息录入</h2>
	 <body>
		<html:form action="/addPointAction" method="get">
		<table>
		<tr>
          <td>地块编号:</td>
          <td><html:text property="fieldNum" /></td>
        </tr>
		 <tr>
          <td>地块类型:</td>
          <td><html:radio property="fieldType" value="水田" />水田
              <html:radio property="fieldType" value="旱地"/>旱地
          </td>
          </tr>
		<tr>
          <td>地块大小:</td>
          <td><html:text property="fieldSquare" /></td>
        </tr>
		<tr>
          <td>地块地理位置:</td>
          <td><html:text property="fieldLoc" /></td>
        </tr>
		<tr>
          <td colspan="2" align="center">
          <html:submit property="submit" value="提交" />
          <html:reset property="reset" value="重置" />
          </td>      
        </tr>
        </table>
		</html:form>
	</body>
</html>

