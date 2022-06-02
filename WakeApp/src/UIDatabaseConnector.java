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
	
	public boolean getOepnv() {
		return oepnv;
	}
	
	public boolean getAuto() {
		return auto;
	}
	
	public boolean getFahrrad() {
		return fahrrad;
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
		this.zielort = newZielort;
	}
	
	public void setOepnv(boolean newOepnv) {
		this.oepnv = newOepnv;
	}
	
	public void setAuto(boolean newAuto) {
		this.auto = newAuto;
	}
	
	public void setFahrrad(boolean newFahrrad) {
		this.fahrrad = newFahrrad;
	}

}
