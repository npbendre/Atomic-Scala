object expressions {
	
	def main(args: Array[String]) = {
	  
		//Everything in scala is an expression
		val feetPerMile: Int  = 5280
		
		val yardsPerMile: Double = feetPerMile / 3.0
		
		val stats: Double = 2000/yardsPerMile
		
		// multi line expression
		val swamMilesInMiles = {
			val feetPerMile: Int  = 5280
			val yardsPerMile: Double = feetPerMile / 3.0
			val yards = 5000
			yards/yardsPerMile
		}
		
		println("Person swam these miles " + swamMilesInMiles)
	}
}