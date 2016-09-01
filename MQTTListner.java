package com.nachiketa.mqtt.simulator.listner;

import org.eclipse.paho.client.mqttv3.IMqttDeliveryToken;
import org.eclipse.paho.client.mqttv3.MqttCallback;
import org.eclipse.paho.client.mqttv3.MqttMessage;

public class MQTTListner implements MqttCallback {

	@Override
	public void connectionLost(Throwable arg0) {
		// code to re-connect to broker in case of disconnection
		
	}

	@Override
	public void deliveryComplete(IMqttDeliveryToken arg0) {
	   // Called when a outgoing publish is complete 
		
	}

	@Override
	public void messageArrived(String arg0, MqttMessage message) throws Exception {
		 String s = new String( message.getPayload());
	        System.out.println("Message published : "+s);
		
	}

}
