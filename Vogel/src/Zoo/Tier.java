package Zoo;

public abstract class Tier implements ITier  //implements gibt an, dass Interface ITier hier genutzt wird
{ 
	String art;
	String name;
	String geschlecht;
	String lebensraum;		
	
	
	public String getart() {		//ab hier werden die Attribute der Tiere ausgegeben
		return art; 
	}
	public String getName(){
		return name; 
	}
	public String setGeschlecht() {
		return geschlecht; 
	}
	public String setLebensraum() {
		return lebensraum;
	}
}
	
	
