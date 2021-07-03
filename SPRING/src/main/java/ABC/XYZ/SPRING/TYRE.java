package ABC.XYZ.SPRING;

import org.springframework.stereotype.Component;

@Component
public class TYRE {
	private String brand;

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

//	public TYRE(String brand) {
//		super();
//		this.brand = brand;
//	}

	@Override
	public String toString() {
//		return "TYRE [brand=" + brand + "]";
		return "TYRE" ;
	}
	
	
}
