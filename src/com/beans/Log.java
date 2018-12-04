package com.beans;

import java.sql.Timestamp;

/**
 * Log entity. @author MyEclipse Persistence Tools
 */

public class Log implements java.io.Serializable {

	// Fields

	private Integer BId;
	private Integer id;
	private Timestamp start;
	private Timestamp end;
	private String way;
	private String other;
	private Integer point;

	// Constructors

	/** default constructor */
	public Log() {
	}

	/** full constructor */
	public Log(Integer id, Timestamp start, Timestamp end, String way,
			String other, Integer point) {
		this.id = id;
		this.start = start;
		this.end = end;
		this.way = way;
		this.other = other;
		this.point = point;
	}

	// Property accessors

	public Integer getBId() {
		return this.BId;
	}

	public void setBId(Integer BId) {
		this.BId = BId;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Timestamp getStart() {
		return this.start;
	}

	public void setStart(Timestamp start) {
		this.start = start;
	}

	public Timestamp getEnd() {
		return this.end;
	}

	public void setEnd(Timestamp end) {
		this.end = end;
	}

	public String getWay() {
		return this.way;
	}

	public void setWay(String way) {
		this.way = way;
	}

	public String getOther() {
		return this.other;
	}

	public void setOther(String other) {
		this.other = other;
	}

	public Integer getPoint() {
		return this.point;
	}

	public void setPoint(Integer point) {
		this.point = point;
	}

}