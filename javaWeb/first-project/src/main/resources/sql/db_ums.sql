/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50634
Source Host           : localhost:3306
Source Database       : db_ums

Target Server Type    : MYSQL
Target Server Version : 50634
File Encoding         : 65001

Date: 2017-11-22 10:35:21
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `db_department`
-- ----------------------------
DROP TABLE IF EXISTS `db_department`;
CREATE TABLE `db_department` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `createDate` date DEFAULT NULL,
  `departmentName` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of db_department
-- ----------------------------
INSERT INTO `db_department` VALUES ('1', '2017-11-03', '开发部', '开发的软件部门');
INSERT INTO `db_department` VALUES ('4', '2017-11-07', '设计部', '设计的顾客需要的东西');
INSERT INTO `db_department` VALUES ('17', '2017-11-07', '财务部', '管理公司财政');
INSERT INTO `db_department` VALUES ('18', '2017-11-07', '公关部', '管理公司的公关');
INSERT INTO `db_department` VALUES ('19', '2017-11-07', '人事部', '管理人员来往');

-- ----------------------------
-- Table structure for `db_jurisdiction`
-- ----------------------------
DROP TABLE IF EXISTS `db_jurisdiction`;
CREATE TABLE `db_jurisdiction` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `createDate` date DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `jurisdictionName` varchar(255) DEFAULT NULL,
  `styleType` varchar(255) DEFAULT NULL,
  `uri` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of db_jurisdiction
-- ----------------------------
INSERT INTO `db_jurisdiction` VALUES ('1', '2017-11-03', '用来管理用户', '用户管理', 'iconfont icon-role', '/user/list');
INSERT INTO `db_jurisdiction` VALUES ('4', '2017-11-05', '用来管理角色以及分配角色的权限', '角色管理', 'iconfont icon-role1', '/role/list');
INSERT INTO `db_jurisdiction` VALUES ('5', '2017-11-04', '用来管理权限', '权限管理', 'iconfont icon-ic-control-Jurisdiction', '/jurisdiction/list');
INSERT INTO `db_jurisdiction` VALUES ('7', '2017-11-06', '部门管理', '部门管理', 'iconfont icon-yunpingtaitubiao_department', '/department/list');
INSERT INTO `db_jurisdiction` VALUES ('8', '2017-11-02', '可以查看系统的信息', '数据分析', 'iconfont icon-datastatistics1', '/chart/charts');
INSERT INTO `db_jurisdiction` VALUES ('9', '2017-11-01', '欢迎使用本系统', '欢迎使用', 'iconfont icon-toutiao', '/welcome');

-- ----------------------------
-- Table structure for `db_role`
-- ----------------------------
DROP TABLE IF EXISTS `db_role`;
CREATE TABLE `db_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `createDate` date DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `roleName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of db_role
-- ----------------------------
INSERT INTO `db_role` VALUES ('2', '2017-11-01', '拥有所有的权限', '管理员');
INSERT INTO `db_role` VALUES ('3', '2017-11-05', '能管理用户及部门信息吧', '部门主管');
INSERT INTO `db_role` VALUES ('4', '2017-11-03', '新注册进系统的伙伴，没有操作权限', '游客');

-- ----------------------------
-- Table structure for `db_role_jurisdiction`
-- ----------------------------
DROP TABLE IF EXISTS `db_role_jurisdiction`;
CREATE TABLE `db_role_jurisdiction` (
  `role_id` int(11) NOT NULL,
  `jurisdiction_id` int(11) NOT NULL,
  PRIMARY KEY (`role_id`,`jurisdiction_id`),
  KEY `FK_bqtncvm97x8wehfhl2mksg6kf` (`jurisdiction_id`),
  CONSTRAINT `FK_bqtncvm97x8wehfhl2mksg6kf` FOREIGN KEY (`jurisdiction_id`) REFERENCES `db_jurisdiction` (`id`),
  CONSTRAINT `FK_g4is3owg79l2osjrao3lnbds3` FOREIGN KEY (`role_id`) REFERENCES `db_role` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of db_role_jurisdiction
-- ----------------------------
INSERT INTO `db_role_jurisdiction` VALUES ('2', '1');
INSERT INTO `db_role_jurisdiction` VALUES ('3', '1');
INSERT INTO `db_role_jurisdiction` VALUES ('2', '4');
INSERT INTO `db_role_jurisdiction` VALUES ('2', '5');
INSERT INTO `db_role_jurisdiction` VALUES ('2', '7');
INSERT INTO `db_role_jurisdiction` VALUES ('3', '7');
INSERT INTO `db_role_jurisdiction` VALUES ('2', '8');
INSERT INTO `db_role_jurisdiction` VALUES ('3', '8');
INSERT INTO `db_role_jurisdiction` VALUES ('4', '8');
INSERT INTO `db_role_jurisdiction` VALUES ('2', '9');
INSERT INTO `db_role_jurisdiction` VALUES ('3', '9');
INSERT INTO `db_role_jurisdiction` VALUES ('4', '9');

-- ----------------------------
-- Table structure for `db_user`
-- ----------------------------
DROP TABLE IF EXISTS `db_user`;
CREATE TABLE `db_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `answer` varchar(255) DEFAULT NULL,
  `avatarPath` varchar(255) DEFAULT NULL,
  `createDate` date DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `password` varchar(255) NOT NULL,
  `phone` bigint(20) DEFAULT NULL,
  `question` varchar(255) DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `updateDate` date DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `departmentId` int(11) DEFAULT NULL,
  `roleId` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_967hjharjwm9t14aa4ic401qm` (`departmentId`),
  KEY `FK_kwmu11hanrxqh9kwkkfwpk9qa` (`roleId`),
  CONSTRAINT `FK_967hjharjwm9t14aa4ic401qm` FOREIGN KEY (`departmentId`) REFERENCES `db_department` (`id`),
  CONSTRAINT `FK_kwmu11hanrxqh9kwkkfwpk9qa` FOREIGN KEY (`roleId`) REFERENCES `db_role` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=67 DEFAULT CHARSET=utf8mb4;

-- ----------------------------
-- Records of db_user
-- ----------------------------
INSERT INTO `db_user` VALUES ('1', null, 'images/01.jpg', '2017-11-02', '男', '222222', '18311542354', null, '启用', null, 'sunnyuu', '1', '4');
INSERT INTO `db_user` VALUES ('2', '1124', '/avatar/2.jpg', '2017-11-18', '女', 'may123', '18311544595', '我的生日？', '启用', null, 'mayxie', '19', '2');
INSERT INTO `db_user` VALUES ('8', null, 'images/01.jpg', '2017-11-03', '男', 'wenyou', '13456678909', null, '启用', null, 'wenyou', '19', '4');
INSERT INTO `db_user` VALUES ('9', null, 'images/01.jpg', '2017-10-31', '女', '123456', '18311544595', null, '启用', null, 'lizeyi', '17', '3');
INSERT INTO `db_user` VALUES ('11', null, 'images/01.jpg', '2017-11-03', '男', '123456', '13456678909', null, '启用', null, 'panshuai', '18', '4');
INSERT INTO `db_user` VALUES ('12', null, 'images/01.jpg', '2017-11-05', '男', '123456', '18311544595', null, '启用', null, 'suchenguang', '19', '3');
INSERT INTO `db_user` VALUES ('13', null, 'images/01.jpg', '2017-11-04', '男', '123456', '18396910107', null, '启用', null, 'huangzhongyuan', '4', '3');
INSERT INTO `db_user` VALUES ('61', null, 'images/01.jpg', '2017-11-07', '男', '111111', '18311544884', null, '启用', null, 'zhengdunkun', '19', '4');
INSERT INTO `db_user` VALUES ('62', null, 'images/01.jpg', '2017-11-06', '男', '23455657', '13456678909', null, '启用', null, 'wangmingming', '18', '4');
INSERT INTO `db_user` VALUES ('63', null, 'images/01.jpg', '2017-11-08', '男', '32453345`', '13456678909', null, '启用', null, 'zhoushuren', '18', '4');
INSERT INTO `db_user` VALUES ('64', null, 'images/01.jpg', '2017-11-06', '男', 'werter', '18311544884', null, '启用', null, 'jandon', '17', '4');
INSERT INTO `db_user` VALUES ('65', null, 'images/01.jpg', '2017-11-03', '男', '1234566Y', '18311544884', null, '启用', null, 'mayunbaba', '1', '4');
INSERT INTO `db_user` VALUES ('66', null, 'images/01.jpg', '2017-11-19', '男', '123456', null, null, '启用', null, 'rrrrrrrr', '4', '4');
