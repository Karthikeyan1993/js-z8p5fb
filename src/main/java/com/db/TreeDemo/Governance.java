package com.db.TreeDemo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tblGovernance")
public class Governance {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "Level1")
	private String level1;

	@Column(name = "Level2")
	private String level2;

	@Column(name = "Level3")
	private String level3;

	@Column(name = "Level4")
	private String level4;

	@Column(name = "SharepointLink")
	private String spLink;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLevel1() {
		return level1;
	}

	public void setLevel1(String level1) {
		this.level1 = level1;
	}

	public String getLevel2() {
		return level2;
	}

	public void setLevel2(String level2) {
		this.level2 = level2;
	}

	public String getLevel3() {
		return level3;
	}

	public void setLevel3(String level3) {
		this.level3 = level3;
	}

	public String getLevel4() {
		return level4;
	}

	public void setLevel4(String level4) {
		this.level4 = level4;
	}

	public String getSpLink() {
		return spLink;
	}

	public void setSpLink(String spLink) {
		this.spLink = spLink;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((level1 == null) ? 0 : level1.hashCode());
		result = prime * result + ((level2 == null) ? 0 : level2.hashCode());
		result = prime * result + ((level3 == null) ? 0 : level3.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Governance other = (Governance) obj;
		if (level1 == null) {
			if (other.level1 != null)
				return false;
		} else if (!level1.equals(other.level1))
			return false;
		if (level2 == null) {
			if (other.level2 != null)
				return false;
		} else if (!level2.equals(other.level2))
			return false;
		if (level3 == null) {
			if (other.level3 != null)
				return false;
		} else if (!level3.equals(other.level3))
			return false;
		return true;
	}
}
