package com.exercicis.quadresv3.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("com.exercicis.quadresv3.persistence")
public class JavaConfig {
}
