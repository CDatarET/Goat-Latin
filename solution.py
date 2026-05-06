class Solution:
    def isVowel(self, c):
        c = c.lower()
        return c == 'a' or c == 'e' or c == 'i' or c == 'o' or c == 'u'

    def toGoatLatin(self, sentence):
        strs = sentence.split()
        ret = []
        for i in range(len(strs)):
            sb = []
            if(self.isVowel(strs[i][0])):
                sb.append(strs[i])
            else:
                sb.append(strs[i][1:len(strs[i])])
                sb.append(strs[i][0])
            
            sb.append("ma")
            for j in range(i + 1):
                sb.append('a')

            ret.append("".join(sb))
        
        return " ".join(ret)
