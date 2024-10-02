//Task 1: Hello Name
  //Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!"
  //helloName("Bob") → "Hello Bob!"
  //helloName("Alice") → "Hello Alice!"
  //helloName("X") → "Hello X!"

public String helloName(String name) {
  return "Hello " + name  + "!"; 
}

//Task 2: Make Abba

  //Given two strings, a and b, return the result of putting them together in the order abba,
  //e.g. "Hi" and "Bye" returns "HiByeByeHi".makeAbba("Hi", "Bye") → "HiByeByeHi"
  //makeAbba("Yo", "Alice") → "YoAliceAliceYo"
  //makeAbba("What", "Up") → "WhatUpUpWhat"


public String makeAbba(String a, String b) {
  return a + b + b + a;
}


//Task 3: Make Tags

  //The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. 
  //In this example, the "i" tag makes <i> and </i> which surround the word "Yay". 
  //Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".
  //makeTags("i", "Yay") → "<i>Yay</i>"
  //makeTags("i", "Hello") → "<i>Hello</i>"
  //makeTags("cite", "Yay") → "<cite>Yay</cite>"

public String makeTags(String tag, String word) {
  return "<" + tag + ">"  + word + "</" + tag + ">" ;
}

//Task 4:First Half
  //Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
  //firstHalf("WooHoo") → "Woo"
  //firstHalf("HelloThere") → "Hello"
  //firstHalf("abcdef") → "abc"

public String firstHalf(String str) {
  String firstHalf  =  new String (str.substring(0,(int)(0.5*str.length())));
  return firstHalf;
}
