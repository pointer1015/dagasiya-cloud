-- Goods & GoodsSku schema
-- Encoding
SET NAMES utf8mb4;

-- 商品（SPU）
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `goods_id`       BIGINT       NOT NULL COMMENT 'SPU主键',
  `goods_name`     VARCHAR(128) NOT NULL COMMENT '商品名',
  `description`    TEXT         NULL COMMENT '描述',
  `price`          DECIMAL(10,2) NULL COMMENT '参考价',
  `category`       VARCHAR(64)  NULL COMMENT '类目',
  `brand`          VARCHAR(64)  NULL COMMENT '品牌',
  `image_url`      VARCHAR(255) NULL COMMENT '主图',
  `detail_image_url` VARCHAR(255) NULL COMMENT '详情图',
  `status`         TINYINT      NOT NULL DEFAULT 0 COMMENT '0-下线，1-上线',
  `create_time`    DATETIME     NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time`    DATETIME     NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `deleted`        TINYINT      NOT NULL DEFAULT 0 COMMENT '软删 0/1',
  PRIMARY KEY (`goods_id`),
  KEY `idx_status` (`status`),
  KEY `idx_category` (`category`),
  KEY `idx_brand` (`brand`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='商品SPU';

-- SKU
DROP TABLE IF EXISTS `goods_sku`;
CREATE TABLE `goods_sku` (
  `sku_id`       BIGINT       NOT NULL COMMENT 'SKU主键',
  `goods_id`     BIGINT       NOT NULL COMMENT 'SPU主键',
  `sku_code`     VARCHAR(64)  NULL COMMENT '外部编码',
  `attrs_json`   TEXT         NULL COMMENT '规格属性JSON',
  `bar_code`     VARCHAR(64)  NULL COMMENT '条码',
  `origin_price` DECIMAL(10,2) NULL COMMENT '原价',
  `price`        DECIMAL(10,2) NOT NULL COMMENT '现价',
  `image_url`    VARCHAR(255) NULL COMMENT 'SKU图片',
  `weight`       DECIMAL(10,3) NULL COMMENT '重量(kg)',
  `spec`         VARCHAR(128) NULL COMMENT '规格文本',
  `status`       TINYINT      NOT NULL DEFAULT 0 COMMENT '0-下线，1-上线',
  `create_time`  DATETIME     NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `update_time`  DATETIME     NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
  `deleted`      TINYINT      NOT NULL DEFAULT 0 COMMENT '软删 0/1',
  PRIMARY KEY (`sku_id`),
  KEY `idx_goods_id` (`goods_id`),
  UNIQUE KEY `uk_goods_code` (`goods_id`,`sku_code`),
  UNIQUE KEY `uk_bar_code` (`bar_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='商品SKU'; 