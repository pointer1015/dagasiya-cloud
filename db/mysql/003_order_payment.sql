-- Order & Payment schema
SET NAMES utf8mb4;

DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders` (
  `order_id`        VARCHAR(64)  NOT NULL,
  `user_id`         BIGINT       NOT NULL,
  `order_type`      TINYINT      NOT NULL DEFAULT 0 COMMENT '0-普通，1-秒杀',
  `original_amount` DECIMAL(10,2) NULL,
  `discount_amount` DECIMAL(10,2) NULL,
  `amount`          DECIMAL(10,2) NOT NULL,
  `pay_amount`      DECIMAL(10,2) NULL,
  `freight`         DECIMAL(10,2) NULL,
  `currency`        VARCHAR(16)  NULL,
  `status`          TINYINT      NOT NULL DEFAULT 0,
  `create_time`     DATETIME     NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time`     DATETIME     NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `pay_time`        DATETIME     NULL,
  `expire_time`     DATETIME     NULL,
  `shipping_address` TEXT        NULL,
  `payment_id`      VARCHAR(64)  NULL,
  `source`          VARCHAR(32)  NULL,
  `remark`          VARCHAR(255) NULL,
  `deleted`         TINYINT      NOT NULL DEFAULT 0,
  PRIMARY KEY (`order_id`),
  KEY `idx_user_time` (`user_id`,`create_time`),
  KEY `idx_status` (`status`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='订单主表';

DROP TABLE IF EXISTS `order_item`;
CREATE TABLE `order_item` (
  `order_item_id`  VARCHAR(64)  NOT NULL,
  `order_id`       VARCHAR(64)  NOT NULL,
  `goods_id`       BIGINT       NULL,
  `sku_id`         BIGINT       NOT NULL,
  `seckill_goods_id` BIGINT     NULL,
  `goods_name`     VARCHAR(255) NOT NULL,
  `quantity`       INT          NOT NULL,
  `price`          DECIMAL(10,2) NOT NULL,
  `price_type`     TINYINT      NOT NULL DEFAULT 0 COMMENT '0-原价，1-秒杀',
  `total_price`    DECIMAL(10,2) NOT NULL,
  `goods_image`    VARCHAR(255) NULL,
  `attrs_json`     TEXT         NULL,
  `create_time`    DATETIME     NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time`    DATETIME     NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `deleted`        TINYINT      NOT NULL DEFAULT 0,
  PRIMARY KEY (`order_item_id`),
  KEY `idx_order` (`order_id`),
  KEY `idx_sku` (`sku_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='订单明细';

DROP TABLE IF EXISTS `seckill_order`;
CREATE TABLE `seckill_order` (
  `id`           BIGINT       NOT NULL,
  `user_id`      BIGINT       NOT NULL,
  `activity_id`  BIGINT       NOT NULL,
  `sku_id`       BIGINT       NOT NULL,
  `status`       TINYINT      NOT NULL DEFAULT 0,
  `order_id`     VARCHAR(64)  NULL,
  `create_time`  DATETIME     NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_user_activity_sku` (`user_id`,`activity_id`,`sku_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='秒杀占位订单';

DROP TABLE IF EXISTS `payment_record`;
CREATE TABLE `payment_record` (
  `payment_id`     VARCHAR(64)  NOT NULL,
  `order_id`       VARCHAR(64)  NOT NULL,
  `order_type`     TINYINT      NOT NULL DEFAULT 0,
  `amount`         DECIMAL(10,2) NOT NULL,
  `currency`       VARCHAR(16)  NULL,
  `payment_method` TINYINT      NOT NULL,
  `status`         TINYINT      NOT NULL DEFAULT 0,
  `create_time`    DATETIME     NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `complete_time`  DATETIME     NULL,
  `update_time`    DATETIME     NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `transaction_id` VARCHAR(64)  NULL,
  `payment_info`   TEXT         NULL,
  `notify_time`    DATETIME     NULL,
  `notify_status`  TINYINT      NULL,
  `payer_id`       VARCHAR(64)  NULL,
  `idempotent_key` VARCHAR(64)  NULL,
  `error_code`     VARCHAR(64)  NULL,
  `error_msg`      VARCHAR(255) NULL,
  `deleted`        TINYINT      NOT NULL DEFAULT 0,
  PRIMARY KEY (`payment_id`),
  UNIQUE KEY `uk_order_id` (`order_id`),
  UNIQUE KEY `uk_transaction_id` (`transaction_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='支付记录'; 