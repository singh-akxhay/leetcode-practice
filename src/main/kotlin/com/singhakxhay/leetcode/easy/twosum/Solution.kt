class Solution {
  fun twoSum(nums: IntArray, target: Int): IntArray {
    val sums = mutableMapOf<Int, Int>()

    for (idx in nums.indices) {
      val e = nums[idx]
      if (sums.containsKey(target - e)) {
        return intArrayOf(sums[target - e]!!, idx)
      } else {
        sums[e] = idx
      }
    }

    return intArrayOf()
  }
}