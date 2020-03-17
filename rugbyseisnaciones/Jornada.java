package rugbyseisnaciones;

import java.sql.Date;

public class Jornada {
	private Date fecha;
	public Partido partido1;
	public Partido partido2;
	public Partido partido3;
	public Partido partido4;
	public Partido partido5;
	
	public Jornada() {
		partido1 = new Partido();
		partido2 = new Partido();
		partido3 = new Partido();
		partido4 = new Partido();
		partido5 = new Partido();
	}
}
