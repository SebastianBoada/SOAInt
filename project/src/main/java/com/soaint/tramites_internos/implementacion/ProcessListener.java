package com.soaint.tramites_internos.implementacion;

import org.kie.api.event.process.ProcessCompletedEvent;
import org.kie.api.event.process.ProcessEventListener;
import org.kie.api.event.process.ProcessNodeLeftEvent;
import org.kie.api.event.process.ProcessNodeTriggeredEvent;
import org.kie.api.event.process.ProcessStartedEvent;
import org.kie.api.event.process.ProcessVariableChangedEvent;

public class ProcessListener implements ProcessEventListener{

	@Override
	public void beforeProcessStarted(ProcessStartedEvent event) {
		System.out.print("beforeProcessStarted:" + event);
		
	}

	@Override
	public void afterProcessStarted(ProcessStartedEvent event) {
		// TODO Auto-generated method stub
		System.out.print("afterProcessStarted:" + event);
		
	}

	@Override
	public void beforeProcessCompleted(ProcessCompletedEvent event) {
		// TODO Auto-generated method stub
		System.out.print("beforeProcessCompleted:" + event);
		
	}

	@Override
	public void afterProcessCompleted(ProcessCompletedEvent event) {
		// TODO Auto-generated method stub
		System.out.print("afterProcessCompleted:" + event);
		
	}

	@Override
	public void beforeNodeTriggered(ProcessNodeTriggeredEvent event) {
		// TODO Auto-generated method stub
		System.out.print("beforeNodeTriggered:" + event);
		
	}

	@Override
	public void afterNodeTriggered(ProcessNodeTriggeredEvent event) {
		// TODO Auto-generated method stub
		System.out.print("afterNodeTriggered:" + event);
	}

	@Override
	public void beforeNodeLeft(ProcessNodeLeftEvent event) {
		// TODO Auto-generated method stub
		System.out.print("beforeNodeLeft:" + event);
		
	}

	@Override
	public void afterNodeLeft(ProcessNodeLeftEvent event) {
		// TODO Auto-generated method stub
		System.out.print("afterNodeLeft:" + event);
		
	}

	@Override
	public void beforeVariableChanged(ProcessVariableChangedEvent event) {
		// TODO Auto-generated method stub
		System.out.print("beforeVariableChanged:" + event);
		
	}

	@Override
	public void afterVariableChanged(ProcessVariableChangedEvent event) {
		// TODO Auto-generated method stub
		System.out.print("afterVariableChanged:" + event);
		
	}

}
