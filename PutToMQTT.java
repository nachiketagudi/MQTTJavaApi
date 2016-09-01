package com.nachiketa.mqtt.simulator.subscriber.MQTTSubscriber;

import java.io.UnsupportedEncodingException;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

public class PutToMQTT {
	public void putToQ(){
		try {
			System.out.println("MQTT Put in Q method called");
			MqttClient client = new MqttClient( 
					"tcp://0.0.0.0:1883", //URI 
				    MqttClient.generateClientId(), //ClientId 
				    new MemoryPersistence());
			client.connect();
			if(client.isConnected()){
				while(true){System.out.println("Connected to MQTT");
				client.publish( "topic", // topic 
					    "payload123456".getBytes("UTF-8"), // payload 
					    2, // QoS 
					    true); // retained
			}
			}
			
			client.disconnect();
			
			
		} catch (MqttException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //Persistence
 catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
