package com.java.test_12_28.q1;

public class StateFactory {

	public static CentralGovernment getStateInstance(String stateName) {
		if (stateName.equalsIgnoreCase("maharashtra")) {
			return new Maharashtra();
		} else if (stateName.equalsIgnoreCase("telangana")) {
			return new Telangana();
		} else
			return new NonState();
	}

}
