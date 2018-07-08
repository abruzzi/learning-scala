def convert(c: Char): (String, Double) = 
	c match {
		case 'D' => ("In Dev", 1.0)
		case 'd' => ("In Dev", 0.5)
		case 'Q' => ("In QA", 1.0)
		case 'q' => ("In QA", 0.5)
		case 'B' => ("Blocked", 1.0)
		case 'b' => ("Blocked", 0.5)		
		case _ => ("Unknown", 0.0)
	}

def reduce(list: List[(String, Double)])  =
	list.foldLeft(Map[String, Double]()) {
		(map: Map[String, Double], status: (String, Double)) => 
			val (key, value) = status
			map + ((key, map.get(key).getOrElse(0.0) + value))
	}

def calculate(input: String): Unit = 
	val converted = input.toCharArray.map(convert)
	converted.fold(Map[String, Double]()){
		(map, status) => 
		map + (status, map.get(status).getOrElse(0.0))
	}

calculate("ddDqQb")