/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 50647
 Source Host           : localhost:3306
 Source Schema         : rrs

 Target Server Type    : MySQL
 Target Server Version : 50647
 File Encoding         : 65001

 Date: 16/10/2023 12:07:50
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for record
-- ----------------------------
DROP TABLE IF EXISTS `record`;
CREATE TABLE `record`  (
  `id` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `base_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `order_center` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `order_center_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `seller_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `产地` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `product` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `brand` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `num` int(20) NULL DEFAULT NULL,
  `配车数量` int(20) NULL DEFAULT NULL,
  `单位` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `Length` int(25) NULL DEFAULT NULL,
  `weight` int(20) NULL DEFAULT NULL,
  `volume` int(20) NULL DEFAULT NULL,
  `deadline` int(20) NULL DEFAULT NULL,
  `time` int(20) NULL DEFAULT NULL,
  `最终客户` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `最终客户名称` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `配车方式` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of record
-- ----------------------------
INSERT INTO `record` VALUES ('1386153996', '武汉基地', 'WFZ11', '福州配送中心', '福州中心', 'F10402', '104-热水器', '089-统帅', 5, 5, 'TAI', 0, 115, 1, 19000120, 19000120, '0E99999013', '日日顺福州配送中心', NULL);
INSERT INTO `record` VALUES ('1386154235', '武汉基地', 'WFZ11', '福州配送中心', '福州中心', 'F10402', '104-热水器', '089-统帅', 5, 5, 'TAI', 0, 115, 1, 19000120, 19000120, '0E99999013', '日日顺福州配送中心', NULL);
INSERT INTO `record` VALUES ('1386350319', '武汉基地', 'WXN11', '西宁配送中心', '西宁中心', 'F10708', '107-冷柜', '000-海尔', 5, 5, 'TAI', 0, 220, 3, 19000120, 19000120, '0E50076321', '格尔木广飞电器经营部', NULL);
INSERT INTO `record` VALUES ('1386154011', '武汉基地', 'WAS11', '阿克苏配送中心', '阿克苏中心', 'F10402', '104-热水器', '000-海尔', 10, 10, 'TAI', 0, 220, 2, 19000120, 19000120, '0E99999069', '日日顺阿克苏配送中心', NULL);
INSERT INTO `record` VALUES ('1386350530', '武汉基地', 'WXN11', '西宁配送中心', '西宁中心', 'F10708', '107-冷柜', '000-海尔', 6, 6, 'TAI', 0, 264, 4, 19000120, 19000120, '0E99999077', '日日顺西宁配送中心', NULL);
INSERT INTO `record` VALUES ('1386154298', '武汉基地', 'WXM11', '厦门配送中心', '厦门中心', 'F10402', '104-热水器', '000-海尔', 20, 20, 'TAI', 0, 380, 3, 19000120, 19000120, '0E99999079', '日日顺厦门配送中心', NULL);
INSERT INTO `record` VALUES ('1386154044', '武汉基地', 'WXM11', '厦门配送中心', '厦门中心', 'F10402', '104-热水器', '000-海尔', 15, 15, 'TAI', 0, 345, 3, 19000120, 19000120, '0E99999079', '日日顺厦门配送中心', NULL);
INSERT INTO `record` VALUES ('1386154045', '武汉基地', 'WXM11', '厦门配送中心', '厦门中心', 'F10402', '104-热水器', '000-海尔', 15, 15, 'TAI', 0, 345, 3, 19000120, 19000120, '0E99999079', '日日顺厦门配送中心', NULL);
INSERT INTO `record` VALUES ('1386154297', '武汉基地', 'WXM11', '厦门配送中心', '厦门中心', 'F10402', '104-热水器', '000-海尔', 20, 20, 'TAI', 0, 380, 3, 19000120, 19000120, '0E99999079', '日日顺厦门配送中心', NULL);
INSERT INTO `record` VALUES ('1386154219', '武汉基地', 'WYC11', '银川配送中心', '银川中心', 'F10402', '104-热水器', '000-海尔', 10, 10, 'TAI', 0, 220, 2, 19000120, 19000120, '0E99999084', '日日顺银川配送中心', NULL);
INSERT INTO `record` VALUES ('1386446987', '武汉基地', 'WXN11', '西宁配送中心', '西宁中心', 'F10708', '107-冷柜', '000-海尔', 1, 1, 'TAI', 0, 44, 1, 19000120, 19000120, '0E99999077', '日日顺西宁配送中心', NULL);
INSERT INTO `record` VALUES ('1386154013', '武汉基地', 'WAS11', '阿克苏配送中心', '阿克苏中心', 'F10402', '104-热水器', '000-海尔', 100, 100, 'TAI', 0, 1500, 14, 19000120, 19000120, '0E99999069', '日日顺阿克苏配送中心', NULL);
INSERT INTO `record` VALUES ('1386154085', '武汉基地', 'WNP11', '南平配送中心', '南平中心', 'F10402', '104-热水器', '000-海尔', 5, 5, 'TAI', 0, 95, 1, 19000120, 19000120, '0E99999014', '日日顺南平配送中心', NULL);
INSERT INTO `record` VALUES ('1386153920', '武汉基地', 'WQZ11', '泉州海尔工贸有限公司', '泉州中心', 'F10402', '104-热水器', '000-海尔', 1, 1, 'TAI', 0, 18, 0, 19000120, 19000120, '0E99999105', '日日顺泉州配送中心', NULL);
INSERT INTO `record` VALUES ('1386350345', '武汉基地', 'WXN11', '西宁配送中心', '西宁中心', 'F10708', '107-冷柜', '000-海尔', 3, 3, 'TAI', 0, 132, 2, 19000120, 19000120, '0E50092572', '青海湖南大街伟强家电家具城', NULL);
INSERT INTO `record` VALUES ('1386154012', '武汉基地', 'WAS11', '阿克苏配送中心', '阿克苏中心', 'F10402', '104-热水器', '000-海尔', 100, 100, 'TAI', 0, 1900, 17, 19000120, 19000120, '0E99999069', '日日顺阿克苏配送中心', NULL);
INSERT INTO `record` VALUES ('1386154046', '武汉基地', 'WXM11', '厦门配送中心', '厦门中心', 'F10402', '104-热水器', '000-海尔', 15, 15, 'TAI', 0, 345, 3, 19000120, 19000120, '0E99999079', '日日顺厦门配送中心', NULL);
INSERT INTO `record` VALUES ('1386154300', '武汉基地', 'WXM11', '厦门配送中心', '厦门中心', 'F10402', '104-热水器', '000-海尔', 10, 10, 'TAI', 0, 190, 2, 19000120, 19000120, '0E99999079', '日日顺厦门配送中心', NULL);
INSERT INTO `record` VALUES ('1386350316', '武汉基地', 'WXN11', '西宁配送中心', '西宁中心', 'F10708', '107-冷柜', '000-海尔', 4, 4, 'TAI', 0, 176, 2, 19000120, 19000120, '0E50176262', '互助县鑫鑫家电部', NULL);
INSERT INTO `record` VALUES ('1386356066', '武汉基地', 'WCD11', '成都配送中心', '成都中心', 'F10708', '107-冷柜', '000-海尔', 50, 50, 'TAI', 0, 2200, 30, 19000120, 19000120, '0E99999009', '日日顺成都配送中心', NULL);
INSERT INTO `record` VALUES ('1386350528', '武汉基地', 'WXN11', '西宁配送中心', '西宁中心', 'F10708', '107-冷柜', '000-海尔', 10, 10, 'TAI', 0, 440, 6, 19000120, 19000120, '0E99999077', '日日顺西宁配送中心', NULL);
INSERT INTO `record` VALUES ('1386154327', '武汉基地', 'WQZ11', '泉州海尔工贸有限公司', '泉州中心', 'F10402', '104-热水器', '000-海尔', 30, 30, 'TAI', 0, 630, 6, 19000120, 19000120, '0E99999105', '日日顺泉州配送中心', NULL);
INSERT INTO `record` VALUES ('1386154296', '武汉基地', 'WXM11', '厦门配送中心', '厦门中心', 'F10402', '104-热水器', '000-海尔', 20, 20, 'TAI', 0, 380, 3, 19000120, 19000120, '0E99999079', '日日顺厦门配送中心', NULL);
INSERT INTO `record` VALUES ('1386154299', '武汉基地', 'WXM11', '厦门配送中心', '厦门中心', 'F10402', '104-热水器', '000-海尔', 10, 10, 'TAI', 0, 190, 2, 19000120, 19000120, '0E99999079', '日日顺厦门配送中心', NULL);
INSERT INTO `record` VALUES ('1386350343', '武汉基地', 'WXN11', '西宁配送中心', '西宁中心', 'F10708', '107-冷柜', '000-海尔', 20, 20, 'TAI', 0, 880, 12, 19000120, 19000120, '0E50180092', '林芝县八一镇国百电器商城', NULL);
INSERT INTO `record` VALUES ('1386153919', '武汉基地', 'WDW11', '龙岩配送中心', '龙岩中心', 'F10402', '104-热水器', '000-海尔', 1, 1, 'TAI', 0, 18, 0, 19000120, 19000120, '0E99999078', '日日顺龙岩配送中心', NULL);
INSERT INTO `record` VALUES ('1386154268', '武汉基地', 'WLH11', '漯河配送中心', '漯河中心', 'F10402', '104-热水器', '089-统帅', 3, 3, 'TAI', 0, 69, 1, 19000120, 19000120, '0E99999086', '日日顺漯河配送中心', NULL);
INSERT INTO `record` VALUES ('1386447188', '武汉基地', 'WXN11', '西宁配送中心', '西宁中心', 'F10708', '107-冷柜', '000-海尔', 1, 1, 'TAI', 0, 51, 1, 19000120, 19000120, '0E99999077', '日日顺西宁配送中心', NULL);
INSERT INTO `record` VALUES ('1386350295', '武汉基地', 'WXN11', '西宁配送中心', '西宁中心', 'F10708', '107-冷柜', '000-海尔', 10, 10, 'TAI', 0, 440, 6, 19000120, 19000120, '0E50180092', '林芝县八一镇国百电器商城', NULL);

SET FOREIGN_KEY_CHECKS = 1;
