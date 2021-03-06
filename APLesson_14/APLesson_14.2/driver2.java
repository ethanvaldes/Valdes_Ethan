import java.util.ArrayList;
public class driver2
{
   public static void main(String[]args)
   {
       ArrayList<location2> locate = new ArrayList<>();
       double[] honLoc = {5, 6};
       locate.add(new honda2(honLoc));
       locate.add(new toyota2("8, 9"));
       locate.add(new GMC2(3, 8));

       double[] home = {0, 0};

       String printout = "\n\n" + "==========================" + "\nStarting locations...";

       for (location2 l : locate)
       {
           printout += "\nLocation for " + l.getID() + ": (" + getLocation(l.getLoc()) + ")";
       }

       printout += "\n\n" + "==========================" + "\nDistance from home...";
 
       for (location2 l : locate)
       { 
           printout += "\nDistance for " + l.getID() + ": (" + getDistance(l.getLoc(), home)+ ")";
       }
	   
	   printout += "\n\n" + "==========================";

       for (location2 l : locate)
	   {
		   double xnew = Math.round((1 + (Math.random() * 100)) * 100.00)/100.00;
		   double ynew = Math.round((1 + (Math.random() * 100)) * 100.00)/100.00;
		   double[] moves = {xnew, ynew};
		   printout += "\nAfter " + l.getID() + " Moved " + getLocation(moves);
		   l.move(xnew,2*ynew);
		   printout += "\nNew Location: (" + getLocation(l.getLoc()) + ")\n";
	   }
	   
	   printout += "\n\n" + "==========================" + "\nDistance from home...";
		
	   for (location2 l : locate)
	   {
			printout += "\n\tDistance for " + l.getID() + ": (" + getDistance(l.getLoc(), home)+ ")"; 
	   }
		
		System.out.println(printout);
   }

   public static double getDistance(double[] car, double[] home)
   {
       return Math.sqrt((Math.pow(car[0] - home[0], 2)+ Math.pow(car[1] - home[1], 2)));
   }

   public static String getLocation(double[] loc)
   {
       return loc[0] + ", " + loc[1];
   }
}