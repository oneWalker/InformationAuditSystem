/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.struts.action;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.beans.Pointbase;
import com.dao.PointbaseDao;
import com.struts.form.QueryPointForm;

/** 
 * MyEclipse Struts
 * Creation date: 07-01-2016
 * 
 * XDoclet definition:
 * @struts.action path="/queryPointAction" name="queryPointForm" input="/pointer/pointer.jsp" scope="request" validate="true"
 */
public class QueryPointAction extends Action {
	/*
	 * Generated Methods
	 */

	/** 
	 * Method execute
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		QueryPointForm queryPointForm = (QueryPointForm) form;// TODO Auto-generated method stub
		Integer fieldNum=(Integer)queryPointForm.getFieldNum();
		//Integer pointNum=(Integer)queryPointForm.getPointNum();
		System.out.println(fieldNum);
		//通过调用数据进行查询
		PointbaseDao PD=new  PointbaseDao();
		ArrayList<Pointbase> pb=PD.searchByFieldNum(fieldNum);
		if(pb.size()>0){
		request.setAttribute("pb",pb);
		return mapping.findForward("success");
		}
		else{
		return mapping.findForward("fail");
		}
	}
}