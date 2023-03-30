package br.com.cod3r.factory.apple;

import br.com.cod3r.factory.apple.factory.IPhoneFactory;
import br.com.cod3r.factory.apple.model.IPhone;

public class Client {

	static IPhone device;

	public static void main(String[] args) {


		System.out.println("### Ordering an iPhone X");
		IPhone iPhone = IPhoneFactory.ordenarTelefones("x", "padrao");
		System.out.println(iPhone);

		System.out.println("\n\n### Ordering an iPhone 11 HighEnd");
		IPhone iPhone2 = IPhoneFactory.ordenarTelefones("11", "hi");
		System.out.println(iPhone);
	}
}
