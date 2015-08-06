'''
Description:

Count the number of prime numbers less than a non-negative number, n.
'''
class Solution:
    # @param {integer} n
    # @return {integer}
    def countPrimes(self, n):
        primes = [False] * n
        for i in range(4,len(primes),2):
            primes[i] = True
        for i in range(3,(int)(math.ceil(math.sqrt(n)))+1,2):
            '''if(i < len(primes) and primes[i]):
                continue'''
            for j in range(2*i,n,i):
                primes[j] = True
        count = 0
        for prime in range(2,len(primes)):
            if(primes[prime] == False):
                count = count + 1
        return count
                