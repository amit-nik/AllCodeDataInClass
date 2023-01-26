package logicalProram;

public class DublicateElementProg1 {

	public static void main(String[] args) {

		String[] str = {"Java","Python","c","c++","AI","Java"};
		int count = 0;
		
		for(int i = 0; i<str.length; i++)
		{
			for(int j = i;j<str.length; j++)
			{
				if(str[i].equals(str[j]))
				count++;
			}
		}
		if(count==0)
			System.out.println("No Dublicate value");
		else
			System.out.println("Dublicate Value");
	}

}
