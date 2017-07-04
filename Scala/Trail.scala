import scala.io.StdIn.{readLine, readInt}
import.scala.match._


object Trail{
	def main(args: Array[String]){
		var i = 0

		while(i <= 10){
			println(i)
		    i += 1
		}

		for(i <- 1 to 5; j<- 6 to 10){
			println("i :", i)
			println("j :", j)	    
	}

	var numGuess = 0
	do{
		print("Guess a number")
		numGuess = readLine.toInt
		} while(numberGuess != 15)

	printf("You guessed the Secret number %d\n", 15)
	}
}