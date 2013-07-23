import org.joda.time.DateMidnight;

public class Program {

	UI ui;
	DateMidnight in;
	DateMidnight out;
	int adults;
	int childrens;
	
	public static void main(String args[]) {
		Program bookingParserProgram = new Program();
		bookingParserProgram.start();
	}

	private void start() {
		ui = new UI();
		showUI();
	}

	public boolean showUI() {
		ui.setVisible(true);
		System.out.println(ui.isVisible());
		return ui.isVisible();

	}

	/**
	 * getInDate() -> DateMidnight gets the Date from the dateIn textbox of the
	 * GUI
	 */
	public DateMidnight getInDate() {
		//TODO: questo va nell'UI.
//		// TODO Auto-generated method stub
////		System.out.println(ui.txtDateIn);
//		String in = ui.txtDateIn.getText();
//		if (in != null) {
//			String[] inElements = in.split("/");
//			if (inElements.length == 3)
//				return new DateMidnight(Integer.parseInt(inElements[2]),
//						Integer.parseInt(inElements[1]),
//						Integer.parseInt(inElements[0]));
//			else
//				return null;
//		}
//		return null;
		return in;
	}

	public void setInDate(DateMidnight new_in) {

		//TODO: Questo va nel ui.
//		String day = String.valueOf(dateMidnight.getDayOfMonth());
//		String month = String.valueOf(dateMidnight.getMonthOfYear());
//		String year = String.valueOf(dateMidnight.getYear());
//		String out = day + "/" + month + "/" + year;
		in = new_in;
	}

	public DateMidnight getOutDate() {
		return out;
	}
	
	public void setOutDate(DateMidnight new_out)
	{
		out = new_out;
	}

	public int getAdults() {
		return adults;
	}

	public void setAdults(int new_adults) {
		adults = new_adults;
	}

	public int getChildrens() {
		return childrens;
	}

	public void setChildrens(int new_childrens) {
		childrens = new_childrens;
		
	}
	
}
