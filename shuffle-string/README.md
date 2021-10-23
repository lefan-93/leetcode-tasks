###1528. Shuffle String

Given a string `s` and an integer array `indices` of the __same length__.

The string `s` will be shuffled such that the character at the i<sup>th</sup> position moves to `indices[i]` in the shuffled string.

Return the *shuffled string*.



__Example 1:__

![example](q1.jpg)

```
Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
Output: "leetcode"
Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.
```
__Example 2:__

```
Input: s = "abc", indices = [0,1,2]
Output: "abc"
Explanation: After shuffling, each character remains in its position.
```

__Example 3:__
```
Input: s = "aiohn", indices = [3,1,4,2,0]
Output: "nihao"
```

__Example 4:__
```
Input: s = "aaiougrt", indices = [4,0,2,6,7,3,1,5]
Output: "arigatou"
```
__Example 5:__
```
Input: s = "art", indices = [1,0,2]
Output: "rat"
```

Constraints:

- `s.length == indices.length == n`
- `1 <= n <= 100`
- `s contains only lower-case English letters.`
- `0 <= indices[i] < n`
- `All values of indices are unique (i.e. indices is a permutation of the integers from 0 to n - 1).`