package project.dto;

import java.math.BigInteger;

public class UserDTO {

	// id
	private BigInteger id;

	// 学号
	private Integer sno;

	// 姓名
	private String name;

	// 性别
	private String gender;

	// 所属专业
	private SpecialtyDTO specialty;

	// 所属方向
	private DirectionDTO direction;

	// 技术
	private Integer skill;

	// 能力
	private Integer ability;

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public Integer getSno() {
		return sno;
	}

	public void setSno(Integer sno) {
		this.sno = sno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public SpecialtyDTO getSpecialty() {
		return specialty;
	}

	public void setSpecialty(SpecialtyDTO specialty) {
		this.specialty = specialty;
	}

	public DirectionDTO getDirection() {
		return direction;
	}

	public void setDirection(DirectionDTO direction) {
		this.direction = direction;
	}

	public Integer getSkill() {
		return skill;
	}

	public void setSkill(Integer skill) {
		this.skill = skill;
	}

	public Integer getAbility() {
		return ability;
	}

	public void setAbility(Integer ability) {
		this.ability = ability;
	}

}
