/**
 * @author lscha - lrschanus
 * CIS175 - Fall 2021
 * Sep 20, 2023
 */
package models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author lscha
 *
 */
@Entity(name = "trees")
@Table(name = "trees")
public class Tree {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int treeId;

	private String commonName;
	private String latinName;
	private double avgHeight;
	@ManyToOne
	@JoinColumn(name = "FORESTID", nullable=false)
	private Forest forest = new Forest();

	public int getTreeId() {
		return treeId;
	}

	public void setTreeId(int rowId) {
		this.treeId = rowId;
	}

	public String getCommonName() {
		return commonName;
	}

	public void setCommonName(String commonName) {
		this.commonName = commonName;
	}

	public String getLatinName() {
		return latinName;
	}

	public void setLatinName(String latinName) {
		this.latinName = latinName;
	}

	public double getAvgHeight() {
		return avgHeight;
	}

	public void setAvgHeight(double avgHeight) {
		this.avgHeight = avgHeight;
	}

	public Forest getForest() {
		return forest;
	}

	public void setForest(Forest forest) {
		this.forest = forest;
	}
	
	

}
