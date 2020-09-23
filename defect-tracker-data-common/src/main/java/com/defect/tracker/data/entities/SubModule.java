package com.defect.tracker.data.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(schema = "defect-tracker", name = "sub_module")
public class SubModule {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	@ManyToOne
	@JoinColumn(name = "moduleId", nullable = false)
	private Module module;
	@ManyToMany(fetch = FetchType.EAGER)
	  @JoinTable(name = "subModule_user",
	      joinColumns = {@JoinColumn(name = "subModule_id", referencedColumnName = "id")},
	      inverseJoinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id")})
	private List<User> user;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Module getModule() {
		return module;
	}

	public void setModule(Module module) {
		this.module = module;
	}

	public List<User> getUser() {
		return user;
	}

	public void setUser(List<User> user) {
		this.user = user;
	}
}