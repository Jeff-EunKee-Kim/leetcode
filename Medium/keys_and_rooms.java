class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        HashSet<Integer> visited_room = new HashSet<>();
        visited_room.add(0);

        Stack<Integer> stack = new Stack<>();
        stack.add(0);
        while(!stack.isEmpty()){
            List<Integer> keys = rooms.get(stack.pop());
            for(int key: keys){
                if(!visited_room.contains(key)){
                    visited_room.add(key);
                    stack.add(key);
                }
            }
        }
        return rooms.size() == visited_room.size();

    }
}