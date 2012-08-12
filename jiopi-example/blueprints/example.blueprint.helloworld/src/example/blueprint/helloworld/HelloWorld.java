package example.blueprint.helloworld;

import org.jiopi.framework.annotation.blueprint.RegisterControlPanel;


@Version
@RegisterControlPanel("example.helloworld")
public interface HelloWorld {
	
	
	/**
	 * The first hello world function
	 * 
	 * it should print "Hello World" in the console.
	 */
	public void sayHelloWorld();
}
