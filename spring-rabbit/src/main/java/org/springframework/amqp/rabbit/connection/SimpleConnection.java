/*
 * Copyright 2002-2010 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.amqp.rabbit.connection;

import java.io.IOException;

import org.springframework.amqp.rabbit.support.RabbitUtils;

import com.rabbitmq.client.Channel;

public class SimpleConnection implements Connection {

	private final com.rabbitmq.client.Connection delegate;

	public SimpleConnection(com.rabbitmq.client.Connection delegate) {
		this.delegate = delegate;	
	}

	// TODO: expose the transactional flag
	public Channel createChannel(boolean transactional) {
		try {
			return delegate.createChannel();
		} catch (IOException e) {
			throw RabbitUtils.convertRabbitAccessException(e);
		}
	}

	public void close() {
		try {
			delegate.close();
		} catch (IOException e) {
			throw RabbitUtils.convertRabbitAccessException(e);
		}
	}

	public boolean isOpen() {
		return delegate!=null && delegate.isOpen();
	}


}
