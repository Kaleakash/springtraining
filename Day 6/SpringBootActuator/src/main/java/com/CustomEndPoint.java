package com;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.actuate.endpoint.Endpoint;
import org.springframework.stereotype.Component;

@Component
public class CustomEndPoint implements Endpoint<List<String>> {

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return "myEndPoint";
	}

	@Override
	public List<String> invoke() {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<String>();
		names.add("Raj");
		names.add("Seeta");
		names.add("Reeta");
		names.add("Veeta");
		return names;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isSensitive() {
		// TODO Auto-generated method stub
		return false;
	}

	
}
