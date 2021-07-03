package ABC.XYZ.SPRING;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        /* it change the reference and object */
        /* it must never change the source code ; apply concept of dependency injection */
        
        //CAR object = new CAR();
        //object.drive();
    
        //BIKE object = new BIKE();
        //object.drive();
    
        /* it change only object ; it do not change reference */    
        
        //VEHICLE object = new CAR() ;
        //object.drive();
        
        //VEHICLE object = new BIKE() ;
        //object.drive();
        
        /* it do not change reference and object */
        
        /* bean factory and application context interface have method get bean() */ 
        /* a simple application => bean fatory and a high level application => application context */
        
        //ApplicationContext context = new ClassPathXmlApplicationContext("SPRING.XML");
        
        //VEHICLE object = (VEHICLE) context.getBean("BIKE");
        //object.drive();
        
        /* it will give illegal state exception because it do not know keyword vechile */
        /* create a xml file  and it will change the code */
        /* it will totally free */
        
        // it is applicable 
        // 1) XML configuration
        // 2) annotation configuration
        // 3) java configuration
    
        
        /* apply @component in the bike or car class ; it will be addedd*/
        /* it will give no bean named error because xml do not know annotation */
        
        /* it will give tyre and null like brand name */
        /* it is a dependency it can be applied in xml */
        /* it will be a type of property */
        /* it can be applied by a property or constructor */
        
        //TYRE object = (TYRE) context.getBean("tyre");
        //System.out.println(object);
        
        /* note if tyre object of car and bike class have annotation based configuration */
        /* note tyre have a x modelling language configuration */
    
        //CAR object = (CAR) context.getBean("CAR");
        //object.drive();
    
        // it will give null value of car property tyre 
        // initialize it via annoted wired technique (annotation initialization)
    
        // tyre can also apply annotation based configuration
    
        /* XML configuration completed */
        
        //ApplicationContext Factory = new AnnotationConfigApplicationContext(APPCONFIG.class);
        
        
        //MI mi = new MI();
        //MI mi = Factory.getBean(MI.class);
        //mi.config();
    
        // it will give illegal state exception and need to make a annotation configuration
        
        // note : how to create bean with! XML bean element or annotation @bean => apply component method
        
        // note : default component will be class
    
        /* if >1 processor then write @primary like annotation in that processor class */
        /* if >1 processor then write @Qualifier(processor) in the common class */
    }
}
