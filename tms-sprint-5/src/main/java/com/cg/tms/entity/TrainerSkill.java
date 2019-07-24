package com.cg.tms.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "trainer_skill")
public class TrainerSkill implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_TR_SKILL")
	@SequenceGenerator(sequenceName = "seq_tr_skill", allocationSize = 1, name = "SEQ_TR_SKILL")
	private int id;

	@Column(name = "employeeid")
	
	private String employeeid;
	
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="skillId")
	private Skill skills;

	public TrainerSkill() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmployee() {
		return employeeid;
	}

	public void setEmployee(String employee) {
		this.employeeid = employee;
	}

	public String getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}

	public Skill getSkills() {
		return skills;
	}

	public void setSkills(Skill skills) {
		this.skills = skills;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return skills.getSkilldesc();
	}
	

}