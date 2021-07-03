package ABC.XYZ.SPRING;

import org.springframework.stereotype.Component;

@Component
public class BIKE implements VEHICLE
{
	public void drive()
	{
		System.out.println("it is riding");
	}
}
