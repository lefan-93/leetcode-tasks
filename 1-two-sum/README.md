### 1. Two Sum

link to the problem on the website [leet code](https://leetcode.com/problems/two-sum/)

Given an array of integers `nums` and an integer `target`, return indices of the two numbers such that they add up to `target`.

You may assume that each input would have ___exactly one solution___, and you may not use the same element twice.

You can return the answer in any order.



__Example 1__:

```
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].
```

__Example 2__:

```
Input: nums = [3,2,4], target = 6
Output: [1,2]
```
__Example 3__:

```
Input: nums = [3,3], target = 6
Output: [0,1]
```

Constraints:

-`2 <= nums.length <= 10^4`

-`10^9 <= nums[i] <= 10^9`

-`10^9 <= target <= 10^9`

-`Only one valid answer exists.`


__Follow-up__: Can you come up with an algorithm that is less than O(n<sup>2</sup>) time complexity?