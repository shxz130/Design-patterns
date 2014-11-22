package com.shxz.state;

public class Context {
	private State state;

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	public void chageMyState(){
		state=state.nextState();
	}
	
	
	
	public static void main(String[] args) {
		Context context=new Context();
		context.setState(new BeforeMeal());
		context.getState().handle();
		context.chageMyState();
		context.getState().handle();
		context.chageMyState();
		context.getState().handle();
	}
	
}
