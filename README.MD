# 员工管理小样

> 在 IDEA 开发环境下 <br>
使用 Maven 项目构建工具 <br>
整合 Spring Boot + Spring MVC + Mybatis

## 开发环境

- IDEA
- Maven
- Spring Boot
- Spring
- Spring MVC
- Mybatis
- Vue

## 数据库

```mysql
/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50610
Source Host           : 127.0.0.1:3306
Source Database       : db

Target Server Type    : MYSQL
Target Server Version : 50610
File Encoding         : 65001

Date: 2018-12-31 20:12:59
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `desc` varchar(20) DEFAULT NULL,
  `state` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES ('1', '总经办', '哈哈哈', '1');
INSERT INTO `department` VALUES ('2', '人事部', '呵呵呵', '1');
INSERT INTO `department` VALUES ('3', '业务部', '是是是', '1');

-- ----------------------------
-- Table structure for employee
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `telephone` varchar(20) DEFAULT NULL,
  `hiredate` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '入职时间',
  `state` int(11) DEFAULT NULL COMMENT '状态 离职-在职-',
  `deptID` int(11) DEFAULT NULL COMMENT '部门ID',
  `roleID` int(11) DEFAULT NULL COMMENT '角色ID',
  `admin` bit(1) DEFAULT b'0',
  `loginID` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES ('1', '张三', '18999998887', '2018-09-16 00:00:00', '1', '1', '1', '', '1');
INSERT INTO `employee` VALUES ('2', '李四', '18988889999', '2018-09-15 00:00:00', '1', '2', '2', '\0', '2');
INSERT INTO `employee` VALUES ('3', '王五', '18977776666', '2018-09-16 00:00:00', '1', '3', '3', '\0', '3');
INSERT INTO `employee` VALUES ('9', '周杰伦', '132', '2018-09-18 00:05:00', '1', '2', '2', '\0', '4');
INSERT INTO `employee` VALUES ('10', 'zhangsan', '666', '2018-11-13 14:04:47', '1', '1', '2', '\0', '5');
INSERT INTO `employee` VALUES ('11', 'lisi999', '99999', '2018-11-23 14:04:53', '1', '2', '2', '\0', '6');
INSERT INTO `employee` VALUES ('12', '王五', '18977776666', '2018-11-08 14:04:56', '1', '1', '1', '\0', '7');
INSERT INTO `employee` VALUES ('13', '999', '789789789', '2018-11-02 14:05:00', '0', '3', '2', '\0', '8');
INSERT INTO `employee` VALUES ('14', '987987', '987987', '2018-11-24 14:05:03', '1', '1', '2', '\0', '9');
INSERT INTO `employee` VALUES ('15', '123123', '123123', '2018-11-05 14:05:06', '0', '2', '1', '\0', '10');
INSERT INTO `employee` VALUES ('18', 'asd', '123123123', '2018-11-07 15:34:28', '0', '1', '1', '\0', '13');
INSERT INTO `employee` VALUES ('19', '123', '123', '2018-11-24 15:34:31', '0', '2', '1', '\0', '14');

-- ----------------------------
-- Table structure for login
-- ----------------------------
DROP TABLE IF EXISTS `login`;
CREATE TABLE `login` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of login
-- ----------------------------
INSERT INTO `login` VALUES ('1', '123', '123');
INSERT INTO `login` VALUES ('2', '456', '456');
INSERT INTO `login` VALUES ('3', '789', '789');

-- ----------------------------
-- Table structure for permission
-- ----------------------------
DROP TABLE IF EXISTS `permission`;
CREATE TABLE `permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `parentid` int(11) DEFAULT NULL,
  `url` varchar(200) DEFAULT NULL,
  `name` varchar(200) DEFAULT NULL,
  `desc` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of permission
-- ----------------------------
INSERT INTO `permission` VALUES ('1', '0', null, '测试管理', '系统管理');
INSERT INTO `permission` VALUES ('2', '1', '/ssm/toEmp', '员工管理', '管理员工');
INSERT INTO `permission` VALUES ('3', '1', 'http://www.baidu.com', '部门管理', '管理部门');
INSERT INTO `permission` VALUES ('4', '1', 'http://www.baidu.com', '角色管理', '管理角色');
INSERT INTO `permission` VALUES ('5', '0', null, '业务管理', '业务管理');
INSERT INTO `permission` VALUES ('6', '5', 'http://www.baidu.com', '订单管理', '用户下单');
INSERT INTO `permission` VALUES ('7', '5', 'http://www.baidu.com', '调度管理', '车辆调度');
INSERT INTO `permission` VALUES ('8', '5', 'http://www.baidu.com', '站点管理', '管理站点');

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) DEFAULT NULL,
  `desc` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', '超级管理员', '系统所有的操作都行');
INSERT INTO `role` VALUES ('2', '员工管理员', '管理公司员工');
INSERT INTO `role` VALUES ('3', '业务管理员', '公司业务操作');

-- ----------------------------
-- Table structure for role_per
-- ----------------------------
DROP TABLE IF EXISTS `role_per`;
CREATE TABLE `role_per` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `rid` int(11) DEFAULT NULL,
  `pid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role_per
-- ----------------------------
INSERT INTO `role_per` VALUES ('1', '2', '2');
INSERT INTO `role_per` VALUES ('2', '2', '3');
INSERT INTO `role_per` VALUES ('3', '2', '4');
INSERT INTO `role_per` VALUES ('4', '3', '6');
INSERT INTO `role_per` VALUES ('5', '3', '7');
INSERT INTO `role_per` VALUES ('6', '3', '8');
INSERT INTO `role_per` VALUES ('7', '2', '6');
INSERT INTO `role_per` VALUES ('8', '1', '2');
INSERT INTO `role_per` VALUES ('9', '1', '3');
INSERT INTO `role_per` VALUES ('10', '1', '4');
INSERT INTO `role_per` VALUES ('11', '1', '6');
INSERT INTO `role_per` VALUES ('12', '1', '7');
INSERT INTO `role_per` VALUES ('13', '1', '8');

```
