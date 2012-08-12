package example.module.helloworld;

import org.jiopi.framework.annotation.module.InstanceType;
import org.jiopi.framework.annotation.module.Instantiation;
import org.jiopi.framework.annotation.module.RegisterModule;

import example.blueprint.helloworld.HelloWorld;

@RegisterModule
@Instantiation(type=InstanceType.PROTOTYPE)
public class ExampleHelloWorld implements HelloWorld {

	@Override
	public void sayHelloWorld() {
		System.out.println("HelloWorld");
	}

}
