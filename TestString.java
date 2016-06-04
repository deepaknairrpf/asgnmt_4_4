
public class TestString {
private String testString;
public void setString(String testString)
{
	this.testString=testString;
}
  public String getString()
  {
	  return testString;
  }
  public void printReverseString()
  {
	  int index=testString.length();
	  while(index>=0)
	  {
		  System.out.print(testString.charAt(index-1));
		  index--;
	  }
  }
}
