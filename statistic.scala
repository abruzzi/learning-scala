def convert(str: String): (String, Double) = 
	str match {
		case "D" => ("In Dev", 1.0)
		case "d" => ("In Dev", 0.5)
		case "Q" => ("In QA", 1.0)
		case "q" => ("In QA", 0.5)
		case "B" => ("Blocked", 1.0)
		case "b" => ("Blocked", 0.5)		
		case _ => ("Unknown", 0.0)
	}

def calculate(input: String) = 
	input.split("").map(convert).foldLeft(Map[String, Double]()) {
		(map: Map[String, Double], status: (String, Double)) => 
			val (key, value) = status
			map + ((key, map.get(key).getOrElse(0.0) + value))
	}

calculate("ddDqQb")