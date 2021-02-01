
public class Time {
	private int hora;
	private int minu;
	private int segu;
	
	public void setTime(int h, int m, int s) {
		this.hora = h;
		this.minu = m;
		this.segu = s;
	}
	
	public void setTime(int h, int m) {
		this.hora = h;
		this.minu = m;
		this.segu = 0;
	}
	
	public void setTime(int h) {
		this.hora = h;
		this.minu = 0;
		this.segu = 0;
	}	
	
	
	public String exibirHoraUniversal() {
		return hora+":"+minu+":"+segu;
	}
	
	public String exibirHoraPadrao() {
		String hPadrao;
		String sufixo;
		
		if (hora == 0) {
			hPadrao = "12:";
			sufixo = "AM";
		}
		else if (hora == 12) {
			hPadrao = "12:";
			sufixo = "PM";
		}
		else if (hora > 0 && hora < 12) {
			hPadrao = hora+":";
			sufixo = "AM";
		}
		else {
			hPadrao = (hora-12)+":";
			sufixo = "PM";
		}
		return hPadrao+minu+":"+segu+sufixo;
	}

}
