package com.learn.patterns.design.structural.flyweight.impl1;

import java.util.HashMap;
import java.util.Map;

public class PlatformFactory {

	private static Map<String, Platform> map = new HashMap<>();
	
	public static Platform getInstance(String platformType) {
		Platform p = map.get(platformType);
		if (p == null) {
			switch(platformType) {
			case "Java":
				p = new JavaPlatform();
				break;
			case ".Net":
				p = new DotNetPlatform();
				break;
			}
			map.put(platformType, p);
		}
		return p;
	}
}
