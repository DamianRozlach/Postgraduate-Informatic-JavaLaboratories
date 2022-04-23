package Collections;

public class InterfacesOpera {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Guitar guitar = new Guitar();
//		guitar.play();
		
		Orchestra orchestra = new Orchestra();
		orchestra.addInstrument(new Guitar());
		orchestra.addInstrument(new Flute());
		orchestra.addInstrument(new Trombone());
		orchestra.play();
	}

}
