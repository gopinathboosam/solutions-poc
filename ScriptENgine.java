package com.learn.test;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ScriptENgine {

	public static void main(String[] args) {
		String st ="(5+4)*10+3-2";
	eval(st);
	}

	private static void eval(String st) {
		// TODO Auto-generated method stub
		ScriptEngineManager engineManager = new ScriptEngineManager();
		ScriptEngine engine = engineManager.getEngineByName("javascript");
		try {
			System.out.println(engine.eval(st));
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
