import chunzhao.Week_02.*
import chunzhao.Week_03.search
import chunzhao.Week_03.search2
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
}