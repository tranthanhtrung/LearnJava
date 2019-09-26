import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[]{};
        System.out.print(a.length);
    }

    //37
    public static String reverceSentence(String sentence) {
        String reverceSentence = "";
        String work = "";
        for (int i = 0; i < sentence.length(); i++) {
        	work += sentence.charAt(i) == ' ' ? "" : sentence.charAt(i);
            if (sentence.charAt(i) == ' ' || i == sentence.length() - 1) {
                reverceSentence = work + ' ' + reverceSentence;
                work = "";
            }
        }
        return reverceSentence;
    }

    //44
    // 20 => 20 + 2020 + 202020

    // n + nn + nnn = n + (n*10 + n) + (n*100 + n*10 + n)
     // => 3*n + 2*n*10 + n*100

    public static double sum(long number) {
    	double sum = 0;
    	double lengthNumber = ("" + number).length();
    	sum = 3*number + 2*number*Math.pow(10, lengthNumber) + number*Math.pow(100, lengthNumber);
    	return sum;
    }

    //48
    public static void printOddNumber() {
    	for (int i = 1; i < 100; i++) {
    		if ( i%2 != 0) {
    			System.out.println(i);
    		}
    	}
    }

    //49
    public static void isEvenNumber(int number) {
    	System.out.println((number+1)%2);
    }

    //50
    public static void printDivisor() {
    	System.out.print(" Divisor for 3: ");
    	for (int i = 1; i <= 100; i++) {
    		if (i%3 == 0) {
    			System.out.print(i + ", ");
    		}
    	}
    	System.out.print("\n Divisor for 5: ");
    	for (int i = 1; i <= 100; i++) {
    		if (i%5 == 0) {
    			System.out.print(i + ", ");
    		}
    	}
    	System.out.print("\n Divisor for 15: ");
    	for (int i = 1; i <= 100; i++) {
    		if (i%15 == 0) {
    			System.out.print(i + ", ");
    		}
    	}
    }

    //51
    public static int convertStringToInt(String input) {
    	double number = 0;
    	for (int i = 0; i < input.length(); i++) {
    		number = number*10 + input.charAt(i) - '0';
    	}
    	return (int) number;
    }

    //55
    public static String converIntToTime(int seconds) {
        return seconds/3600 + ":" + seconds/60 + ":" + seconds%60;
    }

    //58
    public static String capitalizeFisrtLeterInWord(String sentence) {
    	String result = "" + Character.toUpperCase(sentence.charAt(0));
    	for(int i = 1; i < sentence.length(); i++) {
    		if (sentence.charAt(i-1) == ' ') {
    			result += Character.toUpperCase(sentence.charAt(i));
    		} else {
    		    result += sentence.charAt(i);
            }
    	}
    	return result;
    }

    //59
    public static String lowerCase(String sentence) {
        String strLower = "";
        for (int i = 0; i < sentence.length(); i++) {
            strLower += Character.toLowerCase(sentence.charAt(i));
        }
        return strLower;
    }

    //61
    public static String reverseString(String input) {
        String reverse = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reverse += input.charAt(i);
        }
        return reverse;
    }


    // BinToDes
    public static int binToDec(String bin) {
    	int dec = 0;
    	for (int i = 0; i < bin.length(); i++) {
    		dec += (bin.charAt(i) - '0')*Math.pow(2, bin.length() - 1 - i);
    	}
    	return dec;
    }

    // Caesar's Code
    public static String caesarCode(String input, int jump) {
        String encode = "";
        for (int i = 0; i < input.length(); i++) {
            encode += (char)((input.charAt(i) + jump - 'A')%26 + 65);
        }
        return encode;
    }

    // counting valleys
    public static int countingValleys(String topoGraphic) {
        int valleys = 0;
        int height = 0;

        for (int i = 0; i < topoGraphic.length(); i++) {
            height += (topoGraphic.charAt(i) == 'U') ? 1 : -1;
            if (height == 0 && topoGraphic.charAt(i) == 'U') {
                valleys++;
            }
        }

        return valleys;
    }

    public static int[][] raceHorse(int x, int y) {
        int[][] chessboard = new int[8][8];
        return chessboard;
    }


}
