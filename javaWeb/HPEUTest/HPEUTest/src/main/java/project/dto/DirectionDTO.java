package project.dto;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class DirectionDTO {

	// 专业id
	private BigInteger specialty_id;

	// 方向
	private String direction;
	
	// 方向列表
//	private List<SpecialtyDTO> specialtys = new ArrayList<>();

	public BigInteger getSpecialty_id() {
		return specialty_id;
	}

	public void setSpecialty_id(BigInteger specialty_id) {
		this.specialty_id = specialty_id;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	/**
	 * TODO 不一定对！！！ 判断外部传入的专业有哪些方向
	 * 
	 * @param direction
	 * @return
	 */
	/*public Boolean isHaveDirection(SpecialtyDTO specialty) {
		// 循环遍历角色权限关联
		for (SpecialtyDTO currentSpecialty : specialtys) {
			// 两个专业的id相等
			if (currentSpecialty.getId() == DirectionDTO.get()) {
				return true;
			}
		}

		
		return false;
	}*/

}
