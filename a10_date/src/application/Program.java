package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");		
		Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));		
		System.out.println(sdf.format(d));
				
		// Calendário com a data instanciado para alterações
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		
		//Alterações
		System.out.println("");
		cal.add(Calendar.HOUR_OF_DAY, 4);
		d = cal.getTime();
		System.out.println("Acrescentando 4 horas ao horário padrão: " );
		System.out.println(sdf.format(d));
		System.out.println("");
		
		System.out.println("Imprimindo somente minutos e mês");
		int minutes = cal.get(Calendar.MINUTE);
		int month = 1 + cal.get(Calendar.MONTH);
		System.out.println("Minutes: " + minutes);
		System.out.println("Month: " + month);
		
	}
}
