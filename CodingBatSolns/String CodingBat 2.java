@author Macy Ramos
//This is where I copied and pasted my answers from codingBat.


// String makeOutWord

public String makeOutWord(String out, String word) 
  {
  String makeOutWord = (out.substring (0,2) + word + out.substring (2,4));
    return makeOutWord;
  }

// String extraEnd

public String extraEnd(String str) 
  {
  String extraEnd = str.substring(str.length()-2);
  return extraEnd + extraEnd + extraEnd;
  }

// String firstTwo

public String firstTwo(String str) {
 if (str.length() < 2)
 {
   return str;
 }
 else

  {
    return str.substring(0,2);
  }
 
}


// String withoutEnd

public String withoutEnd(String str) 
  {
  return str.substring (1, str.length()-1);
  }
