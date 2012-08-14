package example.blueprint.helloworld;

import org.jiopi.framework.annotation.blueprint.RegisterControlPanel;


@Version
@RegisterControlPanel("example.helloworld.remote")
public interface HelloWorldRemote {
	
	/**
	 * 
	 * the first remote hello world function
	 * 
	 * it should return a sentence of "I'v say Hello World {n} times!"
	 * 
	 * @return
	 */
	public String sayHelloWorld();
}
