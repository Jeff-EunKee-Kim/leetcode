class Solution {
    public int numRescueBoats(int[] people, int limit) {
        if (people.length == 1) return 1; 
        Arrays.sort(people);
        int bcounter = people.length -1; 
        int counter = 0;
        int boats = 0;
        while(counter <= bcounter){
            int temp = people[bcounter];
            bcounter--;
            if ((counter <= bcounter) && (temp + people[counter] <= limit)){
                temp += people[counter];
                counter ++; 
            }
            boats ++;
        }
        return boats; 
    }
}