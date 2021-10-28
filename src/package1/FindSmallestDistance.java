package package1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FindSmallestDistance
{
	private int findIndexDifference(String s1, String s2) {
		String[] s = {"cat","e","f","t","dog"};
		int index1=0,index2=0;
		boolean flag=false;
		for(int i=0;i<s.length;i++)
		{
			if(s[i].equals(s1))
			{
				index1 = i;
			}
			else if(s[i].equals(s2))
			{
				index2 = i;
				flag=true;
			}
		}
		if(flag==false)
		{
			index2=s.length;
		}
		int index_diff = index2-index1;
		return index_diff;
	}
	
	@Test
	public void testCase1()
	{
		Assert.assertEquals(findIndexDifference("cat", "dog"), 4);
	}
	
	@Test
	public void testCase2()
	{
		Assert.assertEquals(findIndexDifference("cat", "wer"), 5);
	}
	
	@Test
	public void testCase3()
	{
		Assert.assertEquals(findIndexDifference("e", "dog"), 3);
	}
	
	@Test
	public void testCase4()
	{
		Assert.assertEquals(findIndexDifference("cat", "e"), 1);
	}

}
