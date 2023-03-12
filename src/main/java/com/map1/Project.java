package com.map1;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {

	@Id
	private int pid;

	private String projectName;

	@ManyToMany(mappedBy = "projects")
	 private List<Emp> emps;
	
	
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(int pid, String projectName) {
		super();
		this.pid = pid;
		this.projectName = projectName;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public List<Emp> getEmps() {
		return emps;
	}

	public void setEmps(List<Emp> emps) {
		this.emps = emps;
	}

	
}
