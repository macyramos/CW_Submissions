@author Macy Ramos
public String doubleChar(String str) {
  String ret = "";
  for(int i = 0; i<str.length(); i++)
    {
      ret = ret + str.charAt(i) + str.charAt(i);
    }
    return ret;

}
