package com.hao.rabbit.common.serializer.impl;

import com.hao.rabbit.api.Message;
import com.hao.rabbit.common.serializer.Serializer;
import com.hao.rabbit.common.serializer.SerializerFactory;

public class JacksonSerializerFactory implements SerializerFactory{

	public static final SerializerFactory INSTANCE = new JacksonSerializerFactory();
	
	@Override
	public Serializer create() {
		return JacksonSerializer.createParametricType(Message.class);
	}

}
