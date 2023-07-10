class Solution:
# 1528
    def restoreString(self, s: str, indices: List[int]) -> str:

        newStr = ""

        length = len(s)

        index_map = {}

        for i in range(length):

            index_map[indices[i]] = s[i]

        for i in range(length):

            newStr += index_map[i]

        return newStr