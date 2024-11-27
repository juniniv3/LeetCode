function missingNumber(nums: number[]): number {
    const n = nums.length;
    const expect = (n * (n + 1)) / 2;
    const current = nums.reduce((sum, num) => sum + num, 0);
    return expect - current;
};