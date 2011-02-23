/*
 * Copyright 2002-2010 the original author or authors.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package org.springframework.amqp.rabbit.test;

/**
 * Global convenience class for all integration tests, carrying constants and other utilities for broker set up.
 * 
 * @author Dave Syer
 * 
 */
public class BrokerTestUtils {
	
	public static final int DEFAULT_PORT = 5672;

	public static final int TRACER_PORT = 5673;

	public static int getPort() {
		return DEFAULT_PORT;
	}

}
