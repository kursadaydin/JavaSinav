package YiyecekSoru;

public abstract class Yiyecek {
	
	private String isimYiyecek;
	private String renkYiyecek;
	
	
	public String getIsimYiyecek() {
		return isimYiyecek;
	}
	public void setIsimYiyecek(String isimYiyecek) {
		this.isimYiyecek = isimYiyecek;
	}
	public String getRenkYiyecek() {
		return renkYiyecek;
	}
	public void setRenkYiyecek(String renkYiyecek) {
		this.renkYiyecek = renkYiyecek;
	}
	
	
		
	public Yiyecek(String isimYiyecek, String renkYiyecek) {
		super();
		this.isimYiyecek = isimYiyecek;
		this.renkYiyecek = renkYiyecek;
	}
	
	
	
	
	
	
	

}
