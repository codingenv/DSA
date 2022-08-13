package GreedyAlgo;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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

    public void findMaxMeeting(int s[], int f[] , int n){
        List<Meeting> meetingsList = new ArrayList<>();


        for(int i = 0; i<n; i++   ){
            Meeting meeting = new Meeting(s[i], f[i], i+1);
            meetingsList.add(meeting);
        }

        MeetingComparator meet = new MeetingComparator();

        //Sort on the basis of end time.
        Collections.sort(meetingsList, meet);

        List<Integer> result = new ArrayList<>();

        int maxMeeting = 1;
        int limit  =  meetingsList.get(0).end;
        result.add(meetingsList.get(0).pos);
        for(int i =1; i< meetingsList.size(); i++){
            if(meetingsList.get(i).start > limit){
                result.add(meetingsList.get(i).pos);
                limit = meetingsList.get(i).end;
            }else{
                //Skip this
            }
        }

        for(int i =0; i<result.size(); i++){
            System.out.println(result.get(i));
        }


    }

    public static void main(String [] args){
        //int s[] = {1, 3, 0, 5, 8, 5};
        //int f[] = {2, 4, 6, 7, 9, 9};

        int s[] = {75250, 50074, 43659, 8931, 11273, 27545, 50879, 77924};
        int f[] = {112960, 114515, 81825, 93424, 54316, 35533, 73383, 160252 };
        MaxMeeting obj = new MaxMeeting();
        obj.findMaxMeeting(s, f, s.length);
    }
}
