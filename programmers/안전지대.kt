package programmers


class 안전지대 {

    fun solution(board: Array<IntArray>): Int {
        var answer: Int = 0
        val n = board.size
        for ((r,row) in board.withIndex()){
            for ((c,now) in row.withIndex()){
                if(now == 1){
                    if(c-1>=0 && board[r][c-1] == 0)
                        board[r][c-1] = 2
                    if(c+1<n && board[r][c+1] == 0)
                        board[r][c+1] = 2
                    if(r-1>=0 && board[r-1][c] == 0)
                        board[r-1][c] = 2
                    if(r+1<n && board[r+1][c] == 0)
                        board[r+1][c] = 2
                }
            }
        }

        return board.map {
            it.count {
                it == 0
            }
        }.sum()
    }

}