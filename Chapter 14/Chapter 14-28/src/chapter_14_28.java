/*
 * Alfred Thomas Cecil
 * 11/15/19
 * A program that
 */
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import java.util.Calendar; 
import java.util.GregorianCalendar;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

public class chapter_14_28 {
	public static void main(String[] args) {
	//Build an instance for ClockPane
		int hour = (int)Math.random() * 12;
		int minute = (int)Math.random() * 60;
		int second = (int)Math.random() * 60;
		ClockPane clockpane = new ClockPane(hour, minute, second);





    //clockpane.setCurrentTime();
	}
}



class ClockPane extends Pane {
  private int hour;
  private int minute;
  private int second;
  private boolean hourVisible;
  private boolean minutesVisible;
  private boolean secondsVisible;
  
  /** Construct a default clock with the current time
  public ClockPane() {
    setCurrentTime();
  }*/

  /** Construct a clock with specified hour, minute, and second */
  public ClockPane(int hour, int minute, int second) {
    this.hour = hour;
    this.minute = minute;
    this.second = second;
  }

  /** Return hour */
  public int getHour() {
    return hour;
  }

  /** Set a new hour */
  public void setHour(int hour) {
    this.hour = hour;
    paintClock();
  }

  /** Return minute */
  public int getMinute() {
    return minute;
  }

  /** Set a new minute */
  public void setMinute(int minute) {
    this.minute = minute;
    paintClock();
  }

  /** Return second */
  public int getSecond() {
    return second;
  }

  /** Set a new second */
  public void setSecond(int second) {
    this.second = second;
    paintClock();
  }
  
  /* Set the current time for the clock */
  public void setCurrentTime() {
    // Construct a calendar for the current date and time
    Calendar calendar = new GregorianCalendar();

    // Set current hour, minute and second
    this.hour = calendar.get(Calendar.HOUR_OF_DAY);
    this.minute = calendar.get(Calendar.MINUTE);
    this.second = calendar.get(Calendar.SECOND);
    
    paintClock(); // Repaint the clock
  }
  
  /** Paint the clock */
  private void paintClock() {
    // Initialize clock parameters
    double clockRadius = 
      Math.min(getWidth(), getHeight()) * 0.8 * 0.5;
    double centerX = getWidth() / 2;
    double centerY = getHeight() / 2;

    // Draw circle
    Circle circle = new Circle(centerX, centerY, clockRadius);
    circle.setFill(Color.WHITE);
    circle.setStroke(Color.BLACK);
    Text t1 = new Text(centerX - 5, centerY - clockRadius + 12, "12");
    Text t2 = new Text(centerX - clockRadius + 3, centerY + 5, "9");
    Text t3 = new Text(centerX + clockRadius - 10, centerY + 3, "3");
    Text t4 = new Text(centerX - 3, centerY + clockRadius - 3, "6");
    
    // Draw second hand
    
    double sLength = clockRadius * 0.8;
    double secondX = centerX + sLength * 
      Math.sin(second * (2 * Math.PI / 60));
    double secondY = centerY - sLength * 
      Math.cos(second * (2 * Math.PI / 60));
    Line sLine = new Line(centerX, centerY, secondX, secondY);
    sLine.setStroke(Color.RED);
    
    
    // Draw minute hand
    
    double mLength = clockRadius * 0.65;
    double xMinute = centerX + mLength * 
      Math.sin(minute * (2 * Math.PI / 60));
    double minuteY = centerY - mLength * 
      Math.cos(minute * (2 * Math.PI / 60));
    Line mLine = new Line(centerX, centerY, xMinute, minuteY);
    mLine.setStroke(Color.BLUE);
    
    
    // Draw hour hand
    
    double hLength = clockRadius * 0.5;
    double hourX = centerX + hLength * 
      Math.sin((hour % 12 + minute / 60.0) * (2 * Math.PI / 12));
    double hourY = centerY - hLength *
      Math.cos((hour % 12 + minute / 60.0) * (2 * Math.PI / 12));
    Line hLine = new Line(centerX, centerY, hourX, hourY);
    hLine.setStroke(Color.GREEN);
  
    
    getChildren().clear();  
    getChildren().addAll(circle, t1, t2, t3, t4, sLine, mLine, hLine);
  }
  
  @Override
  public void setWidth(double width) {
    super.setWidth(width);
    paintClock();
  }
  
  @Override
  public void setHeight(double height) {
    super.setHeight(height);
    paintClock();
  }
  public boolean getHourVisible(){
    return hourVisible;
  }
  public void setHourVisible(boolean hourVisible){
    this.hourVisible = true; 
  }
  public boolean getMinutesVisible(){
    return minutesVisible;
  }
  public void setMinutesVisible(boolean minutesVisible){
    this.minutesVisible = true;
  }
  public boolean getSecondsVisible(){
    return secondsVisible;
  }
  public void setSecondsVisible(boolean secondsVisible){
    this.secondsVisible = false;
  }
}

/*
 * Alfred Thomas Cecil
 * 11/13/19
 * A program that creates a copy of and compares two octagons
 *
import java.lang.*;
public class chapter_13_11 {
	public static void main(String[] args) {
		double side = 8.0;
		Octagon octagon = new Octagon(side);
		Octagon copy = octagon.clone();
		if (octagon.compareTo(copy) == 1) {
		System.out.print("These Octagons are different.");
		}
		else {
			System.out.print("These Octagons are the same.");
		}
	}
	
}

abstract class GeometricObject {
	  private String color = "white";
	  private boolean filled;
	  private java.util.Date dateCreated;

	  /** Construct a default geometric object 
	  protected GeometricObject() {
	    dateCreated = new java.util.Date();
	  }

	  /** Construct a geometric object with color and filled value *
	  protected GeometricObject(String color, boolean filled) {
	    dateCreated = new java.util.Date();
	    this.color = color;
	    this.filled = filled;
	  }

	  /** Return color *
	  public String getColor() {
	    return color;
	  }

	  /** Set a new color *
	  public void setColor(String color) {
	    this.color = color;
	  }

	  /** Return filled. Since filled is boolean,
	   *  the get method is named isFilled *
	  public boolean isFilled() {
	    return filled;
	  }

	  /** Set a new filled *
	  public void setFilled(boolean filled) {
	    this.filled = filled;
	  }

	  /* Get dateCreated *
	  public java.util.Date getDateCreated() {
	    return dateCreated;
	  }

	  @Override/*
	  public String toString() {
	    //return "created on " + dateCreated + "\n\tcolor: " + color +
	    //  " and filled: " + filled;
	  //}

	  /* Abstract method getArea *
	  public abstract double getArea();{
		  
	  }

	  /** Abstract method getPerimeter *
	  public abstract double getPerimeter();{
	}

	
	

}	
	
class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable{
	double side = 0.0;
	
	public Octagon(){
		this.side = 8;
	}
		
	public Octagon(double side){
		this.side = side;
	}
	
	@Override
	public double getArea(){
		return (2+(4/Math.sqrt(2))) * side * side;
	}
	
	@Override
	public double getPerimeter(){
		return side * 8;
	}
	
	public int compareTo(Octagon copy) {
		if (getArea() > copy.getArea())
			return 1;
		else if (getArea() < copy.getArea())
			return -1;
		else 
			return 0;
	}
	
	public Octagon clone() {
		try {
			return (Octagon)super.clone();
		}
		catch (CloneNotSupportedException ex) {
			return null;
		}
	}
}*/