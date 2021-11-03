### 1512. Number of Good Pairs

Given an array of integers `nums`, return the number of ___good pairs___.

A pair `(i, j)` is called _good_ if `nums[i] == nums[j]` and `i < j`.

__Example 1__:
```
Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
```
__Example 2:__
```
Input: nums = [1,1,1,1]
Output: 6
Explanation: Each pair in the array are good.
```
__Example 3:__
```
Input: nums = [1,2,3]
Output: 0
```

__Constraints:__

- `1 <= nums.length <= 100`
- `1 <= nums[i] <= 100`