package epam_lambdastreams;

import java.util.*;

public class Avgoflist {
	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);
		double avg = Avgoflist.doaverage(num);
		System.out.println(avg);
	  }

	private static double doaverage(List <Integer> marks) {
	    if (marks == null || marks.isEmpty()) {
	        return 0;
	    }

	    double sum = 0;
	    for (Integer mark : marks) {
	        sum += mark;
	    }

	    return sum / marks.size();
	}

}
