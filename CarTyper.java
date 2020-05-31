//Car Typer CPT Final Version - June 14 Mid-Day
/*CPT 2017 CAR TYPER
MADE BY JOSHUA KUNIHIRO AND ASHWIN THOMAS on 13 JUNE 2017
This game is a typing race in which you must move your car by typing a series of words.
Upon completion of a level, program displays your WPM */

import hsa.Console;
import java.awt.*;
public class CarTyper
{
    static Console c = new Console (38, 176); // Console window for all input and output
    static Font arialBig = new Font ("Arial", Font.BOLD, 50);
    static Font arialSmall = new Font ("Arial", Font.BOLD, 18);
    public static Font gameFont = new Font ("Broadway", Font.PLAIN, 20);
    public static Font customizeFont = new Font ("Isocteur", Font.BOLD, 25);


    static Color darkBlue = new Color (0, 76, 153);
    static Color orange = new Color (255, 157, 0);
    static Color lime = new Color (0, 255, 0);
    static Color brown = new Color (139, 69, 19);
    static Color pink = new Color (255, 20, 147);
    static Color navy = new Color (0, 0, 128);
    static Color turquoise = new Color (72, 209, 204);
    static Color olive = new Color (107, 142, 35);
    static Color gold = new Color (184, 134, 11);

    static int level = 1, carChoice = 1;
    static String[] words = {"the ", "of ", "and ", "a ", "to ", "in ", "is ", "you ", "that ", "it ", "he ", "was ", "for ", "on ", "are ", "as ", "with ", "his ", "they ", "I ", "at ", "be ", "this ", "have ", "from ", "or ", "one ", "had ", "by ", "word ", "but ", "not ", "what ", "all ", "were ", "we ", "when ", "your ", "can ", "said ", "there ", "use ", "an ", "each ", "which ", "she ", "do ", "how ", "their ", "if ", "will ", "up ", "other ", "about ", "out ", "many ", "then ", "them ", "these ", "so ", "some ", "her ", "would ", "make ", "like ", "him ", "into ", "time ", "has ", "look ", "two ", "more ", "write ", "go ", "see ", "number ", "no ", "way ", "could ", "people ", "my ", "than ", "first ", "water ", "been ", "call ", "who ", "oil ", "its ", "now ", "find ", "long ", "down ", "day ", "did ", "get ", "come ", "made ", "may ", "part"};
    static String[] words2 = {"void ", "boy ", "toy ", "ashwin ", "shave ", "computer ", "orientation ", "spectrum ", "mouse ", "Rainbow ", "Fantastic ", "Absolute ", "resilient ", "shut ", "crazy ", "ignore ", "you ", "tube ", "death ", "Metal ", "at ", "be ", "this ", "have ", "from ", "or ", "one ", "had ", "by ", "word ", "but ", "not ", "what ", "all ", "were ", "we ", "when ", "your ", "can ", "said ", "there ", "use ", "an ", "each ", "which ", "she ", "do ", "how ", "their ", "if ", "will ", "up ", "other ", "about ", "out ", "many ", "then ", "them ", "these ", "so ", "some ", "her ", "would ", "make ", "like ", "him ", "into ", "time ", "has ", "look ", "two ", "more ", "write ", "go ", "see ", "number ", "no ", "way ", "could ", "people ", "my ", "than ", "first ", "water ", "been ", "call ", "who ", "oil ", "its ", "now ", "find ", "long ", "down ", "day ", "did ", "get ", "come ", "made ", "may ", "part "};
    //maxx = 1407, maxy = 759

    public static void main (String args[])
    {

	menu (); //the main menu, has its own method because it is called multiple times
    } // end of main method


    public static void menu ()
    {
	char choice = 0;
	c.setColor (darkBlue);
	c.fillRect (0, 0, 1407, 759);
	c.setColor (Color.gray);
	c.fillRect (453, 200, 500, 100);
	c.fillRect (453, 400, 500, 100);
	c.fillRect (453, 600, 500, 100);
	c.setColor (Color.white);
	c.setFont (arialBig);
	c.drawString ("1 PLAY GAME", 530, 280);
	c.drawString ("2 INSTRUCTIONS", 510, 480);
	c.drawString ("3 CUSTOMIZE", 530, 680);
	choice = c.getChar ();
	while (choice != '1' && choice != '2' && choice != '3')
	{
	    c.setColor (Color.red);
	    c.setFont (arialSmall);
	    c.drawString ("Invalid Option! Please enter a valid number", 500, 720);
	    choice = c.getChar ();

	} //ends while loop, error checks
	if (choice == '1')
	    playGame ();
	else if (choice == '2')
	    instructions ();
	else
	    customize ();
    } //the menu, displays the options


    public static void instructions ()
    {
	char option2;
	c.setColor (Color.blue);
	c.fillRect (0, 0, 1407, 759);
	//sets the background for the customize screen
	c.setColor (Color.gray);
	c.setFont (arialBig);
	c.fillRect (200, 100, 1000, 350);
	c.setColor (Color.white);
	c.drawString ("INSTRUCTIONS", 540, 150);
	c.setFont (arialSmall);
	c.drawString ("Welcome to Thomihiro Games' CarTypist! In this single player game, you will be typing words as they ", 250, 200);
	c.drawString ("appear in a text box in order to move your car forwards. Mistakes will prevent you from moving,", 250, 220);
	c.drawString ("and the race is not over until you finish all the words. ", 250, 240);
	c.drawString ("Upon entering an incorrect letter, the word will be highlighted red, and to continue ", 250, 260);
	c.drawString ("you must type the letter correctly, at which point you can resume", 250, 280);
	c.drawString ("", 250, 300);
	c.drawString ("Upon completing a level, you will progress to the next level, with increased word difficultly.", 250, 340);
	c.drawString ("Now quit reading, and speed away!!!", 250, 360);
	//this block is for additional options
	c.setFont (arialSmall);
	c.setColor (Color.gray);
	c.fillRect (200, 500, 200, 50);
	c.fillRect (200, 600, 200, 50);
	c.setColor (Color.white);
	c.drawString ("1 PLAY GAME", 220, 530);
	c.drawString ("2 BACK TO MENU", 220, 630);
	option2 = c.getChar ();
	while (option2 != '1' && option2 != '2')
	{
	    c.setColor (Color.green);
	    c.drawString ("ERROR! INVALID OPTION, PLEASE ENTER A VALID NUMBER", 220, 730);
	    option2 = c.getChar ();
	} //while loop, error checks for invalid input
	if (option2 == '1')
	    playGame ();
	else
	    menu ();
    } //instructions


    public static void customize ()
    {
	char option3;
	boolean errorCheck = false;
	c.setColor (Color.pink);
	c.fillRect (0, 0, 1407, 759);

	//sets the background for the customize screen
	c.setFont (arialSmall);
	c.setColor (orange);
	c.fillRect (75, 5, 1200, 150);
	c.setColor (darkBlue);
	c.fillRect (165, 15, 1100, 100);
	c.setFont (gameFont);
	c.setColor (Color.white);

	c.drawString ("Welcome to Thomihiro's personal store. Here you will find variety of car choices. Choose and enjoy", 200, 100);

	c.setColor (lime); //for the car CAR 2!!!
	c.fillRect (205, 195, 100, 30);
	c.fillOval (207, 168, 104, 45);
	c.setColor (pink);
	c.fillRect (210, 195, 100, 30);
	c.fillOval (210, 170, 100, 45);
	c.fillArc (180, 188, 60, 70, 0, 180);
	c.fillArc (285, 188, 60, 70, 0, 180);
	c.setColor (Color.yellow); //headlights
	c.fillArc (318, 191, 23, 23, 0, 80);
	c.setColor (Color.black);
	c.fillOval (198, 203, 32, 32);
	c.fillOval (298, 203, 32, 32);
	c.setColor (Color.white);
	c.fillOval (204, 209, 20, 20);
	c.fillOval (304, 209, 20, 20);
	c.setColor (olive);
	c.fillArc (230, 175, 70, 40, 0, 90);
	c.setColor (Color.black);
	c.fillArc (234, 176, 64, 36, 0, 90);
	c.setColor (Color.red);
	c.fillArc (220, 175, 70, 40, 90, 90);
	c.setColor (Color.black);
	c.fillArc (223, 176, 68, 36, 90, 90);
	c.setColor (Color.red);
	c.fillRect (258, 176, 10, 18);

	c.setColor (Color.black);
	c.fillRect (75, 275, 320, 100);
	c.setFont (customizeFont);
	c.setColor (Color.white);
	c.drawString ("3] Car Unlocked", 100, 325);

	c.setColor (Color.red); //for the car 3!!!
	c.fillRect (505, 195, 100, 30);
	c.fillOval (507, 168, 104, 45);
	c.setColor (Color.green);
	c.fillRect (510, 195, 100, 30);
	c.fillOval (510, 170, 100, 45);
	c.fillArc (480, 188, 60, 70, 0, 180);
	c.fillArc (585, 188, 60, 70, 0, 180);
	c.setColor (Color.yellow); //headlights
	c.fillArc (618, 191, 23, 23, 0, 80);
	c.setColor (Color.black);
	c.fillOval (498, 203, 32, 32);
	c.fillOval (598, 203, 32, 32);
	c.setColor (Color.white);
	c.fillOval (504, 209, 20, 20);
	c.fillOval (604, 209, 20, 20);
	c.setColor (Color.red);
	c.fillArc (525, 175, 70, 40, 0, 90);
	c.setColor (Color.black);
	c.fillArc (535, 176, 64, 36, 0, 90);
	c.setColor (Color.red);
	c.fillArc (520, 175, 70, 40, 90, 90);
	c.setColor (Color.black);
	c.fillArc (523, 176, 68, 36, 90, 90);
	c.setColor (Color.red);
	c.fillRect (558, 176, 10, 18);

	c.setColor (Color.black);
	c.fillRect (475, 275, 320, 100);
	c.setFont (customizeFont);
	c.setColor (Color.white);
	c.drawString ("4] Car Locked", 500, 325);
	c.drawString ("Will unlock at stage 2", 500, 355);

	c.setColor (turquoise); //for the car 4!!!!
	c.fillRect (1005, 195, 100, 30);
	c.fillOval (1007, 168, 104, 45);
	c.setColor (brown);
	c.fillRect (1010, 195, 100, 30);
	c.fillOval (1010, 170, 100, 45);
	c.fillArc (980, 188, 60, 70, 0, 180);
	c.fillArc (1085, 188, 60, 70, 0, 180);
	c.setColor (Color.yellow); //headlights
	c.fillArc (1118, 191, 23, 23, 0, 80);
	c.setColor (Color.black);
	c.fillOval (998, 203, 32, 32);
	c.fillOval (1098, 203, 32, 32);
	c.setColor (Color.white);
	c.fillOval (1004, 209, 20, 20);
	c.fillOval (1104, 209, 20, 20);
	c.setColor (gold);
	c.fillArc (1030, 175, 70, 40, 0, 90);
	c.setColor (Color.black);
	c.fillArc (1034, 176, 64, 36, 0, 90);
	c.setColor (Color.red);
	c.fillArc (1020, 175, 70, 40, 90, 90);
	c.setColor (Color.black);
	c.fillArc (1023, 176, 68, 36, 90, 90);
	c.setColor (Color.red);
	c.fillRect (1058, 176, 10, 18);
	c.setColor (Color.gray);
	c.fillRect (1150, 200, 60, 50);
	c.fillArc (1150, 185, 60, 40, 180, -180);
	c.setColor (Color.pink);
	c.fillArc (1160, 195, 40, 20, 180, -180);
	c.setColor (Color.black);
	c.fillRect (855, 275, 320, 100);
	c.setFont (customizeFont);
	c.setColor (Color.white);
	c.drawString ("Legendary Car", 900, 325);
	c.drawString ("Coming soon!", 900, 355);


	c.setColor (Color.red); //for the OG CAR!!
	c.fillRect (505, 495, 100, 30);
	c.fillOval (507, 468, 104, 45);
	c.setColor (Color.blue);
	c.fillRect (510, 495, 100, 30);
	c.fillOval (510, 470, 100, 45);
	c.fillArc (480, 488, 60, 70, 0, 180);
	c.fillArc (585, 488, 60, 70, 0, 180);
	c.setColor (Color.yellow); //headlights
	c.fillArc (618, 491, 23, 23, 0, 80);
	c.setColor (Color.black);
	c.fillOval (498, 503, 32, 32);
	c.fillOval (598, 503, 32, 32);
	c.setColor (Color.white);
	c.fillOval (504, 509, 20, 20);
	c.fillOval (604, 509, 20, 20);
	c.setColor (Color.red);
	c.fillArc (525, 475, 70, 40, 0, 90);
	c.setColor (Color.black);
	c.fillArc (535, 476, 64, 36, 0, 90);
	c.setColor (Color.red);
	c.fillArc (520, 475, 70, 40, 90, 90);
	c.setColor (Color.black);
	c.fillArc (523, 476, 68, 36, 90, 90);
	c.setColor (Color.red);
	c.fillRect (558, 476, 10, 18);
	c.setColor (Color.black);
	c.fillRect (755, 425, 220, 100);
	c.setFont (customizeFont);
	c.setColor (Color.white);
	c.drawString ("Default Car", 775, 475);


	c.setColor (navy);
	c.fillRect (0, 575, 1407, 400);
	c.setColor (Color.white);
	c.setFont (arialSmall);
	c.drawString ("1 PLAY GAME", 220, 630);
	c.drawString ("2 BACK TO MENU", 220, 680);
	option3 = c.getChar ();





	while (option3 != '1' && option3 != '2' && option3 != '3' && option3 != '4')
	{
	    c.setColor (Color.red);
	    c.drawString ("ERROR! INVALID OPTION, PLEASE ENTER A VALID NUMBER", 220, 730);
	    option3 = c.getChar ();
	} //while loop, error checks for invalid input
	if (option3 == '1')
	    playGame ();
	else if (option3 == '2')
	    menu ();
	else if (option3 == '3')
	{
	    carChoice = 2;
	    playGame ();
	}
	else if (option3 == '4')
	{
	    carChoice = 3;

	    playGame ();
	}
	else
	{
	    carChoice = 4;
	    playGame ();

	}
    }


    public static void blinkingCar (double speed2)  //the end of game screen, imports words per minute
    {
	String userSpeed2 = String.valueOf (speed2);
	c.setFont (customizeFont);

	c.setColor (darkBlue);
	c.fillRect (0, 0, 1407, 900);
	c.setColor (pink);

	c.fillRect (0, 0, 1407, 200);
	c.fillRect (0, 300, 1407, 400);

	c.setColor (Color.white); //THIS IS FOR THE CLOUDS
	c.fillOval (30, 500, 90, 40);
	c.fillOval (70, 500, 90, 40);
	c.fillOval (40, 490, 50, 50);
	c.fillOval (90, 490, 50, 50);
	c.fillOval (210, 520, 90, 40);
	c.fillOval (250, 520, 90, 40);
	c.fillOval (220, 510, 50, 50);
	c.fillOval (270, 510, 50, 50);
	c.fillOval (820, 480, 90, 40);
	c.fillOval (860, 480, 90, 40);
	c.fillOval (830, 470, 50, 50);
	c.fillOval (880, 470, 50, 50);

	c.drawString ("CONGRATULATIONS! YOU WIN! WPM: ", 500, 150); //prints wpm
	c.drawString (userSpeed2, 1100, 150);

	for (int z = 0 ; z < 1 ; z++)
	{

	    displayCar ();
	    for (long i = 0 ; i < 10000000 ; i++)
		;

	    c.setColor (Color.blue);

	    c.drawString ("GAME OVER", 500, 250);
	    carChoice = 1;
	    displayCar ();


	    for (long i = 0 ; i < 10000000 ; i++)
		;
	    c.setColor (pink);

	    c.drawString ("GAME OVER", 500, 250);
	    carChoice = 2;
	    displayCar ();


	    for (long i = 0 ; i < 100000000 ; i++)
		;
	    c.setColor (Color.green);
	    c.drawString ("GAME OVER", 500, 250);
	    carChoice = 3;

	    displayCar ();

	    for (long i = 0 ; i < 100000000 ; i++)
		;
	    c.setColor (brown);
	    c.drawString ("GAME OVER", 500, 250);

	    //carChoice = 4;
	    //displayCar ();
	    for (long i = 0 ; i < 100000000 ; i++)
		;

	} //end for loop
	c.setColor (Color.white);
	c.setFont (arialBig);
	c.drawString ("Press 1 to exit! Press 2 to go to menu!", 400, 600);
	char choice = c.getChar ();
	while (choice != '1' && choice != '2')
	{
	    c.setColor (Color.white);
	    c.setFont (arialSmall);
	    c.drawString ("Invalid Option! Please enter a valid number", 500, 720);
	    choice = c.getChar ();

	} //ends while loop, error checks
	if (choice == '1')
	    System.exit (0);
	else
	{
	    level = 1;
	    menu (); //resets game after win
	}
    } //end blinkingCar()


    public static void playGame ()
    {
	firstScreen (0);

	displayCar ();
	animatedSmoke ();
	getReady (); //displays countdown
	type ();


    } //playGame, opens the main game and runs all the methods involved


    public static void delay (int time)
    {
	try
	{
	    Thread.sleep (time);
	}
	catch (Exception e)
	{
	}
    }


    public static void movement (int x)
    {
	firstScreen (x);
	secondScreen (x);
	//ADD IF STATEMENTS HERE FOR DIFFERENT CARS
	displayCar ();
    } //end movement method


    public static void firstScreen (int x)
    {
	c.setColor (Color.black); //for the road // Japan at initial
	c.fillRect (0 - x, 300, 2000, 150);
	c.setColor (Color.white);
	c.fillRect (400 - x, 375, 45, 10);
	c.fillRect (550 - x, 375, 45, 10);
	c.fillRect (700 - x, 375, 45, 10);
	c.fillRect (850 - x, 375, 45, 10);
	c.fillRect (1050 - x, 375, 45, 10);
	c.fillRect (1200 - x, 375, 45, 10);
	c.fillRect (1350 - x, 375, 45, 10);
	c.setColor (Color.blue); //for the top blue background
	c.fillRect (0 - x, 0, 1407, 300);
	c.setColor (Color.yellow); //sun
	c.fillArc (600 - x, 110, 250, 250, 180, -180);
	c.setColor (Color.gray); //mountains
	c.fillArc (100 - x, 150, 290, 300, 180, -180);
	c.fillArc (275 - x, 63, 450, 475, 180, -180);
	c.fillArc (705 - x, 25, 750, 550, 180, -180);
	c.setColor (Color.gray); //bottom of the screen
	c.fillRect (0 - x, 450, 1407, 300);
	c.setColor (Color.green); //for bottom trees
	c.fillOval (100 - x, 600, 30, 30);
	c.fillOval (125 - x, 600, 30, 30);
	c.fillOval (150 - x, 600, 30, 30);
	c.fillOval (115 - x, 580, 30, 30);
	c.fillOval (132 - x, 580, 30, 30);
	c.fillOval (190 - x, 600, 30, 30);
	c.fillOval (215 - x, 600, 30, 30);
	c.fillOval (240 - x, 600, 30, 30);
	c.fillOval (205 - x, 580, 30, 30);
	c.fillOval (222 - x, 580, 30, 30);
	c.fillOval (280 - x, 600, 30, 30);
	c.fillOval (305 - x, 600, 30, 30);
	c.fillOval (330 - x, 600, 30, 30);
	c.fillOval (295 - x, 580, 30, 30);
	c.fillOval (312 - x, 580, 30, 30);
	c.fillOval (370 - x, 600, 30, 30);
	c.fillOval (395 - x, 600, 30, 30);
	c.fillOval (420 - x, 600, 30, 30);
	c.fillOval (385 - x, 580, 30, 30);
	c.fillOval (402 - x, 580, 30, 30);
	c.fillOval (610 - x, 600, 30, 30);
	c.fillOval (635 - x, 600, 30, 30);
	c.fillOval (660 - x, 600, 30, 30);
	c.fillOval (625 - x, 580, 30, 30);
	c.fillOval (642 - x, 580, 30, 30);
	c.fillOval (700 - x, 600, 30, 30);
	c.fillOval (725 - x, 600, 30, 30);
	c.fillOval (750 - x, 600, 30, 30);
	c.fillOval (715 - x, 580, 30, 30);
	c.fillOval (732 - x, 580, 30, 30);
	c.fillOval (790 - x, 600, 30, 30);
	c.fillOval (815 - x, 600, 30, 30);
	c.fillOval (840 - x, 600, 30, 30);
	c.fillOval (805 - x, 580, 30, 30);
	c.fillOval (822 - x, 580, 30, 30);
	c.fillOval (880 - x, 600, 30, 30);
	c.fillOval (905 - x, 600, 30, 30);
	c.fillOval (930 - x, 600, 30, 30);
	c.fillOval (895 - x, 580, 30, 30);
	c.fillOval (912 - x, 580, 30, 30);
	c.fillOval (970 - x, 600, 30, 30);
	c.fillOval (995 - x, 600, 30, 30);
	c.fillOval (1020 - x, 600, 30, 30);
	c.fillOval (985 - x, 580, 30, 30);
	c.fillOval (1002 - x, 580, 30, 30);
	c.fillOval (1060 - x, 600, 30, 30);
	c.fillOval (1085 - x, 600, 30, 30);
	c.fillOval (1110 - x, 600, 30, 30);
	c.fillOval (1075 - x, 580, 30, 30);
	c.fillOval (1092 - x, 580, 30, 30);
	c.setColor (Color.green); //for trees on the road
	c.fillOval (720 - x, 250, 30, 40);
	c.fillOval (710 - x, 270, 30, 30);
	c.setColor (Color.green); //tree 2
	c.fillOval (780 - x, 250, 30, 40);
	c.fillOval (770 - x, 270, 30, 30);
	c.fillOval (790 - x, 270, 30, 30);
	c.fillRect (790 - x, 290, 9, 60);
	c.setColor (Color.green); //tree 3
	c.fillOval (930 - x, 350, 30, 40);
	c.fillOval (920 - x, 370, 30, 30);
	c.fillOval (940 - x, 370, 30, 30);
	c.fillRect (940 - x, 390, 9, 60);
	c.setColor (Color.green); //tree 4
	c.fillOval (990 - x, 350, 30, 40);
	c.fillOval (980 - x, 370, 30, 30);
	c.fillOval (1000 - x, 370, 30, 30);
	c.fillRect (1000 - x, 390, 9, 60);
	c.setColor (Color.white); //THIS IS FOR THE CLOUDS
	c.fillOval (30 - x, 70, 90, 40);
	c.fillOval (70 - x, 70, 90, 40);
	c.fillOval (40 - x, 60, 50, 50);
	c.fillOval (90 - x, 60, 50, 50);
	c.fillOval (210 - x, 90, 90, 40);
	c.fillOval (250 - x, 90, 90, 40);
	c.fillOval (220 - x, 80, 50, 50);
	c.fillOval (270 - x, 80, 50, 50);
	c.fillOval (820 - x, 50, 90, 40);
	c.fillOval (860 - x, 50, 90, 40);
	c.fillOval (830 - x, 40, 50, 50);
	c.fillOval (880 - x, 40, 50, 50);
	c.setColor (Color.white); //for the JAPAN flag
	c.fillRect (100 - x, 150, 120, 75);
	c.setColor (Color.red);
	c.fillOval (135 - x, 160, 50, 50);
	c.setColor (Color.white);
	c.fillRect (100 - x, 150, 7, 150); //for the pole
    } //end firstScreen method


    public static void secondScreen (int x)
    {
	c.setColor (Color.black); //for the road //THIS IS THE INDIAN SCENERY
	c.fillRect (1407 - x, 300, 1407, 150); //-x is used so that it can be brought in later during animation
	c.setColor (Color.white);
	c.fillRect (1807 - x, 375, 45, 10);
	c.fillRect (1957 - x, 375, 45, 10);
	c.fillRect (2107 - x, 375, 45, 10);
	c.fillRect (2257 - x, 375, 45, 10);
	c.fillRect (2457 - x, 375, 45, 10);
	c.fillRect (2607 - x, 375, 45, 10);
	c.fillRect (2757 - x, 375, 45, 10);
	c.setColor (Color.blue); //for the top blue background
	c.fillRect (1407 - x, 0, 1407, 300);
	c.setColor (Color.blue); //for the top blue background
	c.fillRect (1407 - x, 0, 1407, 300);
	c.setColor (Color.yellow); //moon
	c.fillOval (1882 - x, 7, 125, 125);
	c.setColor (Color.blue); //moon
	c.fillOval (1922 - x, 7, 125, 125);
	c.setColor (Color.gray); //mountains
	c.fillArc (1607 - x, 100, 400, 400, 180, -180);
	c.fillArc (1912 - x, 25, 550, 550, 180, -180);
	c.setColor (Color.gray); //for the bottom of the screen
	c.fillRect (1407 - x, 450, 1800, 300);
	c.setColor (Color.green); //for bottom trees
	c.fillOval (1507 - x, 600, 30, 30);
	c.fillOval (1532 - x, 600, 30, 30);
	c.fillOval (1557 - x, 600, 30, 30);
	c.fillOval (1522 - x, 580, 30, 30);
	c.fillOval (1539 - x, 580, 30, 30);
	c.fillOval (1597 - x, 600, 30, 30);
	c.fillOval (1622 - x, 600, 30, 30);
	c.fillOval (1647 - x, 600, 30, 30);
	c.fillOval (1612 - x, 580, 30, 30);
	c.fillOval (1629 - x, 580, 30, 30);
	c.fillOval (1687 - x, 600, 30, 30);
	c.fillOval (1712 - x, 600, 30, 30);
	c.fillOval (1737 - x, 600, 30, 30);
	c.fillOval (1702 - x, 580, 30, 30);
	c.fillOval (1719 - x, 580, 30, 30);
	c.fillOval (1777 - x, 600, 30, 30);
	c.fillOval (1802 - x, 600, 30, 30);
	c.fillOval (1827 - x, 600, 30, 30);
	c.fillOval (1892 - x, 580, 30, 30);
	c.fillOval (1809 - x, 580, 30, 30);
	c.fillOval (2017 - x, 600, 30, 30);
	c.fillOval (2042 - x, 600, 30, 30);
	c.fillOval (2067 - x, 600, 30, 30);
	c.fillOval (2032 - x, 580, 30, 30);
	c.fillOval (2049 - x, 580, 30, 30);
	c.fillOval (2107 - x, 600, 30, 30);
	c.fillOval (2132 - x, 600, 30, 30);
	c.fillOval (2157 - x, 600, 30, 30);
	c.fillOval (2122 - x, 580, 30, 30);
	c.fillOval (2139 - x, 580, 30, 30);
	c.fillOval (2199 - x, 600, 30, 30);
	c.fillOval (2222 - x, 600, 30, 30);
	c.fillOval (2247 - x, 600, 30, 30);
	c.fillOval (2212 - x, 580, 30, 30);
	c.fillOval (2229 - x, 580, 30, 30);
	c.fillOval (2287 - x, 600, 30, 30);
	c.fillOval (2312 - x, 600, 30, 30);
	c.fillOval (2337 - x, 600, 30, 30);
	c.fillOval (2302 - x, 580, 30, 30);
	c.fillOval (2319 - x, 580, 30, 30);
	c.fillOval (2377 - x, 600, 30, 30);
	c.fillOval (2402 - x, 600, 30, 30);
	c.fillOval (2427 - x, 600, 30, 30);
	c.fillOval (2392 - x, 580, 30, 30);
	c.fillOval (2409 - x, 580, 30, 30);
	c.fillOval (2469 - x, 600, 30, 30);
	c.fillOval (2492 - x, 600, 30, 30);
	c.fillOval (2517 - x, 600, 30, 30);
	c.fillOval (2482 - x, 580, 30, 30);
	c.fillOval (2499 - x, 580, 30, 30);
	c.setColor (Color.green); //for trees on the road
	c.fillOval (2127 - x, 250, 30, 40);
	c.fillOval (2117 - x, 270, 30, 30);
	c.fillOval (2137 - x, 270, 30, 30);
	c.fillRect (2137 - x, 290, 9, 60);
	c.setColor (Color.green); //tree 2
	c.fillOval (2187 - x, 250, 30, 40);
	c.fillOval (2177 - x, 270, 30, 30);
	c.fillOval (2197 - x, 270, 30, 30);
	c.fillRect (2197 - x, 290, 9, 60);
	c.setColor (Color.green); //tree 3
	c.fillOval (2337 - x, 350, 30, 40);
	c.fillOval (2327 - x, 370, 30, 30);
	c.fillOval (2347 - x, 370, 30, 30);
	c.fillRect (2347 - x, 390, 9, 60);
	c.setColor (Color.green); //tree 4
	c.fillOval (2397 - x, 350, 30, 40);
	c.fillOval (2387 - x, 370, 30, 30);
	c.fillOval (2407 - x, 370, 30, 30);
	c.fillRect (2407 - x, 390, 9, 60);
	c.fillRect (1527 - x, 150, 12, 150); //for the pole
	c.setColor (Color.orange); //flag of india
	c.fillRect (1527 - x, 80, 150, 30);
	c.setColor (Color.white);
	c.fillRect (1527 - x, 110, 150, 30);
	c.setColor (Color.green);
	c.fillRect (1527 - x, 140, 150, 30);
	c.setColor (Color.black);
	c.drawRect (1527 - x, 80, 150, 90);
	c.setColor (Color.blue);
	c.fillOval (1587 - x, 110, 30, 30);


	c.setColor (Color.black); //for the road // Japan at 3RD WINDOW!!
	c.fillRect (2814 - x, 300, 2000, 150);
	c.setColor (Color.white);
	c.fillRect (3214 - x, 375, 45, 10);
	c.fillRect (3364 - x, 375, 45, 10);
	c.fillRect (3564 - x, 375, 45, 10);
	c.fillRect (3664 - x, 375, 45, 10);
	c.fillRect (3864 - x, 375, 45, 10);
	c.fillRect (4014 - x, 375, 45, 10);
	c.fillRect (4164 - x, 375, 45, 10);
	c.setColor (Color.blue); //for the top blue background
	c.fillRect (2814 - x, 0, 1407, 300);
	c.setColor (Color.yellow); //sun
	c.fillArc (3414 - x, 110, 250, 250, 180, -180);
	c.setColor (Color.gray); //mountains
	c.fillArc (2914 - x, 150, 290, 300, 180, -180);
	c.fillArc (3089 - x, 63, 450, 475, 180, -180);
	c.fillArc (3519 - x, 25, 750, 550, 180, -180);
	c.setColor (Color.gray); //bottom of the screen
	c.fillRect (2814 - x, 450, 1407, 300);
	c.setColor (Color.green); //for bottom trees
	c.fillOval (2914 - x, 600, 30, 30);
	c.fillOval (2939 - x, 600, 30, 30);
	c.fillOval (2964 - x, 600, 30, 30);
	c.fillOval (2929 - x, 580, 30, 30);
	c.fillOval (2946 - x, 580, 30, 30);
	c.fillOval (3004 - x, 600, 30, 30);
	c.fillOval (3029 - x, 600, 30, 30);
	c.fillOval (3054 - x, 600, 30, 30);
	c.fillOval (3019 - x, 580, 30, 30);
	c.fillOval (3036 - x, 580, 30, 30);
	c.fillOval (3096 - x, 600, 30, 30);
	c.fillOval (3119 - x, 600, 30, 30);
	c.fillOval (3144 - x, 600, 30, 30);
	c.fillOval (3109 - x, 580, 30, 30);
	c.fillOval (3126 - x, 580, 30, 30);
	c.fillOval (3184 - x, 600, 30, 30);
	c.fillOval (3209 - x, 600, 30, 30);
	c.fillOval (3234 - x, 600, 30, 30);
	c.fillOval (3199 - x, 580, 30, 30);
	c.fillOval (3216 - x, 580, 30, 30);
	c.fillOval (3424 - x, 600, 30, 30);
	c.fillOval (3449 - x, 600, 30, 30);
	c.fillOval (3479 - x, 600, 30, 30);
	c.fillOval (3634 - x, 580, 30, 30);
	c.fillOval (3456 - x, 580, 30, 30);
	c.fillOval (3514 - x, 600, 30, 30);
	c.fillOval (3539 - x, 600, 30, 30);
	c.fillOval (3564 - x, 600, 30, 30);
	c.fillOval (3529 - x, 580, 30, 30);
	c.fillOval (3546 - x, 580, 30, 30);
	c.fillOval (3604 - x, 600, 30, 30);
	c.fillOval (3629 - x, 600, 30, 30);
	c.fillOval (3654 - x, 600, 30, 30);
	c.fillOval (3619 - x, 580, 30, 30);
	c.fillOval (3636 - x, 580, 30, 30);
	c.fillOval (3694 - x, 600, 30, 30);
	c.fillOval (3719 - x, 600, 30, 30);
	c.fillOval (3744 - x, 600, 30, 30);
	c.fillOval (3709 - x, 580, 30, 30);
	c.fillOval (3726 - x, 580, 30, 30);
	c.fillOval (3784 - x, 600, 30, 30);
	c.fillOval (3809 - x, 600, 30, 30);
	c.fillOval (3834 - x, 600, 30, 30);
	c.fillOval (3799 - x, 580, 30, 30);
	c.fillOval (3816 - x, 580, 30, 30);
	c.fillOval (3874 - x, 600, 30, 30);
	c.fillOval (3899 - x, 600, 30, 30);
	c.fillOval (3924 - x, 600, 30, 30);
	c.fillOval (3889 - x, 580, 30, 30);
	c.fillOval (3906 - x, 580, 30, 30);
	c.setColor (Color.green); //for trees on the road
	c.fillOval (3534 - x, 250, 30, 40);
	c.fillOval (3524 - x, 270, 30, 30);
	c.fillOval (3544 - x, 270, 30, 30);
	c.fillRect (3544 - x, 290, 9, 60);
	c.setColor (Color.green); //tree 2
	c.fillOval (3594 - x, 250, 30, 40);
	c.fillOval (3584 - x, 270, 30, 30);
	c.fillOval (3604 - x, 270, 30, 30);
	c.fillRect (3604 - x, 290, 9, 60);
	c.setColor (Color.green); //tree 3
	c.fillOval (3744 - x, 350, 30, 40);
	c.fillOval (3734 - x, 370, 30, 30);
	c.fillOval (3754 - x, 370, 30, 30);
	c.fillRect (3754 - x, 390, 9, 60);
	c.setColor (Color.green); //tree 4
	c.fillOval (3904 - x, 350, 30, 40);
	c.fillOval (3894 - x, 370, 30, 30);
	c.fillOval (2814 - x, 370, 30, 30);
	c.fillRect (2814 - x, 390, 9, 60);
	c.setColor (Color.white); //THIS IS FOR THE CLOUDS
	c.fillOval (2844 - x, 70, 90, 40);
	c.fillOval (2884 - x, 70, 90, 40);
	c.fillOval (2854 - x, 60, 50, 50);
	c.fillOval (2904 - x, 60, 50, 50);
	c.fillOval (3024 - x, 90, 90, 40);
	c.fillOval (3064 - x, 90, 90, 40);
	c.fillOval (3034 - x, 80, 50, 50);
	c.fillOval (3084 - x, 80, 50, 50);
	c.fillOval (3634 - x, 50, 90, 40);
	c.fillOval (3674 - x, 50, 90, 40);
	c.fillOval (3644 - x, 40, 50, 50);
	c.fillOval (3694 - x, 40, 50, 50);
	c.setColor (Color.white); //for the JAPAN flag
	c.fillRect (2914 - x, 150, 120, 75);
	c.setColor (Color.red);
	c.fillOval (2949 - x, 160, 50, 50);
	c.setColor (Color.white);
	c.fillRect (2914 - x, 150, 7, 150); //for the pole


    } //end secondScreen method


    public static void getReady ()
    {
	c.setFont (arialBig);
	delay (100);
	c.setColor (darkBlue);
	c.fillRect (500, 400, 400, 150);
	c.setColor (Color.yellow);
	c.drawString ("Get Ready...", 550, 500);
	delay (2000);
	c.setColor (darkBlue);
	c.fillRect (500, 400, 400, 150);
	c.setColor (Color.yellow);
	c.drawString ("3...", 550, 500);
	delay (1000);
	c.setColor (darkBlue);
	c.fillRect (500, 400, 400, 150);
	c.setColor (Color.yellow);
	c.drawString ("2...", 550, 500);
	delay (1000);
	c.setColor (darkBlue);
	c.fillRect (500, 400, 400, 150);
	c.setColor (Color.yellow);
	c.drawString ("1...", 550, 500);
	delay (1000);
	c.setColor (darkBlue);
	c.fillRect (500, 400, 400, 150);
	c.setColor (Color.yellow);
	c.drawString ("GO!!!!", 550, 500);
    } // Count down before race


    public static void levelTransition (double speed)
    {
	String userSpeed = String.valueOf (speed);
	c.setColor (darkBlue);
	c.fillRect (0, 0, 1407, 759);

	for (int k = 0 ; k < c.maxx () - 50 ; k++)
	{
	    c.setColor (Color.red);
	    c.fillOval (k, 350, 50, 50);
	    c.setColor (Color.black);
	    c.fillOval (k + 10, 370, 5, 5);
	    c.fillOval (k + 30, 370, 5, 5);
	    c.setColor (Color.pink);
	    c.fillArc (k + 15, 382, 15, 15, 180, 360);
	    delay (3);
	    c.setColor (Color.red);
	    c.fillOval (k, 350, 50, 50);
	}
	delay (100);
	c.setColor (Color.black);
	c.fillRect (200, 5, 900, 150);
	c.setColor (Color.white);
	c.setFont (arialBig);
	c.drawString ("Level Complete! WPM:", 300, 100);
	c.drawString (userSpeed, 900, 100);
	delay (2000);
	c.setColor (Color.black);
	c.fillRect (200, 5, 900, 150);
	c.setColor (Color.white);
	c.drawString ("You have successfully reached", 300, 100);
	delay (2000);
	c.setColor (Color.black);
	c.fillRect (500, 150, 400, 150);
	c.setColor (Color.white);
	c.setFont (arialBig);
	c.drawString ("Level 2", 550, 250);
	delay (1000);
	c.setColor (Color.gray);
	c.setFont (arialBig);
	c.drawString ("New Car Unlocked! ", 550, 500);
	for (int l = c.maxx () - 50 ; l > 0 ; l--)
	{
	    c.setColor (darkBlue);
	    c.fillOval (l, 350, 50, 50);
	    c.setColor (Color.black);
	    c.fillOval (l + 10, 370, 5, 5);
	    c.fillOval (l + 30, 370, 5, 5);
	    c.setColor (Color.pink);
	    c.fillArc (l + 15, 382, 15, 15, 180, 360);
	    delay (3);
	    c.setColor (Color.blue);
	    c.fillOval (l, 350, 50, 50);
	    c.setColor (Color.black); //if game repeats, title will be black
	}
	c.setColor (Color.red); //for the car
	c.fillRect (205, 465, 100, 30);
	c.fillOval (207, 438, 104, 45);
	c.setColor (Color.green);
	c.fillRect (210, 465, 100, 30);
	c.fillOval (210, 440, 100, 45);
	c.fillArc (180, 458, 60, 70, 0, 180);
	c.fillArc (285, 458, 60, 70, 0, 180);
	c.setColor (Color.yellow); //headlights
	c.fillArc (318, 461, 23, 23, 0, 80);
	c.setColor (Color.black);
	c.fillOval (198, 473, 32, 32);
	c.fillOval (298, 473, 32, 32);
	c.setColor (Color.white);
	c.fillOval (204, 479, 20, 20);
	c.fillOval (304, 479, 20, 20);
	c.setColor (Color.red);
	c.fillArc (230, 445, 70, 40, 0, 90);
	c.setColor (Color.black);
	c.fillArc (234, 446, 64, 36, 0, 90);
	c.setColor (Color.red);
	c.fillArc (220, 445, 70, 40, 90, 90);
	c.setColor (Color.black);
	c.fillArc (223, 446, 68, 36, 90, 90);
	c.setColor (Color.red);
	c.fillRect (258, 446, 10, 18);
	delay (1000);
    } //end of level transition


    public static void type ()
    {
	int move = 0;
	c.setFont (arialSmall);
	char letter;
	double begin = System.currentTimeMillis ();
	double end;
	double wpm;
	if (level == 1)
	{
	    for (int a = 0 ; a < 100 ; a += 10)
	    {
		for (int word = 0 ; word < 10 ; word++)
		{
		    for (int currentChar = 0 ; currentChar < words [a + word].length () ; currentChar++)
		    {
			c.setColor (darkBlue);
			c.fillRect (350, 600, 900, 100);
			c.setColor (Color.yellow);
			c.drawString (words [a], 400, 650);
			c.drawString (words [a + 1], 475, 650);
			c.drawString (words [a + 2], 550, 650);
			c.drawString (words [a + 3], 625, 650);
			c.drawString (words [a + 4], 700, 650);
			c.drawString (words [a + 5], 775, 650);
			c.drawString (words [a + 6], 850, 650);
			c.drawString (words [a + 7], 925, 650);
			c.drawString (words [a + 8], 1000, 650);
			c.drawString (words [a + 9], 1075, 650);
			//prints word list

			letter = c.getChar ();
			if (letter == words [a + word].charAt (currentChar))
			{
			    move += 50;
			    if (move >= 2814)
				move = 0;
			    movement (move);
			    c.setColor (Color.green);
			    c.drawString (words [a + word], 400 + 75 * word, 650);
			} //if character is correct
			else
			{
			    c.setColor (Color.red);
			    c.drawString (words [a + word], 400 + 75 * word, 650);
			    letter = c.getChar ();
			    while (letter != words [a + word].charAt (currentChar))
			    {
				letter = c.getChar ();
			    } //error check while loop
			} //if character is not correct
		    } //for, represents individual characters of each word

		} //outer for loop, represents each of 10 current words
		c.setColor (darkBlue);
		c.fillRect (450, 650, 500, 200);
	    } //outermost for loop, 10 of total 100 words
	    end = System.currentTimeMillis ();
	    double elapsed = end - begin;
	    elapsed /= 60000.0;
	    wpm = Math.round (100 * (100 / elapsed)) / 100.0; //divides the number of words by the time elapsed in mins, to find words per minute

	    levelTransition (wpm);
	    level++;
	    playGame ();

	} //outer if, for level 1
	else
	{
	    begin = System.currentTimeMillis ();
	    for (int a = 0 ; a < 100 ; a += 10)
	    {
		for (int word = 0 ; word < 10 ; word++)
		{
		    for (int currentChar = 0 ; currentChar < words2 [a + word].length () ; currentChar++)
		    {
			c.setColor (darkBlue);
			c.fillRect (350, 600, 900, 100);
			c.setColor (Color.yellow);
			c.drawString (words2 [a], 400, 650);
			c.drawString (words2 [a + 1], 475, 650);
			c.drawString (words2 [a + 2], 550, 650);
			c.drawString (words2 [a + 3], 625, 650);
			c.drawString (words2 [a + 4], 700, 650);
			c.drawString (words2 [a + 5], 775, 650);
			c.drawString (words2 [a + 6], 850, 650);
			c.drawString (words2 [a + 7], 925, 650);
			c.drawString (words2 [a + 8], 1000, 650);
			c.drawString (words2 [a + 9], 1075, 650);
			//prints word list

			letter = c.getChar ();
			if (letter == words2 [a + word].charAt (currentChar))
			{
			    move += 50;
			    if (move >= 2814)
				move = 0;
			    movement (move);
			    c.setColor (Color.green);
			    c.drawString (words2 [a + word], 400 + 75 * word, 650);
			} //if character is correct
			else
			{
			    c.setColor (Color.red);
			    c.drawString (words2 [a + word], 400 + 75 * word, 650);
			    letter = c.getChar ();
			    while (letter != words2 [a + word].charAt (currentChar))
			    {
				letter = c.getChar ();
			    } //error check while loop
			} //if character is not correct
		    } //for, represents individual characters of each word

		} //outer for loop, represents each of 10 current words
		c.setColor (darkBlue);
		c.fillRect (450, 650, 500, 200);
	    } //outermost for loop, 10 of total 100 words
	    end = System.currentTimeMillis ();
	    double elapsed = end - begin;
	    elapsed /= 60000.0;
	    wpm = Math.round (100 * (100 / elapsed)) / 100.0; //divides the number of words by the time elapsed in mins, to find words per minute
	    blinkingCar (wpm);
	    level = 1;
	} //else, for level 2
    } //ends type method


    public static void displayCar ()
    {

	if (carChoice == 1)
	{
	    c.setColor (Color.red); //for the car
	    c.fillRect (205, 365, 100, 30);
	    c.fillOval (207, 338, 104, 45);
	    c.setColor (Color.blue);
	    c.fillRect (210, 365, 100, 30);
	    c.fillOval (210, 340, 100, 45);
	    c.fillArc (180, 358, 60, 70, 0, 180);
	    c.fillArc (285, 358, 60, 70, 0, 180);
	    c.setColor (Color.yellow); //headlights
	    c.fillArc (318, 361, 23, 23, 0, 80);
	    c.setColor (Color.black);
	    c.fillOval (198, 373, 32, 32);
	    c.fillOval (298, 373, 32, 32);
	    c.setColor (Color.white);
	    c.fillOval (204, 379, 20, 20);
	    c.fillOval (304, 379, 20, 20);
	    c.setColor (Color.red);
	    c.fillArc (230, 345, 70, 40, 0, 90);
	    c.setColor (Color.black);
	    c.fillArc (234, 346, 64, 36, 0, 90);
	    c.setColor (Color.red);
	    c.fillArc (220, 345, 70, 40, 90, 90);
	    c.setColor (Color.black);
	    c.fillArc (223, 346, 68, 36, 90, 90);
	    c.setColor (Color.red);
	    c.fillRect (258, 346, 10, 18);
	    c.setColor (Color.white); //clouds
	    c.fillOval (30, 70, 90, 40);
	    c.fillOval (70, 70, 90, 40);
	    c.fillOval (40, 60, 50, 50);
	    c.fillOval (90, 60, 50, 50);
	    c.fillOval (210, 90, 90, 40);
	    c.fillOval (250, 90, 90, 40);
	    c.fillOval (220, 80, 50, 50);
	    c.fillOval (270, 80, 50, 50);
	    c.fillOval (820, 50, 90, 40);
	    c.fillOval (860, 50, 90, 40);
	    c.fillOval (830, 40, 50, 50);
	    c.fillOval (880, 40, 50, 50);
	} //default car

	else if (carChoice == 2)
	{
	    c.setColor (lime); //for the car
	    c.fillRect (205, 365, 100, 30);
	    c.fillOval (207, 338, 104, 45);
	    c.setColor (pink);
	    c.fillRect (205, 365, 100, 30);
	    c.fillOval (207, 338, 104, 45);
	    c.fillArc (180, 358, 60, 70, 0, 180);
	    c.fillArc (285, 358, 60, 70, 0, 180);
	    c.setColor (Color.yellow); //headlights
	    c.fillArc (318, 361, 23, 23, 0, 80);
	    c.setColor (Color.black);
	    c.fillOval (198, 373, 32, 32);
	    c.fillOval (298, 373, 32, 32);
	    c.setColor (Color.white);
	    c.fillOval (204, 379, 20, 20);
	    c.fillOval (304, 379, 20, 20);
	    c.setColor (olive);
	    c.fillArc (230, 345, 70, 40, 0, 90);
	    c.setColor (Color.black);
	    c.fillArc (234, 346, 64, 36, 0, 90);
	    c.setColor (Color.red);
	    c.fillArc (220, 345, 70, 40, 90, 90);
	    c.setColor (Color.black);
	    c.fillArc (220, 345, 70, 40, 90, 90);
	    c.setColor (Color.red);
	    c.fillRect (258, 346, 10, 18);
	} //second car
	else if (carChoice == 3)
	{
	    c.setColor (Color.red); //for the car
	    c.fillRect (205, 365, 100, 30);
	    c.fillOval (207, 338, 104, 45);
	    c.setColor (Color.green);
	    c.fillRect (205, 365, 100, 30);
	    c.fillOval (207, 338, 104, 45);
	    c.fillArc (180, 358, 60, 70, 0, 180);
	    c.fillArc (285, 358, 60, 70, 0, 180);
	    c.setColor (Color.yellow); //headlights
	    c.fillArc (318, 361, 23, 23, 0, 80);
	    c.setColor (Color.black);
	    c.fillOval (198, 373, 32, 32);
	    c.fillOval (298, 373, 32, 32);
	    c.setColor (Color.white);
	    c.fillOval (204, 379, 20, 20);
	    c.fillOval (304, 379, 20, 20);
	    c.setColor (Color.red);
	    c.fillArc (230, 345, 70, 40, 0, 90);
	    c.setColor (Color.black);
	    c.fillArc (223, 346, 68, 36, 90, 90);
	    c.setColor (Color.red);
	    c.fillArc (220, 345, 70, 40, 90, 90);
	    c.setColor (Color.black);
	    c.fillArc (220, 345, 70, 40, 90, 90);
	    c.setColor (Color.red);
	    c.fillRect (258, 346, 10, 18);
	} //third car
	else
	{
	    c.setColor (turquoise); //for the car
	    c.fillRect (1005, 195, 100, 30);
	    c.fillOval (1007, 168, 104, 45);
	    c.setColor (brown);
	    c.fillRect (1010, 195, 100, 30);
	    c.fillOval (1010, 170, 100, 45);
	    c.fillArc (980, 188, 60, 70, 0, 180);
	    c.fillArc (1085, 188, 60, 70, 0, 180);
	    c.setColor (Color.yellow); //headlights
	    c.fillArc (1118, 191, 23, 23, 0, 80);
	    c.setColor (Color.black);
	    c.fillOval (998, 203, 32, 32);
	    c.fillOval (1098, 203, 32, 32);
	    c.setColor (Color.white);
	    c.fillOval (1004, 209, 20, 20);
	    c.fillOval (1104, 209, 20, 20);
	    c.setColor (gold);
	    c.fillArc (1030, 175, 70, 40, 0, 90);
	    c.setColor (Color.black);
	    c.fillArc (1034, 176, 64, 36, 0, 90);
	    c.setColor (Color.red);
	    c.fillArc (1020, 175, 70, 40, 90, 90);
	    c.setColor (Color.black);
	    c.fillArc (1023, 176, 68, 36, 90, 90);
	    c.setColor (Color.red);
	    c.fillRect (1058, 176, 10, 18);
	    c.setColor (Color.gray);
	    c.fillRect (1150, 200, 60, 50);
	    c.fillArc (1150, 185, 60, 40, 180, -180);
	    c.setColor (Color.pink);
	    c.fillArc (1160, 195, 40, 20, 180, -180);
	} //last car

    } //displayCar


    public static void displayRoad ()
    {
	c.setColor (Color.black);
	c.fillRect (0, 125, 2000, 150);
	c.setColor (Color.white);
	c.fillRect (50, 200, 45, 10);
	c.fillRect (200, 200, 45, 10);
	c.fillRect (350, 200, 45, 10);
	c.fillRect (500, 200, 45, 10);
	c.fillRect (650, 200, 45, 10);
	c.fillRect (800, 200, 45, 10);
	c.fillRect (950, 200, 45, 10);
	c.fillRect (1100, 200, 45, 10);
	c.fillRect (1250, 200, 45, 10);

    } //displayRoad


    public static void animatedSmoke ()
    {
	int x = 0, dx = 1, y = 0, dy = 1;
	for (int timer = 0 ; timer < 1 ; timer++)
	{
	    while (x < 50)
	    {
		c.setColor (Color.white);
		c.drawOval (100 - (2 * x), 350 - y, 50 - x, 50 - x);
		delay (25);
		c.setColor (Color.black);
		c.fillRect (100 - (2 * x), 350 - y, 50, 50);
		x += dx;
		y += dy;
	    } //inner while loop
	} //for loop, plays smoke for certain amount of time
    } //animated smoke method
} //ends class



