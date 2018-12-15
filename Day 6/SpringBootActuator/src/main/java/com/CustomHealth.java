package com;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class CustomHealth implements HealthIndicator{

	@Override
	public Health health() {
		// TODO Auto-generated method stub
		return Health.down().status("App is down").build();
	}

	
}
