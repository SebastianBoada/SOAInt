package com.soaint.tramites_internos.implementacion;

import org.kie.api.task.TaskEvent;
import org.kie.api.task.TaskLifeCycleEventListener;

public class TaskListener implements TaskLifeCycleEventListener{

	@Override
	public void beforeTaskActivatedEvent(TaskEvent event) {
		// TODO Auto-generated method stub
		System.out.print("beforeTaskActivatedEvent:" + event);
		
	}

	@Override
	public void beforeTaskClaimedEvent(TaskEvent event) {
		// TODO Auto-generated method stub
		System.out.print("beforeTaskClaimedEvent:" + event);
		
	}

	@Override
	public void beforeTaskSkippedEvent(TaskEvent event) {
		// TODO Auto-generated method stub
		System.out.print("beforeTaskSkippedEvent:" + event);
		
	}

	@Override
	public void beforeTaskStartedEvent(TaskEvent event) {
		// TODO Auto-generated method stub
		System.out.print("beforeTaskStartedEvent:" + event);
	}

	@Override
	public void beforeTaskStoppedEvent(TaskEvent event) {
		// TODO Auto-generated method stub
		System.out.print("beforeTaskStoppedEvent:" + event);
		
	}

	@Override
	public void beforeTaskCompletedEvent(TaskEvent event) {
		// TODO Auto-generated method stub
		System.out.print("beforeTaskCompletedEvent:" + event);
	}

	@Override
	public void beforeTaskFailedEvent(TaskEvent event) {
		// TODO Auto-generated method stub
		System.out.print("beforeTaskFailedEvent:" + event);
	}

	@Override
	public void beforeTaskAddedEvent(TaskEvent event) {
		// TODO Auto-generated method stub
		System.out.print("beforeTaskAddedEvent:" + event);
	}

	@Override
	public void beforeTaskExitedEvent(TaskEvent event) {
		// TODO Auto-generated method stub
		System.out.print("beforeTaskExitedEvent:" + event);
	}

	@Override
	public void beforeTaskReleasedEvent(TaskEvent event) {
		// TODO Auto-generated method stub
		System.out.print("beforeTaskReleasedEvent:" + event);
	}

	@Override
	public void beforeTaskResumedEvent(TaskEvent event) {
		// TODO Auto-generated method stub
		System.out.print("beforeTaskResumedEvent:" + event);
	}

	@Override
	public void beforeTaskSuspendedEvent(TaskEvent event) {
		// TODO Auto-generated method stub
		System.out.print("beforeTaskSuspendedEvent:" + event);
	}

	@Override
	public void beforeTaskForwardedEvent(TaskEvent event) {
		// TODO Auto-generated method stub
		System.out.print("beforeTaskForwardedEvent:" + event);
	}

	@Override
	public void beforeTaskDelegatedEvent(TaskEvent event) {
		// TODO Auto-generated method stub
		System.out.print("beforeTaskDelegatedEvent:" + event);
	}

	@Override
	public void beforeTaskNominatedEvent(TaskEvent event) {
		// TODO Auto-generated method stub
		System.out.print("beforeTaskNominatedEvent:" + event);
	}

	@Override
	public void afterTaskActivatedEvent(TaskEvent event) {
		// TODO Auto-generated method stub
		System.out.print("afterTaskActivatedEvent:" + event);
	}

	@Override
	public void afterTaskClaimedEvent(TaskEvent event) {
		// TODO Auto-generated method stub
		System.out.print("afterTaskClaimedEvent:" + event);
	}

	@Override
	public void afterTaskSkippedEvent(TaskEvent event) {
		// TODO Auto-generated method stub
		System.out.print("afterTaskSkippedEvent:" + event);
	}

	@Override
	public void afterTaskStartedEvent(TaskEvent event) {
		// TODO Auto-generated method stub
		System.out.print("afterTaskStartedEvent:" + event);
	}

	@Override
	public void afterTaskStoppedEvent(TaskEvent event) {
		// TODO Auto-generated method stub
		System.out.print("afterTaskStoppedEvent:" + event);
	}

	@Override
	public void afterTaskCompletedEvent(TaskEvent event) {
		// TODO Auto-generated method stub
		System.out.print("afterTaskCompletedEvent:" + event);
	}

	@Override
	public void afterTaskFailedEvent(TaskEvent event) {
		// TODO Auto-generated method stub
		System.out.print("afterTaskFailedEvent:" + event);
	}

	@Override
	public void afterTaskAddedEvent(TaskEvent event) {
		// TODO Auto-generated method stub
		System.out.print("afterTaskAddedEvent:" + event);
	}

	@Override
	public void afterTaskExitedEvent(TaskEvent event) {
		// TODO Auto-generated method stub
		System.out.print("afterTaskExitedEvent:" + event);
	}

	@Override
	public void afterTaskReleasedEvent(TaskEvent event) {
		// TODO Auto-generated method stub
		System.out.print("afterTaskReleasedEvent:" + event);
	}

	@Override
	public void afterTaskResumedEvent(TaskEvent event) {
		// TODO Auto-generated method stub
		System.out.print("afterTaskResumedEvent:" + event);
	}

	@Override
	public void afterTaskSuspendedEvent(TaskEvent event) {
		// TODO Auto-generated method stub
		System.out.print("afterTaskSuspendedEvent:" + event);
	}

	@Override
	public void afterTaskForwardedEvent(TaskEvent event) {
		// TODO Auto-generated method stub
		System.out.print("afterTaskForwardedEvent:" + event);
	}

	@Override
	public void afterTaskDelegatedEvent(TaskEvent event) {
		// TODO Auto-generated method stub
		System.out.print("afterTaskDelegatedEvent:" + event);
	}

	@Override
	public void afterTaskNominatedEvent(TaskEvent event) {
		// TODO Auto-generated method stub
		System.out.print("afterTaskNominatedEvent:" + event);
	}

}
