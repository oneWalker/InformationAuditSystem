/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.struts.form;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

/** 
 * MyEclipse Struts
 * Creation date: 07-01-2016
 * 
 * XDoclet definition:
 * @struts.form name="queryPointForm"
 */
public class QueryPointForm extends ActionForm {
	/*
	 * Generated fields
	 */

	/** fieldNum property */
	private Integer fieldNum;

	/** pointNum property */
	private Integer pointNum;

	/*
	 * Generated Methods
	 */

	/** 
	 * Method validate
	 * @param mapping
	 * @param request
	 * @return ActionErrors
	 */
	public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	/** 
	 * Method reset
	 * @param mapping
	 * @param request
	 */
	public void reset(ActionMapping mapping, HttpServletRequest request) {
		// TODO Auto-generated method stub
	}

	/** 
	 * Returns the fieldNum.
	 * @return String
	 */
	public Integer getFieldNum() {
		return fieldNum;
	}

	/** 
	 * Set the fieldNum.
	 * @param fieldNum The fieldNum to set
	 */
	public void setFieldNum(Integer fieldNum) {
		this.fieldNum = fieldNum;
	}

	/** 
	 * Returns the pointNum.
	 * @return String
	 */
	public Integer getPointNum() {
		return pointNum;
	}

	/** 
	 * Set the pointNum.
	 * @param pointNum The pointNum to set
	 */
	public void setPointNum(Integer pointNum) {
		this.pointNum = pointNum;
	}
}