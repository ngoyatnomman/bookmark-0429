/*
 Navicat MySQL Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50723
 Source Host           : localhost:3306
 Source Schema         : bookmark

 Target Server Type    : MySQL
 Target Server Version : 50723
 File Encoding         : 65001

 Date: 30/01/2020 17:37:37
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for category
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `category` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 13 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of category
-- ----------------------------
INSERT INTO `category` VALUES (1, 'Python');
INSERT INTO `category` VALUES (2, 'Java');
INSERT INTO `category` VALUES (3, 'FFmpeg');
INSERT INTO `category` VALUES (4, '语言');
INSERT INTO `category` VALUES (5, '你懂的');
INSERT INTO `category` VALUES (6, 'C语言');
INSERT INTO `category` VALUES (7, '电子');
INSERT INTO `category` VALUES (8, '视频');
INSERT INTO `category` VALUES (9, '前端');
INSERT INTO `category` VALUES (10, '音乐');
INSERT INTO `category` VALUES (11, '其他');

SET FOREIGN_KEY_CHECKS = 1;
