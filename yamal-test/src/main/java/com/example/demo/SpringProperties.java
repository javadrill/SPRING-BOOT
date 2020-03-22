package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component
@ConfigurationProperties("spring")
@Validated
public class SpringProperties {

	private String datasource;

	@Value("${spring.url.testurl}")
	private String urls;

	private long port1;

	public String getDatasource() {
		return datasource;
	}

	public void setDatasource(String datasource) {
		this.datasource = datasource;
	}

	public String getUrls() {
		return urls;
	}

	public void setUrls(String urls) {
		this.urls = urls;
	}

	public long getPort1() {
		return port1;
	}

	public void setPort1(long port1) {
		this.port1 = port1;
	}

}
