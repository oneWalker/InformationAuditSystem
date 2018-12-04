package com.beans;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Pointfield entity. @author MyEclipse Persistence Tools
 */

public class Pointfield implements java.io.Serializable {

	// Fields

	private Integer FId;
	private Pointbase pointbase;
	private Integer id;
	private String state;
	private String isqual;
	private String notes;
	private Timestamp auditDate;
	private Set wbases = new HashSet(0);
	private Set airbases = new HashSet(0);
	private Set pestses = new HashSet(0);
	private Set environbases = new HashSet(0);

	// Constructors

	/** default constructor */
	public Pointfield() {
	}

	/** minimal constructor */
	public Pointfield(Pointbase pointbase) {
		this.pointbase = pointbase;
	}

	/** full constructor */
	public Pointfield(Pointbase pointbase, Integer id, String state,
			String isqual, String notes, Timestamp auditDate, Set wbases,
			Set airbases, Set pestses, Set environbases) {
		this.pointbase = pointbase;
		this.id = id;
		this.state = state;
		this.isqual = isqual;
		this.notes = notes;
		this.auditDate = auditDate;
		this.wbases = wbases;
		this.airbases = airbases;
		this.pestses = pestses;
		this.environbases = environbases;
	}

	// Property accessors

	public Integer getFId() {
		return this.FId;
	}

	public void setFId(Integer FId) {
		this.FId = FId;
	}

	public Pointbase getPointbase() {
		return this.pointbase;
	}

	public void setPointbase(Pointbase pointbase) {
		this.pointbase = pointbase;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getIsqual() {
		return this.isqual;
	}

	public void setIsqual(String isqual) {
		this.isqual = isqual;
	}

	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Timestamp getAuditDate() {
		return this.auditDate;
	}

	public void setAuditDate(Timestamp auditDate) {
		this.auditDate = auditDate;
	}

	public Set getWbases() {
		return this.wbases;
	}

	public void setWbases(Set wbases) {
		this.wbases = wbases;
	}

	public Set getAirbases() {
		return this.airbases;
	}

	public void setAirbases(Set airbases) {
		this.airbases = airbases;
	}

	public Set getPestses() {
		return this.pestses;
	}

	public void setPestses(Set pestses) {
		this.pestses = pestses;
	}

	public Set getEnvironbases() {
		return this.environbases;
	}

	public void setEnvironbases(Set environbases) {
		this.environbases = environbases;
	}

}