var countSubarrays = function(nums, minK, maxK) {
    if (minK > maxK) return 0
    let positionMinK = -1
    let positionMaxK = -1
    let leftBound = -1

    let res = 0

    for (let i = 0; i < nums.length; i++) {
        if (nums[i] < minK || nums[i] > maxK) {
            leftBound = i
            continue
        }
        if (nums[i] == minK) positionMinK = i
        if (nums[i] == maxK) positionMaxK = i

        start = Math.min(positionMinK, positionMaxK)

        res += Math.max(0, start - leftBound)
    }
    return res
};
