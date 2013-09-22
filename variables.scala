object variables {

  def main(args: Array[String]) = {
    
	  // 1. Cannot update val values 
	  val i1 = 99
	  println("i1 "+i1)
	  // i1 = 100; reassignment to val is not allowed 
	  
	  // 2. Assign value of var to some other val, if you update value of var then val updates as well 
	  var i2 = 100
	  val constantv1 = i2
	  println("Value of constant at this time is : "+ constantv1)
	  i2 = 200
	  println("Reassigned value of i2. Value of constant at this time is : "+ constantv1)
	  
	  // 3. Assigning a var to a different var, then updating the orginal var has no effect on the other var
	  var i3 = 10
	  var v2: Int = i3
	  println("Assigned i to v2. Value of v2 is "+v2)
	  i3 = 15
	  println("Reassigned value of i3. Effect on v2 ? Value of v2 - "+v2)
	  
  }

}