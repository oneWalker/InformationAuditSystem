package com.beans;

/**
 * Pests entity. @author MyEclipse Persistence Tools
 */

public class Pests implements java.io.Serializable {

	// Fields

	private PestsId id;
	private Pointfield pointfield;

	// Constructors

	/** default constructor */
	public Pests() {
	}

	/** minimal constructor */
	public Pests(PestsId id) {
		this.id = id;
	}

	/** full constructor */
	public Pests(PestsId id, Pointfield pointfield) {
		this.id = id;
		this.pointfield = pointfield;
	}

	// Property accessors

	public PestsId getId() {
		return this.id;
	}

	public void setId(PestsId id) {
		this.id = id;
	}

	public Pointfield getPointfield() {
		return this.pointfield;
	}

	public void setPointfield(Pointfield pointfield) {
		this.pointfield = pointfield;
	}

}