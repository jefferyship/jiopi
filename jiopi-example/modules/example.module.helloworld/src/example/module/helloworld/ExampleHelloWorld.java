package example.module.helloworld;

import org.jiopi.framework.annotation.module.InstanceType;

import org.jiopi.framework.annotation.module.Instantiation;
import org.jiopi.framework.annotation.module.RegisterModule;
import org.jiopi.framework.annotation.module.SocketModule;

import example.blueprint.helloworld.HelloWorld;

@RegisterModule
@Instantiation(type=InstanceType.PROTOTYPE)
public class ExampleHelloWorld implements HelloWorld {
	
	private final String name;
	
	@SocketModule(id="next")
	private HelloWorld nextOne;
	
	public ExampleHelloWorld(){
		name = "";
	}
	
	public void setNextOne(HelloWorld next){
		this.nextOne = next;
	}
	
	public ExampleHelloWorld(String name){
		this.name = " "+name;
	}

	@Override
	public void sayHelloWorld() {
		System.out.println("HelloWorld"+name);
		if(nextOne!=null){
			nextOne.sayHelloWorld();
		}
	}

}
