package com.shxz.Comand;

public class CreateConmand implements Command{

	private Reicever reicever;
	
	public CreateConmand(Reicever reicever)
	{
		this.reicever=reicever;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		reicever.action();
	}
	@Override
	public void unDo() {
		// TODO Auto-generated method stub
		reicever.undo();
	}
	
	public static void main(String[] args)
	{
		Reicever reicever=new Reicever();
		Command command=new CreateConmand(reicever);
		Invoker invoker=new Invoker();
		invoker.setCommand(command);
		invoker.executeConmand();
		invoker.undoConmand();
	}
}
