package ru.davydov.algoritmization.decomposition;

/*
 * 3. Вычислить площадь правильного шестиугольника со стороной а,
 * используя метод вычисления площади треугольника.
 * */
public class Task3 {

	public static void main(String[] args) {
	
		//площадь правильного шестиуголника
		double a = 2;
		
		double areaOfRegularHexagon = 6 * areaOfEquiTriangle(a);
		
		System.out.println("Площадь праильного шестигранника со стороной " + a + " = " + areaOfRegularHexagon);

	}
	
	// Площадь правильного треуголльника
	private static double areaOfEquiTriangle (double a) {
		return (Math.sqrt(3) / 4 * (Math.pow(a, 2)));
	}
}
