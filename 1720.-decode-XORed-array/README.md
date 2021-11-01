### 1720. Decode XORed Array

link to the problem on the website [leet code](https://leetcode.com/problems/decode-xored-array/)

There is a __hidden__ integer array `arr` that consists of `n` non-negative integers.

It was encoded into another integer array `encoded` of length `n - 1`, such that `encoded[i] = arr[i] XOR arr[i + 1]`. For example, if `arr = [1,0,2,1]`, then `encoded = [1,2,3]`.

You are given the `encoded` array. You are also given an integer `first`, that is the first element of `arr`, i.e. `arr[0]`.

Return the _original array_ `arr`. It can be proved that the answer exists and is unique.



__Example 1__:
```
Input: encoded = [1,2,3], first = 1
Output: [1,0,2,1]
Explanation: If arr = [1,0,2,1], then first = 1 and encoded = [1 XOR 0, 0 XOR 2, 2 XOR 1] = [1,2,3]
```
__Example 2:__
```
Input: encoded = [6,2,7,3], first = 4
Output: [4,2,0,7,4]
```

__Constraints:__

- `2 <= n <= 10^4`
- `encoded.length == n - 1`
- `0 <= encoded[i] <= 10^5`
- `0 <= first <= 10^5`