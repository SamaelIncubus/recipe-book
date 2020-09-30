package com.pra.recipe.entity.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "cheft")
public class Cheft implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotEmpty
	private String name;

	@NotEmpty
	private String prestige;

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

	public String getPrestige() {
		return prestige;
	}

	public void setPrestige(String prestige) {
		this.prestige = prestige;
	}

	public Cheft(long id, @NotEmpty String name, @NotEmpty String prestige) {
		super();
		this.id = id;
		this.name = name;
		this.prestige = prestige;
	}

	public Cheft() {
	}

}
