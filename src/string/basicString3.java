package string;

public class basicString3 {

	public static void main(String[] args) {
		//		method in the string

		String senteance = "Harmayini Also Good Actor In Harry Potter";
		//indexOf And lastIndexOf
		System.out.println(senteance.indexOf("Ha"));
		System.out.println(senteance.lastIndexOf("Ha"));
		System.out.println(senteance.indexOf("Als"));
		System.out.println(senteance.indexOf("o"));
		System.out.println(senteance.lastIndexOf("o"));
		System.out.println(senteance.lastIndexOf("A"));
		System.out.println(senteance.indexOf("a"));
		System.out.println("---------------------------------");
		// startwith and endwith()
		System.out.println(senteance.startsWith("H"));				//true
		System.out.println(senteance.startsWith("Har")); 			//true
		System.out.println(senteance.startsWith("Harmayini"));		 //true
		System.out.println(senteance.startsWith("Harr")); 			//false
		System.out.println("---------------------------------");
		System.out.println(senteance.endsWith("Potter")); 			//true
		System.out.println(senteance.endsWith(" Potter")); 			//true
		System.out.println(senteance.endsWith("ry Potter")); 		//true
		System.out.println(senteance.endsWith("arry Potter."));	 	//false
		System.out.println("---------------------------------");
		//subString(5)
		String str1 = "Amit Tambe Is Very Inteligent Persion";
		System.out.println(str1.substring(4));
		System.out.println(str1.substring(6));
		System.out.println(str1.substring(12));
		System.out.println("---------------------------------");
		//subString(5,10)
		String str2 = "Amit Tambe Is Very Inteligent Persion";
		System.out.println(str2.substring(4,12));
		System.out.println(str2.substring(6,15));
		System.out.println(str2.substring(12,19));
		System.out.println("---------------------------------");
		//concat
		String str3 = "Albus",str4 = "Dumbdore";
		System.out.println(str3.concat(str4));
		System.out.println(str3.concat(" ").concat(str4));
		System.out.println(str3.concat(" Head master ").concat(str4).concat(" is most powerful person"));
		System.out.println("---------------------------------");
		//replace
		System.out.println(str3.replace("Albus", "Albus Dumbdore the head master"));
		System.out.println(str3);
		System.out.println(str1.replace("Is", "ooo"));
		System.out.println("---------------------------------");
		//trim
		String str10 = "I am student     ";
		String str11 = " of automation class";
		String str12 = "I am also learning API";
		System.out.println(str10.trim());
		System.out.println(str11.trim());
		System.out.println(str12.trim());
		System.out.println(str10.trim()+ " " + str11.trim());
		System.out.println(str10 + str11);
		System.out.println("---------------------------------");
		//Split
		String sentence = "I am an automation engineer who loves to work on Selenium with java";
				String sentenceArray[] = sentence.split(" ");
				System.out.println("Orirional Sentence : " + sentence);			
				System.out.println("After split :");
				for(int i=0;i<sentenceArray.length;i++)
					System.out.print(sentenceArray[i] + " ");
	}

}
