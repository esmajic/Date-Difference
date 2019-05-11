
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class MainDateDifference {

	public static ArrayList<Datum> date = new ArrayList<>();

	public static void main(String[] args) throws ParseException {

		Scanner input = new Scanner(System.in);

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		System.out.println("Enter older date (dd-MM-yyyy):  ");
		String date1 = input.nextLine();
		System.out.println("Enter present date (dd-MM-yyyy):  ");
		String date2 = input.nextLine();
		Datum dates = new Datum(date1, date2);

		date.add(dates);

		try {
			Date newDate1 = dateFormat.parse(date1);
			System.out.println(newDate1);
			Date newDate2 = dateFormat.parse(date2);
			System.out.println(newDate2);

			System.out.println("Difference between dates is "
					+ DateDifference.getDateDiff(newDate1, newDate2, TimeUnit.DAYS) + " days.");
			if (DateDifference.getDateDiff(newDate1, newDate2, TimeUnit.DAYS) > 30) {
				System.out.println("Difference in days is greater than 30 days!");
			}

		} catch (ParseException e) {

			e.printStackTrace();
		}

		input.close();

	}

}
