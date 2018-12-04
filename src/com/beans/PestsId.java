package com.beans;

import java.sql.Timestamp;

/**
 * PestsId entity. @author MyEclipse Persistence Tools
 */

public class PestsId implements java.io.Serializable {

	// Fields

	private Pointfield pointfield;
	private Integer pestSort;
	private String pests;
	private String pecent;
	private Integer PId;
	private Timestamp PTime;

	// Constructors

	/** default constructor */
	public PestsId() {
	}

	/** full constructor */
	public PestsId(Pointfield pointfield, Integer pestSort, String pests,
			String pecent, Integer PId, Timestamp PTime) {
		this.pointfield = pointfield;
		this.pestSort = pestSort;
		this.pests = pests;
		this.pecent = pecent;
		this.PId = PId;
		this.PTime = PTime;
	}

	// Property accessors

	public Pointfield getPointfield() {
		return this.pointfield;
	}

	public void setPointfield(Pointfield pointfield) {
		this.pointfield = pointfield;
	}

	public Integer getPestSort() {
		return this.pestSort;
	}

	public void setPestSort(Integer pestSort) {
		this.pestSort = pestSort;
	}

	public String getPests() {
		return this.pests;
	}

	public void setPests(String pests) {
		this.pests = pests;
	}

	public String getPecent() {
		return this.pecent;
	}

	public void setPecent(String pecent) {
		this.pecent = pecent;
	}

	public Integer getPId() {
		return this.PId;
	}

	public void setPId(Integer PId) {
		this.PId = PId;
	}

	public Timestamp getPTime() {
		return this.PTime;
	}

	public void setPTime(Timestamp PTime) {
		this.PTime = PTime;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PestsId))
			return false;
		PestsId castOther = (PestsId) other;

		return ((this.getPointfield() == castOther.getPointfield()) || (this
				.getPointfield() != null && castOther.getPointfield() != null && this
				.getPointfield().equals(castOther.getPointfield())))
				&& ((this.getPestSort() == castOther.getPestSort()) || (this
						.getPestSort() != null
						&& castOther.getPestSort() != null && this
						.getPestSort().equals(castOther.getPestSort())))
				&& ((this.getPests() == castOther.getPests()) || (this
						.getPests() != null && castOther.getPests() != null && this
						.getPests().equals(castOther.getPests())))
				&& ((this.getPecent() == castOther.getPecent()) || (this
						.getPecent() != null && castOther.getPecent() != null && this
						.getPecent().equals(castOther.getPecent())))
				&& ((this.getPId() == castOther.getPId()) || (this.getPId() != null
						&& castOther.getPId() != null && this.getPId().equals(
						castOther.getPId())))
				&& ((this.getPTime() == castOther.getPTime()) || (this
						.getPTime() != null && castOther.getPTime() != null && this
						.getPTime().equals(castOther.getPTime())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getPointfield() == null ? 0 : this.getPointfield()
						.hashCode());
		result = 37 * result
				+ (getPestSort() == null ? 0 : this.getPestSort().hashCode());
		result = 37 * result
				+ (getPests() == null ? 0 : this.getPests().hashCode());
		result = 37 * result
				+ (getPecent() == null ? 0 : this.getPecent().hashCode());
		result = 37 * result
				+ (getPId() == null ? 0 : this.getPId().hashCode());
		result = 37 * result
				+ (getPTime() == null ? 0 : this.getPTime().hashCode());
		return result;
	}

}