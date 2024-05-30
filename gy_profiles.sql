/*
 Navicat Premium Data Transfer

 Source Server         : local
 Source Server Type    : MySQL
 Source Server Version : 50716
 Source Host           : localhost:3306
 Source Schema         : gy

 Target Server Type    : MySQL
 Target Server Version : 50716
 File Encoding         : 65001

 Date: 29/05/2024 19:38:04
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for gy_profiles
-- ----------------------------
DROP TABLE IF EXISTS `gy_profiles`;
CREATE TABLE `gy_profiles`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '种类名',
  `kind` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '所属种类',
  `same` int(20) NOT NULL COMMENT '种植面积',
  `season` varchar(10) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL DEFAULT '0' COMMENT '成熟季节',
  `yield` int(20) NOT NULL DEFAULT 0 COMMENT '产量',
  `del_flag` tinyint(2) NOT NULL DEFAULT 0 COMMENT '逻辑删除(0:删除,1：正常)',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of gy_profiles
-- ----------------------------
INSERT INTO `gy_profiles` VALUES (1, '红富士', '苹果', 100, '春天', 200, 0);
INSERT INTO `gy_profiles` VALUES (2, '巨无霸', '香蕉', 0, '夏天', 0, 0);

SET FOREIGN_KEY_CHECKS = 1;
