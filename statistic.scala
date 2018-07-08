def infoMap(c: Char): Map[String, Double] = 
	c match {
		case 'D' => Map(("In Dev", 1.0))
		case 'd' => Map(("In Dev", 0.5))
		case 'Q' => Map(("In QA", 1.0))
		case 'q' => Map(("In QA", 0.5))
		case 'B' => Map(("Blocked", 1.0))
		case 'b' => Map(("Blocked", 0.5))			
		case _ => Map(("Unknown", 0.0))
	}


"dDddD".toCharArray.map(infoMap).fold()