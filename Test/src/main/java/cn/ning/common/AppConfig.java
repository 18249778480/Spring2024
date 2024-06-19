package cn.ning.common;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *
 * ComponentScan扫描组件 实现对Bean的创建和实现依赖注入
 */
@Configuration
@ComponentScan(basePackages = "cn.ning")
public class AppConfig {
}
