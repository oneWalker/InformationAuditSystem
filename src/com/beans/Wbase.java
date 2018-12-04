package com.beans;

import java.sql.Timestamp;

/**
 * Wbase entity. @author MyEclipse Persistence Tools
 */

public class Wbase implements java.io.Serializable {

	// Fields

	private Integer FId;
	private Pointfield pointfield;
	private String nitContent;
	private String phoContent;
	private String potContent;
	private String microRich;
	private Integer WId;
	private Timestamp WTime;

	// Constructors

	/** default constructor */
	public Wbase() {
	}

	/** minimal constructor */
	public Wbase(Pointfield pointfield) {
		this.pointfield = pointfield;
	}

	/** full constructor */
	public Wbase(Pointfield pointfield, String nitContent, String phoContent,
			String potContent, String microRich, Integer WId, Timestamp WTime) {
		this.pointfield = pointfield;
		this.nitContent = nitContent;
		this.phoContent = phoContent;
		this.potContent = potContent;
		this.microRich = microRich;
		this.WId = WId;
		this.WTime = WTime;
	}

	// Property accessors

	public Integer getFId() {
		return this.FId;
	}

	public void setFId(Integer FId) {
		this.FId = FId;
	}

	public Pointfield getPointfield() {
		return this.pointfield;
	}

	public void setPointfield(Pointfield pointfield) {
		this.pointfield = pointfield;
	}

	public String getNitContent() {
		return this.nitContent;
	}

	public void setNitContent(String nitContent) {
		this.nitContent = nitContent;
	}

	public String getPhoContent() {
		return this.phoContent;
	}

	public void setPhoContent(String phoContent) {
		this.phoContent = phoContent;
	}

	public String getPotContent() {
		return this.potContent;
	}

	public void setPotContent(String potContent) {
		this.potContent = potContent;
	}

	public String getMicroRich() {
		return this.microRich;
	}

	public void setMicroRich(String microRich) {
		this.microRich = microRich;
	}

	public Integer getWId() {
		return this.WId;
	}

	public void setWId(Integer WId) {
		this.WId = WId;
	}

	public Timestamp getWTime() {
		return this.WTime;
	}

	public void setWTime(Timestamp WTime) {
		this.WTime = WTime;
	}

}