package com.nachiketa.mqtt.simulator.subscriber.MQTTSubscriber;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttConnectOptions;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

import com.nachiketa.mqtt.simulator.listner.MQTTListner;

public class GetFromMQTT {

	
	public void getFromMQTT(){
	
	System.out.println("MQTT get from Q method called");
	MqttClient client;
	try {
		client = new MqttClient( 
				"tcp://0.0.0.0:1883", //URI 
			    MqttClient.generateClientId(), //ClientId 
			    new MemoryPersistence());
		MQTTListner myMQTTListner = new MQTTListner();
		
		client.setCallback(myMQTTListner);
		MqttConnectOptions options = new MqttConnectOptions();
		 
		options.setMqttVersion(MqttConnectOptions.MQTT_VERSION_3_1);
		options.setConnectionTimeout(10);
		        
		client.connect(options);
		client.subscribe("topic", 1);
	} catch (MqttException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}
}
