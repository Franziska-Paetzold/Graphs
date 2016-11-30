package interfaceTest;

import java.util.ArrayList;

public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Fahrzeug> autoListe = new ArrayList<Fahrzeug>();
		
		SeatCar toledo = new SeatCar();
		SeatCar leon = new SeatCar();
		
		autoListe.add(toledo);
		autoListe.add(leon);
		
		
		
		Flugzeug f = new Flugzeug();
		autoListe.add(f);
		
//		for (int i=0; i<= autoListe.size(); i++)
//		{
//			autoListe.get(i).fahre();
//		}
		
		for(Fahrzeug l : autoListe)
		{
		   l.fahre();
		   if (l instanceof Auto )
		   {
			   ((Auto) l).crash();
		   }
		}
		
		
		
	}

}
	