package com.atguigu.mall.coupon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 使用nacos配置中心
 *
 *1。导入依赖 pom
 *
 * 2。创建boostrap。properties并配置
 *
 *3。配置中心添加一个application——name.properties得命名规则
 *
 * 4。动态获取配置
 *      1。@refreshScopes 动态获取并刷新
 *      2。@Value
 *      如果配置中心和当前应用都配置了相同的项优选使用配置中心配置
 *
 *  ps：
 *     命名空间：配置隔离 默认public
 *          生产、开发、测试
 *          每一个微服务建立
 *     配置集 配置的集合
 *
 *     配置集ID：类似配置文件名
 *
 *     配置分组：
 *      默认配置都属于不同分组
 *
 *      每一个微服务创建自己的命名空间，不同环境用不同分组
 *每一个微服务的任何配置信息都可以放在配置中心
 * @Value @Configurationproperties
 */
@EnableDiscoveryClient
@SpringBootApplication
public class MallCouponApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallCouponApplication.class, args);
    }

}
