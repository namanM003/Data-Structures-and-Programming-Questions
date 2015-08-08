'''
Implement strStr().

Returns the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
'''
class Solution:
    # @param {string} haystack
    # @param {string} needle
    # @return {integer}
    def strStr(self, haystack, needle):
        if len(needle)==0:
            return 0
        if len(haystack)==0:
            return -1
        for i in range(len(haystack)-len(needle) +1):
            if haystack[i] == needle[0]:
                print haystack[i:i+len(needle)]
                if needle == haystack[i:i+len(needle)]:
                    return i
        return -1