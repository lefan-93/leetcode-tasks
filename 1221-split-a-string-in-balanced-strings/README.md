### 1221. Split a String in Balanced Strings

link to the problem on the website [leet code](https://leetcode.com/problems/concatenation-of-array/)

__Balanced__ strings are those that have an equal quantity of `'L'` and `'R'` characters.

Given a __balanced__ string `s`, split it in the maximum amount of balanced strings.

Return _the maximum amount of split __balanced__ strings_.

__Example 1:__
```
Input: s = "RLRRLLRLRL"
Output: 4
Explanation: s can be split into "RL", "RRLL", "RL", "RL", each substring contains same number of 'L' and 'R'.
```
__Example 2:__
```
Input: s = "RLLLLRRRLR"
Output: 3
Explanation: s can be split into "RL", "LLLRRR", "LR", each substring contains same number of 'L' and 'R'.
```
__Example 3:__
```
Input: s = "LLLLRRRR"
Output: 1
Explanation: s can be split into "LLLLRRRR".
```
__Example 4:__
```
Input: s = "RLRRRLLRLL"
Output: 2
Explanation: s can be split into "RL", "RRRLLRLL", since each substring contains an equal number of 'L' and 'R'
```

__Constraints:__

- `1 <= s.length <= 1000`
- `s[i] is either 'L' or 'R'`.
- `s` is a __balanced__ string.