package com.cg.tms.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author trainee
 *
 */
@Entity
@Table(name = "skill")
public class Skill implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ_SKILL")
	@SequenceGenerator(sequenceName = "seq_skill", allocationSize = 1, name = "SEQ_SKILL")
@Column(name="skillid")
	private int skillId;
	@Column(name = "skill_desc")
	private String skilldesc;

	public Skill() {
	}

	public Skill(int skillId, String skilldesc) {
		this.skillId = skillId;
		this.skilldesc = skilldesc;
	}

	public int getSkillId() {
		return skillId;
	}

	public void setSkillId(int skillId) {
		this.skillId = skillId;
	}

	public String getSkilldesc() {
		return skilldesc;
	}

	public void setSkilldesc(String skilldesc) {
		this.skilldesc = skilldesc;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Skills: "+skilldesc;
	}
	
	

}
