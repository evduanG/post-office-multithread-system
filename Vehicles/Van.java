

/**
 * 
 * @author eviatar
 *Or from the sender to the local branch
 *Or from the local branch to the recipient of the package
 */
public class Van extends Truck {
	
	

	public Van(int truckID, boolean available, int timeLeft) {
		super(truckID, available, timeLeft);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		/*רכב פנוי )available )לא מבצע דבר. 
		 * רכב שנמצא במהלך נסיעה בכל צעד ישן 300 מילישניות ומצמצם את הזמן שנותר לסיום.
		 * הנסיעה (timeLeft (ב-1 .אם לאחר
			 ערך הזמן שווה לאפס,
		 * רכב פנוי )available )לא מבצע דבר.
רכב שנמצא במהלך נסיעה בכל צעד ישן 300 מילישניות ומצמצם את הזמן שנותר לסיום הנסיעה (timeLeft (ב-1 .אם לאחר
הצמצום	 ערך הזמן שווה לאפס,
 	אזי הנסיעה הסתיימה ורכב ביצע את המשימה לשמה נשלח.
אם מטרת הנסיעה הייתה איסוף חבילה משולח )COLLECTION ,)החבילה בשלב זה תעבור מהרכב לסניף, סטטוס החבילה
יתעדכן, לרשימת tracking של החבילה יתווסף רישום מתאים, ותודפס הודעה על כך שהרכב אסף את החבילה והגיע חזרה
לסניף )ראו דוגמת הדפסה(. בנוסף, הרכב ישנה את מצבו לפנוי.

אם מטרת הנסיעה הייתה מסירת החבילה ללקוח )DISTRIBUTION ,)החבילה תוסר מרשימת החבילות ברכב, סטטוס
החבילה והיסטוריית העברות יתעדכנו בהתאם ותודפס הודעה על כך שהחבילה נמסרה ללקוח. במידה ומדובר על חבילה קטנה
עם אופציית שליחת אישור מסירה מופעלת, תודפס הודעה על שליחת אישור מסירה. 
		 */
		
	}
	

}
