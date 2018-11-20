package com.learn.test;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ScriptEnginerrrr {
	public static void main(String[] args) throws ScriptException {
		ScriptEngineManager engineManager = new ScriptEngineManager();
		ScriptEngine engine = engineManager.getEngineByExtension("js");
		Object ob= engine.eval("10>15");
		System.out.println(ob);
	}


}
