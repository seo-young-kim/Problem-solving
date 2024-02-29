package programmers

class OX퀴즈 {

    fun solution(quiz: Array<String>): Array<String> {

        val regex = """(.+)(\-|\+)(.+)=(.+)""".toRegex()

        return quiz.map {
            val (x,op,y,z) = regex.matchEntire(it.trim())!!.destructured
            when(calculate(x,op,y,z)){
                true -> "O"
                false -> "X"
            }
        }.toTypedArray()
    }

    fun calculate(x: String, op: String, y: String, z: String): Boolean{

        val operand1 = x.trim().toInt()
        val operand2 = y.trim().toInt()
        val expectResult = z.trim().toInt()

        return when(op){
            "+" -> { operand1 + operand2 == expectResult}
            "-" -> { operand1 - operand2 == expectResult}
            else -> throw Exception("")
        }
    }
}