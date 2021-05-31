package guru.springframework.sfgdi;

import guru.springframework.sfgdi.controller.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

		PetController petController = ctx.getBean("petController", PetController.class);
		System.out.println("----- The Best Pet is -----");
		System.out.println(petController.whichPetIsTheBest());

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());

		// MyController를 직접 생성(new)하지 않아도, context에의해 생성되어 관리된다.
		// Context의 getBean메소드를 이용하여 가져올 수 있다.(파라미터의 클래스명은 소문자로 시작할 것)
		MyController myController = (MyController) ctx.getBean("myController");
		System.out.println("----- Primary Bean      -----");
		System.out.println(myController.sayHello());
		System.out.println("----- Property Inject   -----");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());
		System.out.println("----- Setter Inject     -----");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());
		System.out.println("----- Constructor Inject -----");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
