import org.junit.Assert;
import org.junit.Test;

public class Lab10Test {
    @Test
    public void testSum2_1() { Assert.assertEquals(3, Lab10.sum2(new int[]{1, 2, 3})); }

    @Test
    public void testSum2_2() { Assert.assertEquals(2, Lab10.sum2(new int[]{1, 1})); }

    @Test
    public void testSum2_3() { Assert.assertEquals(2, Lab10.sum2(new int[]{1, 1, 1, 1})); }

    @Test
    public void testSum2_4() { Assert.assertEquals(3, Lab10.sum2(new int[]{1, 2})); }

    @Test
    public void testSum2_5() { Assert.assertEquals(1, Lab10.sum2(new int[]{1})); }

    @Test
    public void testSum2_6() { Assert.assertEquals(0, Lab10.sum2(new int[]{})); }

    @Test
    public void testSum2_7() { Assert.assertEquals(9, Lab10.sum2(new int[]{4,5,6})); }

    @Test
    public void testSum2_8() { Assert.assertEquals(4, Lab10.sum2(new int[]{4})); }


    @Test
    public void testStart1_1() {
        Assert.assertEquals(2, Lab10.start1(new int[]{1, 2, 3}, new int[]{1,3}));
    }


    @Test
    public void testStart1_2() {
        Assert.assertEquals(1, Lab10.start1(new int[]{7,2,3}, new int[]{1}));
    }


    @Test
    public void testStart1_3() {
        Assert.assertEquals(1, Lab10.start1(new int[]{1,2}, new int[]{}));
    }


    @Test
    public void testStart1_4() {
        Assert.assertEquals(1, Lab10.start1(new int[]{}, new int[]{1,2}));
    }


    @Test
    public void testStart1_5() {
        Assert.assertEquals(0, Lab10.start1(new int[]{7}, new int[]{}));
    }


    @Test
    public void testStart1_6() {
        Assert.assertEquals(1, Lab10.start1(new int[]{7}, new int[]{1}));
    }


    @Test
    public void testStart1_7() {
        Assert.assertEquals(2, Lab10.start1(new int[]{1}, new int[]{1}));
    }


    @Test
    public void testStart1_8() {
        Assert.assertEquals(0, Lab10.start1(new int[]{7}, new int[]{8}));
    }


    @Test
    public void testStart1_9() {
        Assert.assertEquals(0, Lab10.start1(new int[]{}, new int[]{}));
    }


    @Test
    public void testStart1_10() {
        Assert.assertEquals(2, Lab10.start1(new int[]{1,3}, new int[]{1}));
    }


    @Test
    public void testcountEvens_1() {
        Assert.assertEquals(3, Lab10.countEvens(new int[]{2, 1, 2, 3, 4}));
    }

    @Test
    public void testcountEvens_2() {
        Assert.assertEquals(3, Lab10.countEvens(new int[]{2, 2, 0}));
    }

    @Test
    public void testcountEvens_3() {
        Assert.assertEquals(0, Lab10.countEvens(new int[]{1, 3, 5}));
    }

    @Test
    public void testcountEvens_4() {
        Assert.assertEquals(0, Lab10.countEvens(new int[]{}));
    }

    @Test
    public void testcountEvens_5() {
        Assert.assertEquals(1, Lab10.countEvens(new int[]{11, 9, 0, 1}));
    }

    @Test
    public void testcountEvens_6() {
        Assert.assertEquals(2, Lab10.countEvens(new int[]{2, 11, 9, 0}));
    }

    @Test
    public void testcountEvens_7() {
        Assert.assertEquals(1, Lab10.countEvens(new int[]{2}));
    }

    @Test
    public void testcountEvens_8() {
        Assert.assertEquals(2, Lab10.countEvens(new int[]{2, 5, 12}));
    }


}
