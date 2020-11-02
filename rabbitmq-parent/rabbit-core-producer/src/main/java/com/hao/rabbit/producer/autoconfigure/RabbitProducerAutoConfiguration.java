package com.hao.rabbit.producer.autoconfigure;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.hao.rabbit.task.annotation.EnableElasticJob;

/**
 * 	$RabbitProducerAutoConfiguration 自动装配 
 * @author Alienware
 *
 */
@EnableElasticJob
@Configuration
@ComponentScan({"com.hao.rabbit.producer.*"})
public class RabbitProducerAutoConfiguration {


}
