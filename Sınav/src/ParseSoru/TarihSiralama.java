package ParseSoru;

import java.util.Comparator;

public class TarihSiralama implements Comparator<Sirket> {

	@Override
	public int compare(Sirket arg0, Sirket arg1) {
		// TODO Auto-generated method stub
		if (arg1.getKayittarihi().after(arg0.getKayittarihi())) {
			return 1;
		}
		else if (arg1.getKayittarihi().before(arg0.getKayittarihi())) {
			return -1;
		}
		
		return 0;
	}

}
