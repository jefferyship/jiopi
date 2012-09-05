package example.blueprint.helloworld;

import org.jiopi.framework.annotation.blueprint.RegisterControlPanel;

@Version
@RegisterControlPanel("example.helloworld")
public interface HelloWorld {
	
	
	/**
	 * The first hello world function
	 * 
	 * We want the computer give us a response when this function calls.
	 */
	public void sayHelloWorld();
}
