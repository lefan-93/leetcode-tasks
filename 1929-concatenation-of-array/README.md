### 1929. Concatenation of Array

link to the problem on the website [leet code](https://leetcode.com/problems/concatenation-of-array/)

Given an integer array `nums` of length n, you want to create an array `ans` of length `2n` where `ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n` __(0-indexed)__.

Specifically, `ans` is the __concatenation__ of two `nums` arrays.

Return the _array_ `ans`.

__Example 1:__
```
Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]
```
__Example 2:__
```
Input: nums = [1,3,2,1]
Output: [1,3,2,1,1,3,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[3],nums[0],nums[1],nums[2],nums[3]]
- ans = [1,3,2,1,1,3,2,1]
```

__Constraints:__

- `n == nums.length`
- `1 <= n <= 1000`
- `1 <= nums[i] <= 1000`