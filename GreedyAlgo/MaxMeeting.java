package GreedyAlgo;


import java.util.Comparator;

/**There is one meeting room in a firm. There are N meetings in the form of (S[i], F[i]) where
 * S[i] is the start time of meeting i and F[i] is finish time of meeting i. The task is to find the maximum number of meetings
 * that can be accommodated in the meeting room. Print all meeting numbers

 * Input : s[] = {1, 3, 0, 5, 8, 5},
 *         f[] = {2, 4, 6, 7, 9, 9}
 * Output : 1 2 4 5
 * First meeting [1, 2]
 * Second meeting [3, 4]
 * Fourth meeting [5, 7]
 * Fifth meeting [8, 9]
 *
 * Input : s[] = {75250, 50074, 43659, 8931, 11273, 27545, 50879, 77924},
 f[] = {112960, 114515, 81825, 93424, 54316, 35533, 73383, 160252 }
 Output : 6 7 1
 */

public class MaxMeeting {

    class Meeting{
        int start;
        int end;
        int pos;

        Meeting (int start, int end, int pos){
            this.start = start;
            this.end = end;
            this.pos = pos;
        }
    }

    class MeetingComparator implements Comparator<Meeting>{
        @Override
        public int compare(Meeting o1, Meeting o2){
            if(o1.end > o2.end){
                return 1;
            }else if(o1.end < o2.end){
                return -1;
            }else if(o1.pos < o2.pos){
                return -1;
            }
            return 1;
        }
    }

    public static void findMaxMeeting(int s[], int f[] , int n){
        
    }



    public static void main(String [] args){
        int s[] = {1, 3, 0, 5, 8, 5};
        int f[] = {2, 4, 6, 7, 9, 9};

    }
}
