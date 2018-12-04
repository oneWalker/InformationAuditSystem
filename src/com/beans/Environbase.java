package com.beans;

/**
 * Environbase entity. @author MyEclipse Persistence Tools
 */

public class Environbase implements java.io.Serializable {

	// Fields

	private EnvironbaseId id;
	private Pointfield pointfield;

	// Constructors

	/** default constructor */
	public Environbase() {
	}

	/** full constructor */
	public Environbase(EnvironbaseId id, Pointfield pointfield) {
		this.id = id;
		this.pointfield = pointfield;
	}

	// Property accessors

	public EnvironbaseId getId() {
		return this.id;
	}

	public void setId(EnvironbaseId id) {
		this.id = id;
	}

	public Pointfield getPointfield() {
		return this.pointfield;
	}

	public void setPointfield(Pointfield pointfield) {
		this.pointfield = pointfield;
	}

}