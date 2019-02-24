class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();
        String first = "";
        for(String email: emails){
            int j = email.indexOf('@');
            
            String front = email.substring(0, j); 
            String back = email.substring(j);
            if(front.contains("+")){
                front = front.substring(0, front.indexOf("+"));
            }
            front = front.replace(".", "");
            set.add(front + back);
        }
        return set.size();
    }
}