import javax.swing.*;
import java.awt.event.*;


public class JElkins_Lab11 extends JFrame
{
	private JPanel panel;
	private JLabel milesLabel;
	private JTextField milesTextField;
	private JLabel gallonsLabel;
	private JTextField gallonsTextField;
	private JLabel resultLabel;
	private JButton calcButton;

	public JElkins_Lab11()
	{
		setTitle("Fuel Economy");

		setSize(250,150);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		buildPanel();

		add(panel);

		setVisible(true);
	}

	private void buildPanel();
	{
		milesLabel = new JLabel("Miles Driven:");


	}


	// STEP 3:  DECLARE GUI COMPONENT VARIABLES HERE, BUT DO NOT CONSTRUCT

	// STEP 4:  NO-ARG CONSTRUCTOR
		// SET TITLE, SIZE, AND DEFAULT CLOSE OPERATION
		// STEP 8:  INVOKE HELPER METHOD
		//			ADD PANEL TO WINDOW
		//			MAKE WINDOW VISIBLE

	// STEP 5:  PRIVATE HELPER METHOD
		// CALL CONSTRUCTOR FOR EACH GUI COMPONENT
		// (LATER) STEP 7:  REGISTER NEW EVENT LISTENER OBJECT WITH BUTTON
		// ADD THE SIX GUI COMPONENTS TO THE PANEL

	// STEP 6:  PRIVATE INNER LISTENER CLASS
		// METHOD TO RESPOND TO EVENT FIRING
			// DECLARE LOCAL VARIABLES TO STORE INPUT, CALCULATE & FORMAT RESULT
			// OBTAIN INPUT FROM TEXT FIELDS, CONVERT TO DOUBLE FORM
			// CALCULATE RESULT
			// BUILD RESULT TEXT STRING WITH FORMATTED RESULT VALUE & LABELS
			// DISPLAY RESULT TEXT IN RESULT LABEL

	public static void main(String[] args)
	{
		// STEP 9:  CONSTRUCT A WINDOW OBJECT
	}
}