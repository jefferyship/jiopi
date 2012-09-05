package example.module.helloworld;

import org.jiopi.framework.annotation.module.InstanceType;
import org.jiopi.framework.annotation.module.Instantiation;
import org.jiopi.framework.annotation.module.RegisterModule;

import example.blueprint.helloworld.HelloWorldRemote;

@RegisterModule
@Instantiation(type=InstanceType.SINGLETON)
public class ExampleHelloWorldRemote implements HelloWorldRemote {
	
	private int _count = 0;

	@Override
	public String sayHelloWorld() {
		int count = ++_count;
		return "I'v say Hello World "+count+" times!";
	}

}
