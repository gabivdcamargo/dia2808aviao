package pooAviao;

public class ObjetoAviao {

	public static void main(String[] args) {

		Aviao aviao1 = new Aviao();
		Aviao aviao2 = new Aviao();
		Aviao aviao3 = new Aviao();
		Aviao aviao4 = new Aviao();

		aviao1.setModelo("ATR 600");
		aviao1.setCor("Branco");
		aviao1.setTipo("Comercial");
		aviao1.setQuantLug("72");

		aviao2.setModelo("Airbus A320");
		aviao2.setCor("Branco e Azul");
		aviao2.setTipo("Comercial");
		aviao2.setQuantLug("180");

		aviao3.setModelo("Airbus A330");
		aviao3.setCor("Branco");
		aviao3.setTipo("Comercial");
		aviao3.setQuantLug("236");

		aviao4.setModelo("Boeing 737");
		aviao4.setCor("Branco");
		aviao4.setTipo("Comercial");
		aviao4.setQuantLug("179");

		System.out.println("----- OBJETO 1-----");
		System.out.println(aviao1.getModelo());
		System.out.println(aviao1.getCor());
		System.out.println(aviao1.getTipo());
		System.out.println(aviao1.getQuantLug());

		System.out.println("----- OBJETO 1-----");
		System.out.println(aviao2.getModelo());
		System.out.println(aviao2.getCor());
		System.out.println(aviao2.getTipo());
		System.out.println(aviao2.getQuantLug());

		System.out.println("----- OBJETO 1-----");
		System.out.println(aviao3.getModelo());
		System.out.println(aviao3.getCor());
		System.out.println(aviao3.getTipo());
		System.out.println(aviao3.getQuantLug());

		System.out.println("----- OBJETO 1-----");
		System.out.println(aviao4.getModelo());
		System.out.println(aviao4.getCor());
		System.out.println(aviao4.getTipo());
		System.out.println(aviao4.getQuantLug());

		System.out.println("----- OBJETO 2-----");
		System.out.println(aviao1.getLigarTurb());
		System.out.println(aviao1.getDecolar());
		System.out.println(aviao1.getDescer());
		System.out.println(aviao1.getLigarMotor());

		System.out.println("----- OBJETO 2-----");
		System.out.println(aviao2.getLigarTurb());
		System.out.println(aviao2.getDecolar());
		System.out.println(aviao2.getDescer());
		System.out.println(aviao2.getLigarMotor());

		System.out.println("----- OBJETO 2-----");
		System.out.println(aviao3.getLigarTurb());
		System.out.println(aviao3.getDecolar());
		System.out.println(aviao3.getDescer());
		System.out.println(aviao3.getLigarMotor());







	}
}






