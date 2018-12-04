/*
Navicat MySQL Data Transfer

Source Server         : 刘坤
Source Server Version : 50621
Source Host           : localhost:3306
Source Database       : system

Target Server Type    : MYSQL
Target Server Version : 50621
File Encoding         : 65001

Date: 2016-07-03 10:37:32
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for airbase
-- ----------------------------
DROP TABLE IF EXISTS `airbase`;
CREATE TABLE `airbase` (
  `f_id` int(11) NOT NULL,
  `carDio` int(11) DEFAULT NULL,
  `nitrOxi` float DEFAULT NULL,
  `ss` float DEFAULT NULL,
  `carmon` float DEFAULT NULL,
  `a_id` int(11) DEFAULT NULL,
  `a_time` datetime DEFAULT NULL,
  KEY `f_id` (`f_id`),
  CONSTRAINT `airbase_ibfk_1` FOREIGN KEY (`f_id`) REFERENCES `pointfield` (`f_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of airbase
-- ----------------------------

-- ----------------------------
-- Table structure for environbase
-- ----------------------------
DROP TABLE IF EXISTS `environbase`;
CREATE TABLE `environbase` (
  `f_id` int(11) NOT NULL,
  `hum` int(11) DEFAULT NULL,
  `tem` varchar(10) DEFAULT NULL,
  `seas` varchar(10) DEFAULT NULL,
  `wearCon` varchar(10) DEFAULT NULL,
  `e_id` int(11) DEFAULT NULL,
  `e_time` datetime DEFAULT NULL,
  KEY `f_id` (`f_id`),
  CONSTRAINT `environbase_ibfk_1` FOREIGN KEY (`f_id`) REFERENCES `pointfield` (`f_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of environbase
-- ----------------------------

-- ----------------------------
-- Table structure for log
-- ----------------------------
DROP TABLE IF EXISTS `log`;
CREATE TABLE `log` (
  `b_id` int(11) NOT NULL,
  `id` int(11) DEFAULT NULL,
  `start` datetime DEFAULT NULL,
  `end` datetime DEFAULT NULL,
  `way` varchar(20) DEFAULT NULL,
  `Other` varchar(255) DEFAULT NULL,
  `point` int(11) DEFAULT NULL,
  PRIMARY KEY (`b_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of log
-- ----------------------------

-- ----------------------------
-- Table structure for pests
-- ----------------------------
DROP TABLE IF EXISTS `pests`;
CREATE TABLE `pests` (
  `f_id` int(11) NOT NULL,
  `pestSort` int(11) DEFAULT NULL,
  `Pests` varchar(10) DEFAULT NULL,
  `Pecent` varchar(10) DEFAULT NULL,
  `p_id` int(11) DEFAULT NULL,
  `p_time` datetime DEFAULT NULL,
  KEY `f_id` (`f_id`),
  CONSTRAINT `pests_ibfk_1` FOREIGN KEY (`f_id`) REFERENCES `pointfield` (`f_id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pests
-- ----------------------------

-- ----------------------------
-- Table structure for pointbase
-- ----------------------------
DROP TABLE IF EXISTS `pointbase`;
CREATE TABLE `pointbase` (
  `pointNum` int(11) NOT NULL AUTO_INCREMENT,
  `fieldNum` int(11) NOT NULL,
  `id` int(11) NOT NULL,
  `fieldSquare` varchar(20) DEFAULT NULL,
  `fieldType` varchar(20) DEFAULT NULL,
  `fieldLoc` varchar(20) DEFAULT NULL,
  `createTime` datetime DEFAULT NULL,
  PRIMARY KEY (`pointNum`)
) ENGINE=InnoDB AUTO_INCREMENT=113 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pointbase
-- ----------------------------
INSERT INTO `pointbase` VALUES ('102', '1', '1', '30', '1', '67', '2016-06-30 18:52:13');
INSERT INTO `pointbase` VALUES ('105', '0', '3', '6', '2', '4', '2016-07-01 15:13:54');
INSERT INTO `pointbase` VALUES ('106', '403', '3', '1', '1', '2', '2016-07-01 15:15:49');
INSERT INTO `pointbase` VALUES ('110', '0', '3', '6', '2', '67', '2016-07-01 20:42:48');
INSERT INTO `pointbase` VALUES ('111', '1', '3', '1234', '2', '12345', '2016-07-01 23:55:08');
INSERT INTO `pointbase` VALUES ('112', '1234', '3', '111', '2', '1234567', '2016-07-01 23:59:51');

-- ----------------------------
-- Table structure for pointfield
-- ----------------------------
DROP TABLE IF EXISTS `pointfield`;
CREATE TABLE `pointfield` (
  `f_id` int(11) NOT NULL,
  `id` int(11) DEFAULT NULL,
  `pointNum` int(11) NOT NULL,
  `state` varchar(20) DEFAULT NULL,
  `Isqual` varchar(10) DEFAULT NULL,
  `notes` varchar(10) DEFAULT NULL,
  `auditDate` datetime DEFAULT NULL,
  PRIMARY KEY (`f_id`),
  KEY `pointNum` (`pointNum`),
  CONSTRAINT `pointfield_ibfk_1` FOREIGN KEY (`pointNum`) REFERENCES `pointbase` (`pointNum`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pointfield
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `userType` varchar(10) NOT NULL,
  `userName` char(10) NOT NULL,
  `password` varchar(10) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '2', 'jonathan', '123456');
INSERT INTO `user` VALUES ('2', '3', 'Michael', '123456');
INSERT INTO `user` VALUES ('3', '1', 'Bulinner', '123456');

-- ----------------------------
-- Table structure for wbase
-- ----------------------------
DROP TABLE IF EXISTS `wbase`;
CREATE TABLE `wbase` (
  `f_id` int(11) NOT NULL,
  `nitContent` varchar(10) DEFAULT NULL,
  `phoContent` varchar(10) DEFAULT NULL,
  `potContent` varchar(10) DEFAULT NULL,
  `microRich` varchar(10) DEFAULT NULL,
  `w_id` int(11) DEFAULT NULL,
  `w_time` datetime DEFAULT NULL,
  PRIMARY KEY (`f_id`),
  CONSTRAINT `wbase_ibfk_1` FOREIGN KEY (`f_id`) REFERENCES `pointfield` (`f_id`) ON DELETE NO ACTION ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of wbase
-- ----------------------------
