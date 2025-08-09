-- User schema
SET NAMES utf8mb4;

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id`        BIGINT       NOT NULL,
  `user_name`      VARCHAR(64)  NOT NULL,
  `password`       VARCHAR(128) NOT NULL,
  `phone`          VARCHAR(32)  NULL,
  `email`          VARCHAR(64)  NULL,
  `status`         TINYINT      NOT NULL DEFAULT 1,
  `register_time`  DATETIME     NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `last_login_time` DATETIME    NULL,
  `update_time`    DATETIME     NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `deleted`        TINYINT      NOT NULL DEFAULT 0,
  PRIMARY KEY (`user_id`),
  UNIQUE KEY `uk_user_name` (`user_name`),
  UNIQUE KEY `uk_phone` (`phone`),
  UNIQUE KEY `uk_email` (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户';

DROP TABLE IF EXISTS `user_address`;
CREATE TABLE `user_address` (
  `address_id`   BIGINT      NOT NULL,
  `user_id`      BIGINT      NOT NULL,
  `receiver`     VARCHAR(64) NOT NULL,
  `phone`        VARCHAR(32) NOT NULL,
  `province`     VARCHAR(64) NOT NULL,
  `city`         VARCHAR(64) NOT NULL,
  `district`     VARCHAR(64) NOT NULL,
  `detail`       VARCHAR(255) NOT NULL,
  `is_default`   TINYINT     NOT NULL DEFAULT 0,
  `create_time`  DATETIME    NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time`  DATETIME    NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `deleted`      TINYINT     NOT NULL DEFAULT 0,
  PRIMARY KEY (`address_id`),
  KEY `idx_user` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户地址'; 