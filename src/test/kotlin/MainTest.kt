import chunzhao.Week_02.*
import chunzhao.Week_03.*
import chunzhao.Week_04.numDecodings
import org.junit.Test
import kotlin.test.assertEquals

class MainTest {
    @Test
    fun topKFrequentTest() {
        val inArray = intArrayOf(1,1,1,2,2,3,3,3,3, 4)
        val k = 3
        val expect = intArrayOf(3, 1,2 ).apply {
            sort()
        }
        val result = topKFrequent(inArray, k).apply {
            sort()
        }

        println("expect ${expect.joinToString()}, result ${result.joinToString()}")
        assert(expect.contentEquals(result))
    }

    @Test
    fun topKFrequent2Test() {
        val inArray = intArrayOf(1,1,1,2,2,3,3,3,3, 4)
        val k = 3
        val expect = intArrayOf(3, 1,2 ).apply {
            sort()
        }
        val result = topKFrequent2(inArray, k).apply {
            sort()
        }

        println("expect ${expect.joinToString()}, result ${result.joinToString()}")
        assert(expect.contentEquals(result))
    }

    @Test
    fun topKFrequent3Test() {
        val inArray = intArrayOf(1,1,1,2,2,3,3,3,3, 4)
        val k = 3
        val expect = intArrayOf(3, 1,2).apply {
            sort()
        }
        val result = topKFrequent3(inArray, k).apply {
            sort()
        }

        println("expect ${expect.joinToString()}, result ${result.joinToString()}")
        assert(expect.contentEquals(result))
    }

    @Test
    fun levelOrderTest() {

    }

    @Test
    fun climStarsTest() {
        val result = climbStairs(10)

        assertEquals(5, result, "")
    }

    @Test
    fun searchTest() {
        val array = intArrayOf(5, 1, 3)
        assertEquals(-1, search2(array, 0), "-1, 3")
//        assertEquals(3, search2(array, 7))
//        assertEquals(5, search2(array, 1))
    }

    @Test
    fun maxProfitTest() {
        assertEquals(maxProfit(intArrayOf(7,1,5,3,6,4)), 7)
        assertEquals(maxProfit(intArrayOf(3, 2, 1)), 0)
        assertEquals(maxProfit(intArrayOf(1, 2, 3)), 2)
    }

    @Test
    fun subsetsTest() {
//        assertEquals(listOf(emptyList(), listOf(1), listOf(2), listOf(1, 2)), subsets(intArrayOf(1, 2)).reversed())
    }

    @Test
    fun jumpTest() {
//        assertEquals(2, jump(intArrayOf(2, 1, 3, 1)))
//        assertEquals(1, jump(intArrayOf(2, 3, 1)))
        assertEquals(3, jump(intArrayOf(1, 2, 1,1,3)))
    }


    @Test
    fun letterCombinationsTest() {
//        assertEquals(listOf(), letterCombinations(""))
//        assertEquals(listOf("a","b","c"), letterCombinations("2"))
        assertEquals(listOf("ad","ae","af","bd","be","bf","cd","ce","cf"), letterCombinations("23"))
    }

    @Test
    fun numDecodingsTest() {
        assertEquals(0, numDecodings(""))
        assertEquals(0, numDecodings("0"))
        assertEquals(1, numDecodings("1"))
        assertEquals(2, numDecodings("12"))
        assertEquals(0, numDecodings("01"))
        assertEquals(3, numDecodings("226"))
        assertEquals(1, numDecodings("10"))
    }
}