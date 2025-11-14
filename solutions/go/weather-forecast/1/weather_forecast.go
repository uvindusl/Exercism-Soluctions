// Package weather can forecast the current weather condition of various cities in Goblinocus.
package weather

var (
    // CurrentCondition is used to store current conditon.
	CurrentCondition string
    // CurrentLocation is used to store current location.
	CurrentLocation  string
)

// Forecast returns the current weather forecast for a given city and condition.
func Forecast(city, condition string) string {
	CurrentLocation, CurrentCondition = city, condition
	return CurrentLocation + " - current weather condition: " + CurrentCondition
}
