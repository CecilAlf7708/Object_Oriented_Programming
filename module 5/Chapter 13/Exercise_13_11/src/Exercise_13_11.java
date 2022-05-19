
public class Exercise_13_11 {
	public static void main(String[] args) {
		Octagon octagon = new Octagon(7);
		Octagon octagon2 = (Octagon) octagon.clone();
		System.out.println(octagon.compareTo(octagon2));
		System.out.println(octagon.getArea());
		System.out.println(octagon2.getArea());
	}
}
