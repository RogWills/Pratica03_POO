package Pratica03_OO;

public class Empresa {

	public static void main(String[] args) {
		Fpadrao f1 = new Fpadrao(207460, "Roger", 1000);
		System.out.println(f1.toString());
		
		Fcomissionado f2 = new Fcomissionado(217561, "Jacqueline", 3000, 10000, 20);
		System.out.println(f2.toString());
	}

}
