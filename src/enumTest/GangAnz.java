package enumTest;

public enum GangAnz {
	
	FUENF(5), S(6);
	
	private int anz;	
	
	private GangAnz(int anz){
		this.anz= anz;
	}
	
	public int getAnz(){
		return anz;
	}
}
