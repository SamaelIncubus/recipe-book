package com.pra.recipe.entity.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "recipe")
public class Recipe implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotEmpty
	private String name;

	@NotNull
	private long cheft;

	@NotNull
	private long category;

	@NotNull
	private long ingredient_1;
	@NotNull
	private long ingredient_2;
	
	private long ingredient_3;
	private long ingredient_4;
	private long ingredient_5;
	private long ingredient_6;
	private long ingredient_7;
	private long ingredient_8;
	private long ingredient_9;

	@NotEmpty
	private String step_1;
	@NotEmpty
	private String step_2;

	private String step_3;
	private String step_4;
	private String step_5;
	private String step_6;
	private String step_7;
	private String step_8;
	private String step_9;

	public void setId(long id) {
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getCheft() {
		return cheft;
	}

	public void setCheft(int cheft) {
		this.cheft = cheft;
	}

	public long getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public long getIngredient_1() {
		return ingredient_1;
	}

	public void setIngredient_1(int ingredient_1) {
		this.ingredient_1 = ingredient_1;
	}

	public long getIngredient_2() {
		return ingredient_2;
	}

	public void setIngredient_2(int ingredient_2) {
		this.ingredient_2 = ingredient_2;
	}

	public long getIngredient_3() {
		return ingredient_3;
	}

	public void setIngredient_3(int ingredient_3) {
		this.ingredient_3 = ingredient_3;
	}

	public long getIngredient_4() {
		return ingredient_4;
	}

	public void setIngredient_4(int ingredient_4) {
		this.ingredient_4 = ingredient_4;
	}

	public long getIngredient_5() {
		return ingredient_5;
	}

	public void setIngredient_5(int ingredient_5) {
		this.ingredient_5 = ingredient_5;
	}

	public long getIngredient_6() {
		return ingredient_6;
	}

	public void setIngredient_6(int ingredient_6) {
		this.ingredient_6 = ingredient_6;
	}

	public long getIngredient_7() {
		return ingredient_7;
	}

	public void setIngredient_7(int ingredient_7) {
		this.ingredient_7 = ingredient_7;
	}

	public long getIngredient_8() {
		return ingredient_8;
	}

	public void setIngredient_8(int ingredient_8) {
		this.ingredient_8 = ingredient_8;
	}

	public long getIngredient_9() {
		return ingredient_9;
	}

	public void setIngredient_9(int ingredient_9) {
		this.ingredient_9 = ingredient_9;
	}

	public String getStep_1() {
		return step_1;
	}

	public void setStep_1(String step_1) {
		this.step_1 = step_1;
	}

	public String getStep_2() {
		return step_2;
	}

	public void setStep_2(String step_2) {
		this.step_2 = step_2;
	}

	public String getStep_3() {
		return step_3;
	}

	public void setStep_3(String step_3) {
		this.step_3 = step_3;
	}

	public String getStep_4() {
		return step_4;
	}

	public void setStep_4(String step_4) {
		this.step_4 = step_4;
	}

	public String getStep_5() {
		return step_5;
	}

	public void setStep_5(String step_5) {
		this.step_5 = step_5;
	}

	public String getStep_6() {
		return step_6;
	}

	public void setStep_6(String step_6) {
		this.step_6 = step_6;
	}

	public String getStep_7() {
		return step_7;
	}

	public void setStep_7(String step_7) {
		this.step_7 = step_7;
	}

	public String getStep_8() {
		return step_8;
	}

	public void setStep_8(String step_8) {
		this.step_8 = step_8;
	}

	public String getStep_9() {
		return step_9;
	}

	public void setStep_9(String step_9) {
		this.step_9 = step_9;
	}

	public Recipe(@NotEmpty String name, @NotNull int cheft, @NotNull int category, @NotNull int ingredient_1,
			@NotNull int ingredient_2, int ingredient_3, int ingredient_4, int ingredient_5, int ingredient_6,
			int ingredient_7, int ingredient_8, int ingredient_9, @NotEmpty String step_1,
			@NotEmpty String step_2, String step_3, String step_4, String step_5, String step_6, String step_7,
			String step_8, String step_9) {
		super();
		this.name = name;
		this.cheft = cheft;
		this.category = category;
		this.ingredient_1 = ingredient_1;
		this.ingredient_2 = ingredient_2;
		this.ingredient_3 = ingredient_3;
		this.ingredient_4 = ingredient_4;
		this.ingredient_5 = ingredient_5;
		this.ingredient_6 = ingredient_6;
		this.ingredient_7 = ingredient_7;
		this.ingredient_8 = ingredient_8;
		this.ingredient_9 = ingredient_9;
		this.step_1 = step_1;
		this.step_2 = step_2;
		this.step_3 = step_3;
		this.step_4 = step_4;
		this.step_5 = step_5;
		this.step_6 = step_6;
		this.step_7 = step_7;
		this.step_8 = step_8;
		this.step_9 = step_9;
	}

	public Recipe() {
		super();
	}
}
