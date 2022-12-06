package mainPackage;
import java.io.*;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.awt.GraphicsEnvironment;
import java.util.Scanner;

public class Main {
	static Scanner userInput = new Scanner(System.in);
	
	static String name;
	static String businessName;
	static String item;
	static boolean grapes = false;
	
	public static void narrate(String s) {
		int sleepTime = (s.length()>40) ? 40 : 90;
		for (int i = 0; i<s.length(); i++) {
			System.out.print(s.charAt(i));
			try {
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("");
	}	
	public static boolean yes() {
		String input = userInput.nextLine();
		input = input.toLowerCase();
		if (input.equals("yes") || input.equals("y")) {
			narrate("--------yes--------");
			return true;
		} else if (input.equals("no") || input.equals("n")) {
			narrate("--------no--------");
			return false;
		} else {
			System.out.println("Please type Yes or No");
			return yes();
		}
	}
	public static boolean college() {
		String input = userInput.nextLine();
		input = input.toLowerCase();
		if (input.equals("1") || input.equals("college")) {
			return true;
		} else if (input.equals("2") || input.equals("business")) {
			return false;
		} else {
			System.out.println("Please type 1 or 2");
			return college();
		}
	}
	public static void begin() {
		narrate("Welcome, what is your name?");
		name = userInput.nextLine();
		narrate(name + "...");
		narrate("It is 1975 and you currently live in South Vietnam. You are quite young but It feels like everyone who lives here is doomed to live in poverty and danger for life under the current regime. You want more. You've made preparations to leave, but you will be risking your life. The last step is to sell all your belongings and pay your smuggler.\r\n"
				+ "Are you ready to go?\n (Please type Yes or No)");
		if (yes()) {
			A1();
		} else { //no
			A2();
		}
	}
	public static void end() {
		narrate("The story ends here.");
	}
	
	public static void A1() {
		narrate("It is midnight and you pay the smuggler with all the money you have left on you. All you have left are the clothes on your back and a little plastic bag with some grapes to keep your spirits. \r\n"
				+ "\r\n"
				+ "You and around a hundred people get onto the crammed fishing boat in the hopes that you drift onto another land that you can call home.\r\n"
				+ "\r\n"
				+ "Several days pass and the food and water rations have nearly run out. You see another passenger nearly passed out.\r\n"
				+ "Should you offer him your last grapes?");
		if (yes()) {
			B1();
		} else { //no
			B2();
		}
	}
	public static void A2() {
		narrate("You can't bring yourself to sell everything you own for what could result in death. You choose to continue surviving as best you can. Many of your friends and relatives end up dying attempting to make it to America, but one writes to you about how wonderful America is. You've made your decision, but sometimes you wonder \"what if I tried?\"");
		end();
	}
	
	public static void B1() {
		narrate("You give the man the last of your grapes. He smiles and quickly eats them. You can see some color return to his eyes. He tells you his name is Hien.\r\n"
				+ "\r\n"
				+ "After a long chat with your new friend, you try to fall asleep");
		grapes = true;
		B3();
	}
	public static void B2() {
		narrate("You choose to eat the last of the grapes instead, which slightly eases the pain in your stomach.\r\n"
				+ "\r\n"
				+ "You try to fall asleep.");
		B3();
	}
	public static void B3() {
		narrate("You wake up to shouts of the people onboard saying they've spotted a ship. Finally, you're so close to escape. \r\n"
				+ "\r\n"
				+ "...It's Thai Pirates\r\n"
				+ "\r\n"
				+ "Your heart sinks as they board the fishing boat. They tie up all the men while taking the women below the deck of their ship where you only hear screams. As the pirate approaches you to tie your hands, you have to quickly make a decision.\r\n"
				+ "Should you try fight back?");
		boolean yes = yes();
		if (yes && grapes) {
			C1();
		} else if (yes) { //no
			C2();
		} else {
			C3();
		}
	}
	
	public static void C1() {
		narrate("You grab a shard of glass on the floor and try to stab the pirate closest to you. You graze their arm but you notice another pirate aiming their gun at you. You hear the gunshot go off but you are still.. alive? You look down to see Hien on the ground bleeding out. He took the bullet for you. You quickly escape to go blend in with the other passengers during the commotion");
		narrate("\nYou tie your own hands and wait for the pirates to finish taking everyone's belongings, after which they leave on their ship.");
		narrate("\nAfter a day of the ship drifting through the sea, you spot land a good distance away, about a mile. Others are jumping ship and attempting to make the arduous swim to shore.\r\n"
				+ "Should you try to follow them?");
		if (yes()) {
			D1();
		} else { //no
			D2();
		}
	}
	public static void C2() {
		narrate("You grab a shard of glass on the floor and try to stab the pirate closest to you. You graze their arm but are immediately shot by another pirate. They take your dying corpse and throw it overboard");
		end();
	}
	public static void C3() {
		narrate("It's probably not a good idea to fight back. They have guns, knives, and clubs. They tie your hands together and take everyone's belongings. There were over a hundred people on the boat before, now there are only around 40 men. The pirates leave and the survivors are left to fend for themselves\r\n"
				+ "\r\n"
				+ "After a day of the ship drifting through the sea, you spot land a good distance away, about a mile. Others are jumping ship and attempting to make the arduous swim to shore.\r\n"
				+ "Should you try to follow them?");
		if (yes()) {
			D1();
		} else { //no
			D2();
		}
	}
	
	public static void D1() {
		narrate("You grab an empty jerry can to use as a floatation device and jump into the water. It is cold and you are already very tired, but you have to make it to land in order to survive, so you kick and kick and kick your legs.\r\n"
				+ "\r\n"
				+ "By some miracle, you make it to shore and around you only around 10 other men made it with you. A group of people spot you landing on the shore and offer you food and water as well as blankets. You are then taken to a nearby refugee camp.\r\n"
				+ "\r\n"
				+ "After moving between camps for a while, you eventually got sponsored by a kind person from America who was willing to take you in. On the plane to California, you think about all the struggles you've been through, and look forward to starting your new life.\r\n"
				+ "\r\n"
				+ "You arrive at your sponsor's home and now have to decide where to go from here.");
		F1();
	}
	public static void D2() {
		narrate("Swimming that far when you're this tired is a deathwish. You remain on the boat with the others and hope for a miracle. As the water reserves are gone, you resort to collecting rainwater with any tarps you can find, just to survive a bit longer\r\n"
				+ "\r\n"
				+ "When you almost feel like giving up, you spot a ship in the distance coming towards you. It turns out to be a Japanese naval ship and they rescue all of the people left onboard and give you food and water.\r\n"
				+ "\r\n"
				+ "Eventually you are taken back to Japan where you labor as a farmer for a few years. While life is finally comfortable, you have a nagging feeling that you want more.\r\n"
				+ "\r\n"
				+ "Do you want to apply to immigrate to the United States?");
		if (yes()) {
			E1();
		} else { //no
			E2();
		}
	}
	
	public static void E1() {
		narrate("You gather all of your personal documents and apply to immigrate to the United States. The process takes quite a long time and you end up having to wait over 2 years to finally be allowed into the U.S.\r\n"
				+ "\r\n"
				+ "You get on the plane and arrive in California, ready to start a new life.");
		F1();
	}
	public static void E2() {
		narrate("You already have everything you need here. You continue to work as a farmer for the rest of your life, and just live your new life away from the suffering back home.");
		end();
	}
	
	public static void F1() {
		narrate(" Do you:\r\n"
				+ "1. Go to community college\r\n"
				+ "2. Attempt to start a business");
		if (college()) {
			G1();
		} else { //no
			G2();
		}
	}
	
	public static void G1() {
		narrate("You apply to a community college near your city and choose to study computer science. Walking into your first class you're greeted with a few stares since the locals don't see Vietnamese people very often.\r\n"
				+ "\r\n"
				+ "You get assigned to a group with 3 other people in order to work on a project. One of your groupmates asks for your name.\r\n"
				+ "\r\n"
				+ "\"Oh, " + name + "\n"
				+ "\r\n"
				+ "\"Woah that sounds exotic. What are you?\"\r\n"
				+ "\r\n"
				+ "\"What?\"\r\n"
				+ "\r\n"
				+ "\"Like where did you come from?\"\r\n"
				+ "\r\n"
				+ "\"I came from Vietnam\"\r\n"
				+ "\r\n"
				+ "\"I heard asians have really good grades, I'll make sure to come to you when I need help\"\r\n"
				+ "\r\n"
				+ "Communicating in America has been hard because of the language barrier but you try your best.\r\n"
				+ "\r\n"
				+ "Do you want to change your name to be more American so you fit in better?");
		if (yes()) {
			H1();
		} else { //no
			H2();
		}
	}
	public static void G2() { //business route
		narrate("Your business will sell...");
		item = userInput.nextLine();
		if (item.charAt(item.length()-1)=='s') {
			item = item.substring(0,item.length()-1);
		}
		narrate("It will be called...");
		businessName = userInput.nextLine();
		
		narrate("You scrounge together all of the money you have left and start renting a property. It's dusty and old, but you get to work on fixing it up and making it yours. \r\n"
				+ "\r\n"
				+ "Eventually you get your first customer. They come in and say,\r\n"
				+ "\r\n"
				+ "\"" + businessName + "... Very nice place, I can tell you're hardworking. But if you had a website, you could get much more business\"\r\n"
				+ "\r\n"
				+ "He orders 3 " + item + "s.\r\n"
				+ "Do you want to give him an extra " + item + "?");
		if (yes()) {
			I2();
		} else {
			I1();
		}
	}
	
	
	public static void H1() {
		narrate("It's probably better to avoid trouble in the longterm. What should I change my name to?\r\n");
				
		name = userInput.nextLine();
		
		narrate("Yea, "+ name + ".. I like it");
		H3();
	}
	public static void H2() {
		narrate("No, this is your name, why should you change it? You deserve to keep your history and heritage.");
		H3();
	}
	public static void H3() {
		narrate("One time while you're out shopping, you suddenly hear someone hold up their middle finger towards you and say:\r\n"
				+ "\r\n"
				+ "\"Go back to your country, stupid asians\"\r\n"
				+ "\r\n"
				+ "Should you say something back?");
		yes();
		
		narrate("As much as it hurts, the words just don't come out of your mouth. The other person walks away and you're left there speechless");
		H4();
	}
	public static void H4() {
		narrate("After graduating with your computer science degree, you want to tell your story, so you decide to make a text based game where you follow the life of a Vietnamese refugee escaping communist Vietnam and creating a new life for themselves in America.\r\n"
				+ "\r\n"
				+ "Hopefully spreading awareness opens others up to the struggles you have faced.\r\n");
		end();
	}
	
	
	public static void I1() { //business route
		narrate("On his way out you overhear another person say \"Why'd you get those " + item + "s from that asian? You know they're taking our jobs right?\"\r\n"
				+ "\r\n"
				+ "It hurts but you can't leave to confront him, so you remain in the store, waiting for your next customers.");
		I3();
	}
	public static void I2() { //business route
		narrate("You give the man one more " + item + ". He smiles and takes it.\r\n"
				+ "\r\n"
				+ "\"Thank you. I'm sure your business will be successful when you make your customers happy like this\"\r\n"
				+ "\r\n"
				+ "On his way out you overhear another person say \"Why'd you get those " + item + "s from that asian? You know they're taking our jobs right?\"\r\n"
				+ "\r\n"
				+ "It hurts but you can't leave to confront him, so you remain in the store, waiting for your next customers.");
		
		I3();
	}
	public static void I3() { //business route
		narrate("Hiring someone to make the company website would be very expensive, so instead you decide to buy a coding book and learn how to make your own.\r\n"
				+ "\r\n"
				+ "Several months later you have the website up and running and in just a few weeks there are many more people showing up to "+ businessName + ". However, you notice an extremely rude comment every once in a while on your review section. But you don't let it bother you, because you know people enjoy coming to your store");
		
		I4();
	}
	public static void I4() { //business route
		narrate("In your freetime, you use the knowledge you learned from making the website to create a game that tells your story. It is a text based game that follows the life of a Vietnamese refugee escaping communist Vietnam and creating a new life for themselves in America\r\n"
				+ "\r\n"
				+ "Hopefully spreading awareness opens others up to the struggles you have faced.\r\n");
		end();
	}
	
	
	//MAIN
	public static void main(String[] args) throws IOException, InterruptedException, URISyntaxException {
		
		Console console = System.console();
        if(console == null && !GraphicsEnvironment.isHeadless()){ //If a console is not open, open one
            String filename = Main.class.getProtectionDomain().getCodeSource().getLocation().toString().substring(6);
            filename = URLDecoder.decode(filename, "UTF-8");
            Runtime.getRuntime().exec(new String[]{"cmd","/c","start","cmd","/k","java -jar \"" + filename + "\""});
        }else{
		begin();
		//F1();
        }
        //begin();
	}

}
