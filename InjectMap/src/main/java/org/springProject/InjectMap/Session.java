package org.springProject.InjectMap;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Session {
	
	private Map<String, String> training;

	public Map<String, String> getTraining() {
		return training;
	}

	@Autowired
	public void setTraining(Map<String, String> training) {
		this.training = training;
	}

	public Session() {
		super();
	}

	public Session(Map<String, String> training) {
		super();
		this.training = training;
	}

	@Override
	public String toString() {
		return "Session [training=" + training + "]";
	}
	

}
