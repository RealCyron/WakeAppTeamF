//TODO: getter und setter für alle Felder der UI
public class UIDatabaseConnector {
	
	public String ankunftszeit;
	public String fertigmachZeit;
	public String wohnort;
	public String zielort;
	public boolean oepnv;
	public boolean auto;
	public boolean fahrrad;
	
	//Getter
	public String getAnkunftszeit() {
		return ankunftszeit;
	}
	
	public String getFertigmachZeit() {
		return fertigmachZeit;
	}
	public String getWohnort() {
		return wohnort;
	}
	
	public String getZielort() {
		return zielort;
	}
	
	//Setter
	public void setAnkunftszeit(String newAnkunftszeit) {
		this.ankunftszeit = newAnkunftszeit;
	}
	
	public void setFertigmachZeit(String newFertigmachZeit) {
		this.fertigmachZeit = newFertigmachZeit;
	}
	
	public void setWohnort(String newWohnort) {
		this.wohnort = newWohnort;
	}
	
	public void setZielort(String newZielort) {
		this.zielort= newZielort;
	}

}
