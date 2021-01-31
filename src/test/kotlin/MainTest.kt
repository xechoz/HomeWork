import chunzhao.Week_02.topKFrequent
import chunzhao.Week_02.topKFrequent2
import chunzhao.Week_02.topKFrequent3
import org.junit.Test

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
}