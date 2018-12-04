package com.beans;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Pointbase entity. @author MyEclipse Persistence Tools
 */

public class Pointbase implements java.io.Serializable {

	// Fields

	private Integer pointNum;
	private Integer fieldNum;
	private Integer id;
	private String fieldSquare;
	private String fieldType;
	private String fieldLoc;
	private Timestamp createTime;
	private Set pointfields = new HashSet(0);

	// Constructors

	/** default constructor */
	public Pointbase() {
	}

	/** minimal constructor */
	public Pointbase(Integer fieldNum, Integer id) {
		this.fieldNum = fieldNum;
		this.id = id;
	}

	/** full constructor */
	public Pointbase(Integer fieldNum, Integer id, String fieldSquare,
			String fieldType, String fieldLoc, Timestamp createTime,
			Set pointfields) {
		this.fieldNum = fieldNum;
		this.id = id;
		this.fieldSquare = fieldSquare;
		this.fieldType = fieldType;
		this.fieldLoc = fieldLoc;
		this.createTime = createTime;
		this.pointfields = pointfields;
	}

	// Property accessors

	public Integer getPointNum() {
		return this.pointNum;
	}

	public void setPointNum(Integer pointNum) {
		this.pointNum = pointNum;
	}

	public Integer getFieldNum() {
		return this.fieldNum;
	}

	public void setFieldNum(Integer fieldNum) {
		this.fieldNum = fieldNum;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFieldSquare() {
		return this.fieldSquare;
	}

	public void setFieldSquare(String fieldSquare) {
		this.fieldSquare = fieldSquare;
	}

	public String getFieldType() {
		return this.fieldType;
	}

	public void setFieldType(String fieldType) {
		this.fieldType = fieldType;
	}

	public String getFieldLoc() {
		return this.fieldLoc;
	}

	public void setFieldLoc(String fieldLoc) {
		this.fieldLoc = fieldLoc;
	}

	public Timestamp getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Timestamp createTime) {
		this.createTime = createTime;
	}

	public Set getPointfields() {
		return this.pointfields;
	}

	public void setPointfields(Set pointfields) {
		this.pointfields = pointfields;
	}

}