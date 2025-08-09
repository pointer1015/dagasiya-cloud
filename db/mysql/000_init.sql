-- Initialization schema
-- 请根据环境修改数据库名与权限
CREATE DATABASE IF NOT EXISTS `dagasiya_seckill` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `dagasiya_seckill`;

-- 建表请按序执行以下脚本：
-- 1) 001_goods.sql
-- 2) 004_stock.sql
-- 3) 002_seckill.sql
-- 4) 003_order_payment.sql
-- 5) 005_user.sql

-- 注：生产环境建议由迁移工具（Flyway/Liquibase）管理版本化脚本 