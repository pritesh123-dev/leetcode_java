func maxSubArray(nums []int) int {
    maxval := math.MinInt32
    curr := 0

    for _, n := range nums {
        curr = max(n, curr + n) 
        maxval = max(maxval, curr)
    }
    return maxval
}

func max(a, b int) int {
    if a > b {
        return a
    }
    return b
}