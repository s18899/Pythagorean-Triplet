import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class PythagoreanTriplet {
	static List<Integer> triplet;
	static List<PythagoreanTriplet> tripletList;
	static int factorsLessThanOrEqualTo;
	static int sumsTo;
	
	public PythagoreanTriplet() 
	{
		triplet = new ArrayList<Integer>();
	}
	
	public PythagoreanTriplet(int a, int b, int c) 
	{
		triplet = new ArrayList<Integer>();
		triplet.add(a);
		triplet.add(b);
		triplet.add(c);
	}
	
	static PythagoreanTriplet makeTripletsList()
	{
		tripletList = new ArrayList<PythagoreanTriplet>();
		return new PythagoreanTriplet();
	}
    
  PythagoreanTriplet withFactorsLessThanOrEqualTo(int n)
  {
    factorsLessThanOrEqualTo = n;
    return this;
  }
	
	PythagoreanTriplet thatSumTo(int sum)
	{
	  sumsTo = sum;
		return this;
  }
	
  public static int[] getNumbersInRange(int end) {
    int[] arr = new int[] {};
    for (int i = 0; i < end; i++) {
        arr[i] = i + 1;
    }
    
    return arr;
}
	
	static List<PythagoreanTriplet> build()
	{
    int[] ar = getNumbersInRange(factorsLessThanOrEqualTo);
    for (int i = 0; i < factorsLessThanOrEqualTo; i++)
    {
      for (int j = i + 1; j < factorsLessThanOrEqualTo; j++)
      {
          for (int k = j + 1; k < factorsLessThanOrEqualTo; k++)
          {
              // Calculate square of array elements
              int x = ar[i] * ar[i], y = ar[j] * ar[j], z = ar[k] * ar[k];

              if (x == y + z || y == x + z || z == x + y || x+y+z == factorsLessThanOrEqualTo)
              {
                int max = Math.max(i, Math.max(j, k));
                int min = Math.min(i, Math.min(j, k));
                int mid = i + j + k - max - min;
                tripletList.add(new PythagoreanTriplet(min,mid,max));
              }  
          }
      }
    }  
  return tripletList;
  }
}
	
      



