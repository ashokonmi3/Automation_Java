package certification.oracle;

//class Animal {
//	void jump() {
//		System.out.println("Animal");
//	}
//}
//
//class Cat extends Animal {
//	void jump(int a) {
//		System.out.println("Cat");
//	}
//}
//
//class Rabbit extends Animal {
//	void jump() {
//		System.out.println("Rabbit");
//	}
//}
//
//class Java_06_Inheritance {
//	public static void main(String args[]) {
//		Animal cat = new Cat();
//		Rabbit rabbit = new Rabbit();
//		cat.jump();
//		rabbit.jump();
//
//	}
//
//}

//class Flower {
//	public void fragrance() {
//		System.out.println("Flower");
//	}
//}
//
//class Rose {
//	public void fragrance() {
//		System.out.println("Rose");
//	}
//}
//
//class Lily {
//	public void fragrance() {
//		System.out.println("Lily");
//	}
//}
//
//class Bouquet {
//	public void arrangeFlowers() {
//		Flower f1 = new Rose();
//		Flower f2 = new Lily();
//		f1.fragrance();
//	}
//}
//=================

class Base {
	String var = "EJava";

	void printVar() {
		System.out.println(var);
	}
}

class Derived extends Base {
	String var = "Guru";

	void printVar() {
		System.out.println(var);
	}
}

class Java_06_Inheritance {
	public static void main(String[] args) {

		Base base = new Base();
		Base derived = new Derived();
		System.out.println(base.var);
		System.out.println(derived.var);
		base.printVar();
		derived.printVar();
	}
}
