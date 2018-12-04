package com.beans;

import java.sql.Timestamp;

/**
 * AirbaseId entity. @author MyEclipse Persistence Tools
 */

public class AirbaseId implements java.io.Serializable {

	// Fields

	private Pointfield pointfield;
	private Integer carDio;
	private Float nitrOxi;
	private Float ss;
	private Float carmon;
	private Integer AId;
	private Timestamp ATime;

	// Constructors

	/** default constructor */
	public AirbaseId() {
	}

	/** minimal constructor */
	public AirbaseId(Pointfield pointfield) {
		this.pointfield = pointfield;
	}

	/** full constructor */
	public AirbaseId(Pointfield pointfield, Integer carDio, Float nitrOxi,
			Float ss, Float carmon, Integer AId, Timestamp ATime) {
		this.pointfield = pointfield;
		this.carDio = carDio;
		this.nitrOxi = nitrOxi;
		this.ss = ss;
		this.carmon = carmon;
		this.AId = AId;
		this.ATime = ATime;
	}

	// Property accessors

	public Pointfield getPointfield() {
		return this.pointfield;
	}

	public void setPointfield(Pointfield pointfield) {
		this.pointfield = pointfield;
	}

	public Integer getCarDio() {
		return this.carDio;
	}

	public void setCarDio(Integer carDio) {
		this.carDio = carDio;
	}

	public Float getNitrOxi() {
		return this.nitrOxi;
	}

	public void setNitrOxi(Float nitrOxi) {
		this.nitrOxi = nitrOxi;
	}

	public Float getSs() {
		return this.ss;
	}

	public void setSs(Float ss) {
		this.ss = ss;
	}

	public Float getCarmon() {
		return this.carmon;
	}

	public void setCarmon(Float carmon) {
		this.carmon = carmon;
	}

	public Integer getAId() {
		return this.AId;
	}

	public void setAId(Integer AId) {
		this.AId = AId;
	}

	public Timestamp getATime() {
		return this.ATime;
	}

	public void setATime(Timestamp ATime) {
		this.ATime = ATime;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AirbaseId))
			return false;
		AirbaseId castOther = (AirbaseId) other;

		return ((this.getPointfield() == castOther.getPointfield()) || (this
				.getPointfield() != null && castOther.getPointfield() != null && this
				.getPointfield().equals(castOther.getPointfield())))
				&& ((this.getCarDio() == castOther.getCarDio()) || (this
						.getCarDio() != null && castOther.getCarDio() != null && this
						.getCarDio().equals(castOther.getCarDio())))
				&& ((this.getNitrOxi() == castOther.getNitrOxi()) || (this
						.getNitrOxi() != null && castOther.getNitrOxi() != null && this
						.getNitrOxi().equals(castOther.getNitrOxi())))
				&& ((this.getSs() == castOther.getSs()) || (this.getSs() != null
						&& castOther.getSs() != null && this.getSs().equals(
						castOther.getSs())))
				&& ((this.getCarmon() == castOther.getCarmon()) || (this
						.getCarmon() != null && castOther.getCarmon() != null && this
						.getCarmon().equals(castOther.getCarmon())))
				&& ((this.getAId() == castOther.getAId()) || (this.getAId() != null
						&& castOther.getAId() != null && this.getAId().equals(
						castOther.getAId())))
				&& ((this.getATime() == castOther.getATime()) || (this
						.getATime() != null && castOther.getATime() != null && this
						.getATime().equals(castOther.getATime())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getPointfield() == null ? 0 : this.getPointfield()
						.hashCode());
		result = 37 * result
				+ (getCarDio() == null ? 0 : this.getCarDio().hashCode());
		result = 37 * result
				+ (getNitrOxi() == null ? 0 : this.getNitrOxi().hashCode());
		result = 37 * result + (getSs() == null ? 0 : this.getSs().hashCode());
		result = 37 * result
				+ (getCarmon() == null ? 0 : this.getCarmon().hashCode());
		result = 37 * result
				+ (getAId() == null ? 0 : this.getAId().hashCode());
		result = 37 * result
				+ (getATime() == null ? 0 : this.getATime().hashCode());
		return result;
	}

}