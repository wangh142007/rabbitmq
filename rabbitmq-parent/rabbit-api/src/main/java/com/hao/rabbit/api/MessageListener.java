package com.hao.rabbit.api;

/**
 * 	$MessageListener 消费者监听消息
 * @author Alienware
 *
 */
public interface MessageListener {

	void onMessage(Message message);
	
}
