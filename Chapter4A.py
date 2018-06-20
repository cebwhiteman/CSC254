magicians = ['alice', 'david', 'carolina']
for magician in magicians:
	print(magician)
for magician in magicians:
	print(magician.title() + ", that was a great trick!")
	print("I can't wait to see your next trick, " + magician.title() + ".\n")

print("Thank you everyone. That was a great magic show!")

pizzas = ['margherita', 'diavola', 'boscaiola', 'capricciosa']
print(pizzas)
for pizza in pizzas:
	print("I like " + pizza + " pizza.\n")

print("I really like pizza!\n")

animals = ['giraffe', 'lion', 'okapi', 'dog']
print(sorted(animals))

for animal in animals:
	print("A " + animal + " would make a great pet.\n")

animals.sort()
print(animals)

for animal in animals:
	print("A " + animal + " would make a great pet.\n")

print("Actually, a " + animals[2] + " would make a terrible pet.\n")
print("I still think a " + animals[0] + ", a " + animals[1] + ", or an " + animals[3] + " would be nice, though!\n")




