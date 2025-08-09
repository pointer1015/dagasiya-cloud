-- Stock schema
SET NAMES utf8mb4;

DROP TABLE IF EXISTS `stock`;
CREATE TABLE `stock` (
  `stock_id`        BIGINT   NOT NULL,
  `goods_id`        BIGINT   NULL,
  `sku_id`          BIGINT   NOT NULL,
  `total_stock`     INT      NOT NULL DEFAULT 0,
  `available_stock` INT      NOT NULL DEFAULT 0,
  `lock_stock`      INT      NOT NULL DEFAULT 0,
  `version`         INT      NOT NULL DEFAULT 0,
  `update_time`     DATETIME NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  `deleted`         TINYINT  NOT NULL DEFAULT 0,
  PRIMARY KEY (`stock_id`),
  UNIQUE KEY `uk_sku` (`sku_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='库存';

DROP TABLE IF EXISTS `stock_log`;
CREATE TABLE `stock_log` (
  `log_id`        BIGINT       NOT NULL,
  `goods_id`      BIGINT       NULL,
  `sku_id`        BIGINT       NOT NULL,
  `order_id`      VARCHAR(64)  NULL,
  `activity_id`   BIGINT       NULL,
  `change_type`   TINYINT      NOT NULL COMMENT '0-预扣,1-回滚,2-实际扣减',
  `change_amount` INT          NOT NULL,
  `operator`      VARCHAR(32)  NOT NULL,
  `status`        TINYINT      NOT NULL DEFAULT 0 COMMENT '0-INIT,1-SUCCESS,2-FAIL',
  `biz_type`      VARCHAR(32)  NULL,
  `request_id`    VARCHAR(64)  NULL,
  `trace_id`      VARCHAR(64)  NULL,
  `remark`        VARCHAR(255) NULL,
  `create_time`   DATETIME     NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`log_id`),
  KEY `idx_sku_time` (`sku_id`,`create_time`),
  KEY `idx_order` (`order_id`),
  UNIQUE KEY `uk_request` (`request_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='库存流水'; 