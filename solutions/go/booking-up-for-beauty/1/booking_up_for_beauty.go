package booking

import "time"

// Schedule returns a time.Time from a string containing a date.
func Schedule(date string) time.Time {
	layout := "1/2/2006 15:04:05"
	t, err := time.Parse(layout,date)
	if err != nil {
		return time.Time{} 
	}
	return t
}

// HasPassed returns whether a date has passed.
func HasPassed(date string) bool {
	layout := "January 2, 2006 15:04:05"
	t, err := time.Parse(layout, date)
	if err != nil {
		return false
	}
	return t.Before(time.Now())
}

// IsAfternoonAppointment returns whether a time is in the afternoon.
func IsAfternoonAppointment(date string) bool {
	layout := "Monday, January 2, 2006 15:04:05"
	t, err := time.Parse(layout, date)
	if err != nil {
		return false
 	}
	
	hour := t.Hour()
	return hour >= 12 && hour < 18
}


// Description returns a formatted string of the appointment time.
func Description(date string) string {
	const layout = "1/2/2006 15:04:05"

	t, err := time.Parse(layout, date)
	if err != nil {
		return "Invalid date format"
	}

	const outputLayout = "Monday, January 2, 2006, at 15:04"

	return "You have an appointment on " + t.Format(outputLayout) + "."
}

// AnniversaryDate returns a Time with this year's anniversary.
func AnniversaryDate() time.Time {
	now := time.Now()
	currentYear := now.Year()
	anniversary := time.Date(currentYear, time.September, 15, 0, 0, 0, 0, time.UTC)

	return anniversary
}
