package Task4;

import java.util.Objects;

public class Car {
	private String make;
	private String model;
	private String color;

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Car car = (Car) o;
		return
				model.equals(car.model) &&
				color.equals(car.color);
	}




	@Override
	public int hashCode() {
		return Objects.hash(make, model, color);
	}

	public Car(String make, String model, String color) {
		this.make = make;
		this.model = model;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car{" +
				"make='" + make + '\'' +
				", model='" + model + '\'' +
				", color='" + color + '\'' +
				'}';
	}
}
