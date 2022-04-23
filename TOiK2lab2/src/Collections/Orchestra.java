package Collections;

import java.util.ArrayList;

public class Orchestra implements Instrument{
	ArrayList<Instrument> instrumentsList = new ArrayList<>();
	
	public void addInstrument(Instrument instrument) {
		instrumentsList.add(instrument);
	}
	
	public void play() {
		for(Instrument e: instrumentsList) {
			e.play();
		}
	}
	
}
