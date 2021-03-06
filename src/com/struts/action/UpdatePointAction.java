/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.struts.action;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.beans.Pointbase;
import com.dao.PointbaseDao;
import com.struts.form.UpdatePointForm;

/** 
 * MyEclipse Struts
 * Creation date: 07-01-2016
 * 
 * XDoclet definition:
 * @struts.action path="/updatePointAction" name="updatePointForm" input="/pointer/updatePoint.jsp" scope="request" validate="true"
 * @struts.action-forward name="fail" path="/pointer/updatePoint.jsp"
 * @struts.action-forward name="success" path="/pointer/pointer.jsp"
 */
public class UpdatePointAction extends Action {
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
		UpdatePointForm updatePointForm = (UpdatePointForm) form;// TODO Auto-generated method stub
		HttpSession session = request.getSession(); //程序中session的通道进行读取session的值
		Integer pointNum=(Integer)updatePointForm.getPointNum();
		Integer fieldNum=(Integer)updatePointForm.getFieldNum(); 
		String fieldType=(String)updatePointForm.getFieldType();
		String fieldLoc=(String)updatePointForm.getFieldLoc();
		String fieldSquare=(String)updatePointForm.getFieldSquare();
		String userType=(String)session.getAttribute("userType");
		Date date=new Date();
		Timestamp time=new Timestamp(date.getTime());
		Integer id=(Integer)session.getAttribute("id");
		Pointbase pb=new Pointbase();
		pb.setFieldNum(fieldNum);
		pb.setCreateTime(time);
		pb.setFieldLoc(fieldLoc);
		pb.setFieldSquare(fieldSquare);
		pb.setFieldType(fieldType);
		pb.setId(id);
		if(userType.equalsIgnoreCase("1")){
			System.out.println(fieldType+"00000000");
			PointbaseDao PBD=new PointbaseDao();
			PBD.updatePointbase(pb,pointNum);
			ArrayList<Pointbase> APB=PBD.searchAll();
			request.setAttribute("pb",APB);		
			return(new ActionForward(mapping.findForward("success")));	
		}		
		else{
			return(new ActionForward(mapping.findForward("fail")));
		}
	}
}