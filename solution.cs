public class Solution {
    private bool isVowel(char c) {
        c = char.ToLower(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public string ToGoatLatin(string sentence) {
        string[] strs = sentence.Split(" ");
        string[] ret = new string[strs.Length];
        for(int i = 0; i < strs.Length; i++){
            StringBuilder sb = new StringBuilder();
            if(isVowel(strs[i][0])) sb.Append(strs[i]);
            else{
                sb.Append(strs[i].Substring(1));
                sb.Append(strs[i][0]);
            }

            sb.Append("ma");
            for(int j = 0; j <= i; j++) sb.Append('a');
            ret[i] = sb.ToString();
        }

        return string.Join(" ", ret);
    }
}
