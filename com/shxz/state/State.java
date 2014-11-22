package com.shxz.state;

public interface State {
	void handle();
	State nextState();
}
