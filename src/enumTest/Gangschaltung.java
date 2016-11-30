package enumTest;

public class Gangschaltung {

	private GangArt art;
	private GangAnz gangAnz;
	public Gangschaltung(){
		
	}
	
	public void setArt(GangArt art){
		this.art = art;
	}
	
	public void setGangAnz(GangAnz gangAnz){
		this.gangAnz= gangAnz;
		gangAnz.getAnz();
		
		switch (gangAnz) {
		default: 
			break;
		case FUENF:
			
			break;
		case S:
			break;
		}
		
	}
}
