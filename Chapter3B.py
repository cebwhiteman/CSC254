cars = ['bmw', 'audi', 'toyota', 'subaru']
print(cars)
cars.sort() #sorting lists permanently
print(cars)

cars.sort(reverse = True) #sorting in reverse alphabetical order
print(cars)

cars = ['bmw', 'audi', 'toyota', 'subaru']
message = "Here is the original list: "
print(message)
print(cars)
print("\nHere is the sorted list: ")
print(sorted(cars)) #sorted() temporarily sorts a list
print("Here is the original list again: ")
print(cars)

cars.reverse() #printing a list in reverse order
print(cars)

cars = ['bmw', 'audi', 'toyota', 'subaru']
print(len(cars)) #why do I need print here?


places = ['japan', 'south africa', 'new zealand', 'singapore', 'argentina']
print(places)
print("Here is the sorted list: ")
print(sorted(places))
print("Here is the original list again: ")
print(places)
places.reverse()
print(places)
places.reverse()
print(places)
places.sort()
print(places)
places.sort(reverse = True)
print(places)