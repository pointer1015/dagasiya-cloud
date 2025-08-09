-- Seckill schema
SET NAMES utf8mb4;

DROP TABLE IF EXISTS `seckill_activity`;
CREATE TABLE `seckill_activity` (
  `activity_id`      BIGINT       NOT NULL,
  `activity_name`    VARCHAR(128) NOT NULL,
  `description`      TEXT         NULL,
  `start_time`       DATETIME     NOT NULL,
  `end_time`         DATETIME     NOT NULL,
  `preheat_time`     DATETIME     NULL,
  `status`           TINYINT      NOT NULL DEFAULT 0,
  `publish_status`   TINYINT      NOT NULL DEFAULT 0,
  `session_id`       VARCHAR(64)  NULL,
  `qps_limit`        INT          NULL,
  `concurrency_limit` INT         NULL,
  `promotion_rules`  TEXT         NULL,
  `limit_per_user`   INT          NULL,
  `create_time`      DATETIME     NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time`      DATETIME     NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `deleted`          TINYINT      NOT NULL DEFAULT 0,
  PRIMARY KEY (`activity_id`),
  KEY `idx_time` (`start_time`,`end_time`),
  KEY `idx_publish` (`publish_status`),
  KEY `idx_session` (`session_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='秒杀活动';

DROP TABLE IF EXISTS `seckill_goods`;
CREATE TABLE `seckill_goods` (
  `seckill_goods_id` BIGINT       NOT NULL,
  `activity_id`      BIGINT       NOT NULL,
  `goods_id`         BIGINT       NULL,
  `sku_id`           BIGINT       NOT NULL,
  `seckill_price`    DECIMAL(10,2) NOT NULL,
  `seckill_stock`    INT          NOT NULL,
  `init_stock`       INT          NOT NULL,
  `sold_stock`       INT          NOT NULL DEFAULT 0,
  `limit_per_user`   INT          NULL,
  `status`           TINYINT      NOT NULL DEFAULT 0,
  `version`          INT          NOT NULL DEFAULT 0,
  `create_time`      DATETIME     NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time`      DATETIME     NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `deleted`          TINYINT      NOT NULL DEFAULT 0,
  PRIMARY KEY (`seckill_goods_id`),
  UNIQUE KEY `uk_activity_sku` (`activity_id`,`sku_id`),
  KEY `idx_activity` (`activity_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='秒杀活动商品';

DROP TABLE IF EXISTS `seckill_token`;
CREATE TABLE `seckill_token` (
  `token_id`      VARCHAR(64)  NOT NULL,
  `user_id`       BIGINT       NOT NULL,
  `activity_id`   BIGINT       NOT NULL,
  `seckill_goods_id` BIGINT    NOT NULL,
  `create_time`   DATETIME     NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `expire_time`   DATETIME     NOT NULL,
  `status`        TINYINT      NOT NULL DEFAULT 0,
  `request_id`    VARCHAR(64)  NULL,
  `ip`            VARCHAR(64)  NULL,
  `user_agent`    VARCHAR(255) NULL,
  `shard_key`     VARCHAR(64)  NULL,
  `used_time`     DATETIME     NULL,
  PRIMARY KEY (`token_id`),
  UNIQUE KEY `uk_user_activity_sku` (`user_id`,`activity_id`,`seckill_goods_id`),
  KEY `idx_expire` (`expire_time`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='秒杀令牌'; 