package com.beans;

import java.sql.Timestamp;

/**
 * EnvironbaseId entity. @author MyEclipse Persistence Tools
 */

public class EnvironbaseId implements java.io.Serializable {

	// Fields

	private Pointfield pointfield;
	private Integer hum;
	private String tem;
	private String seas;
	private String wearCon;
	private Integer EId;
	private Timestamp ETime;

	// Constructors

	/** default constructor */
	public EnvironbaseId() {
	}

	/** minimal constructor */
	public EnvironbaseId(Pointfield pointfield) {
		this.pointfield = pointfield;
	}

	/** full constructor */
	public EnvironbaseId(Pointfield pointfield, Integer hum, String tem,
			String seas, String wearCon, Integer EId, Timestamp ETime) {
		this.pointfield = pointfield;
		this.hum = hum;
		this.tem = tem;
		this.seas = seas;
		this.wearCon = wearCon;
		this.EId = EId;
		this.ETime = ETime;
	}

	// Property accessors

	public Pointfield getPointfield() {
		return this.pointfield;
	}

	public void setPointfield(Pointfield pointfield) {
		this.pointfield = pointfield;
	}

	public Integer getHum() {
		return this.hum;
	}

	public void setHum(Integer hum) {
		this.hum = hum;
	}

	public String getTem() {
		return this.tem;
	}

	public void setTem(String tem) {
		this.tem = tem;
	}

	public String getSeas() {
		return this.seas;
	}

	public void setSeas(String seas) {
		this.seas = seas;
	}

	public String getWearCon() {
		return this.wearCon;
	}

	public void setWearCon(String wearCon) {
		this.wearCon = wearCon;
	}

	public Integer getEId() {
		return this.EId;
	}

	public void setEId(Integer EId) {
		this.EId = EId;
	}

	public Timestamp getETime() {
		return this.ETime;
	}

	public void setETime(Timestamp ETime) {
		this.ETime = ETime;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EnvironbaseId))
			return false;
		EnvironbaseId castOther = (EnvironbaseId) other;

		return ((this.getPointfield() == castOther.getPointfield()) || (this
				.getPointfield() != null && castOther.getPointfield() != null && this
				.getPointfield().equals(castOther.getPointfield())))
				&& ((this.getHum() == castOther.getHum()) || (this.getHum() != null
						&& castOther.getHum() != null && this.getHum().equals(
						castOther.getHum())))
				&& ((this.getTem() == castOther.getTem()) || (this.getTem() != null
						&& castOther.getTem() != null && this.getTem().equals(
						castOther.getTem())))
				&& ((this.getSeas() == castOther.getSeas()) || (this.getSeas() != null
						&& castOther.getSeas() != null && this.getSeas()
						.equals(castOther.getSeas())))
				&& ((this.getWearCon() == castOther.getWearCon()) || (this
						.getWearCon() != null && castOther.getWearCon() != null && this
						.getWearCon().equals(castOther.getWearCon())))
				&& ((this.getEId() == castOther.getEId()) || (this.getEId() != null
						&& castOther.getEId() != null && this.getEId().equals(
						castOther.getEId())))
				&& ((this.getETime() == castOther.getETime()) || (this
						.getETime() != null && castOther.getETime() != null && this
						.getETime().equals(castOther.getETime())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getPointfield() == null ? 0 : this.getPointfield()
						.hashCode());
		result = 37 * result
				+ (getHum() == null ? 0 : this.getHum().hashCode());
		result = 37 * result
				+ (getTem() == null ? 0 : this.getTem().hashCode());
		result = 37 * result
				+ (getSeas() == null ? 0 : this.getSeas().hashCode());
		result = 37 * result
				+ (getWearCon() == null ? 0 : this.getWearCon().hashCode());
		result = 37 * result
				+ (getEId() == null ? 0 : this.getEId().hashCode());
		result = 37 * result
				+ (getETime() == null ? 0 : this.getETime().hashCode());
		return result;
	}

}