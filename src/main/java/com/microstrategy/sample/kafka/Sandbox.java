/**
* Configuration class for the MicroStrategySink Kafka connector
*
* @author  Alex Fernandez
* @version 0.1
* @since   2018-08-01 
*
*/

package com.microstrategy.sample.kafka;

public class Sandbox {

	public static void main(String[] args) throws Exception {
		
		String libraryUrl = "https://xxx.microstrategy.com/MicroStrategyLibrary";
		String username = "username";
		String password = "password";
		String loginMode = "1";
		
		MicroStrategy mstr = new MicroStrategy(libraryUrl, username, password,loginMode);
		mstr.connect();
		mstr.setProject("Tutorial Project");

	}

}
