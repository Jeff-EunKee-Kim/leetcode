class Solution {
    public int findMinDifference(List<String> timePoints) {
        List<Time> times = new ArrayList<>(); 
        for(String s: timePoints){
            String[] run = s.split(":");
            times.add(new Time(Integer.parseInt(run[0]), Integer.parseInt(run[1])));
        }
        Collections.sort(times);
        times.add(new Time(times.get(0).hour + 24, times.get(0).minute));
        int min = 60 * 24; 
        for(int i = 0; i < times.size()-1; i++){
            int temp = Time.timeMin(times.get(i+1))- Time.timeMin(times.get(i));
            if (temp < min){
                min = temp; 
            }
        }
        return min;   
    }    
}

class Time implements Comparable<Time> {
    public int hour;
    public int minute; 
    public Time(int hour, int minute){
        this.hour = hour;
        this.minute = minute; 
    }
    public int compareTo(Time t){
        if(this.hour == t.hour){
            return this.minute - t.minute; 
        }
        return this.hour - t.hour; 
    }
    public static int timeMin(Time a){
        return a.hour * 60 + a.minute;
    }
}