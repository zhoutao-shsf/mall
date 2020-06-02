package com.atguigu.mall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1.导入mybatis-plus依赖
 * 2.配置
 *      1。配置数据源
 *       1.导入数据库驱动
 *       2。在yml文件中配置数据源相关信息
 *      2。配置mybatis-plus
 *       1。使用mapperscan
 *       2。告诉mybatis，xml文件的地方
 */

@MapperScan("com.atguigu.mall.product.dao")
@SpringBootApplication
public class MallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallProductApplication.class, args);
    }

}
