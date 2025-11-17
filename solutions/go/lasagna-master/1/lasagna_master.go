package lasagna

import (
	"math/rand"
	"time"
) 

func PreparationTime(layers []string, avgPrepMin int) int{
	if avgPrepMin == 0 {
		return len(layers) * 2
	}else {
		return len(layers) * avgPrepMin
	}
}

func Quantities(layers []string) (noodles int, sauce float64){
	var countNoodles int
	var countSauce float64

	for i := 0; i < len(layers); i++{
		if layers[i] == "noodles"{
			countNoodles += 1
		}else if layers[i] == "sauce"{
			countSauce += 1
		}
	}

	noodles, sauce = 50 * countNoodles, 0.2 * countSauce
	return 
}

func AddSecretIngredient(firendsList, myList []string){
	rand.Seed(time.Now().UnixNano())
	randNumber := rand.Intn(len(firendsList))
	randItem := firendsList[randNumber]
	
	lastIndexOfMylist := len(myList) - 1
	myList[lastIndexOfMylist] = randItem
}

func ScaleRecipe(quantities []float64, protions int) []float64{
	var newList []float64 
	for i := 0; i < len(quantities); i ++{
		newList = append(newList, (quantities[i] * float64(protions)) / 2)
	}
	return newList
}

// Your first steps could be to read through the tasks, and create
// these functions with their correct parameter lists and return types.
// The function body only needs to contain `panic("")`.
//
// This will make the tests compile, but they will fail.
// You can then implement the function logic one by one and see
// an increasing number of tests passing as you implement more
// functionality.
