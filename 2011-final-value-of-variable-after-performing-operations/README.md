### 2011. Final Value of Variable After Performing Operations

link to the problem on the website [leet code](https://leetcode.com/problems/final-value-of-variable-after-performing-operations/)

There is a programming language with only __four__ operations and __one__ variable X:

- `++X` and `X++` __increments__ the value of the variable `X` by `1`.
- `--X` and `X--` __decrements__ the value of the variable `X` by `1`.

Initially, the value of `X` is `0`.

Given an array of strings `operations` containing a list of operations, return the ___final___ value of `X` after performing all the operations.

__Example 1:__
```
Input: operations = ["--X","X++","X++"]
Output: 1
Explanation: The operations are performed as follows:
Initially, X = 0.
--X: X is decremented by 1, X =  0 - 1 = -1.
X++: X is incremented by 1, X = -1 + 1 =  0.
X++: X is incremented by 1, X =  0 + 1 =  1.
```
__Example 2:__
```
Input: operations = ["++X","++X","X++"]
Output: 3
Explanation: The operations are performed as follows:
Initially, X = 0.
++X: X is incremented by 1, X = 0 + 1 = 1.
++X: X is incremented by 1, X = 1 + 1 = 2.
X++: X is incremented by 1, X = 2 + 1 = 3.
```
__Example 3:__
```
Input: operations = ["X++","++X","--X","X--"]
Output: 0
Explanation: The operations are performed as follows:
Initially, X = 0.
X++: X is incremented by 1, X = 0 + 1 = 1.
++X: X is incremented by 1, X = 1 + 1 = 2.
--X: X is decremented by 1, X = 2 - 1 = 1.
X--: X is decremented by 1, X = 1 - 1 = 0.
```

__Constraints:__

- `1 <= operations.length <= 100`  
- `operations[i]` will be either `"++X"`, `"X++"`, `"--X"`, or `"X--"`.