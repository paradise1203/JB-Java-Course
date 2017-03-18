package org.jblab.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;

/**
 * @author aleksandrpliskin on 18.03.17.
 */
@Configurable
@EnableAspectJAutoProxy
@ImportResource("classpath:/src/main/webapp/WEB-INF/aop-config.xml")
public class AopConfig {
}
