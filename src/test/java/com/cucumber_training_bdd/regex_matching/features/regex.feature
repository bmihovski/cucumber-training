Feature: regex validations

	Scenario: Check step definitions from the same pattern different values
	    Given the flight EZY4567 is leaving today
	
		Given the flight C038 is leaving today
		
		Given a flight BA01618 is leaving today