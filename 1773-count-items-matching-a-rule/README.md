1773. Count Items Matching a Rule 

link to the problem on the website [leet code](https://leetcode.com/problems/count-items-matching-a-rule/)

You are given an array items, where each `items[i] = [type[i], color[i], name[i]]` describes the type, color, and name of the `ith` item. You are also given a rule represented by two strings, `ruleKey` and `ruleValue`.

The `ith` item is said to match the rule if __one__ of the following is true:

- `ruleKey == "type"` and `ruleValue == type[i].`
- `ruleKey == "color"` and `ruleValue == color[i]`.
- `ruleKey == "name"` and `ruleValue == name[i]`.

Return _the number of items that match the given rule._

__Example 1:__
```
Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
Output: 1
Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].
```
__Example 2:__
```
Input: items = [["phone","blue","pixel"],["computer","silver","phone"],["phone","gold","iphone"]], ruleKey = "type", ruleValue = "phone"
Output: 2
Explanation: There are only two items matching the given rule, which are ["phone","blue","pixel"] and ["phone","gold","iphone"]. Note that the item ["computer","silver","phone"] does not match.
```
__Constraints:__

- `1 <= items.length <= 104`
- `1 <= typei.length, colori.length, namei.length, ruleValue.length <= 10`
- `ruleKey` is equal to either `"type", "color"`, or `"name"`.
- All strings consist only of lowercase letters.
