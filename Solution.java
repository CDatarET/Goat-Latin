class Solution {
    private boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }

    public String toGoatLatin(String sentence) {
        String[] strs = sentence.split(" ");
        String[] ret = new String[strs.length];
        for(int i = 0; i < strs.length; i++){
            StringBuilder sb = new StringBuilder();
            if(isVowel(strs[i].charAt(0))){
                sb.append(strs[i]);
            }
            else{
                sb.append(strs[i].substring(1));
                sb.append(strs[i].charAt(0));
            }

            sb.append("ma");
            for(int j = 0; j <= i; j++){
                sb.append('a');
            }

            ret[i] = sb.toString();
        }

        return(String.join(" ", ret));
    }
}
