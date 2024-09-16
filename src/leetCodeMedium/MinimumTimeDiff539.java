package leetCodeMedium;

import java.util.Arrays;
import java.util.List;

public class MinimumTimeDiff539 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int minDiff=findMinDifference(Arrays.asList("00:00","23:59","00:00"));
		System.out.println(minDiff);
	}

	public static int findMinDifference(List<String> timePoints) {
		int[] minutesArray = new int[timePoints.size()];
		for (int i = 0; i < timePoints.size(); i++) {
			String[] time = timePoints.get(i).split(":");
			minutesArray[i] = Integer.valueOf(time[0]) * 60 + Integer.valueOf(time[1]);
		}
		Arrays.sort(minutesArray);
			int minDiff = Integer.MAX_VALUE;
		for (int i = 1; i < minutesArray.length; i++) {
			minDiff = Math.min(minDiff, minutesArray[i] - minutesArray[i - 1]);
		}
		minDiff = Math.min(minDiff, 1440 - minutesArray[minutesArray.length - 1] + minutesArray[0]);
		return minDiff;

	}
}
