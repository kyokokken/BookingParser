import org.joda.time.DateMidnight;

public class Program {

	UI ui;

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
		if (ui.isVisible())
			return true;
		else
			return false;

	}

	public DateMidnight getInDate() {
		// TODO Auto-generated method stub
		String in = ui.txtDateIn.getText();
		String[] inElements = in.split("/");
		if (inElements.length == 3)
			return new DateMidnight(Integer.parseInt(inElements[2]),
					Integer.parseInt(inElements[1]),
					Integer.parseInt(inElements[0]));
		else
			return null;
	}

	public void setInDate(DateMidnight dateMidnight) {
		
		String day = String.valueOf(dateMidnight.getDayOfMonth());		
		String month = String.valueOf(dateMidnight.getMonthOfYear());
		String year = String.valueOf(dateMidnight.getYear());
		
		String out =	day + "/" +
						month + "/" +
						year;
	}
}
