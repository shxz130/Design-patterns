package com.shxz.Comand;

public class Invoker {
	private Command command;

	public Command getCommand() {
		return command;
	}
	public void setCommand(Command command) {
		this.command = command;
	}
	public void executeConmand()
	{
		command.execute();
	}
	public void undoConmand()
	{
		command.unDo();
	}
}
