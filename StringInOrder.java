package Strings;

public class StringInOrder 
{
	public static void main(String[] args) 
	{
		
	
		
		String[] st = {"Pavan", "Pradeep","Aakash","Chaitra"};
		
	      int size = st.length;

	      for(int i = 0; i<size-1; i++) {
	         for (int j = i+1; j<st.length; j++) {
	            if(st[i].compareTo(st[j])>0) {
	               String temp = st[i];
	               st[i] = st[j];
	               st[j] = temp;
	            }
	         }
	      }
	}
}
