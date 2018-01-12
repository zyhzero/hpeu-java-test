/* 2018-1-10 */
-- 创建数据库
CREATE DATABASE db_hpeutest;

-- 创建专业表
CREATE TABLE t_specialty (
	id BIGINT(20) NOT NULL AUTO_INCREMENT PRIMARY KEY COMMENT "id",
  specialty VARCHAR(255) COMMENT "专业"
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 创建方向表
CREATE TABLE t_direction (
	id BIGINT(20) NOT NULL AUTO_INCREMENT PRIMARY KEY COMMENT "id",
  specialty_id BIGINT(20) NOT NULL COMMENT "specialty_id",
  direction VARCHAR(255) COMMENT "方向",
  CONSTRAINT fk_specialty_direction_id FOREIGN KEY (specialty_id) REFERENCES t_specialty (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 创建用户表
CREATE TABLE t_user (
	id BIGINT(20) NOT NULL AUTO_INCREMENT PRIMARY KEY COMMENT "id",
  sno int(20) NOT NULL COMMENT "学号",
	name VARCHAR(255) NOT NULL COMMENT "姓名",
	gender VARCHAR(255) COMMENT "性别",
  specialty_id BIGINT(20) NOT NULL COMMENT "专业",
  direction_id BIGINT(20) NOT NULL COMMENT "方向",
  skill INT(10) COMMENT "技能",
  ability INT(10) COMMENT "能力",
	createTime TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT "创建时间",
	updateTime TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT "更新时间",
  CONSTRAINT fk_user_specialty_id FOREIGN KEY (specialty_id) REFERENCES t_specialty (id),
	CONSTRAINT fk_user_direction_id FOREIGN KEY (direction_id) REFERENCES t_direction (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;


-- 专业表添加数据
INSERT INTO `t_specialty` (`id`, `specialty`)
VALUES
(1, '教育学'),
(2, '天文学'),
(3, '数学'),
(4, '电子信息'),
(5, '中文语言文学');

-- 方向表添加数据
INSERT INTO `t_direction` (`id`, `specialty_id`, `direction`)
VALUES
(1,1,'学前教育学'),
(2,1,'高等教育学'),
(3,1,'成人教育学'),
(4,1,'职业技术教育学'),
(5,2, '天体物理'),
(6,2, '天体测量'),
(7,2, '天体力学'),
(8,3, '基础数学'),
(9,3, '计算数学'),
(10,3, '应用数学'),
(11,3, '概率论与数理统计'),
(12,3, '运筹学与控制论'),
(13,4, '物理电子学'),
(14,4, '电路与系统'),
(15,4, '无线电物流'),
(16,4, '信号与信息处理'),
(17,4, '电子与通信工程'),
(18,4, '电磁场与微波技术'),
(19,5, '文艺学'),
(20,5, '中国古代文学'),
(21,5, '中国现当代文学'),
(22,5, '汉语言文学'),
(23,5, '广播影视文艺学');

-- 用户表添加数据
INSERT INTO `t_user` (`id`, `sno`, `NAME`, `gender`, `specialty_id`, `direction_id`, `skill`, `ability`)
VALUES
(1, 201801, '房司令', '男', 1, 3, 99, 99),
(2, 201802, '王阳', '女', 3, 10, 98, 98);





-- 查询所有用户
SELECT u.sno, u.name, u.gender, ds.specialty, ds.direction, u.skill, u.ability
FROM t_user u
LEFT JOIN (
SELECT d.id ,s.specialty, d.direction
FROM t_specialty s
RIGHT JOIN t_direction d
ON s.id=d.specialty_id
)ds
ON u.direction_id=ds.id
where u.gender='女' AND ds.id=10;



-- ------------------------------------------------------------------------------------------------------
-- 挣扎之后的简单表
-- 创建见简单用户表！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！
CREATE TABLE t_usersingle (
	id BIGINT(20) NOT NULL AUTO_INCREMENT PRIMARY KEY COMMENT "id",
  sno int(20) NOT NULL COMMENT "学号",
	name VARCHAR(255) NOT NULL COMMENT "姓名",
	gender VARCHAR(255) COMMENT "性别",
  specialty VARCHAR(255) NOT NULL COMMENT "专业",
  direction VARCHAR(255) NOT NULL COMMENT "方向",
  skill INT(10) COMMENT "技能",
  ability INT(10) COMMENT "能力",
	createTime TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT "创建时间",
	updateTime TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT "更新时间"
)ENGINE=InnoDB DEFAULT CHARSET=utf8;



-- 用户表简单表添加数据
INSERT INTO `t_usersingle` (`id`, `sno`, `NAME`, `gender`, `specialty`, `direction`, `skill`, `ability`)
VALUES
(1, 201801, '房司令', '男', '软件工程', '大数据', 99, 99),
(2, 201802, '王阳', '女', '软件工程', '通信', 98, 98),
(3, 201803, '张小三', '男', '软件工程', 'Java', 99, 99),
(4, 201804, '李小四', '男', '软件工程', 'Web前端', 99, 99),
(5, 201805, '王小五', '男', '数学', '应用数学', 99, 99);


-- 查询所有用户
		SELECT
		u.sno,
		u.name,
		u.gender,
		u.specialty,
		u.direction,
		u.skill,
		u.ability
		FROM
		t_usersingle u






