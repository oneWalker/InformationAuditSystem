package com.beans;

/**
 * Airbase entity. @author MyEclipse Persistence Tools
 */

public class Airbase implements java.io.Serializable {

	// Fields

	private AirbaseId id;
	private Pointfield pointfield;

	// Constructors

	/** default constructor */
	public Airbase() {
	}

	/** full constructor */
	public Airbase(AirbaseId id, Pointfield pointfield) {
		this.id = id;
		this.pointfield = pointfield;
	}

	// Property accessors

	public AirbaseId getId() {
		return this.id;
	}

	public void setId(AirbaseId id) {
		this.id = id;
	}

	public Pointfield getPointfield() {
		return this.pointfield;
	}

	public void setPointfield(Pointfield pointfield) {
		this.pointfield = pointfield;
	}

}