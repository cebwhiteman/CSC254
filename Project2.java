/**
 * This is an interactive text-based application for completing a single instance of
 * the Washington Post sunday crossword puzzle. It has been developed for use in CSC184
 * in 2017 at Missouri Western State University.
 *
 * The original crossword puzzle can be found here:
 * https://www.washingtonpost.com/crossword-puzzles/sunday-evan-birnholz/?utm_term=.5a20fb43f9bd
 *
 * @author Joseph Kendall-Morwick <jkendallmorwick@missouriwestern.edu>
 * @version 10/31/2017
 */

import java.util.Scanner;

public class Project2 {

    /** maximum row for the crossword puzzle board */
    public static final int MAX_ROW = 21;

    /** maximum column for the crossword puzzle board */
    public static final int MAX_COL = 21;


    /** determines what character from the answers to the down clues is at the given row and column.
     * If no down clue covers the coordinates indicated, a '#' symbol is returned.
     * If the user hasn't provided an answer for the down clue at the coordinates indicated,
     * a '_' character is returned.
     */
    public static char getDownAnswerCharacter(int row, int column) {
        for(int clueNum=0; clueNum < getMaximumDownClueNumber(); clueNum++) {
            if(downClueExists(clueNum) &&
                    getDownAnswerColumn(clueNum) == column &&
                    getDownAnswerRow(clueNum) <= row &&
                    getDownAnswerRow(clueNum) + getDownAnswerLength(clueNum) > row) {
                return getDownAnswer(clueNum).charAt(row - getDownAnswerRow(clueNum));

            }
        }
        return '#';
    }

    /** prints out each character from the board. #'s are printed where there is no space to enter an answer,
     * _'s are printed in spaces where an answer is expected but none has been given yet, and otherwise
     * the character from the user's answer is printed.
     */
    public static void printBoard() {
        for (int row = 1; row <= MAX_ROW; row++) {
            for (int col = 1; col <= MAX_COL; col++) {
                char acrossChar = getAcrossAnswerCharacter(row, col);
                char downChar = getDownAnswerCharacter(row, col);
                if (acrossChar == '#' && downChar == '#') {
                    System.out.print('#');
                } else if (acrossChar == '#') {
                    System.out.print(downChar);
                } else if (downChar == '#') {
                    System.out.print(acrossChar);
                } else if (downChar == '_') {
                    System.out.print(acrossChar);
                } else {
                    System.out.print(downChar);
                }
            }

            System.out.println("");
        }
    }




    /** determines what character from the answers to the across clues is at the given row and column.
     * If no down clue covers the coordinates indicated, a '#' symbol is returned.
     * If the user hasn't provided an answer for the down clue at the coordinates indicated,
     * a '_' character is returned.
     */
    public static char getAcrossAnswerCharacter(int row, int column) {
        char c = '#';   // this is returned if no other value is found


        // TODO: search through the across answers to see if you should return a blank _
        // or if the user entered an answer at these coordinates you should return.
        // Look at getDownAnswerCharacter and mimic what that function is doing.

        return c;
    }

    
    /** determines whether all the down answers are compatible with all the across answers */
    public static boolean checkBoard() {
        for (int row = 1; row <= MAX_ROW; row++) {
            for (int col = 1; col <= MAX_COL; col++) {
                char acrossChar = getAcrossAnswerCharacter(row, col);
                char downChar = getDownAnswerCharacter(row, col);
                // TODO: determine if the characters for the down and across answers
                // are in conflict. If they are, return false. If they aren't, keep looking...
            if(acrossChar != downChar) {
                return false;
            }
            }
        }
        return true;
    }



    /** runs the crossword application */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean keepPlaying = true;     // application stops when this is set to false

        System.out.println("Washington Post Sunday Crossword Puzzle - Movie Clips");

        while(keepPlaying) { // main loop
            // print menu out to the user
            System.out.println("");
            System.out.println("Select an option: ");
            System.out.println(" 1) Print the answers on the board");
            System.out.println(" 2) Print the down clues");
            System.out.println(" 3) Print the across clues");
            System.out.println(" 4) Submit a down answer");
            System.out.println(" 5) Submit an across answer");
            System.out.println(" 6) Quit");
            System.out.println(" 10) Inject Solution (testing purposes -- beware spoilers!)");
            System.out.print("\nSelection: ");
            // read in response from the user
            String choice = input.nextLine().trim();

            System.out.println("");
            // take action based on the user's selection
            switch(forceParseInt(choice)) {
                case 1: {    // OPTION print the current state of the board
                    printBoard();
                    break;
                } case 2: {     // OPTION print the down clues
                    // check each possible down clue number
                    for (int clueNumber = 1; clueNumber < getMaximumDownClueNumber(); clueNumber++) {
                        if (downClueExists(clueNumber)) {
                            // if it exists, print out information for it
                            System.out.println("Down Clue #" + clueNumber);
                            System.out.println("\thint: " + getDownClue(clueNumber));
                            System.out.println("\tlocation: (" +
                                    getDownAnswerColumn(clueNumber) + ", " +
                                    getDownAnswerRow(clueNumber) + ")");
                            System.out.println("\tanswer length: " + getDownAnswerLength(clueNumber));
                        }
                    }
                    break;
                } case 3: {     // OPTION: print the across clues
                    // check each possible across clue number
                    for (int clueNumber = 1; clueNumber < getMaximumAcrossClueNumber(); clueNumber++) {
                        if (acrossClueExists(clueNumber)) {
                            // if it exists, print out information for it
                            System.out.println("Across Clue #" + clueNumber);
                            System.out.println("\thint: " + getAcrossClue(clueNumber));
                            System.out.println("\tlocation: (" +
                                    getAcrossAnswerColumn(clueNumber) + ", " +
                                    getAcrossAnswerRow(clueNumber) + ")");
                            System.out.println("\tanswer length: " + getAcrossAnswerLength(clueNumber));
                        }
                    }
                    break;
                } case 4: {    // OPTION: submit a down answer
                    // get the clue number from the user
                    System.out.print("Enter Clue Number: ");
                    String response = input.nextLine().trim();
                    int clueNumber = forceParseInt(response);
                    if (downClueExists(clueNumber)) { // make sure it exists
                        // get the user's proposed answer
                        System.out.print("Enter your answer: ");
                        response = input.nextLine().trim();
                        // make sure it's the right length
                        if(response.length() != getDownAnswerLength(clueNumber)) {
                            System.out.println("your answer is not the right length!");
                        } else {
                            //make sure it is consistent with any across answers
                            String oldAnswer = getDownAnswer(clueNumber); // save the current answer
                            setDownAnswer(clueNumber, response); // overwrite it
                            if(!checkBoard()) { // then check for an inconsistency
                                // if there is an inconsistency, roll back the change and alert the user
                                System.out.println("your answer is incompatible with the current state of the board");
                                setDownAnswer(clueNumber, oldAnswer);
                            }
                        }
                    } else {
                        System.out.println("No such down clue: " + response);
                        break;
                    }
                    break;
                } case 5: {    // OPTION: submit an across answer
                    // get the clue number from the user
                    System.out.print("Enter Clue Number: ");
                    String response = input.nextLine().trim();
                    int clueNumber = forceParseInt(response);
                    if (acrossClueExists(clueNumber)) {// make sure it exists
                        // get the user's proposed answer
                        System.out.print("Enter your answer: ");
                        response = input.nextLine().trim();
                        // make sure it's the right length
                        if(response.length() != getAcrossAnswerLength(clueNumber)) {
                            System.out.println("your answer is not the right length!");
                        } else {
                            //make sure it is consistent with any down answers
                            String oldAnswer = getAcrossAnswer(clueNumber);  // save the current answer
                            setAcrossAnswer(clueNumber, response); // overwrite it
                            if(!checkBoard()) { // then check for an inconsistency
                                // if there is an inconsistency, roll back the change and alert the user
                                System.out.println("your answer is incompatible with the current state of the board");
                                setAcrossAnswer(clueNumber, oldAnswer);
                            }
                        }
                    } else {
                        System.out.println("No such across clue: " + response);
                        break;
                    }
                    break;
                } case 6:     // OPTION: quit
                    keepPlaying = false; // quit the game
                    break;
                case 10: // for testing purposes -- inject all solutions in to the board, one at a time
                    injectSolution();
                    break;
                default:
                    System.out.println("Unrecognized choice, please try again. ");
            }
        }

        System.out.println("Thanks for playing!");

    }

    //********************************************************************************************
    // ADVANCED CODE:  The code below completes this class's implementation and uses some
    // techniques that haven't been covered yet in class.  You do not need to provide any
    // changes to the code below.  You may read it if you wish, but be aware that you may
    // not have the background to comprehend all of it.  You should be able to understand
    // all of this code by the end of the class, however.



    public static final int getMaximumDownClueNumber() {
        return downClues.length;
    }
    public static final int getMaximumAcrossClueNumber() {
        return acrossClues.length;
    }

    /** returns true if an across clue with the given clue number exists */
    public static boolean acrossClueExists(int clueNumber) {
        return clueNumber < acrossClues.length && acrossClues[clueNumber] != null;
    }

    /** returns true if a down clue with the given clue number exists */
    public static boolean downClueExists(int clueNumber) {
        return clueNumber < downClues.length && downClues[clueNumber] != null;
    }

    /** returns the text hint of the specified down clue */
    public static String getDownClue(int clueNumber) {
        if(clueNumber > downClues.length || downClues[clueNumber] == null)
            throw new IllegalArgumentException(clueNumber + " down does not exist");
        return downClues[clueNumber].getClue();
    }

    /** returns the text hint of the specified across clue */
    public static String getAcrossClue(int clueNumber) {
        if(clueNumber > acrossClues.length || acrossClues[clueNumber] == null)
            throw new IllegalArgumentException(clueNumber + " down does not exist");
        return acrossClues[clueNumber].getClue();
    }

    /** returns the row of the specified down clue */
    public static int getDownAnswerRow(int clueNumber) {
        if(clueNumber > downClues.length)
            return 0;
        return downClues[clueNumber].getRow();
    }

    /** returns the row of the specified across clue */
    public static int getAcrossAnswerRow(int clueNumber) {
        if(clueNumber > acrossClues.length)
            return 0;
        return acrossClues[clueNumber].getRow();
    }

    /** returns the column of the specified down clue */
    public static int getDownAnswerColumn(int clueNumber) {
        if(clueNumber > downClues.length)
            return 0;
        return downClues[clueNumber].getColumn();
    }

    /** returns the column of the specified across clue */
    public static int getAcrossAnswerColumn(int clueNumber) {
        if(clueNumber > acrossClues.length)
            return 0;
        return acrossClues[clueNumber].getColumn();
    }

    /** returns the length of the specified down clue's answer */
    public static int getDownAnswerLength(int clueNumber) {
        if(clueNumber > downClues.length)
            return 0;
        return downClues[clueNumber].getLength();
    }

    /** returns the length of the specified across clue's answer */
    public static int getAcrossAnswerLength(int clueNumber) {
        if(clueNumber > acrossClues.length)
            return 0;
        return acrossClues[clueNumber].getLength();
    }

    /** returns the answer given for the specified down clue */
    public static String getDownAnswer(int clueNumber) {
        if(clueNumber > downClues.length || downClues[clueNumber] == null)
            throw new IllegalArgumentException(clueNumber + " down does not exist");
        return downClues[clueNumber].getAnswer();
    }

    /** returns the answer given for the specified across clue */
    public static String getAcrossAnswer(int clueNumber) {
        if(clueNumber > acrossClues.length || acrossClues[clueNumber] == null)
            throw new IllegalArgumentException(clueNumber + " down does not exist");
        return acrossClues[clueNumber].getAnswer();
    }

    /** sets the user's answer given for the specified down clue */
    public static void setDownAnswer(int clueNumber, String answer) {
        if(clueNumber > downClues.length || downClues[clueNumber] == null ||
                answer.length() != downClues[clueNumber].getLength())
            throw new IllegalArgumentException(clueNumber + " down does not exist");

        if(answer.length() != downClues[clueNumber].getLength())
            throw new IllegalArgumentException("Length of answer for " +
                    clueNumber + " down has incorrect length: " + answer);
        downClues[clueNumber].setAnswer(answer);
    }

    /** sets the user's answer given for the specified across clue */
    public static void setAcrossAnswer(int clueNumber, String answer) {
        if(clueNumber > acrossClues.length || acrossClues[clueNumber] == null ||
                answer.length() != acrossClues[clueNumber].getLength())
            throw new IllegalArgumentException(clueNumber + " across does not exist");

        if(answer.length() != acrossClues[clueNumber].getLength())
            throw new IllegalArgumentException("Length of answer for " +
                    clueNumber + " across has incorrect length: " + answer);
        acrossClues[clueNumber].setAnswer(answer);
    }


    public static final Clue[] acrossClues = {
            null,
            new Clue("\"The package that I ordered just arrived!\"", 1, 1, 7), // 1
            null,
            null,
            null,
            null,
            null,
            null,
            new Clue("Target rival", 1, 9, 5),     // 8
            null,
            null,
            null,
            null,
            new Clue("De-creases?",  1, 15, 7),    // 13
            null,
            null,
            null,
            null,
            null,
            null,
            new Clue("Come through",  2, 1, 7) ,  // 20
            new Clue("File menu selection" , 2, 9, 5), // 21
            new Clue("Her diary entries are compiled in the book \"Last Flight\"", 2, 15,7),  // 22
            new Clue("Film about Oct. 24, in whichever year?", 3,1,13),  // 23
            null,
            new Clue("Faucet attachment", 3,15,7),   // 25
            new Clue("\"___ a Pirate\" (song from the \"Pirates of the Caribbean\" soundtrack)",
                    4, 4, 3), // 26
            new Clue("Home of Pennsylvania’s Millcreek Mall", 4, 8, 4),   // 27
            new Clue("Apple containing chips?", 4, 13, 3),       // 28
            null,
            new Clue("Off target" , 4, 18,  4), //30
            new Clue("Milliner's creations" , 5, 1,  4), //31
            null,
            null,
            new Clue("Film about Copenhagen reisdents living among pack animals",
                    5, 7,  15), // 34             null,
            null,
            null,
            null,
            new Clue("Former Wizards owner Pollin" , 6, 1,  3), // 38
            new Clue("Go after, as a fly" , 6, 5,  4), // 39
            null,
            new Clue("In a pile" , 6, 12,  6), // 41
            new Clue("Pitches on TV" , 6, 19,  3), // 42
            new Clue("Enter abruptly" , 7, 1,  7), // 43
            null,
            new Clue("Domino's domino, e.g." , 7, 9,  4), // 45
            null,
            null,
            new Clue("Peeves" , 7, 14,  5), // 48
            null,
            new Clue("Beersheba's nation" , 8, 1,  6), // 50
            new Clue("Family guy?" , 8, 8,  4), // 51
            new Clue("Lo-cal drinks" , 8, 13,  9), // 52
            null,
            null,
            null,
            new Clue("Film about taverns where people share tales of woe?" , 9, 1,  14), // 56
            null,
            null,
            new Clue("Denver's genre" , 9, 18,  4), // 59
            new Clue("Valencia conqueror" , 10, 4,  5), // 60
            new Clue("___ tuna" , 10, 11,  3), // 61
            new Clue("Popular dish in Bangkok" , 10, 15,  7), // 62
            null,
            null,
            new Clue("Emma Pillsbury's affliction on \"Glee\"" , 11, 1,  3), // 65
            null,
            null,
            new Clue("Film about in-flight Japanese drinks?" , 11, 5,  13), // 68
            null,
            null,
            null,
            new Clue("Point-click link" , 11, 19,  3), // 72
            new Clue("Push" , 12, 1,  7), // 73
            null,
            new Clue("\"13th\" director DuVernay" , 12, 9,  3), // 75
            new Clue("Emulate Obama" , 12, 14,  5), // 76
            null,
            new Clue("Nobelist Morrison" , 13, 1,  4), // 78
            new Clue("Film about a shrub grown by gorillas?" , 13, 8,  14), // 79
            null,
            null,
            null,
            null,
            null,
            new Clue("Good thing to hit" , 14, 1,  9), // 85
            null,
            null,
            null,
            new Clue("Touch upon" , 14, 11,  4), // 89
            new Clue("Sew up" , 14, 16,  6), // 90
            new Clue("Gets warm, so to speak" , 15, 4,  5), // 91
            new Clue("Subtle summons" , 15, 10,  4), // 92
            new Clue("Internet guide resembling a flowchart" , 15, 15,  7), // 93
            new Clue("Nest egg choice" , 16, 1,  3), // 94
            null,
            null,
            new Clue("Emulate 22 Across" , 16, 5,  6), // 97
            null,
            new Clue("Idol's quality" , 16, 14,  4), // 99
            new Clue("Letter in the Schrödinger equation" , 16, 19,  3), // 100
            new Clue("With \\\"The,\\\" film about a British conservative who goes on and on and on?",
                    17, 1,  15), // 101 null,
            null,
            null,
            null,
            null,
            new Clue("Adrift while aboard, maybe" , 17, 18,  4), // 106
            new Clue("Zoom up" , 18, 1,  4), // 107
            new Clue("Hoedown attendee" , 18, 7,  3), // 108
            new Clue("Military band wind" , 18, 11,  4), // 109
            new Clue("Need meds, perhaps" , 18, 16,  3), // 110
            null,
            new Clue("Ideal" , 19, 1,  7), // 112
            null,
            null,
            new Clue("Clips found in the special features menu of a DVD ..." +
                    " and a description of the letters clipped from this puzzle's movies",
                    19, 9,  13), // 115
            null,
            null,
            null,
            null,
            null,
            new Clue("Engine problem" , 20, 1,  7), // 121
            new Clue("Make euphoric" , 20, 9,  5), // 122
            new Clue("Echo" , 20, 15,  7), // 123
            new Clue("Maddens big-time" , 21, 1,  7), // 124
            new Clue("Squash" , 21, 9,  5), // 125
            new Clue("\"I'd prefer anything else!\"" , 21, 15,  7)  // 126
    };

    public static final Clue[] downClues = {
            null,
            new Clue("First lady before Edith", 1, 1, 3), // 1
            new Clue("Low euchre card",  1, 2, 3),       // 2
            new Clue("Furtive", 1, 3,  3),                 // 3
            new Clue("Weather Channel listings", 1, 4,  5),  // 4
            new Clue("Villainous queen’s daughter in Disney’s “Descendants”", 1, 5,4),   // 5
            new Clue("Guns, as on a racetrack",  1, 6,4),    // 6
            new Clue("Prior’s “prior to”",   1, 7,  3),    // 7
            new Clue("Cold-shoulder", 1, 9,  5),    // 8
            new Clue("Saxophonist Watts", 1, 10, 5),// 9
            new Clue("They provide help around the House", 1, 11,  5),  // 10
            new Clue("Microscopic messenger", 1, 12,  3),   // 11
            new Clue("Frustrate",  1, 13, 6),      // 12
            new Clue("Fruity diner dessert", 1, 15,  8),     // 13
            new Clue("Issa ___ (star of HBO’s “Insecure”)", 1, 16,  3), // 14
            new Clue("Screw up",  1, 17,  3),       // 15
            new Clue("Inedible wrap",  1, 18, 5),  // 16
            new Clue("Cannabis ___ (marijuana species)", 1, 19,  6),// 17
            new Clue("Washed away",   1, 20,  6),           // 18
            new Clue("Reason to take a break", 1, 21,  6),  // 19
            null,
            null,
            null,
            null,
            new Clue("“How charming!”",  3, 8, 4),   // 24
            null,
            null,
            null,
            null,
            new Clue("Some 1980s consoles" , 4, 14,  6), // 29
            null,
            new Clue("Something you might break" , 5, 1,  5), // 31
            new Clue("Cause to blush", 5, 2, 5), // 32
            new Clue("Pied-a-____" , 5, 3,  5), // 33
            new Clue("Comedian Fogler" , 5, 7,  3), // 34
            new Clue("Start of a question" , 5, 12,  3), // 35
            new Clue("Paintball result, maybe" , 5, 16,  4), // 36
            new Clue("Works of veneration" , 5, 17,  4), // 37
            null,
            new Clue("Cross-reference section heading in a Wikipedia article" ,
                    6, 5,  7), // 39
            new Clue("Davidson College athlete" , 6, 6,  7), // 40
            null,
            null,
            null,
            new Clue("Kotter of 1970s TV" , 7, 4,  4), // 44
            new Clue("What a bill covers" , 7, 9,  3), // 45
            new Clue("Special ____" , 7, 10,  3), // 46
            new Clue("Get very excited" , 7, 11,  9), // 47
            null,
            new Clue("Like piano notes" , 7, 18,  4), // 49
            null,
            new Clue("Yield" , 8, 8,  4), // 51
            new Clue("IV flow" , 8, 13,  4), // 52
            new Clue("Persian Gulf metropolis" , 8, 19,  4), // 53
            new Clue("\"Watchmen\" author Moore" , 8, 20,  4), // 54
            new Clue("Lose control, in a way" , 8, 21,  4), // 55
            null,
            new Clue("Baller's brand, maybe" , 9, 7,  4), // 57
            new Clue("Riddle-solver's cry" , 9, 12,  3), // 58
            null,
            null,
            null,
            new Clue("Play thing?" , 10, 15,  4), // 62
            new Clue("City of Angels" , 10, 16,  7), // 63
            new Clue("Diplomatic goal" , 10, 17,  7), // 64
            new Clue("Stops waffling" , 11, 1,  4), // 65
            new Clue("Raven's relative" , 11, 2,  4), // 66
            new Clue("\"That's it!\"" , 11, 3,  4), // 67
            null,
            new Clue("Pasta water additive" , 11, 9,  4), // 69
            new Clue("Eggs in a lab" , 11, 10,  3), // 70
            new Clue("Artist's digs" , 11, 14,  4), // 71
            null,
            null,
            new Clue("Personal appearance" , 12, 4,  4), // 74
            null,
            null,
            new Clue("Relax" , 12, 18,  4), // 77
            null,
            new Clue("Longtime Yankees catcher Jorge" , 13, 8,  6), // 79
            new Clue("Conan's channel" , 13, 12,  3), // 80
            new Clue("National defense goal?" , 13, 13,  3), // 81
            new Clue("BP station installations" , 13, 19,  5), // 82
            new Clue("Remove a letter, e.g." , 13, 20,  5), // 83
            new Clue("Vintage photo tone" , 13, 21,  5), // 84
            null,
            new Clue("Page problem" , 14, 5,  4), // 86
            new Clue("File menu selection" , 14, 6,  4), // 87
            new Clue("Brand of chips with a mustachioed man on its cans" ,
                    14, 7,  8), // 88
            null,
            null,
            null,
            new Clue("Letter writer?" , 15, 10,  3), // 92
            new Clue("\"You know ...\"" , 15, 15,  3), // 93
            new Clue("log comforter" , 16, 1,  6), // 94 C
            new Clue("Go back into business" , 16, 2,  6), // 95
            new Clue("Blog poster's image" , 16, 3,  6), // 96
            null,
            new Clue("Jalapeño and piña colada ingredients?" , 16, 9,  6), // 98
            new Clue("Word before \"pass\" or \"throw\"" , 16, 14,  4), // 99
            null,
            null,
            new Clue("Actress Christensen" , 17, 4,  5), // 102
            new Clue("Major key of Debussy's \"La Fille aux Cheveux de Lin\"" ,
                    17, 11,  5), // 103
            new Clue("Connect with" , 17, 12,  5), // 104
            new Clue("Regularly" , 17, 13,  5), // 105
            new Clue("Prepared to react" , 17, 18,  5), // 106
            null,
            null,
            null,
            new Clue("Regarding" , 18, 16,  4), // 110
            new Clue("\"Colors\" rapper" , 18, 17,  4), // 111
            null,
            new Clue("Inc., e.g., briefly" , 19, 5,  3), // 113
            new Clue("Wine lover's concern" , 19, 6,  3), // 114
            null,
            new Clue("Sportscaster Gold" , 19, 10,  3), // 116
            new Clue("Disruptive noise" , 19, 15,  3), // 117
            new Clue("Informal rejection" , 19, 19,  3), // 118
            new Clue("Due-in guess, briefly" , 19, 20,  3), // 119
            new Clue("___ theory" , 19, 21,  3) // 120
    };

    //********************************************************************************************
    // EVEN MORE ADVANCED CODE:  The code below completes this class's implementation and uses some
    // techniques that haven't been covered yet in class.  You do not need to provide any
    // changes to the code below.  You may read it if you wish, but be aware that you may
    // not have the background to comprehend all of it.  You should be able to understand
    // all of this code by the end of CSC 245.


    public static int forceParseInt(String num) {
        try {
            return Integer.parseInt(num);
        } catch(Exception e) {
            return 0;
        }
    }


    //********************************************
    //** PUZZLE SPOILER SOLUTIONS BELOW!!!!!!!!!!
    //********************************************




    public static void injectSolution() {
        // clear out all clues
        for(int clueNum=1;
            clueNum < Math.max(getMaximumAcrossClueNumber(), getMaximumDownClueNumber());
            clueNum++) {
            if(acrossClueExists(clueNum)) {
                acrossClues[clueNum].clearAnswer();
            }
            if(downClueExists(clueNum)) {
                downClues[clueNum].clearAnswer();
            }
        }
        setAcrossAnswer(1, "itshere");
        setAcrossAnswer(8, "sears");
        setAcrossAnswer(13, "presses");
        setAcrossAnswer(20, "deliver");
        setAcrossAnswer(21, "print");
        setAcrossAnswer(22, "earhart");
        setAcrossAnswer(23, "anygivenunday");
        setAcrossAnswer(25, "aerator");
        setAcrossAnswer(26, "hes");
        setAcrossAnswer(27, "erie");
        setAcrossAnswer(28, "mac");
        setAcrossAnswer(30, "wide");
        setAcrossAnswer(31, "hats");
        setAcrossAnswer(34, "daneswithwolves");
        setAcrossAnswer(38, "abe");
        setAcrossAnswer(39, "swat");
        setAcrossAnswer(41, "heaped");
        setAcrossAnswer(42, "ads");
        setAcrossAnswer(43, "bargein");
        setAcrossAnswer(45, "logo");
        setAcrossAnswer(48, "riles");
        setAcrossAnswer(50, "israel");
        setAcrossAnswer(51, "capo");
        setAcrossAnswer(52, "dietsodas");
        setAcrossAnswer(56, "thebadnewsbars");
        setAcrossAnswer(59, "folk");
        setAcrossAnswer(60, "elcid");
        setAcrossAnswer(61, "ahi");
        setAcrossAnswer(62, "padthai");
        setAcrossAnswer(65, "ocd");
        setAcrossAnswer(68, "sakesonaplane");
        setAcrossAnswer(72, "and");
        setAcrossAnswer(73, "promote");
        setAcrossAnswer(75, "ava");
        setAcrossAnswer(76, "orate");
        setAcrossAnswer(78, "toni");
        setAcrossAnswer(79, "plantoftheapes");
        setAcrossAnswer(85, "sweetspot");
        setAcrossAnswer(89, "abut");
        setAcrossAnswer(90, "ensure");
        setAcrossAnswer(91, "nears");
        setAcrossAnswer(92, "psst");
        setAcrossAnswer(93, "sitemap");
        setAcrossAnswer(94, "ira");
        setAcrossAnswer(97, "aviate");
        setAcrossAnswer(99, "fame");
        setAcrossAnswer(100, "psi");
        setAcrossAnswer(101, "neverendingtory");
        setAcrossAnswer(106, "asea");
        setAcrossAnswer(107, "soar");
        setAcrossAnswer(108, "gal");
        setAcrossAnswer(109, "fife");
        setAcrossAnswer(110, "ail");
        setAcrossAnswer(112, "optimal");
        setAcrossAnswer(115, "deletedscenes");
        setAcrossAnswer(121, "leakage");
        setAcrossAnswer(122, "elate");
        setAcrossAnswer(123, "iterate");
        setAcrossAnswer(124, "enrages");
        setAcrossAnswer(125, "siton");
        setAcrossAnswer(126, "notthat");



        setDownAnswer(1, "ida");
        setDownAnswer(2, "ten");
        setDownAnswer(3, "sly");
        setDownAnswer(4, "highs");
        setDownAnswer(5, "evie");
        setDownAnswer(6, "revs");
        setDownAnswer(7, "ere");
        setDownAnswer(8, "spurn");
        setDownAnswer(9, "ernie");
        setDownAnswer(10, "aides");
        setDownAnswer(11, "rna");
        setDownAnswer(12, "stymie");
        setDownAnswer(13, "peachpie");
        setDownAnswer(14, "rae");
        setDownAnswer(15, "err");
        setDownAnswer(16, "shawl");
        setDownAnswer(17, "sativa");
        setDownAnswer(18, "eroded");
        setDownAnswer(19, "stress");
        setDownAnswer(24, "neat");
        setDownAnswer(29, "ataris");
        setDownAnswer(31, "habit");
        setDownAnswer(32, "abash");
        setDownAnswer(33, "terre");
        setDownAnswer(34, "dan");
        setDownAnswer(35, "who");
        setDownAnswer(36, "welt");
        setDownAnswer(37, "odes");
        setDownAnswer(39, "seealso");
        setDownAnswer(40, "wildcat");
        setDownAnswer(44, "gabe");
        setDownAnswer(45, "law");
        setDownAnswer(46, "ops");
        setDownAnswer(47, "gobananas");
        setDownAnswer(49, "soft");
        setDownAnswer(51, "cede");
        setDownAnswer(52, "drip");
        setDownAnswer(53, "doha");
        setDownAnswer(54, "alan");
        setDownAnswer(55, "skid");
        setDownAnswer(57, "nike");
        setDownAnswer(58, "aha");
        setDownAnswer(62, "part");
        setDownAnswer(63, "anaheim");
        setDownAnswer(64, "detente");
        setDownAnswer(65, "opts");
        setDownAnswer(66, "crow");
        setDownAnswer(67, "done");
        setDownAnswer(69, "salt");
        setDownAnswer(70, "ova");
        setDownAnswer(71, "loft");
        setDownAnswer(74, "mien");
        setDownAnswer(77, "ease");
        setDownAnswer(79, "posada");
        setDownAnswer(80, "tbs");
        setDownAnswer(81, "out");
        setDownAnswer(82, "pumps");
        setDownAnswer(83, "erase");
        setDownAnswer(84, "sepia");
        setDownAnswer(86, "tear");
        setDownAnswer(87, "save");
        setDownAnswer(88, "pringles");
        setDownAnswer(92, "pen");
        setDownAnswer(93, "say");
        setDownAnswer(94, "insole");
        setDownAnswer(95, "reopen");
        setDownAnswer(96, "avatar");
        setDownAnswer(98, "tildes");
        setDownAnswer(99, "free");
        setDownAnswer(102, "erika");
        setDownAnswer(103, "gflat");
        setDownAnswer(104, "tieto");
        setDownAnswer(105, "often");
        setDownAnswer(106, "alert");
        setDownAnswer(110, "asto");
        setDownAnswer(111, "icet");
        setDownAnswer(113, "mag");
        setDownAnswer(114, "age");
        setDownAnswer(116, "eli");
        setDownAnswer(117, "din");
        setDownAnswer(118, "nah");
        setDownAnswer(119, "eta");
        setDownAnswer(120, "set");
        if(!checkBoard()) throw new RuntimeException("board is screwed up");
        printBoard();
    }
}


/** A class that represents a single clue in a crossword puzzle */
class Clue {

    private String clue;
    private int row;
    private int column;
    private int length;
    private String answer="";

    /** Creates a new crossword clue object
     *
     * @param clue the hint provided to the player
     * @param row  the row the answer will appear in
     * @param column  the column the answer will appear in
     * @param length  the length of the answer
     */
    public Clue(String clue, int row, int column, int length) {
        this.clue = clue;
        this.row = row;
        this.column = column;
        this.length = length;
        clearAnswer();
    }

    public String getClue() { return clue; }

    public int getRow() { return row; }

    public int getColumn() { return column; }

    public int getLength() { return length; }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getAnswer() { return answer; }

    public void clearAnswer() {
        answer = "";
        for(int i=0; i<length; i++) {
            answer += "_";
        }
    }
}
