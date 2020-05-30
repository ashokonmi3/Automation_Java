package Package;

class Protection2 extends corejavapackage.Java_13_Protection {
	Protection2() {
		System.out.println("derived other package constructor");
		// class or package only
		System.out.println("default n = " + n);
		// class only
		System.out.println("priivate n_pri = " + n_pri);
		System.out.println("protected n_pro = " + n_pro);
		System.out.println("public n_pub = " + n_pub);
	}
}

// int n = 1;
// private int n_pri = 2;
// protected int n_pro = 3;
// public int n_pub = 4;
