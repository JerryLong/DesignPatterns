package com.dralong.design.test;

import com.dralong.design.command.Command;
import com.dralong.design.command.Invoker;
import com.dralong.design.command.MyCommand;
import com.dralong.design.command.Receiver;

public class CommandTest {
	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		Command cmd = new MyCommand(receiver);
		Invoker invoker = new Invoker(cmd);
		invoker.action();
	}
}
