import complexphasor.Complex;
import complexphasor.Phasor;


public class Example{

	public static void main(String[] args)
	{
		Complex Z1 = new Complex(1,2);
		Complex Z2 = new Complex();
		Z2.setReal(3);
		Z2.setImag(-3);
		Phasor P1 = new Phasor(3,30);
		Phasor P2 = new Phasor();

		Z1 = Z1.Add(Z1,Z2);
		System.out.println("The sum of Z1 and Z2 is: "+Z1.show());
                P2 = P1.getConjugate();
		System.out.println("The Complex Conjugate of P1 is: "+P2.show());

	}

		}
		
