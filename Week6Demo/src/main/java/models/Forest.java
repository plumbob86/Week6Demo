/**
 * @author lscha - lrschanus
 * CIS175 - Fall 2021
 * Sep 27, 2023
 */
package models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author lscha
 *
 */
@Entity(name = "forest")
@Table(name = "forest")
public class Forest {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int forestId;
	private String location;
	private String name;
	@OneToMany(mappedBy = "forest")
	private List<Tree> trees;

	public int getForestId() {
		return forestId;
	}

	public void setForestId(int forestId) {
		this.forestId = forestId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Tree> getTrees() {
		return trees;
	}

	public void setTrees(List<Tree> trees) {
		this.trees = trees;
	}

}
